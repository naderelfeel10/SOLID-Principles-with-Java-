package ISP.EX1;

import ISP.EX1.solution.FreeParking;
import ISP.EX1.solution.NormalParking;

public class Main {
    public static void main(String[] args) {
        FreeParking freeParking = new FreeParking();
        freeParking.parkCar();
        //freeParking.doPayment();  // not found

        NormalParking normalParking = new NormalParking();
        normalParking.parkCar();
        normalParking.doPayment();   //found


    }
}
