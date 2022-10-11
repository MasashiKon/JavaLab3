package Type;
import Animal.Animal;

public class Bird extends Animal{
    boolean hasFeather;
    boolean canFly;

    public Bird() {
        super();
        this.hasFeather = true;
        this.canFly = true;
    }
    
    public Bird(float height, float weight, String animalType, String bloodType, boolean hasFeather, boolean canFly) {
        super(height, weight, animalType, bloodType);
        this.hasFeather = hasFeather;
        this.canFly = canFly;
    }

    public boolean isHasFeather() {
        return hasFeather;
    }

    public void setHasFeather(boolean hasFeather) {
        this.hasFeather = hasFeather;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    
}
