package item07;

import org.junit.Ignore;
import org.junit.Test;

public class SheepTest {

    @Test
    @Ignore//Test must be improved.
    public void testMemoryLeakWhileCreatingSheepClones(){

        final Sheep originalSheep = Sheep.getOriginal("Dolly", 20.0);

        //We are trying to create a lot of clones and let them get out of the context but because
        //of our intentional bug we are keeping the refence in each clone

        Sheep lastClone = null;
        for(int i =0;i< Integer.MAX_VALUE;i++){

            if(lastClone == null){
                lastClone = originalSheep;
            }
            final Sheep clone = Sheep.getClone(lastClone);
            lastClone = clone;
        }

    }

}