## Introduction

In Design Patterns, the authors describe the Observer pattern like this:

__*Define a one to many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.*__

## UML Diagram:

Click here to see (https://howtodoinjava.com/wp-content/uploads/2019/01/observer-pattern-arch.jpg)

## Design Participants:

**Subject** : interface or abstract class defining the operations for attaching and de-attaching observers to the subject.

**ConcreteSubject** : concrete Subject class. It maintain the state of the object and when a change in the state occurs it notifies the attached Observers.

**Observer** : interface or abstract class defining the operations to be used to notify this object.

**ConcreteObserver** : concrete Observer implementations.

## When to use observer design pattern

when you have a design a system where multiple entities are interested in any possible update to some particular second entity object, we can use the observer pattern.

The flow is very simple to understand. Application creates the concrete subject object. All concrete observers register themselves to be notified for any further update in the state of subject.

As soon as the state of subject changes, subject notifies all the registered observers and the observers can access the updated state and act accordingly.


The Observer pattern is one of the most fundamental design patterns because it allows highly decoupled objects to communicate. In Example 1, the only thing the bounded range model knows about its listeners is that they implement a stateChanged() method. The listeners are only interested in the model's value, not how the model is implemented. The model and its listeners know very little about one another, but thanks to the Observer pattern, they can communicate. That high degree of decoupling between models and listeners lets you build software composed of pluggable objects, **making your code highly flexible and reusable**.
