package entities;

public class Load {
    private double height;
    private double widht;
    private double lenght;
    private double wight;

    public Load(double height, double widht, double wight, double lenght) {
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

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }
}
