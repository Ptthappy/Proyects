package com.lepg.consolitas;


import java.util.Scanner;
import java.util.InputMismatchException;


/**
 * @author luis
 */


public class main {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a;
        
        
        System.out.println("Select which console do you want to use: ");
        
        do {
            
            try {
                
                a=s.nextInt();
                
            } catch(InputMismatchException e) {
                
                s=null;
                s=new Scanner (System.in);
                a=0;
                
            }
            
            
            switch(a) {
                
                case 1:
                    WindowsConsole wc=new WindowsConsole();
                    break;
                case 2:
                    UnixConsole uc=new UnixConsole();
                default:
                    System.out.println("Error");
                    
            }
        }while(a!=1 || a!=2);
        
        
        
    }
    
}
