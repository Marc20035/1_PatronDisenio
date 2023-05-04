package org.example.Director;

import org.example.Builder.BaseBuilder;
import org.example.Products.Base;

public class BaseDirector {
    public Base createBase(BaseBuilder builder) {
        return builder.build();
    }
}

