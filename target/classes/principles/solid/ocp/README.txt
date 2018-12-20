Open Closed Principle - software entities (classes, modules, functions etc.) should be open for extension, but closed for modification.

Description:

1. They are “Open For Extension”. 
   This means that the behavior of the module can be extended. That we can make
   the module behave in new and different ways as the requirements of the application
   change, or to meet the needs of new applications.
2. They are “Closed for Modification”.
   The source code of such a module is inviolate. No one is allowed to make source
   code changes to it.


How can these two opposing attributes be resolved?
In object oriented design, it is possible to create abstractions
that are fixed and yet represent an unbounded group of possible behaviors. The abstractions
are abstract base classes, and the unbounded group of possible behaviors is represented
by all the possible derivative classes


Programs that conform to the open-closed principle are changed by adding new
code, rather than by changing existing code, they do not experience the cascade of changes
exhibited by non-conforming programs

Strategic Closure - Since closure cannot be complete, it must be strategic. That is, the designer must
choose the kinds of changes against which to close his design.

https://web.archive.org/web/20150905081105/http://www.objectmentor.com/resources/articles/ocp.pdf