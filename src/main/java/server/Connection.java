package server;

import com.mongodb.*;
import java.net.*;
import java.util.*;

public class Connection {
    DB dataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    public Connection() throws UnknownHostException, MongoException{
        MongoClient connectionServer = new MongoClient("localhost", 27017);
        dataBase = connectionServer.getDB("mongo_connection");
        collection = dataBase.getCollection("product");
        System.out.println("Conexão bem sucedida!\n"+"Por favor aguarde ...");
    }

    public boolean insertData(String Data){
        document.put("CPF", Data);
        collection.insert(document);
        return true;
    }

    public void showData(){
        DBCursor cursor = collection.find();
        while (cursor.hasNext()){
            System.out.println(cursor.next());
        }
    }

    public boolean updateData(String oldData, String updatedData){
        document.put("CPF", oldData);
        BasicDBObject newDoc = new BasicDBObject();
        newDoc.put("CPF", updatedData);
        collection.findAndModify(document, newDoc);
        return true;
    }

    public boolean removeData(String Data){
        document.put("CPF",Data);
        collection.remove(document);
        return true;
    }




}
