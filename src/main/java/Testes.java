import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
//        Scanner entrada = new Scanner(System.in);
        float num1;
        float num2;


        num1 = Float.parseFloat(JOptionPane.showInputDialog("Insere numero 1"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Insere Numero 2"));
        double result = num1 / num2;
        JOptionPane.showMessageDialog(null, "Resultado: " + result);


//        System.out.println("Insere 1º numero");
//        num1 = entrada.nextFloat();
//        System.out.println("Insere 2º numero");
//        num2 = entrada.nextFloat();
//
//        System.out.println("Resultado: " + result);
//
//        entrada.close();

//        System.out.println(result);
    }
}
