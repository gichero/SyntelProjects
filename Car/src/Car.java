
public class Automobile {
    //create instant variables of String type
    private String vehicleIdNo;
    private String make;
    private String model;
    private String color;

    // Create a constructor
    public Automobile(String vehicleIdNo,String make,String model,String color){
        this.vehicleIdNo = vehicleIdNo;
        this.make = make;
        this.model = model;
        this.color = color;
    }
    // create get and set methods
    public String getVehicleIdNo() {
        return vehicleIdNo;
    }

    public void setVehicleIdNo(String vehicleIdNo) {
        this.vehicleIdNo = vehicleIdNo;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // create a method that will return a String value
    public String getData(){
        return  "\n" + "Vehicle Id Number: " + vehicleIdNo + "\n" + "Make: " + make + " \n" + "Model: " + model +  "\n"  + "Color: " + color;
    }

}


