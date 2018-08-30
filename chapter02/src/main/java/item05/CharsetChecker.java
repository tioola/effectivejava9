package item05;

import java.io.File;
import java.nio.charset.Charset;

public class CharsetChecker {

    private Charset charset;

    //The dependency is received through the contructor.
    public CharsetChecker(Charset charset){
        this.charset = charset;
    }

    //Method won't have real implementation, just for
    public boolean isFileCorrectCharset(File file){
        //Do some magic to check the charset..
        return true;
    }

    public String getCharsetAvailable(){
        return charset.displayName();
    }

}
