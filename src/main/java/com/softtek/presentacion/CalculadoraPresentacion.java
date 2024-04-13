package com.softtek.presentacion;

import java.util.Scanner;
import com.softtek.modelo.Calculadora.Calculadora;

public class CalculadoraPresentacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Elige la operación (+, -, *, /): ");
        String operacion = scanner.next();

        Calculadora calc = new Calculadora();

        switch (operacion) {
            case "+":
                System.out.println("Tu suma da: " + calc.sumar(num1, num2));
                break;
            case "-":
                System.out.println("Tu resta da: " + calc.restar(num1, num2));
                break;
            case "*":
                System.out.println("Tu multiplicación da: " + calc.multiplicar(num1, num2));
                break;
            case "/":
                System.out.println("Tu división da: " + calc.dividir(num1, num2));
                break;
            default:
                System.out.println("Operación no válida.");
        }
    }
}