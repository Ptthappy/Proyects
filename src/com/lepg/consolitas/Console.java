package com.lepg.consolitas;


/**
 * @author luis
 */


public interface Console {
    void MoveMe();
    void WriteTxt();
    void ListDir();
    void CreateDir();
    void CopyTxt();
    void MoveTxt();
    void DelTxt();
    void ReadTxt();  //Extra
    void DelDir();     //Extra
    
    void CheckStr();
    void Exit();
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
