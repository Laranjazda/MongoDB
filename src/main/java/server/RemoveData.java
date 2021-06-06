package server;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class RemoveData {
    public static DB dataBase;
    public static DBCollection collection;
    public static BasicDBObject document = new BasicDBObject();

    public static void main(String[] args) {
        MongoClient connectionServer = new MongoClient("localhost", 27017);
        dataBase = connectionServer.getDB("mongo_connection");
        collection = dataBase.getCollection("product");
        System.out.println("Conexão bem sucedida!\n"+"Por favor aguarde ...");

        //Remover dados
        String Data = "Music";
        document.put("CPF",Data);
        collection.remove(document);

        System.out.println (document);

    }
}
