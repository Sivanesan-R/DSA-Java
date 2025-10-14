import java.util.*;

public class HuffmanCoder {
    HashMap<Character,String> encoder;
    HashMap <String,Character> decoder;

    private class Node implements Comparable<Node>{
        Character data;
        int cost;
        Node left;
        Node right;

        public Node(Character data,int cost){
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }
        @Override
        public int compareTo(Node other){
            return this.cost - other.cost;
        }
    }
    public HuffmanCoder(String feeder) throws Exception{
        HashMap<Character,Integer> fmap = new HashMap<>();

        for (int i = 0; i < feeder.length(); i++) {
            char cc = feeder.charAt(i);
            if (fmap.containsKey(cc)) {
                int ov = fmap.get(cc);
                ov += 1;
                fmap.put(cc, ov);
            } else {
                fmap.put(cc, 1);
            }
        }

        Heap<Node> minheap = new Heap<>();
        Set<Map.Entry<Character,Integer>> entrtSet = fmap.entrySet();
        
        for (Map.Entry<Character,Integer> entry : entrtSet) {
            Node node = new Node(entry.getKey(), entry.getValue());
            minheap.insert(node);
        }

        while (minheap.size() != 1) {
            Node first = minheap.remove();
            Node second = minheap.remove();

            Node newNode = new Node('\0',first.cost + second.cost);
            newNode.left = first;
            newNode.right = second;

            minheap.insert(newNode);
        }

        Node ft = minheap.remove();

        this.encoder = new HashMap<>();
        this.decoder = new  HashMap<>();

        this.initEncodeDecoder(ft,"");
    }

    private void initEncodeDecoder(Node node,String osf){
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            this.encoder.put(node.data, osf);
            this.decoder.put(osf,node.data);
        }
        initEncodeDecoder(node.left,osf+"0");
        initEncodeDecoder(node.right,osf+"1");
    }

    public String encode(String source){
        String ans = "";

        for (int i = 0; i < source.length(); i++) {
            ans = ans + encoder.get(source.charAt(i));
        }

        return ans;
    }
    public String decode(String codedString){
        String key = "";
        String ans = "";
        
        for (int i = 0; i < codedString.length(); i++) {
            key = key + codedString.charAt(i);
            if (decoder.containsKey(key)) {
                ans = ans + decoder.get(key);
                key = "";
            }
        }
        return ans;
    }
}
