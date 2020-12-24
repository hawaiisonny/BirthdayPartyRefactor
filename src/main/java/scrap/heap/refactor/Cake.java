package scrap.heap.refactor;

public class Cake {

    public enum Flavor {
        chocolate,
        vanilla
    }

    public enum FrostingFlavor {
        chocolate,
        vanilla
    }

    public enum Shape {
        circle,
        square
    }

    public enum Size {
        large,
        med,
        small
    }

    public enum Color {
        brown,
        yellow
    }

    private Flavor flavor;
    private FrostingFlavor frostingFlavor;
    private Shape shape;
    private Size size;
    private Color color;

    public Cake(Flavor flavor, FrostingFlavor frostingFlavor, Shape shape, Size size, Color color) {
        this.flavor = flavor;
        this.frostingFlavor = frostingFlavor;
        this.shape = shape;
        this.size = size;
        this.color = color;
    }

    public Flavor getFlavor() {
        return flavor;
    }

    public FrostingFlavor getFrostingFlavor() {
        return frostingFlavor;
    }

    public Shape getShape() {
        return shape;
    }

    public Size getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

}
