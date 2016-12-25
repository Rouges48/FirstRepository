package comparators;

import cats.Cat;

import java.util.Comparator;

/**
 * Created by Tim on 22.07.2016.
 */
public class AgeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Cat cat1 = (Cat) o1;
        Integer cat1Age = new Integer(cat1.getAge());

        Cat cat2 = (Cat) o2;
        Integer cat2Age = new Integer(cat2.getAge());

        return cat1Age.compareTo(cat2Age);
    }
}
