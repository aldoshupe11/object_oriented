import java.util.*;

public class House implements IEstimatable{
    
    //private house variables for calculations
    private double m_length;
    private double m_width;
    private int price_rate = 97;
    
    public House(double length, double width){
        m_length = length;
        m_width = width;
    }
    
    @Override
    public double estimate(){
        try{
            return ((m_length * m_width)) * price_rate;
        }catch(Exception e){
            throw new Error("error");
        }
    }
}