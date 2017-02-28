import java.util.*;
public class DropHighest implements IFilter{
    
    @Override
    public int[] filter(int[] ary){
        int[] copy = new int[ary.length - 1];
        Arrays.sort(ary);
        for(int i = 0; i < copy.length; i++){
            copy[i] = ary[i];
        }
        return copy;
    }
}