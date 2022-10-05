package entities;

public class Load {
    private double height;
    private double widht;
    private double wight;

    public Load(double height, double widht, double wight) {
        this.height = height;
        this.widht = widht;
        this.wight = wight;
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
