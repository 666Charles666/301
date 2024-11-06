public class Components {
    private String name,    description,    quantity,   quality;
    //constructor
    public Components(String name,String description,String quantity,String quality){
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.quality = quality;
    }
    //getter and setter method
    public String getName(){
    return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}

