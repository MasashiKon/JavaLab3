package Family;
import Type.Reptile;

public class Crocodile extends Reptile {

    public Crocodile() {
        super();
    }

    public Crocodile(float height, float weight, String animal, String bloodType, String skinType, String bone,
            String eggType) {
        super(height, weight, animal, bloodType, skinType, bone, eggType);
    }

    @Override
    public String toString() {
        return "Crocodile [height= " + this.getHeight() + " weight= " + this.getWeight() + " animal= " + this.getAnimalType() + " bloodType= " + this.getBloodType() + " skinType= " + this.getSkinType() + " bone= " + this.getBone() + " eggType= " + this.getEggType() + "]";
    }

    public String ShowInfo() {
        return this.toString();
    }
    
}
