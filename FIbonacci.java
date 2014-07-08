
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dragonslayer
 */
public class FIbonacci {
    int n;
    int count=0;
        
    FIbonacci(int x){
        n = x;
    }
     
    private int fibonacci(int a, int b) {
        if(count==n-2){
            return 0;
        }else {
        int c = a+b;
        System.out.println(c);
        a=b;
        b=c;
        count++;
        return (fibonacci(a,b));
        }
    }
    
    
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int x=ob.nextInt();
        System.out.println(" ");
        System.out.println(a);
        System.out.println(b);
        FIbonacci fibo = new FIbonacci(x);
        fibo.fibonacci(a,b);
    
    }
   
}
