import java.util.*;

public class SolidConstructionHouse extends House{
    public SolidConstructionHouse(double width, double length){
        super(length, width); //using extended class' constructor
    }
    
    @Override
    public double estimate(){
        //dont quite get this? (error portion)
        try{
            return (super.estimate() * 1.25); //using the extended classes estimate and multiplay by 1.25 to make it 25% higher
        }catch(Exception e){
            System.err.println("error");
            return 0;
        }
    }
}