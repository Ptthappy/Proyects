package com.lepg.consolitas;


/**
 * @author luis
 */


public class WindowsConsole extends Console {
    
    void CheckStr(String s) {
        int x;
        
        
        x=s.indexOf(' ');
        String s2=s.substring(0, x);
        s2=s2.toLowerCase();
        
        switch(s2) {
            
            case "echo":
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
                System.out.println("No se reconoce el comando \"" + s + "\"");
                
        }
    }
}