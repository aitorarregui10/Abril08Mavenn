package com.softtek.modelo.ejercicio7;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Producto {
    //Atributos
    private int ID;
    private String nombre;
    private double precio;
    private String proveedor;
    private String descripcion;

    //Método

    public void comprobar() throws FueraComprobado {
        if (ID == 0) {
            throw new FueraComprobado("El producto es incorrecto");
        } else if (nombre == null) {
            throw new FueraComprobado("El producto es incorrecto");
        }
        else if (precio == 0) {
            throw new FueraComprobado("El producto es incorrecto");
        }
    }
/*
    //Constructores
    public Producto(int ID, String nombre, double precio, String proveedor, String descripcion) {
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
    }
    public Producto() {
    }
*/


}
