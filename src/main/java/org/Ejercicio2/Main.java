package org.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        ComponenteFactory factory = new ComponenteFactoryImpl();
        TecladoBuilder tecladoBuilder = factory.crearTecladoBuilder();
        tecladoBuilder.setFabricante("Logitech").setModelo("G213").setPrecio(50);
        Componente teclado = tecladoBuilder.build();
        Ordenador ordenador = new Ordenador();
        double precioTotal = ordenador.calcularPrecio();
        System.out.println("El precio total del ordenador es: " + precioTotal);
    }
}

