package org.Ejercicio1.Director;

import org.Ejercicio1.Builder.BaseBuilder;
import org.Ejercicio1.Products.Base;

public class BaseDirector {
    public Base createBase(BaseBuilder builder) {
        return builder.build();
    }
}

