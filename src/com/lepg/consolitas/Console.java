package com.lepg.consolitas;


/**
 * @author luis
 */


public abstract class Console {
    abstract void MoveMe();
    abstract void WriteTxt();
    abstract void ListDir();
    abstract void CreateDir();
    abstract void CopyTxt();
    abstract void MoveTxt();
    abstract void DelTxt();
    abstract void ReadTxt();  //Extra
    abstract void DelDir();     //Extra
    
    abstract void CheckStr();
    abstract void Exit();
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
