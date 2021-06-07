package server;

import com.mongodb.*;

public class GetFromMatched {
    private static DB dataBase;
    private static DBCollection collection;
    public static void main(String[] args) {
        MongoClient connectionServer = new MongoClient("localhost", 27017);
        dataBase = connectionServer.getDB("mongo_connection");
        collection = dataBase.getCollection("products");
        System.out.println("Conexão bem sucedida!\n"+"Por favor aguarde ...");

        BasicDBObject allQuery = new BasicDBObject();
        BasicDBObject fields = new BasicDBObject();
        fields.put("description", 1);

        DBCursor cursor = collection.find(allQuery, fields);
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }
    }
}
