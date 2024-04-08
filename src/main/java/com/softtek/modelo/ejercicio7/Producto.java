package com.softtek.modelo.ejercicio7;


public class Producto {
/*
@Data
@NoArgsConstructor
@AllArgsConstructor
*/
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

    public boolean comprobar() throws Exception {
        boolean comprobar;
        if (comprobar = true) {
            System.out.println("El producto es correcto, puedes seguir");
            return comprobar;
        }else {
            throw new Exception("El producto es incorrecto");
        }
    }
}
