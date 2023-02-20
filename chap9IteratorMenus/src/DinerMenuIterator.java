import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] list;
    int position = 0;
    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }
    @Override
    public boolean hasNext() {
        return position < list.length && list[position] != null;
    }

    @Override
    public Object next() {
        MenuItem nextMenuItem = list[position++];
        return nextMenuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove element unless you have done at least one next() call");
        }
        if (list[position-1] != null) {
            for (int i=position-1; i<list.length-1; i++) {
                list[i] = list[i+1];
            }
            list[list.length-1] = null;
        }
        Iterator.super.remove();
    }
}
