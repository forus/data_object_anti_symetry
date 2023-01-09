# Data/Object Anti-Symmetry. Conclusion


> Procedural code (code using data structures) makes it easy to add new functions without changing the existing data structures. OO code, on the other hand, makes it easy to add new classes without changing existing functions.

The complement is also true:

> Procedural code makes it hard to add new data structures because all the functions must change. OO code makes it hard to add new functions because all the classes must change.


Excerpt From
Clean Code: A Handbook of Agile Software Craftsmanship
Martin, Robert C.

I think that procedural code can give the illusion that it's better, because it's faster in the beginning. But the code is not reusable. If we look for example look at a square. Let's say that the requirement is to only make a square as fast as possible, you could argue that procedural code is better. But what if requirements change midway or that the square needs to be updated later on? That's where OOP comes into the picture as the better solution. These are small examples, but I would think that OOP would be better in a larger application.