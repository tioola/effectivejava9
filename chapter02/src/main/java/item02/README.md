_**Item02- 2: Consider a builder when faced with many constructor parameters**_

**Problem**

When you have too much parameters to construct the object you may fall in situations where:

You crate lots of constructors with lots of parameters that makes everything hard to read and maintain.

You create an empty constructor and set the values individually, this may cause problems with wrong state of the objects.
Once you don't know whether all the values were defined you have to check the object everytime or you will have a wrong state.

To solve this problem you can use the builder approach.

_**Advantages:**_

**Builders are easy to write and also easy to read**

**The Builder pattern simulates named optional parameters**

**You can validate the state of the object before you finally construct it**

_**Disadvantages:**_

**In Performance critical application you will be creating a new object and it may be a problem**