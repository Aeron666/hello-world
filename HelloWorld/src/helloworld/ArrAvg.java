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
public class ArrAvg {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        double[] arr1=new double[5];
        double total=0;
        System.out.println("Enter the "+arr1.length+" numbers:");
        for(int i=0; i<arr1.length;i++){
            arr1[i]=sc.nextDouble();
        }
        for(int j=0; j<arr1.length;j++){
            total=total+arr1[j];
        }
        double avg=total/arr1.length;
        System.out.println("avg is "+avg);
    }
}
