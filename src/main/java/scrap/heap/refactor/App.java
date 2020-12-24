package scrap.heap.refactor;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

         //Place birthday party orders
        PartyOrder order1 = new PartyOrder();
        order1.addBallons(new Ballon(Ballon.Color.red, Ballon.Material.mylar, 4));
        order1.addCake(new Cake(Cake.Flavor.chocolate, Cake.FrostingFlavor.chocolate, Cake.Shape.circle, Cake.Size.large, Cake.Color.brown));
        order1.placeOrder();

        PartyOrder order2 = new PartyOrder();
        order2.addBallons(new Ballon(Ballon.Color.blue, Ballon.Material.latex, 7));
        order2.addCake(new Cake(Cake.Flavor.vanilla, Cake.FrostingFlavor.chocolate, Cake.Shape.square, Cake.Size.med, Cake.Color.brown));
        order2.placeOrder();

        PartyOrder order3 = new PartyOrder();
        order3.addBallons(new Ballon(Ballon.Color.yellow, Ballon.Material.mylar, 4));
        order3.addCake(new Cake(Cake.Flavor.vanilla, Cake.FrostingFlavor.vanilla, Cake.Shape.square, Cake.Size.small, Cake.Color.yellow));
        order3.placeOrder();

        /*
         order("red", "mylar", "4", "chocolate", "chocolate", "circle", "large", "brown" );
         order("blue", "latex", "7", "Vanilla", "chocelate", "square", "med", "brown" );
         order("yellow", "mylar", "4", "vanilla", "vanilla", "square", "small", "yellow" );
        */
    }

}
