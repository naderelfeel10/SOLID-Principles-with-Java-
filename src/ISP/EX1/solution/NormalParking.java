package ISP.EX1.solution;


public class NormalParking implements ParkingLot,ParkingPayment {



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


    @Override
    public double calcFee(Car car){
        double total = car.parkingPrice+0.14*car.parkingPrice;
        return total;
    }

    @Override
    public void doPayment(){
        System.out.println("noraml parking done");
    }

}
