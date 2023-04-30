interface DetailInfo {
    public void display();
    public int  count();
}
class Person_p8 implements DetailInfo{
    static int maxcount = 0;
    String name;
    public void display() {
        System.out.println("The name of the person is " + name);
    }
    public int count()  {
        int length = name.length();
        if (length > maxcount) {
            maxcount = length;
        }
        return length;
    }
}
public class p8 {
    public static void main(String[] args) {
        Person_p8 per = new Person_p8();
        per.name = "pratik";
        per.display();
        System.out.println("The length of the Character is " + per.count());
        System.out.println("MAX COUNT : " + Person_p8.maxcount);
    }
}