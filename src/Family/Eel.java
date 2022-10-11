package Family;

import Type.Fish;

public class Eel extends Fish{
    private String skill;

    public Eel() {
        super();
    }

    public Eel(float height, float weight, String animalType, String bloodType, String habitat, String ventilation, String skill) {
        super(height, weight, animalType, bloodType, habitat, ventilation);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Eel [height= " + this.getHeight() + " weight= " + this.getWeight() + " animal= " + this.getAnimalType() + " bloodType= " + this.getBloodType() + " habitat=" + this.getHabitat() + " ventilation=" + this.getVentilation() + " skill= " + this.getSkill() + "]";
    }

    public String ShowInfo() {
        return this.toString();
    }
    
}
