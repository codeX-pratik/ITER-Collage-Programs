interface RestaurantMeal {
    String foodName = "steak dinner";
    double foodPrice = 600;
}

interface HotelService {
    String serviceName = "room service";
    double serviceFee = 24;
    int roomNumber = 1202;
}

class RoomServiceMeal implements RestaurantMeal, HotelService {
    void display() {
        System.out.println("A \"" + foodName + "\" costing Rs. " + foodPrice + " is a \"" + serviceName + "\" provided to room " + roomNumber + " for Rs. " + serviceFee);
        double totalFee = foodPrice + serviceFee;
        System.out.println("The Total fee to pay is Rs. " + totalFee);
    }
}

public class HW_5 {
    public static void main(String[] args) {
        RoomServiceMeal meal = new RoomServiceMeal();
        meal.display();
    }
}
