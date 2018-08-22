package item03;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ElvisTest {

    @Test
    public void testIfInstanceIsUnique() {

        final Elvis firstCall = Elvis.getInstance();
        final Elvis secondCall = Elvis.getInstance();

        assertThat(firstCall).isSameAs(secondCall);

    }

}