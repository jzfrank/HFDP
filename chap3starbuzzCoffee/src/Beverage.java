public abstract class Beverage {
    String description = "Unknown Beverage";
    int size = 0;

    public String getDescription() {
        return description;
    }
    public abstract double cost();

    public int getSize() {
        return size;
    }


    public void setSize(int size) {
        this.size = size;
    }
}
