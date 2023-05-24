import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    private final List<Integer> randomNumbers = new ArrayList<>();
    private final int min, max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                randomNumbers.add(random.nextInt((max - min) + 1) + min);
                return true;
            }

            @Override
            public Integer next() {
                int value = randomNumbers.get(0);
                randomNumbers.remove(0);
                return value;
            }
        };
    }
}
