package server;

import Olds.Connection;
import com.mongodb.*;

public class ShowData {
    public static void main(String[] args) {
        Connection connection = new Connection();
        connection.conectDB();
        //Ler dados
        DBCursor cursor = Connection.collection.find();
        while (cursor.hasNext()){
            System.out.println(cursor.next());
        }
    }
}
