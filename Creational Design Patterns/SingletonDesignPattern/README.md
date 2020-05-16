## Introduction

The Singleton pattern is a part of Creational design patterns.

In Java, the new keyword creates an instance of a class whenever required. But there are some cases where developers need to have an isolated instance of a class such as:

* A single database connection object

* A single shared resource

Therefore, this design pattern ensures that only one instance of a given class is created and a global access to that instance is provided.

## Pre-requisites

To implement the Singleton design pattern in the Java programming language, developers need to have the following:

**Static Member**: It will create a single instance in the JVM memory as static are class level variables.

**Private Constructor**: It will restrict the instantiation of the Singleton class from the outside world (i.e. Initialization of this class using the new keyword is prevented).

**Static factory method**: This provides the global point of access to the Singleton object and returns the instance to the caller.


In the Java programming language, there are different implementations of the singleton pattern. But before we start, the singleton design pattern should be considered only if all the three criteria’s are satisfied i.e.

* Ownership of the single instance cannot be changed.

* Lazy initialization is recommended.

* Global access to the singleton instance is not otherwise provided.

## Singleton Design Pattern Types:

* **Lazy initialization**

In this method, object is created only if it is needed. This may prevent resource wastage. An implementation of getInstance() method is required which return the instance. There is a null check that if object is not created then create, otherwise return previously created. To make sure that class cannot be instantiated in any other way, constructor is made final. As object is created with in a method, it ensures that object will not be created until and unless it is required. Instance is kept private so that no one can access it directly.

It can be used in a single threaded environment because multiple threads can break singleton property because they can access get instance method simultaneously and create multiple objects.

* **Eager Initialization**

In eager initialization, the instance of the singleton class is created at the time of class loading. This approach offers the easiest execution and helps improve the runtime performance of the application. Here is an example of Eager Initialization singleton class.

This approach is similar to lazy initialization, but it has a drawback i.e. the instance is always created even though the application is not utilizing it. This is considered a destructive practice for creating the database connections or sockets as it may lead to memory leak problems.

* **Bill Pugh Singleton**

Prior to Java 5, Java memory model had many issues and the developers had to use the Bill Pugh Solution for implementing the Single design pattern in their applications. This approach is based on initialization on demand idiom and uses the Inner classes’ concept.