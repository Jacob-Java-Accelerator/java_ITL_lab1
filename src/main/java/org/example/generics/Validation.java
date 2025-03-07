package org.example.generics;

import java.util.function.Predicate;

public class Validation {

    public static <T> boolean validate(T t, Predicate<T> criteria){
        return criteria.test(t);
    }
}
