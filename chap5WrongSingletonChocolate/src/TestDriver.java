public class TestDriver {
    public static void main(String[] args) {
        for (int i=0; i<3; i++) {
            FillAndBoiledChocolateBoiler fillAndBoiledChocolateBoiler = new FillAndBoiledChocolateBoiler();
            Thread myThread = new Thread(fillAndBoiledChocolateBoiler);
            myThread.start();
        }
    }


}
