import java.util.*;

public class MaxTrappedWater {
    
    public static void Solution(ArrayList<Integer> lines){

        int maxwater=Integer.MIN_VALUE;

        for(int i=0;i<lines.size();i++){
            for(int j=0;j<lines.size();j++){

                //min height to store water
                int height=Math.min(lines.get(i),lines.get(j));

                int width=j-i;
                int currwater=height * width;
                 maxwater=Math.max(currwater,maxwater);
            }
        }
        System.out.println(maxwater);
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> lines=new ArrayList<>();
        lines.add(1);
        lines.add(8);
        lines.add(6);
        lines.add(2);
        lines.add(5);
        lines.add(4);
        lines.add(8);
        lines.add(3);
        lines.add(7);

        Solution(lines);
    }
}
