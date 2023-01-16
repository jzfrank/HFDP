public class FillAndBoiledChocolateBoiler implements Runnable {
    @Override
    public void run() {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        chocolateBoiler.fill();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        chocolateBoiler.boil();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
    }
}
