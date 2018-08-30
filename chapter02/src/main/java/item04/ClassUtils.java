package item04;

public class ClassUtils {

    private static final Integer RANDOM_FACTOR = 100;

    private ClassUtils(){
        throw new AssertionError();
    }

    public static final double getRandomNumber(){
        return Math.random() * RANDOM_FACTOR;
    }

}
