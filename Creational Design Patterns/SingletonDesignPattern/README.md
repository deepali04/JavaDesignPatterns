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

