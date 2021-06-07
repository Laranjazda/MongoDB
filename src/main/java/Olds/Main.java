package Olds;

import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws UnknownHostException {
//        Methods methods = new Methods();
//        methods.insertData("123");
//        methods.updateData("um", "KKKKKKKKK");
//        methods.showData();
//        methods.removeData("123");

        Connection connection = new Connection();
        connection.conectDB();

    }
}
