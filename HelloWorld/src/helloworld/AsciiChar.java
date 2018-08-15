/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class AsciiChar {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int ascii=ch;
        int castAscii=(int)ch;
        System.out.println(ch);
        System.out.println(ascii);
        System.out.println(castAscii);
    }
    
}
