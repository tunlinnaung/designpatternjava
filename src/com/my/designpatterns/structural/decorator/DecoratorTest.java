package com.my.designpatterns.structural.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        FlowerBouquet roseBouquet = new RoseBouquest();
        System.out.println(roseBouquet.getDescription() + "-> $" + roseBouquet.cost());

        FlowerBouquet decoratedRoseBouquet = new RoseBouquest();
        decoratedRoseBouquet = new PaperWrapper(decoratedRoseBouquet);
        decoratedRoseBouquet = new Glitter(decoratedRoseBouquet);
        decoratedRoseBouquet = new RipponBow(decoratedRoseBouquet);
        System.out.println(decoratedRoseBouquet.getDescription() + "-> $" + decoratedRoseBouquet.cost());

        FlowerBouquet doublePapperRoseBouquet = new RoseBouquest();
        doublePapperRoseBouquet = new PaperWrapper(doublePapperRoseBouquet);
        doublePapperRoseBouquet = new PaperWrapper(doublePapperRoseBouquet);
        doublePapperRoseBouquet = new RipponBow(doublePapperRoseBouquet);
        System.out.println(doublePapperRoseBouquet.getDescription() + "-> $" + doublePapperRoseBouquet.cost());
    }
}
