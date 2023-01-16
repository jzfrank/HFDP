public class TestDriver {
    public static void main(String[] args) {
        for (int i=0; i<3; i++) {
            FillAndBoildChocolateBoiler fillAndBoildChocolateBoiler = new FillAndBoildChocolateBoiler();
            Thread myThread = new Thread(fillAndBoildChocolateBoiler);
            myThread.start();
        }
    }


}
