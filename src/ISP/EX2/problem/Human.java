package ISP.EX2.problem;

public class Human implements Worker {
    @Override
    public void work() {
        System.out.println("Human working on the assembly line.");
    }

    @Override
    public void eat() {
        System.out.println("Human is taking a lunch break.");
    }
}
