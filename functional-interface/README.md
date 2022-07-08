Functional Interfaces
=====================
A Functional Interface in java is an interface which is having single abstract method.

A Functional Interface can contain default methods and static methods in addition to single abstract method. 

Consumer
-------
````
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
````
Consumer interface is a part of java.util.function package

Consumer interface has been introduced since java8,It is used to implement functional programming in java

It represents a function which takes one argument and will not return result.


BiConsumer
----------
````
@FunctionalInterface
public interface BiConsumer<T, U> {
void accept(T t, U u);
}
````
It Represents a function that accepts two input arguments and returns no result.

Predicate
---------
````
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
````

Predicate interface is part of java.util.function package

Function interface has been introduced since java8, It is used to implement the functional programming in java

Predicate is having test method which return boolean value

Function
--------
````
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
````
Function interface is a part of java.util.function package

Function interface has been introduced since java8, It is used to implement the functional programming in java

It represents a function which takes one argument as input and return the result.

BiFunction
----------
BiFunction interface is a part of java.util.function package

BiFunction interface has been introduced since java8, It is used to implement the functional programming in java

It represents a function which takes two argument as input and return the result.

````
@FunctionalInterface
public interface BiFunction<T, U, R> {
    R apply(T t, U u);
}
````

UnaryOperator
-------------

UnaryOperator extends Function interface

It takes single argument as input and returns the output as same type of input

**IntUnaryOperator** - operates on single int-valued  operand that produces an int-valued result
````
@FunctionalInterface
public interface IntUnaryOperator {
    int applyAsInt(int operand);
}
````

**LongUnaryOperator** - operates on single long-valued  operand that produces a long-valued result
````
@FunctionalInterface
public interface LongUnaryOperator {   
    long applyAsLong(long operand);
}
````

**DoubleUnaryOperator** - operates on single double-valued  operand that produces a double-valued result
````
@FunctionalInterface
public interface DoubleUnaryOperator {  
    double applyAsDouble(double operand);
}
````
BinaryOperator
--------------
BinaryOperator(extends from BiFunction) is a functional interface which takes two parameters and return single value. Here both
parameters and return value should be same type

It is useful when implementing Mathematical functions such as sum, subtract, multiply, divide etc.
````
@FunctionalInterface
public interface IntBinaryOperator {
     int applyAsInt(int left, int right);
}
````

Supplier
--------
Supplier is a functional interface which supplies a value of some type
````
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
````


