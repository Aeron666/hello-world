/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.Scanner;

/**
 *
 * @author sidharth
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello World");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter any operation to be performed:");
        char op=sc.next().charAt(0);
        double calc;
        switch(op){
            case '+':
                calc=a+b;
                break;
            case '-':
                calc=a-b;
                break;
            case '*':
                calc=a*b;
                break;
            case '/':
                calc=a/b;
                break;
            case '%':
                calc=a%b;
                break;
            default:
                System.out.println("Operator entered is invalid");
                return;
        }
        System.out.println(calc);
    }
    
}
