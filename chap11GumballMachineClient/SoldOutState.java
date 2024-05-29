public class SoldOutState implements State {
    private final static long serialVersionUID = 1L;
    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("It's sold out, you shouldn't insert quarters");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("It's sold out, you shouldn't eject quarters");
    }

    @Override
    public void turnCrank() {
        System.out.println("Cant's turn crank");
    }

    @Override
    public void dispense() {
        System.out.println("Can't dispense");
    }

    public void refill(int amount) {
        System.out.println("Refilling the gumballMachine with " + amount + " gumballs");
        gumballMachine.setCount(amount);
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
