package com.lepg.consolitas;


import java.io.IOException;
/**
 * @author luis
 */


public abstract class Console {
    abstract void MoveMe();
    abstract void WriteTxt(String S) throws IOException;
    abstract void ListDir();
    abstract void CreateDir();
    abstract void CopyTxt();
    abstract void MoveTxt();
    abstract void DelTxt();
    abstract void ReadTxt();  //Extra
    abstract void DelDir();     //Extra
    
    abstract void CheckStr(String S) throws IOException;
    boolean Exit() {
        return true;
    }
}

/*
-Moverse entre directorios
-Escribir archivos de texto
-Listar directorios
-Crear directorios
-Copiar archivos
-Mover archivos
-Borrar archivos
-Leer archivos
-Borrar directorios
*/
