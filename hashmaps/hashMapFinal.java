import java.util.*;

public class hashMapFinal<K, V> {
    ArrayList<LinkedList<Entity>> list;

    private int size = 0;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    public hashMapFinal(){
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key,V value){
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList <Entity> entities = list.get(hash);
        for (Entity entity : entities) {
            if(entity.key.equals(key)){
                entity.val = value;
                return;
            }
        }
        if ((float)(size) / list.size() > DEFAULT_LOAD_FACTOR) {
            reHash();
        }
        entities.add(new Entity(key, value));
        size++;
    }

    private void reHash(){
        System.out.println("We are Rehashing");
        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();

        size = 0; 
        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }
        for (LinkedList<Entity> bucket : old) {
            for (Entity entry : bucket) {
                put(entry.key, entry.val);
            }
        }
    }

    public V get(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                return entity.val;
            }
        }
        return null;
    }

    public void remove(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        Entity target = null;
        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                target = entity;
                break;
            }
        }
        if (target != null) {
            entities.remove(target);
            size--;
        }
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for (LinkedList<Entity> entities : list) {
            for (Entity entity : entities) {
                builder.append(entity.key);
                builder.append("=");
                builder.append(entity.val);
                builder.append(",");
            }
        }
        if (builder.length() > 1) {
            builder.deleteCharAt(builder.length() - 1); // Remove trailing comma
        }
        builder.append("}");
        return builder.toString();
    }

    public boolean containsKey(K key){
        return get(key) != null;
    }

    private class Entity {
        K key;
        V val;

        public Entity(K key, V val) {
            this.key = key;
            this.val = val;
        }

    }
}
