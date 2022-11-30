import java.util.Map;

class ExMultiTypeGeneric<K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public V setValue(V value) {
        this.value = value;
        return value;
    }

}

public class google_Generics_MultiTypeGenerics {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
