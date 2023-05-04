package org.example.Products;

import org.example.Builder.BaseBuilder;

import java.util.List;

public class Base {
    private String nombre;
    private int numeroAmbulancias;
    private double tiempoMedioAsistencia;
    private List<Base> bases;

    public Base(BaseBuilder builder) {
        this.nombre = builder.getNombre();
        this.numeroAmbulancias = builder.getNumeroAmbulancias();
        this.tiempoMedioAsistencia = builder.getTiempoMedioAsistencia();
        this.bases = builder.getBases();
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroAmbulancias() {
        if (bases != null) {
            int totalAmbulancias = 0;
            for (Base base : bases) {
                totalAmbulancias += base.getNumeroAmbulancias();
            }
            return totalAmbulancias;
        } else {
            return numeroAmbulancias;
        }
    }

    public double getTiempoMedioAsistencia() {
        if (bases != null) {
            double sumaTiempos = 0;
            int numBases = 0;
            for (Base base : bases) {
                sumaTiempos += base.getTiempoMedioAsistencia();
                numBases++;
            }
            return sumaTiempos / numBases;
        } else {
            return tiempoMedioAsistencia;
        }
    }
}

