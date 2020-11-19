package Vehicle;
public class Bicycle extends Vehicle{
    private int myGearCount;

    public Bicycle() {
        System.out.printf("Bicycle\n");
    }

    public int MyGearCount() {
        return myGearCount;
    }

    public void setGearCount(int GearCount) {
        this.myGearCount = GearCount;
    }
    
    
    
}
