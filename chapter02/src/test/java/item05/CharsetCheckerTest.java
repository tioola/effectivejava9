package item05;

import org.junit.Test;

import java.nio.charset.Charset;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CharsetCheckerTest {

    @Test
    public void testDependencyInjectionWithTwoDifferentDependencies(){

        final CharsetChecker firstChecker = new CharsetChecker(Charset.forName("UTF-8"));
        final String firstCharset = firstChecker.getCharsetAvailable();

        final CharsetChecker secondChecker = new CharsetChecker(Charset.forName("UTF-16"));
        final String secondCharset = secondChecker.getCharsetAvailable();

        assertThat(firstCharset).isNotEqualTo(secondCharset);
    }

}