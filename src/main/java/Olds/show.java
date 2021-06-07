package Olds;
import Olds.Connection;
import com.mongodb.DBCursor;

import java.net.UnknownHostException;

public class show {
    public static void main(String[] args) throws UnknownHostException {
        Connection connection = new Connection();
        connection.conectDB();
        //Ler dados
        DBCursor cursor = Connection.collection.find();
        while (cursor.hasNext()){
            System.out.println(cursor.next());
        }
    }
}
