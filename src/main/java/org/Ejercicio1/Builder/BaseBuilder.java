package org.Ejercicio1.Builder;
import java.util.List;
import org.Ejercicio1.Products.Base;
public class BaseBuilder {
    protected String nombre;
    protected int numeroAmbulancias;
    protected double tiempoMedioAsistencia;
    protected List<Base> bases;

    public BaseBuilder(String nombre) {
        this.nombre = nombre;
    }

    public BaseBuilder numeroAmbulancias(int numeroAmbulancias) {
        this.numeroAmbulancias = numeroAmbulancias;
        return this;
    }

    public BaseBuilder tiempoMedioAsistencia(double tiempoMedioAsistencia) {
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
        return this;
    }

    public BaseBuilder bases(List<Base> bases) {
        this.bases = bases;
        return this;
    }

    public Base build() {
        return new Base(this);
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroAmbulancias() {
        return numeroAmbulancias;
    }

    public double getTiempoMedioAsistencia() {
        return tiempoMedioAsistencia;
    }

    public List<Base> getBases() {
        return bases;
    }
}

