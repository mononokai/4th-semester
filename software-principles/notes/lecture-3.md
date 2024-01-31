- inheritance - a mechanism in which one object acquires all the properties and behaviors of its parent object
- why use inheritance?
  - enables runtime polymorphism through method overriding
  - code reusability
- superclass - class whose properties are inherited by a subclass
  - AKA parent class, base class
- subclass - class that inherits the properties of another object
  - AKA child class, derived class
- keywords:
  - extends - used for classes, deriving a child class from the extended parent class
  - implements - used for interfaces
- generalization - using a parent class to build child classes that would otherwise have common attributes and behaviors
- child classes inherit public, protected, and default methods and attributes
- child classes do not inherit private methods and attributes or constructors
- rules for inherited methods:
  - superclass public methods must be public in child classes
  - superclass protected methods must be public or protected in child classes
  - superclass private methods are not inherited
- types of inheritance:
  - single inheritance
      A
      |
      B
  - multiple inheritance
      A    B
       \  /
        C
  - multilevel inheritance
      A
      |
      B
      |
      C
  - hierarchical inheritance
       A
      / \
     B   C
  - hybrid (multi-path) inheritance
      A
    / | \
   B  C  D
    \ | /
      E
- java only supports multiple and hybrid inheritance through interfaces
- important points:
  - a child class can only extend one parent class in java
  - create the bottom-most derived classes before building out base classes
  - when creating bottom-most derived class:
    - first, memory space is allocated for the data members (properties/attributes) of the top-most class
    - then, memory space is allocated for the data members specific to the current subclass
    - finally, memory space can be allocated for data members of other subclasses at the same level in hierarchy
  - bottom-most derived classes contain all data members inherited from all top-most base classes in a logical, coherent and organized manner
  - preceding a class definition with the "final" keyword will prevent inheritance and ensure the class cannot be derived
  - parent classes do not contain information about child classes
  - each class in java has a predefined parent class called java.lang.Object which provides garbage collection for unused memory space and improves performance
- advantages of inheritance:
  - time saved
  - less memory usage
  - better performance
  - minimizes redundancy
- disadvantages of inheritance:
  - changing a parent class will effect all of its child classes
  - class hierarchy can lead to unused data members which can negatively impact performance


- polymorphism - the ability of objects to take on multiple forms or exhibit multiple behaviors based on the context in which they are used
  - example: you have a class "Shape" and subclasses "Circle", "Rectangle", and "Triangle"
    - all three subclasses have a method "calculateArea()", but each one's method acts differently
  - polymorphism allows you to treat objects of different subclasses uniformly based on their shared superclass while still allowing each object to have its own specific behaviors
- two main types of polymorphism:
  - compile-time polymorphism
    - AKA static polymorphism
    - occurs at compile time
    - can be done with method overloading
  - runtime polymorphism
    - occurs at runtime
    - can be done with method overriding
- method overriding - a subclass provides a specific implementation of a method that is already defined in the superclass
  - the method name must match the name of the method in the parent class
  - the method must have the same parameters as the parent class' method
  - static methods cannot be overridden because they are bound to the class rather than an instance
  - static methods can, however, be re-declared
  - main method cannot be overridden as it is a static method
  - return type should be the same or a subtype of the original overridden method's return type
  - child method's access level cannot be more strict than the original method
  - instance methods can only be overridden if the subclass inherited the method
  - methods declared with the "final" keyword cannot be overridden
  - a subclass from the same package as the instance's superclass can override that superclass's methods
  - a subclass from a different package can only override the non-final methods declared public or protected (cannot override package-private methods)
  - overriding methods can throw any unchecked exceptions, but should not throw check exceptions that are new or broader than the overridden method
- method overloading - in a class, declaring multiple methods with the same name but different with different numbers or types of parameters
  - considered compile-time polymorphism because which overloaded method is called is decided by the compiler
  - method signature must be different
  - private, static, and final methods can be overloaded