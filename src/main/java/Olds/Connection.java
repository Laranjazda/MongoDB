package Olds;

import com.mongodb.*;
public class Connection {
    public static DB dataBase;
    public static DBCollection collection;
    public Connection() throws MongoException {
    }
    public static boolean conectDB(){
        MongoClient connectionServer = new MongoClient("localhost", 27017);
        dataBase = connectionServer.getDB("mongo_connection");
        collection = dataBase.getCollection("products");
        System.out.println("Conexão bem sucedida!\n"+"Por favor aguarde ...");
        return true;
    }
}
