package ISP.EX1.problem;

public interface ParkingLot {
    void parkCar();
    void unparkCar();
    void getCapacity();
    double calcFee(Car car);
    void doPayment();
}
