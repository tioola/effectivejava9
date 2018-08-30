_**Item05: Prefer dependency injection to hardwiring resources**_

**Scenario**

Hardcoding your dependencies or and making your classes singleton can be a problem. Prefer to use dependency injection when you have dependencies from other classes.

**Advantages**

You class will be more flexible and reusable.

**Solution**

Pass the dependency through contructor, this way you will be also prepared for IOC frameworks