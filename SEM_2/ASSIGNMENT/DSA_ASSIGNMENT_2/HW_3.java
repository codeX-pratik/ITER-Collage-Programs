class Distance {
    double meter;
    double centimeter;
    Distance(double m , double cm) {
        this.meter = m;
        this.centimeter = cm;
    }
    void Display() {
        System.out.println("Meter : " + meter);
        System.out.println("Centimeter : " + centimeter);
    }
    public static Distance sum(Distance d1 , Distance d2) {
        double totalMeter = d1.meter + d2.meter;
        double totalCentimeter = d1.centimeter + d2.centimeter;
        if (totalCentimeter >= 100) {
            totalMeter += totalCentimeter / 100;
            totalCentimeter = totalCentimeter % 100;
        }
        return new Distance(totalMeter,totalCentimeter);
    }
}

public class HW_3 {
    public static void main(String[] args) {
        Distance d1 = new Distance(3, 50);
        System.out.println("---> Distance 1 : ");
        d1.Display();

        Distance d2 = new Distance(2, 75);
        System.out.println("---> Distance 2 : ");
        d2.Display();
        
        Distance sum = Distance.sum(d1 , d2);
        System.out.println("---> Distance 3 : ");
        sum.Display();

    }
}
