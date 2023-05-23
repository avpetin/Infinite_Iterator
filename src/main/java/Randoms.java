import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    List<Integer> randomNumbers = new ArrayList<>();

    public Randoms(int min, int max){
        randomNumbers.add(new Random().nextInt((max - min) + 1) + min);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int nextValue = 0;

            @Override
            public boolean hasNext() {
                return nextValue < randomNumbers.size();
            }

            @Override
            public Integer next() {
                return randomNumbers.get(nextValue++);
            }
        };
    }
}
