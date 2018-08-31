package item06;

import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.regex.Pattern;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class AvoidCreatingUnecessaryObjects {


    private static final Pattern COMPILER_BR_TELEPHONE = Pattern.compile("\\(\\d{2}\\)\\d{4,5}-\\d{4}");

    @Test
    public void doNotDoThisFirstExample(){

        //Note that you are creating unecessary objects in this sample.
        final String city = new String("Brussels");


        //Correct usage
        final String cityCorrect = "Brussels";
    }

    @Test
    public void doNotDoThisSecondExample(){

        //Another example of not creating unecessary object is using the string matches.
        //It seems to be the correct usage but for every call string will create a new regex compiler that causes
        //Unecessary creation
        final String telefoneNumber = "(14)99987-7939";

        final boolean matches = telefoneNumber.matches("\\(\\d{2}\\)\\d{4,5}-\\d{4}");

        assertThat(matches).isTrue();

        //Correct usage.

        //Instead you can create the compiler once as an static element and use it.
        //If you do it in the wrong way above it can cause serious performance problems.
        final boolean secondMatch = AvoidCreatingUnecessaryObjects.COMPILER_BR_TELEPHONE.matcher(telefoneNumber).matches();

        assertThat(secondMatch).isTrue();
    }

    @Test
    public void doNotDoThisThirdExample(){

        //This code looks good right?
        //The problem is that you are creating unecessary instances of Long for each iteration.
        //Avoid the usage of boxed primitive, it can cause serious performance issues.
        Instant beforeBadPerformance = Instant.now();
        Long sum = 0L;
        for(long i = 0L; i <= Integer.MAX_VALUE ;i++){
            sum += i;
        }
        Instant afterBadPerformance = Instant.now();

        long elapsedBadPerformance = Duration.between(beforeBadPerformance, afterBadPerformance).toMillis();

        //Correct usage

        //The example below shows how to use it in a good way with primitives.

        Instant beforeGoodPerformance = Instant.now();
        long sumPrimitive = 0L;
        for(long i = 0L; i <= Integer.MAX_VALUE ;i++){
            sumPrimitive += i;
        }
        Instant afterGoodPerformance = Instant.now();

        long elapsedGoodPerformance = Duration.between(beforeGoodPerformance, afterGoodPerformance).toMillis();

        assertThat(elapsedBadPerformance).isGreaterThan(elapsedGoodPerformance);
    }

}
