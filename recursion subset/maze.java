import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        // System.out.println(count(3, 7));
        // mazepath("", 3, 3);
        // System.out.println(pathlist("", 3, 3));
        // System.out.println(pathdiagonal("", 3, 3));
        boolean [][] arr = {
            {true,true,true},
            {true,false,true},
            {true,true,true},
        };
        pathrestrict("", arr, 0, 0);
    }
    static int count(int row,int col){
        if (row == 1 || col == 1) {
            return 1;
        }
        int left = count(row -1 , col);
        int right = count(row, col-1);

        return left + right;
    }

    static void mazepath(String p,int r,int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            mazepath(p+'D', r-1, c); 
        }
        if(c > 1){
            mazepath(p+'R', r, c-1); 
        }
    }
    static ArrayList<String> pathlist(String p,int r,int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
            
        }
        ArrayList<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll(pathlist(p+'D', r-1, c));
        }
        if(c > 1){
            list.addAll(pathlist(p+'R', r, c-1) );
        }
        return list;
    }

    static ArrayList<String> pathdiagonal(String p,int r,int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
            
        }
        ArrayList<String> list = new ArrayList<>();

        if(r > 1 && c > 1){
            list.addAll(pathdiagonal(p+'D', r-1, c-1));
        }
        if(r > 1){
            list.addAll(pathdiagonal(p+'V', r-1, c));
        }

        if(c > 1){
            list.addAll(pathdiagonal(p+'H', r, c-1) );
        }
        return list;
    }
    
    static void pathrestrict(String p,boolean [][] maze,int r,int c){
        if(r == maze.length -1  && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length -1 ){
            pathrestrict(p+'D',maze ,r+1, c);
        }
        if(c < maze[0].length-1){
            pathrestrict(p+'R',maze ,r, c+1);
        }
    }
}
