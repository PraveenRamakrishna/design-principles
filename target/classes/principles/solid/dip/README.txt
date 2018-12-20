Dependency Inversion Principle is a principle that requires all your code's entities to depend only on Interfaces.

Dependence Inversion is about the shape of the object upon which the code depends.

DI is about how one object acquires a dependency. 

When a dependency is provided externally, then the system is using DI. 

IoC is about who initiates the call. If your code initiates a call, it is not IoC, if the container/system/library calls back into code that you provided it, is it IoC.

DIP, on the other hand, is about the level of the abstraction in the messages sent from your code to the thing it is calling. 

To be sure, using DI or IoC with DIP tends to be more expressive, powerful and domain-aligned, but they are about different dimensions, or forces, in an overall problem. 

DI is about wiring, IoC is about direction, and DIP is about shape.


- The Dependency Inversion Principle - DIP: implies that objects should depend upon abstractions, not concretions
									        this is the fundamental principle upon which the Inversion of Control pattern and Dependency Injection are implemented. 
	
- Inversion of Control - IOC: is a pattern implementation of the Dependency Inversion Principle, where abstract dependencies replace concrete dependencies,
							  allowing concretions of the dependency to be specified outside of the object.
							  
- Dependency Injection - DI: is a design pattern that implements Inversion of Control and provides dependency resolution. 
							 Injection occurs when a dependency is passed to a dependent component. 
							 In essence, the Dependency Injection pattern provides a mechanism for coupling dependency abstractions with concrete implementations.
							 
- Encapsulation is the process whereby data and functionality that is required by a higher level object is insulated away and inaccessible, thus, the programmer is unaware of how an object is implemented.