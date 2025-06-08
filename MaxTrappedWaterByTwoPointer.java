import java.util.*;

public class MaxTrappedWaterByTwoPointer {
    
    public static void Solution(ArrayList<Integer> lines){

        int lp=0;
        int rp=lines.size()-1;
        int maxwater=0;

        while(lp <rp){

            int height=Math.min(lines.get(lp),lines.get(rp));
            int width=rp-lp;
            int currwater=height* width;
            maxwater=Math.max(maxwater,currwater);

            if(lines.get(lp) < lines.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        System.out.println(maxwater);
    }
    public static void main(String args[]){
    
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
