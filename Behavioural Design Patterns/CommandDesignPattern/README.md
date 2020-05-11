## Introduction

In object-oriented programming, the command pattern is a behavioral design pattern in which an object is used to encapsulate all information needed to perform an action, a business operation or trigger an event e.g. method name, receiver object reference and method parameter values, if any. This object is called command.

It allows us to achieve **complete decoupling** between the sender and the receiver.

## Design Participants

**Command interface** : An interface for declaring an operation.

**Concrete command classes** : A class which extends the Command interface, and has execute method for invoking business operation methods on receiver. It internally has reference of the receiver of command.

**Invoker** :An invoker is an object that invokes an operation.

**Receiver** : A receiver is an object that receives the request to execute a certain operation.

With decoupling, the sender has no knowledge of the Receiver's interface.) The term request here refers to the command that is to be executed. The Command pattern also allows us to vary when and how a request is fulfilled. Therefore, a Command pattern provides us **flexibility** as well as **extensibility**.

Open link for UML diagram (https://www.dofactory.com/images/diagrams/net/command.gif)

## Conclusion
The Command pattern has the following advantages:

* A command decouples the object that invokes the operation from the one that knows how to perform it.

* A command is a first-class object. It can be manipulated and extended like any other object.

* Commands can be assembled into a composite command.

* It's easy to add new commands, because you don't have to change the existing classes.

