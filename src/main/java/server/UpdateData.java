package server;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class UpdateData {
    private static DB dataBase;
    private static DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    public static void main(String[] args) {
        MongoClient connectionServer = new MongoClient("localhost", 27017);
        dataBase = connectionServer.getDB("mongo_connection");
        collection = dataBase.getCollection("product");
        System.out.println("Conexão bem sucedida!\n"+"Por favor aguarde ...");

        //Captura o dado antigo
        BasicDBObject oldDoc = new BasicDBObject();
        Object oldData = "Music";
        oldDoc.put("CPF", oldData);
        //Atualiza dado capturado
        BasicDBObject newDoc = new BasicDBObject();
        Object updatedData = "01551974010";
        newDoc.put("CPF", updatedData);
        //Realiza a operação
        collection.findAndModify(oldDoc, newDoc);
    }
}
