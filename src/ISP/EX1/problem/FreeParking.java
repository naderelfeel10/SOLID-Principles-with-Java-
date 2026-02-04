package ISP.EX1.problem;

public class FreeParking implements ParkingLot{


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


    // error arises here : as no payment for freeParking cars
    @Override
    public double calcFee(Car car){
        return 0.0;
    }

    @Override
    public void doPayment(){
            //throw new Exception("Parking is free here");
    }

    // that's why we have to split the interface

}
