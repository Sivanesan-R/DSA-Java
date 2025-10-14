public class Main {
    public static void main(String[] args) throws Exception{
        String str = "abbccda";
        HuffmanCoder hf = new HuffmanCoder(str);
        String cs = hf.encode(str);
        System.out.println(cs);
        String ds = hf.decode(str);
        System.out.println(ds);
    }
}
