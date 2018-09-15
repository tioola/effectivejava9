package item09;

import org.assertj.core.util.Files;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesTest {

    @Test
    @Ignore//Just use as reference, test ignored...
    public void testJustToShowAnExampleOfTheOldwayOfDoingThings() throws IOException {
        final File temporaryFile = Files.newTemporaryFile();
        final BufferedReader bufferedReader = new BufferedReader(new FileReader(temporaryFile));
        try{
            bufferedReader.readLine();
        }finally {
            bufferedReader.close();
        }

    }

    @Test
    @Ignore//Just use as reference, test ignored...
    public void testWithtTryWithResources(){
        final File temporaryFile = Files.newTemporaryFile();
        try(final BufferedReader br = new BufferedReader(new FileReader(temporaryFile.getPath()))) {
            br.readLine();
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }




}
