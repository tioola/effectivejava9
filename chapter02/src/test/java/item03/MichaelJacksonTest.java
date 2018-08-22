package item03;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class MichaelJacksonTest {

    @Test
    public void testIfSameInstance() {

        MichaelJackson firstCall = MichaelJackson.INSTANCE;
        MichaelJackson secondCall = MichaelJackson.INSTANCE;

        assertThat(firstCall).isSameAs(secondCall);

        //Just for fun xD
        firstCall.moonWalk();

    }

}