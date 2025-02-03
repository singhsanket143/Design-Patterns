package PrototypePattern;

public interface Prototype<T extends Prototype<T>> {
    T copy();
}