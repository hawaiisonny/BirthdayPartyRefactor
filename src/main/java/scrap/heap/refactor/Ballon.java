package scrap.heap.refactor;

public class Ballon {

    public enum Color {
        red,
        blue,
        yellow
    }

    public enum Material {
        mylar,
        latex
    }

    private Color color;
    private Material material;
    private int number;

    public Ballon(Color color, Material material, int number) {
        this.color = color;
        this.material = material;
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public Material getMaterial() {
        return material;
    }

    public int getNumber() {
        return number;
    }

}
