package server;
import Products.Foods;
import com.mongodb.*;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import java.util.List;
import static java.util.Arrays.asList;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class InsertListData {
    public static void main(String[] args) {
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoClient mongoClient = new MongoClient("localhost", MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build());
        MongoDatabase database = mongoClient.getDatabase("mongo_connection").withCodecRegistry(pojoCodecRegistry);

        //Inserir dados
        MongoCollection<Foods> productList = database.getCollection("products", Foods.class);
        List<Foods> foods = asList(
                new Foods("Food",false, "teste1", 22),
                new Foods("Fruit",true, "teste2", 12),
                new Foods("Food",true, "teste3", 45),
                new Foods("Fruit",false, "teste4", 22),
                new Foods("Food",false, "teste5", 12),
                new Foods("Fruit",false, "teste6", 199)
        );
        productList.insertMany(foods);
        System.out.println(foods);
    }
}
