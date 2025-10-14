
public class mapusinghash {
    private Entity[] entities;

    public mapusinghash(){
        entities = new Entity[100];

    }

    public void put(String key,String val){
        int hash = Math.abs(key.hashCode() % entities.length);
        // NOTE: This implementation does not handle hash collisions.
        // If two different keys have the same hash code, the previous entry will be overwritten.
        entities[hash] = new Entity(key, val);
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].val;
        }
        return null;
    }

    public void remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);  
        if (entities[hash] != null && entities[hash].key.equals(key)){
            entities[hash] = null;
        }
    }

    private class Entity {
        String key;
        String val;

        public Entity(String key,String val){
            this.key = key;
            this.val = val;
        }
        
    }

    public static void main(String[] args) {
        hashMapFinal<String,String> map = new hashMapFinal<>();
        map.put("siva", "is a developer");
        map.put("karan", "is a tester");
        map.put("siva", "ml");
        System.out.println(map.get("siva"));
        System.out.println(map.get("siva"));
        System.out.println(map.get("karan"));
        System.out.println(map);
        map.remove("siva");
        // System.out.println(map.get("siva"));
    }
}
