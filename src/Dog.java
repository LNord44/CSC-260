public class Dog extends Animal{
    protected String name;

    public Dog(int legCount, String name) {
        super(legCount);
        this.name = name;
    }

    public Dog() {
        legCount = 4;
        name = "No Name";
    }

    public int getLegCount() {
        return 4;
    }

}
