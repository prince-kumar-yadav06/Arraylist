import java.util.ArrayList;
import java.util.*;
public class MultidimentionalList{

    public static void main(String args[]){

        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        
    ArrayList<Integer> list1=new ArrayList<>();
    list1.add(1);
    list1.add(2);

    ArrayList<Integer> list2=new ArrayList<>();
    list2.add(3);
    list2.add(67);

    mainlist.add(list1);
    mainlist.add(list2);

    for(int i=0;i<mainlist.size();i++){
        ArrayList<Integer> currlist=mainlist.get(i);
        for(int j=0;j<currlist.size();j++){
            System.out.print(currlist.get(j)+" ");
        }
        System.out.println();
    }
    System.out.println(mainlist);
}
    }