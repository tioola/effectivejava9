package item08;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class KitchenTest {

    @Test
    public void testAutoClosableCorrectly(){

        Kitchen outsideReference = null;

        try(final Kitchen k = new Kitchen(1)) {
            System.out.println("Do some operations with Kitchen....");
            outsideReference = k;
        } catch (final Exception e) {
            e.printStackTrace();
        }

        assertThat(outsideReference.isClosed()).isTrue();
    }

    public void testCleanerWithoutClose(){

        //Test pending once it is not possible to when the gc will be calling the cleaner

    }

}