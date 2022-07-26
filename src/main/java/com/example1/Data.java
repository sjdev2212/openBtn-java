package com.example1;

public class Data {
    public static void main(String[] args) {
        int numero = 1;
        double decimalD = 12.02d;
        float decimalf = 0.1f;
        String palabra = "java";
        char letra = 'a';
        long largo = 1500;
        boolean boleano = true;



        System.out.println(numero);
        System.out.println(decimalD);
        System.out.println(decimalf);
        System.out.println(palabra);
        System.out.println(letra);
        System.out.println(largo);
        System.out.println(boleano);
       double resultado = precioConIva(20);
        System.out.println(resultado);

    }
    static double precioConIva (double precio) {
        return (precio *  21 / 100)  + precio;
    }
}
