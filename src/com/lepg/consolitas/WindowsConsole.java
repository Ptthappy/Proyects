package com.lepg.consolitas;


import java.util.Scanner;
import java.io.*;


/**
 * @author luis
 */


public class WindowsConsole extends Console {
    Scanner s1=new Scanner(System.in);
    FileInputStream fin;
    FileOutputStream fout;
    File F[]=new File[100];
    String cmd;
    String dir="C:/Users/luis/Desktop/Test";
    int a=0;
    
    
    void Iter() throws IOException {
        
        do {
            System.out.print(dir + ">");
            cmd=s1.nextLine();
            CheckStr(cmd);
        }while(!cmd.equals("exit"));
        
    }
    
    
    void CheckStr(String s) throws IOException {
        int x;
        String s2;
        String s3;
        
        x=s.indexOf(' ');
        if (x==-1) {
            s2=s;
            s3="";
        }
        else {
            s2=s.substring(0, x);
            s3=s.substring(x+1);
        }
        
        s2=s2.toLowerCase();
        
        
        switch(s2) {
            
            case "echo":
                WriteTxt(s3);
                break;
            case "copy":
                CopyTxt();
                break;
            case "move":
                MoveTxt();
                break;
            case "del":
                DelTxt();
                break;
            case "notepad":
                ReadTxt();
                break;
            case "mkdir":
                CreateDir();
                break;
            case "dir":
                ListDir();
                break;
            case "rmdir":
                DelDir();
                break;
            case "cd":
                MoveMe();
                break;
            case "exit":
                break;
            default:
                System.out.println("No se reconoce el comando \"" + s2 + "\"");
                break;
                
        }
        
    }
    
    
    void WriteTxt(String s) throws IOException {
        char c=0;
        int n;
        boolean b;
        String s2;
        
        
        
        if (s.equals(""))
            System.out.println("ECHO está activado");
        
        else {
            
            
            
            n=s.indexOf('>');
            if (n!=-1) {
                try {
                    if(s.charAt(n)==62  && s.charAt(n+1)==62) {
                    
                    s2=s.substring(0, n);
                    s=s.substring(n+2);
                    F[a]=new File(dir, s);
                    F[a].createNewFile();
                    
                    } 
                      
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println("Error de sintáxis");
                }
                    
            }
            else {
                
                System.out.println(s);
                
            }
            
        }
        
    }
    
    
    
    
    void MoveMe() {
        
    }
    void ListDir() {
        
    }
    void CreateDir() {
        
    }
    void CopyTxt() {
        
    }
    void MoveTxt() {
        
    }
    void DelTxt() {
        
    }
    void ReadTxt() {
        
    }
    void DelDir() {
        
    }
    
}