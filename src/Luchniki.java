public class Luchniki extends Spartansy {

    private String  height;  // бою

    private String weight; // вес

    public Luchniki(String name, String massa, String height, String weight) {
        super(name, massa);
        this.height = height;
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }



    }


