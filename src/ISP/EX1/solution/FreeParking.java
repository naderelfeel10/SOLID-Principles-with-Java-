package ISP.EX1.solution;

public class FreeParking implements ParkingLot {


    // ok it will override these functions
    @Override
    public void parkCar(){
        System.out.println("car parked");
    }
    @Override
    public void unparkCar(){
        System.out.println("car unparked");
    }
    @Override
    public void getCapacity(){
        System.out.println("car capacity");
    }


}
