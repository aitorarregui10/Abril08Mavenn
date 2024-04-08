package com.softtek.modelo;

public class FueraComprobado extends Exception{
    public FueraComprobado (int indice){
        super ("El producto está fuera de los parámetros obligatorios");
    }
}
