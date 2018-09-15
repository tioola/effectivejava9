_**Item09: Prefer try with resources to try-finally**_

**Problem**

Try-finally is a very verbose way to close resources also most times you also have to try-catch your attempt to close your resource.

**Solution**
 
Use try with resources keep your code cleaner and your stacktrace more visible.

_Please check the tests for this item once we will be using java api_

_You can also refer to item08 as an example of autocloseable_