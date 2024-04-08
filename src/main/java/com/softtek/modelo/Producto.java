package com.softtek.modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Producto {

@Data
@NoArgsConstructor
@AllArgsConstructor

    //Atributos
    private int ID;
    private String nombre;
    private double precio;
    private String proveedor;
    private String descripcion;

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

    //Método

    public boolean comprobar() {
        if (comprobar = true) {

        }
        return false;
    }
}
