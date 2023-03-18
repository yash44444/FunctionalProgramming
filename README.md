# Advantages of functional programming (java 8)
clean n readable code
reduces errors
removing boiler plate codes
less code
parallel processing


# Java streams
stream is a sequence of elements that can be processed in parallel or sequentially. 
Streams support a wide range of operations, such as filtering, mapping, sorting, and reducing. 
These operations can be chained together to perform complex data transformations in a very concise 
and readable way.
		 
Streams offer below methods:
1) filter()
2) map()
3) reduce()
4) forEach()
5) distinct()
6) sorted()
7) Optional

# Optional
optional is a container object that may or may not contain a non-null value. It is often used as a return type for methods that may or may not find a value in a collection. ex: If you want to add list elements and store the result in a variable, Optional would be used which act as a return type.

# reduce
 performs a reduction operation on the elements of the stream. The reduce() method takes a binary operator as its parameter, which is used to combine two elements of the stream. ex: reduce((a,b)->a+b);

# get
get() is a method of the Optional class, which is used to retrieve the value contained in an optional object.





