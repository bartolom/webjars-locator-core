package org.webjars;

/**
 * Same signature like Java 8 java.util.function.Function, and could be replaced
 * by it once webjars-locator-core moves to Java 8
 */
public interface WebJarFunction<T, R> {
	R apply(T t);
}
