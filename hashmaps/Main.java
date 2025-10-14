import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("siva", 53);
        hashMap.put("bala", 78);
        hashMap.put("sans", 89);
        // System.out.println(hashMap.get("siva"));
        // System.out.println(hashMap.get("bala"));
        // System.out.println(hashMap.getOrDefault("karan",89));
        // System.out.println(hashMap.containsKey("bala"));
        // System.out.println(hashMap.containsValue(53));

        HashSet<String> set = new HashSet<>();
        set.add("bala");
        System.out.println(set.contains("bala"));

    }
}
