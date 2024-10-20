class Elefant  extends Erbivor implements Animal{
    @Override
    public void eat() {
        System.out.println("Elefantul maninca iarba.");
    }

    @Override
    public String placeTheyLive() {
        return "Elefantii traiesc  in savane.";
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean hasFur() {
        return false;
    }

    @Override
    public String diet() {
        return "Elefatii sunt erbivori care se hranesc cu plante.";
    }
}