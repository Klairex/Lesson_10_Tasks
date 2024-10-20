public interface Animal {

    void eat();
    String placeTheyLive();
    boolean canFly();
    boolean hasFur();

    default void Info() {
        System.out.println("Acesta este un animal.");
    }
    static String describeAnimal() {
        return "Animalele sunt organisme multicelulare.";
    }
}

