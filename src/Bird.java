public class Bird extends Animal{
    protected boolean canFly;

    public Bird(int legCount, boolean canFly) {
        super(legCount);
        this.canFly = canFly;
    }

    public Bird() {
        legCount = 2;
        canFly = false;
    }

    public int getLegCount() {
        return 2;
    }

    public boolean getCanFly() {
        return canFly;
    }
}
