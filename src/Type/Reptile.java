package Type;
import Animal.Animal;

public class Reptile extends Animal{
    
    private String skinType;
    private String bone;
    private String eggType;


    public Reptile() {
        super();
        this.skinType = "Dry";
        this.bone = "Backbone";
        this.eggType = "Soft-shelled eggs";
    }



    public Reptile(float height, float weight, String animal, String bloodType, String skinType, String bone,
            String eggType) {
        super(height, weight, animal, bloodType);
        this.skinType = skinType;
        this.bone = bone;
        this.eggType = eggType;
    }



    public String getSkinType() {
        return skinType;
    }



    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }



    public String getBone() {
        return bone;
    }



    public void setBone(String bone) {
        this.bone = bone;
    }



    public String getEggType() {
        return eggType;
    }



    public void setEggType(String eggType) {
        this.eggType = eggType;
    }

    

}
