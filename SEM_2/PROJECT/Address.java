package PROJECT;

public class Address {
    private String street;
    private String city;
    private String state;
    private int pincode;

    Address(String street , String city , String state , int pincode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    //setter
    public void setStreet(String street) {
        this.street = street;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setPinCode(int pincode) {
        this.pincode = pincode;
    }

    //getter
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public int pincode() {
        return pincode;
    }

    public String getAddress() {
        return (street + " , " + city + " , " + state + " , " + pincode);
    }
}
