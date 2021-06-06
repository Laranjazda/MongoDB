package server;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class ShowData {
    private static DB dataBase;
    private static DBCollection collection;
    public static void main(String[] args) {
        MongoClient connectionServer = new MongoClient("localhost", 27017);
        dataBase = connectionServer.getDB("mongo_connection");
        collection = dataBase.getCollection("product");
        System.out.println("Conexão bem sucedida!\n"+"Por favor aguarde ...");

        //Ler dados
        DBCursor cursor = collection.find();
        while (cursor.hasNext()){
            System.out.println(cursor.next());
        }
    }
}
