package structural.flyweight;

public class Main {
    public static void main(String[] args) {
        Font arial = FontFactory.getFont("Arial");
        arial.applyFont("Hello Arial!");

        Font timesNewRoman = FontFactory.getFont("Times New Roman");
        timesNewRoman.applyFont("Hello Times New Roman");

        Font arialReusable = FontFactory.getFont("Arial");
        arialReusable.applyFont("Hello reusable Arial!");
    }
}
