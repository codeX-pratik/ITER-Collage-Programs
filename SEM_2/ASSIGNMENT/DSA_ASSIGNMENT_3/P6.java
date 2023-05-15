
class Box<T> {
    T data;
    Box(T d) {
        this.data = d;
    }
    public T getdata() {
        return data;
    }
}

public class P6 {
    public static void main(String[] args) {
        //String
        Box<String> s1 = new Box<>("Hello world");
        Box<String> s2 = new Box<>("Hello Everyone");

        System.out.println("----> String object Created : ");
        System.out.println(s1.getdata());
        System.out.println(s2.getdata());
        
        //Integer
        Box<Integer> I1 = new Box<>(34);
        Box<Integer> I2 = new Box<>(95);

        System.out.println("----> Integer object Created : ");
        System.out.println(I1.getdata());
        System.out.println(I2.getdata());

        Box<Object> obj1 = new Box<>("Hello world");
        Box<Object> obj2 = new Box<>(45);

        System.out.println("----> Object object Created : ");
        System.out.println(obj1.getdata());
        System.out.println(obj2.getdata());

    }
}
