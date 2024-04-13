package com.softtek.presentacion;

import com.softtek.modelo.ejercicio7.FueraComprobado;
import com.softtek.modelo.ejercicio7.Producto;

public class PruebaProducto {
        public static void main(String[] args) {
            try {
                Producto p1 = new Producto();
                Producto p2 = new Producto(0,"teclado", 13, "hp", "teclado chulo y de colores");
                Producto p3 = new Producto(1, null, 13, "hp", "teclado chulo y de colores");
                Producto p4 = new Producto(1, "teclado", 0, "hp", "teclado chulo y de colores");
                Producto p5 = new Producto(1, "teclado", 25, "hp", "teclado chulo y de colores");
                Producto p6 = new Producto(1, "teclado", 25, null, null);
                //p1.comprobar();
                //p2.comprobar();
                //p3.comprobar();
                //p4.comprobar();
                p5.comprobar();
                //p6.comprobar();

                // p1 y 2 petan por no tener ID o por ser 0. p3 peta porque el nombre es null y p4 peta porque el precio es 0.
                //El único que funciona es el p5 que tiene todos los datos Ok y el p6 que faltan datos que nos dan igual
                System.out.println("Tu producto ha sido añadido con éxito");

            } catch (FueraComprobado e) {
                System.out.println(e.getMessage());
            }
        }
}
