package server;

import Olds.Connection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;

public class GetBreakData {
    public static void main(String[] args) {
        Connection connection = new Connection();
        connection.conectDB();

        BasicDBObject gtQuery = new BasicDBObject();
        gtQuery.put("price", new BasicDBObject("$gt", 15).append("$lt", 100));
        DBCursor cursor = Connection.collection.find(gtQuery);
        while(cursor.hasNext()) {
            System.out.println(cursor.next());
        }


    }
}
