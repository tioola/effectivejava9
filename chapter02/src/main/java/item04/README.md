_**Item04: Enforce noninstantiability with a private constructor**_

**Scenario**

When you have a Util class with only static methods you shoudn't let it be instantiated

**Advantages**

You won't allow the creation of unecessary instances that can create extra overhead

**Solution**

Make the constructor private and throw an exception to avoid reflection