_**Item01- Static Factory methods instead of Constructor.**_

_**Advantages:**_

**Unlike constructors they have names**

-`Guard.forDay(`) is an example of static constructor that makes the instantiation of the object clear.

**Static constructors are not required to create a new instance everytime you call it**

-`Guard.getInstance(boolean urgency`) is an example, if you pass the parameter of the getInstance as true it will return the single insance of SupervisorGuard which is in our fictitious example is a more expensive object.

**They can return am object of any subtype**

-`Guard.getInstance(boolean urgency)` If you check the code, you will se that depending of the day a different subtype will be returned.

**The class of the returned object can vary from call to call as a function of the input parameters**

-`Guard.getInstance(boolean urgency)` This is exacly what happens, when you call the get instance, different objects can be returned depending on time and parameters.

**The class of the returned object need not exist when the class containing the method is written**

-`Guard.getInstance(boolean urgency)` You can check the lazy initialization of the supervisor.

_**Disadvantages:**_

**Without public or protected constructors it cannot be subclassed**