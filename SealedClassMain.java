package com;

sealed class Shape permits circle,Rectangle{

}
final class circle extends Shape{

}

non-sealed class Rectangle extends Shape{

}
public class SealedClassMain {
    public static void main(String[] args) {

    }
}
//maze race , nqueens