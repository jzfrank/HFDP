public class WinnerState implements State {
    private final static long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert quarter. Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject quarter, since you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can't turn crank, since you already turned the crank once");
    }

    @Override
    public void dispense() {
        System.out.println("YOU'ARE WINNER! You get two gumballs");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Running out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override
    public void refill(int amount) {
        System.out.println("Can't refill");
    }
}
