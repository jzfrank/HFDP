import java.util.Enumeration;
import java.util.Iterator;
// many legacy codes depend on Enumeration interface
// this class is an adapter to convert an Iterator to an Enumeration

public class IteratorEnumeration implements Enumeration {
    Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
