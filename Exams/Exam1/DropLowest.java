import java.util.*;
public class DropLowest implements IFilter{
    
    @Override
    public int[] filter(int[] ary){
        int[] copy = new int[ary.length - 1];
        Arrays.sort(ary);
        for(int i = 1; i < copy.length; i++){
            copy[i - 1] = ary[i];
        }
        return copy;
    }
}