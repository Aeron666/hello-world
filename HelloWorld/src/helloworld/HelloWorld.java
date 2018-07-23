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
        System.out.println(a*b);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*a/b);
        System.out.println(a%b);
    }
    
}
