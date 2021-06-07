package server;

import Olds.Connection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;

import java.util.ArrayList;
import java.util.List;

public class GetSpecificData {
    public static void main(String[] args) {
        Connection connection = new Connection();
        connection.conectDB();

        BasicDBObject inQuery = new BasicDBObject();
        List<String> list = new ArrayList<String>();
        list.add("teste3");
        list.add("teste5");
        list.add("teste9");
        inQuery.put("description", new BasicDBObject("$in", list));
        DBCursor cursor = Connection.collection.find(inQuery);
        while(cursor.hasNext()) {
            System.out.println(cursor.next());
        }
    }
}
