public class Test{
    public static void main(String[] args){
        Test t = new Test();
        t.go();
    }
    
    public void go(){
        IEstimatable house = new House(100, 10);
        System.out.println(house.estimate());
        
        IEstimatable house_solid = new SolidConstructionHouse(100, 10);
        System.out.println(house_solid.estimate());
    }
}
