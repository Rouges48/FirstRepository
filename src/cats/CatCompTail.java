package cats;

/**
 * Created by Tim on 22.07.2016.
 */
public class CatCompTail extends Cat implements Comparable<Cat> {

    public CatCompTail(Cat cat) {
        super(cat.getName(), cat.getAge(), cat.getTailLength());
    }

    public CatCompTail(String name, int age, int tailLength) {
        super(name, age, tailLength);
    }

    @Override
    public int compareTo(Cat o) {
        Integer ownTale = new Integer(getTailLength());
        Integer incomingTale = new Integer(o.getTailLength());
        return ownTale.compareTo(incomingTale);
    }
}
