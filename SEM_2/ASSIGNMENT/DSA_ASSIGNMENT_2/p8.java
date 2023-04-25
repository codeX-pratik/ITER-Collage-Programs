package DSA_ASSIGNMENT_2;

interface DetailInfo {
    void display();
    int count();
}
class Person implements DetailInfo{
    static int maxcount = 0;
    String name;
    public void display() {
        System.out.println("The name of the person is " + name);
    }
    public int count() {
        int count = name.length();
        if (count > maxcount) {
            maxcount = count;
        }
        return count;
        
    }
}
public class p8 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "javaprogram";
        p.display();
        System.out.println("The length of the Name is " + (p.count()));
        System.out.println(Person.maxcount);
    }
}

