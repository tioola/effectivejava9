_**Item07: Eliminate obsolete object references**_

**Problem**

Leaving references of objects may cause memory leaks that can be present on the system during years, they can slowdown the application or even cause OutOfMemory Exception

**Solution**
 
In most part of the time you just have to let the object get out of the context and the garbage collector will notice that it doesn't have any reference. But there are some cases where you may be managing your own cache , you have to set the reference as null to make sure that the garbage collector will act.

_This item must be improved._