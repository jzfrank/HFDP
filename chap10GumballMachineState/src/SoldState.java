public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
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
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Running of of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }
}

