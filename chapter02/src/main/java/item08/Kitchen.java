package item08;


import java.lang.ref.Cleaner;

/**
 * You should avoid the usage of finalizers or cleaners but there is one valid usage for them.
 * It can be used as a safenet to "try to" make sure that the resource will be closed even when the programmer
 * forgot to close it.
 */
public class Kitchen implements AutoCloseable {

    private static final Cleaner cleaner = Cleaner.create();

    private boolean closed = false;

    private static class State implements Runnable{

        int numOfDishes;

        State(final int numOfDishes){
            this.numOfDishes = numOfDishes;
        }

        @Override
        public void run() {
            System.out.println("Clean " + numOfDishes);
        }
    }

    private final State state;

    private final Cleaner.Cleanable cleanable;

    public Kitchen(final int numOfDishes){
        state = new State(numOfDishes);
        cleanable = Kitchen.cleaner.register(this, state);
    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
        closed = true;
    }

    public boolean isClosed(){
        return true;
    }
}
