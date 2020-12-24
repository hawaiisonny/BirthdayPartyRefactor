package scrap.heap.refactor;

import java.util.*;

public class PartyOrder {
    List<Ballon> ballonList = null;
    List<Cake> cakeList = null;

    public PartyOrder() {
        ballonList = new ArrayList<>();
        cakeList = new ArrayList<>();
    }

    public void addBallons(Ballon ballon) {
        ballonList.add(ballon);
    }

    public void addCake(Cake cake) {
        cakeList.add(cake);
    }

    public void placeOrder() {
        for (Ballon ballon : ballonList) {
            orderBalloons(ballon);
        }

        for (Cake cake : cakeList) {
            orderCake(cake);
        }
    }

    private void orderBalloons(Ballon ballon){
        //for the purposes of this exercise, pretend this method works and adds balloons to the order
        System.out.println("Balloons ordered; " + ballon.getColor() + ", " + ballon.getMaterial()  + ", " + ballon.getNumber());

    }

    private void orderCake(Cake cake){
        //for the purposes of this exercise, pretend that this method adds a cake to the order
        System.out.println("cake ordered; " + cake.getFlavor() + ", " + cake.getFrostingFlavor()  + ", " + cake.getShape() + ", " + cake.getSize() + ", " + cake.getColor());

    }

}
