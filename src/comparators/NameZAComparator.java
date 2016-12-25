package comparators;

import cats.Cat;

import java.util.Comparator;

/**
 * Created by Tim on 22.07.2016.
 */
public class NameZAComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Cat cat1 = (Cat) o1;
        String cat1Name = cat1.getName();

        Cat cat2 = (Cat) o2;
        String cat2Name = cat2.getName();

        return cat2Name.compareTo(cat1Name); //reverse order!!!!!!!!!
    }
}
