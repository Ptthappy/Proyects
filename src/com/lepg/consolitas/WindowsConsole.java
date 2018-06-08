package com.lepg.consolitas;


/**
 * @author luis
 */


public class WindowsConsole extends Console {
    
    void CheckStr(String s) {
        int x;
        
        
        x=s.indexOf(' ');
        String s2=s.substring(0, x);
        String s3=s.substring(x+1);
        s2=s2.toLowerCase();
        
        switch(s2) {
            
            case "echo":
                WriteTxt(s3);
                break;
            case "copy":
                break;
            case "move":
                break;
            case "del":
                break;
            case "notepad":
                break;
            case "mkdir":
                break;
            case "dir":
                break;
            case "rmdir":
                break;
            case "cd":
                break;
            default:
                System.out.println("No se reconoce el comando \"" + s2 + "\"");
                break;
                
        }
        
    }
    
    
    void WriteTxt(String s) {
        char c;
        boolean b;
        
        
        do {
            c=s.charAt(0);
            
        }
        
    }
}