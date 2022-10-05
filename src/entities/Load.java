package entities;

public class Load {
    private int height;
    private int widht;
    private double lenght;
    private double wight;

    public Load(int height, int widht, int wight, double lenght) {
        this.height = height;
        this.widht = widht;
        this.lenght = lenght;
        this.wight = wight;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }
}
