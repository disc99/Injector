package com.github.disc99.injector.util;

import java.util.function.Function;

@FunctionalInterface
public interface UncheckFunction<T, R> extends Function<T, R> {
    public R func(T arg) throws Exception;

    public default R apply(T t) {
        try {
            return func(t);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    };
}
