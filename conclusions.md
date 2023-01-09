# Data/Object Anti-Symmetry. Conclusion


> Procedural code (code using data structures) makes it easy to add new functions without changing the existing data structures. OO code, on the other hand, makes it easy to add new classes without changing existing functions.

The complement is also true:

> Procedural code makes it hard to add new data structures because all the functions must change. OO code makes it hard to add new functions because all the classes must change.


Excerpt From
Clean Code: A Handbook of Agile Software Craftsmanship
Martin, Robert C.

My comments:
\
\
Procedural code does not provide reusable code. When we want to create a new item, we need to create every relevant items one line by one line, instead of constructing a new object instance; We can directly create a new object instance with all the pre-set attributes.
\
\
Procedural programming does not have any proper way of hiding data so it is less secure; OOP provides encapsulation, and we can set fields as private to protect the data.
\
\
Procedural programming is hard to modify and change, because we have to add new functions to the existing code;
we can add new classes and new methods without modifying the existing code in OOP.
\
\
Procedural programming does not allow inheritance, so we have to repeat a lot of code; we can create abstract and parent classes for inheritance, so the child classes can inherit the methods from their parents.