package com.lepg.consolitas;


import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;

/**
 * @author luis
 */


public class main {
    public static Console C=null;  //Se crea un objeto de tipo console (Sin instanciar, ya que es un objeto de tipo abstract)
    
    
    public static Console getC(int a) {  //Un singleton todo periquiado
        if (C == null) {
            if (a==1)
                C=new WindowsConsole();
            if (a==2)
                C=new UnixConsole();
        }  //Solo se puede crear una sola vez uno de los dos
        return C;  //Retorna el objeto a instanciar
    }

    public static void main(String[] args) throws IOException {
        debugger d=new debugger();
        Scanner s=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        String S;
        int a;
        int b=0;
        
        
        System.out.println("Select which console do you want to use\n1. Windows Console\n2. Unix Console");
        
        do {
            
            try {
                
                a=s.nextInt();
                
            } catch(InputMismatchException e) {  //Se atrapa una posible excepción de tipo InputMismatchException
                                                                      //(es decir, la excepción que resulta si el valor ingresado no es int)
                s=null;
                s=new Scanner (System.in);
                a=0;
                
            }
            
            
            switch(a) {
                
                case 1:
                    b=1;
                    break;
                case 2:
                    b=2;
                    break;
                default:
                    System.out.println("Error");
                    break;
                    
            }
            
        }while(b!=1);
        
        getC(a);
        C.Iter();
        
        
    }
    
}
