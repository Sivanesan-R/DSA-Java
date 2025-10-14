public class main {
    private int PRIME = 101;

    private double calculateHash(String str) {
        double hash = 0;
        for (int i = 0; i < str.length(); i++) {
            hash =  (hash + str.charAt(i) * Math.pow(PRIME, i));
        }

        return hash;
    }

    private double updateHash(double prevhash, char oldChar, char newChar, int patternLength) {
        double newHash = (prevhash - oldChar) / PRIME;
        newHash = (newHash + newChar * Math.pow(PRIME, patternLength - 1));
        return newHash;
    }

    public void search(String str,String pattern){
        int patternLength = pattern.length();
        double patternHash = calculateHash(pattern);
        double textHash = calculateHash(str.substring(0,patternLength));

        for (int i = 0; i <= str.length() - patternLength ; i++) {
            if (textHash == patternHash) {
                if (str.substring(i, i+ patternLength).equals(pattern)) {
                    System.out.println("Pattern found at index " + i);
                }
            }
            if (i < str.length() - patternLength) {
                textHash = updateHash(textHash, str.charAt(i), str.charAt(i + patternLength), patternLength);
            }
        }
    }
}
