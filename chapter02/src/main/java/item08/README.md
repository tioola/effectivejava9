_**Item08: Avoid finalizers and cleaner**_

**Problem**

There is no guarantee that the implemantation of the finalizer method will be executed by the JVM. Also you can drastically decrease the performance of your application doing it.

**Solution**
 
Use Autoclosable and let the client of the api call the close. 

**Where is it applicable?**

It can be used as a safe net to make sure that resources will be closed, but you should always implement the AutoCloseble.

