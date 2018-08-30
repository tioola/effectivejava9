package item04;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassUtilsTest {


    @Test(expected = InvocationTargetException.class)
    public void tryToInstantiateWithReflection() throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        final Class<?> cl = Class.forName("item04.ClassUtils");
        final Constructor<?>[] constructors = cl.getDeclaredConstructors();
        constructors[0].setAccessible(true);
        constructors[0].newInstance();
    }

}