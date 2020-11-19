package Vehicle;
public class Skateboard extends Vehicle{
    private double myBoardLength;

    public Skateboard() {
        System.out.printf("Skateboard\n");
    }
       
    public double getBoardLength() {
        return myBoardLength;
    }

    public void setBoardLength(double BoardLength) {
        this.myBoardLength = BoardLength;
    }
    
    
}
