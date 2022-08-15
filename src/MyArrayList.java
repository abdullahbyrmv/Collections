import java.util.Iterator;

public class MyArrayList implements Iterable<String> {
    private String[] elementData = new String[10];
    int size = 0;

    public void add(String element) {
        ensureCapacity();
        elementData[size++] = element;
    }

    public void ensureCapacity() {
        if (elementData.length == size) {
            String arr2[] = new String[elementData.length / 2 + elementData.length];
            for (int i = 0; i < elementData.length; i++) {
                arr2[i] = elementData[i];
            }
            elementData = arr2;
        }
    }

    public String get(int i) {
        return elementData[i];
    }

    public int size() {
        return size;
    }

    private Iterator iter = new Iterator() {

        int i = 0;

        @Override
        public boolean hasNext() {
            return elementData.length < ++i;
        }

        @Override
        public Object next() {
            return elementData[++i];
        }
    };

    @Override
    public Iterator<String> iterator() {
        return iter;
    }
}
