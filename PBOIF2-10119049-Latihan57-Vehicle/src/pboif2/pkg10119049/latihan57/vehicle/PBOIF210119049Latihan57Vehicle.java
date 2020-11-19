package pboif2.pkg10119049.latihan57.vehicle;
/**
 * @author
 * Name  : Nur Sasongko
 * Class : PBOIF2
 * NIM   : 10119049
 * Program Description : Output infomation vehicle without machine
**/
import Vehicle.Bicycle;
import Vehicle.Skateboard;
public class PBOIF210119049Latihan57Vehicle {
    public static void main(String[] args) {
        
        // object bicycle
        Bicycle bi1 = new Bicycle();
        bi1.setBrand("Trek Bike");
        bi1.setModel("7.4FX");
        bi1.setGearCount(23);
        System.out.printf("Brand : %s\n", bi1.getBrand());
        System.out.printf("Model : %s\n", bi1.getModel());
        System.out.printf("Jumlah Gear : %d\n\n", bi1.MyGearCount());
        
        // object skateboard
        Skateboard sk1 = new Skateboard();
        sk1.setBrand("Ally Skate");
        sk1.setModel("Rocket");
        sk1.setBoardLength(54.5);
        System.out.printf("Brand : %s\n", sk1.getBrand());
        System.out.printf("Model : %s\n", sk1.getModel());
        System.out.printf("Panjangnya Board : %.1f\n\n", sk1.getBoardLength());
        
        
    }
    
}
