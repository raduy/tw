package lab01;

/**
 * @author Lukasz Raduj <raduj.lukasz@gmail.com>
 */
public class NonSaveDecrementer implements Runnable {
    private Counter counter;

    public NonSaveDecrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < Parameters.NUMBER_OF_ITERATIONS; i++) {
            counter.decrement();
        }
    }
}
