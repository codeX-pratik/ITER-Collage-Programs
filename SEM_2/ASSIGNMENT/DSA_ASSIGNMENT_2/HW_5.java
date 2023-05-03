interface RestaurantMeal {
    String getName();
    double getPrice();
}

interface HotelService {
    String getServiceName();
    double getServiceFee();
    int getRoomNumber();
}

class RoomServiceMeal implements RestaurantMeal, HotelService {
    private String name;
    private double price;
    private String serviceName;
    private double serviceFee;
    private int roomNumber;
    
    public RoomServiceMeal() {
        this.name = "steak dinner";
        this.price = 600;
        this.serviceName = "room service";
        this.serviceFee = 24;
        this.roomNumber = 1202;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public double getPrice() {
        return price;
    }
    
    @Override
    public String getServiceName() {
        return serviceName;
    }
    
    @Override
    public double getServiceFee() {
        return serviceFee;
    }
    
    @Override
    public int getRoomNumber() {
        return roomNumber;
    }
    
    public void display() {
        double totalFee = price + serviceFee;
        System.out.println("The Total fee is " + totalFee);
    }
}

public class HW_5 {
    public static void main(String[] args) {
        RoomServiceMeal meal = new RoomServiceMeal();
        meal.display();
    }
}
