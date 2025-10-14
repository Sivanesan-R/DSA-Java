public class hasmap<K, V>{
    
}

static class Node<K,V>{
    int hash;
    K key;
    V value;
    Node<K, V> next;

    public Node(int hash, K key, V value, Node<K, V> next) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public final K getKey(){
        return key;
    }
    public final V getValue(){
        return value;
    }
    public final String toString(){
        return key + " = " + value;
    }
    public final V setValue(V newvalue){
        V oldvalue = value;
        value = newvalue;
        return oldvalue;
    }

    public boolean put(K key, V value){
        return
    }
    
}