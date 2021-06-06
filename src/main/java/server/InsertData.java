package server;
import Products.Foods;
import com.mongodb.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.util.List;
import static java.util.Arrays.asList;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class InsertData {
    BasicDBObject document = new BasicDBObject();
    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create("mongodb+srv://carlos_curso:bros2011@sandbox.fnsvd.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("mongo_connection");
        System.out.println("Conexão bem sucedida!\n"+"Por favor aguarde ...");

        //Inserir dados
        MongoCollection<Foods> productList = database.getCollection("product", Foods.class);
        List<Foods> foods = asList(
                new Foods("Food",false, "teste1", 22),
                new Foods("Food",true, "teste2", 12),
                new Foods("Food",true, "teste3", 45),
                new Foods("Food",false, "teste4", 22),
                new Foods("Food",false, "teste5", 12),
                new Foods("Food",false, "teste6", 199)
        );
        productList.insertMany(foods);
    }
}
