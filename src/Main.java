public class Main {
    public static void main(String[] args) {

        Animal elephant = new Elefant();
        elephant.eat();
        System.out.println(elephant.placeTheyLive());
        System.out.println("Poate zbura: " + elephant.canFly());
        System.out.println("Are blana: " + elephant.hasFur());

        Erbivor elephant2 = new Elefant();
        elephant2.printHerbivoreInfo();
        System.out.println(elephant2.diet());

    }
}
