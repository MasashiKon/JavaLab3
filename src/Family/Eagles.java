package Family;
import Type.Bird;

public class Eagles extends Bird{

    public Eagles() {
        super();
    }

    public Eagles(float height, float weight, String animalType, String bloodType, boolean hasFeather, boolean canFly) {
        super(height, weight, animalType, bloodType, hasFeather, canFly);
    }

    @Override
    public String toString() {
        return "Eagles [height= " + this.getHeight() + " weight= " + this.getWeight() + " animal= " + this.getAnimalType() + " bloodType= " + this.getBloodType() + "]";
    }
    
    public String ShowInfo() {
        return this.toString();
    }
    
}
