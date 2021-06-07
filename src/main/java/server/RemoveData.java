package server;

import Olds.Connection;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import java.util.Collection;

public class RemoveData {
    public static BasicDBObject document = new BasicDBObject();
    public static void main(String[] args) {
        Connection connection = new Connection();
        connection.conectDB();
        //Remover dados
        String Data = "Teste";
        document.put("CPF",Data);
        Connection.collection.remove(document);
    }
}
