
package Q01;

public class Temperature {
    private double celcious;

    public Temperature() {
        this.celcious = 0.0;
    }

    public Temperature(double celcious) {
        this.celcious = celcious;
    }

    public double toCelsius() {
        return celcious;
    }

    public double toFahrenheit() {
        return (celcious * 9/5) + 32;
    }

    public double getCelsius() {
        return celcious;
    }

    public void setCelsius(double celcious) {
        this.celcious = celcious;
    }

    public void setFahrenheit(double farenheit) {
        this.celcious = (farenheit - 32) * 5 / 9;
    }
}