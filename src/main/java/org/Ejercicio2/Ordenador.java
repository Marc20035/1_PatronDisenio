package org.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Ordenador {
    private List<Componente> componentes;

    public Ordenador() {
        componentes = new ArrayList<>();
    }

    public void agregarComponente(Componente componente) {
        componentes.add(componente);
    }

    public void quitarComponente(Componente componente) {
        componentes.remove(componente);
    }

    public void actualizarComponente(Componente componenteAntiguo, Componente componenteNuevo) {
        int indice = componentes.indexOf(componenteAntiguo);
        if (indice != -1) {
            componentes.set(indice, componenteNuevo);
        }
    }

    public double calcularPrecio() {
        double precioTotal = 0;
        for (Componente componente : componentes) {
            precioTotal += componente.getPrecio();
        }
        return precioTotal;
    }

    public List<Componente> getComponentes() {
        return componentes;
    }
}

