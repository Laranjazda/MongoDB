package server;

import Olds.Connection;
import com.mongodb.*;

public class InsertSingleData {
    public static BasicDBObject document = new BasicDBObject();
    public static void main(String[] args) {
        Connection connection = new Connection();
        connection.conectDB();
        // Inserir dados
        String Data = "01551974010";
        document.put("CPF", Data);
        Connection.collection.insert(document);
        System.out.println(document);

    }
}
