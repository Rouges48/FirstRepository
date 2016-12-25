import cats.Cat;
import cats.CatCompTail;
import comparators.AgeComparator;
import comparators.NameAZComparator;
import comparators.NameZAComparator;

import java.util.*;

/**
 * Created by Tim on 22.07.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tomas", 5, 3);
        Cat cat2 = new Cat("Barsik", 2, 8);
        Cat cat3 = new Cat("Murzik", 6, 5);

        testComparable(cat1, cat2, cat3);
        testComratatorList(cat1, cat2, cat3);
    }

    private static void testComparable(Cat cat1, Cat cat2, Cat cat3) {
        System.out.println("=== testComparable");
        System.out.println("== TreeSet<cats.Cat>");
        try {
            Set<Cat> cats = new TreeSet<Cat>();
            cats.add(cat1);
            cats.add(cat2);
            cats.add(cat3);
            print(cats);
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("== TreeSet<cats.CatCompTail>");
        Set<CatCompTail> catsComp = new TreeSet<CatCompTail>();
        catsComp.add(new CatCompTail(cat1));
        catsComp.add(new CatCompTail(cat2));
        catsComp.add(new CatCompTail(cat3));
        print(catsComp);
    }

    private static void testComratatorList(Cat cat1, Cat cat2, Cat cat3) {
        System.out.println("=== testComratatorList");
        System.out.println("== ArrayList<cats.Cat> as is");
        List<Cat> list = new ArrayList<Cat>();
        list.add(cat1);
        list.add(cat2);
        list.add(cat3);
        print(list);

        System.out.println("== ArrayList<cats.Cat> sorted by age");
        Collections.sort(list, new AgeComparator());
        print(list);

        System.out.println("== ArrayList<cats.Cat> sorted by name AZ");
        Collections.sort(list, new NameAZComparator());
        print(list);

        System.out.println("== ArrayList<cats.Cat> sorted by name ZA (reverse)");
        Collections.sort(list, new NameZAComparator());
        print(list);
    }

    private static void print(Collection<? extends Cat> cats) {
        //avarage approach
        for (Cat cat : cats) {
            System.out.println(cat);
        }
//        //Java8-style
//        cats.forEach( (cat) -> {
//            System.out.println(cat);
//        });
    }

}
