import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    protected int min, max;
    List<Integer> randomNumbers = new ArrayList<>();

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int nextValue = 0;

            @Override
            public boolean hasNext() {
                randomNumbers.add(random.nextInt((max - min) + 1) + min);
                return nextValue < randomNumbers.size();
            }

            @Override
            public Integer next() {
                return randomNumbers.get(nextValue++);
            }
        };
    }
}
