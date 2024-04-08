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
                p1.comprobar();
                p2.comprobar();
                p3.comprobar();
                p4.comprobar();
                p5.comprobar();

            } catch (FueraComprobado fueraComprobado) {
                fueraComprobado.printStackTrace();
            }
        }
}
