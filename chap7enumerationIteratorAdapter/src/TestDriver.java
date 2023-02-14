import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class TestDriver {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        int n = 10;
        for (int i=0; i<n; i++) {
            arrayList.add(i);
        }

        Iterator iter = arrayList.iterator();

        System.out.println("convert arrayList as an iterator");
        for (int i=0; i<n; i++) {
            System.out.println(iter.next());
        }

        System.out.println("adapt the iterator as an enumeration");
        Enumeration enumeration = new IteratorEnumeration(arrayList.iterator());
        for (int i=0; i<n; i++) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("adapt the enumeration converted from iterator back to iterator");
        Iterator iterator = new EnumerationIterator(new IteratorEnumeration(arrayList.iterator()));
        for (int i=0; i<n; i++) {
            System.out.println(iterator.next());
        }

    }
}
