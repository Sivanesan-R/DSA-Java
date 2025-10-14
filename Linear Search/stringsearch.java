public class stringsearch {
    public static void main(String [] args){
        String name ="siva";
        char target = 'i';
        System.out.println(search(name,target));
    }
    static boolean search(String arr,char target){
        if(arr.length() == 0){
            return false;
        }
        for(int i =0;i<arr.length();i++){
            if(target == arr.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
