package ISP.EX2.problem;

public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot assembling parts.");
    }


    // the problem is :  Robots don't eat!
    // We are forced to write dummy code or throw an exception.
    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robots do not eat!");
    }
}
