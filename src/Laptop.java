public class Laptop {
    private String model;
    private String brand;
    private Float screenSize;


//    public Laptop(){
//
//    }

    public Laptop(String model, String brand){
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }


    public Float getScreenSize() {
        return screenSize;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
