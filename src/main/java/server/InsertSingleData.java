package server;

import com.mongodb.*;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class InsertSingleData {
    public static DB dataBase;
    public static DBCollection collection;
    public static BasicDBObject document = new BasicDBObject();
//    BasicDBObject document = new BasicDBObject();
    public static void main(String[] args) {
        MongoClient connectionServer = new MongoClient("localhost", 27017);
        dataBase = connectionServer.getDB("mongo_connection");
        collection = dataBase.getCollection("product");
        System.out.println("Conexão bem sucedida!\n"+"Por favor aguarde ...");

        // Inserir dados
        String Data = "01551974010";
        document.put("CPF", Data);
        collection.insert(document);

    }
}
