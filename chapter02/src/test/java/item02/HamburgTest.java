package item02;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class HamburgTest {


    @Test
    public void testHamburguerBuilder(){

        Hamburger hamburgerBuilt = Hamburger.builder(Size.LARGE, Bread.WHITE, Meat.ANGUS)
                .addAdditional(Additional.BACON)
                .addAdditional(Additional.CHEDDAR)
                .addAdditional(Additional.ONION)
                .addAdditional(Additional.SALAD)
                .build();


        assertThat(hamburgerBuilt.getSize()).isEqualTo(Size.LARGE);
        assertThat(hamburgerBuilt.getBread()).isEqualTo(Bread.WHITE);
        assertThat(hamburgerBuilt.getMeat()).isEqualTo(Meat.ANGUS);
        assertThat(hamburgerBuilt.getAdditional()).contains(Additional.BACON);
        assertThat(hamburgerBuilt.getAdditional()).contains(Additional.CHEDDAR);
        assertThat(hamburgerBuilt.getAdditional()).contains(Additional.ONION);
        assertThat(hamburgerBuilt.getAdditional()).contains(Additional.SALAD);



    }
}
