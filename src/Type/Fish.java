package Type;
import Animal.Animal;

public class Fish extends Animal {
    private String habitat;
    private String ventilation;

    public Fish() {
        super();
        habitat = "Water";
        ventilation = "Gill";
    }
    public Fish(float height, float weight, String animalType, String bloodType, String habitat, String ventilation) {
        super(height, weight, animalType, bloodType);
        this.habitat = habitat;
        this.ventilation = ventilation;
    }

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String getVentilation() {
        return ventilation;
    }
    public void setVentilation(String ventilation) {
        this.ventilation = ventilation;
    }

    
}
