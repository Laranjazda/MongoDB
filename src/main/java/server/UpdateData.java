package server;

import Olds.Connection;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class UpdateData {
    public static void main(String[] args) {
        Connection connection = new Connection();
        connection.conectDB();

        //Captura o dado antigo
        BasicDBObject oldDoc = new BasicDBObject();
        Object oldData = "01551974010";
        oldDoc.put("CPF", oldData);
        //Atualiza dado capturado
        BasicDBObject newDoc = new BasicDBObject();
        Object updatedData = "Teste";
        newDoc.put("CPF", updatedData);
        //Realiza a operação
        Connection.collection.findAndModify(oldDoc, newDoc);
    }
}
