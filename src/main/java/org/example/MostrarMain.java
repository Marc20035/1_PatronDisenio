package org.example;

import org.example.Builder.BaseBuilder;
import org.example.Director.BaseDirector;
import org.example.Products.Base;

import java.util.ArrayList;
import java.util.List;

public class MostrarMain {
    public void mostrarMain(){
        BaseDirector director = new BaseDirector();

        BaseBuilder baseConcretaBuilder = new BaseBuilder("Villanueva de la Cañada")
                .numeroAmbulancias(5)
                .tiempoMedioAsistencia(30);

        Base baseConcreta = director.createBase(baseConcretaBuilder);
        System.out.println("Base concreta: " + baseConcreta.getNombre());
        System.out.println("Número de ambulancias: " + baseConcreta.getNumeroAmbulancias());
        System.out.println("Tiempo medio de asistencia: " + baseConcreta.getTiempoMedioAsistencia());

        List<Base> basesAgrupadas = new ArrayList<>();
        basesAgrupadas.add(baseConcreta);

        BaseBuilder baseAdministrativaBuilder = new BaseBuilder("Majadahonda")
                .bases(basesAgrupadas);

        Base baseAdministrativa = director.createBase(baseAdministrativaBuilder);
        System.out.println("\nBase administrativa: " + baseAdministrativa.getNombre());
        System.out.println("Número de ambulancias: " + baseAdministrativa.getNumeroAmbulancias());
        System.out.println("Tiempo medio de asistencia: " + baseAdministrativa.getTiempoMedioAsistencia());
    }
    public static void aux(){
        MostrarMain mostrarMain = new MostrarMain();
        mostrarMain.mostrarMain();
    }
}
