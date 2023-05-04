package org.Ejercicio2;

public class ComponenteFactoryImpl implements ComponenteFactory{
    @Override
    public TecladoBuilder crearTecladoBuilder() {
        return new TecladoBuilder();
    }
}
