package DSA_ASSIGNMENT_1;

public class p4 {
    public static void printpermutation(StringBuffer s) {
        int k = 0 ,l = 0;
        boolean end = false;
        
        while (true) {
            System.out.println(s);
            end = true;
            for (int i=s.length()-2 ;i>=0 ; i--) 
                if (s.charAt(i)< s.charAt(i+1)) {
                    k = i;
                    end = false;
                    break;
                }
            if (end) {
                break;
            }
            for (int i=s.length()-1 ; i > k ; i--) 
                if (s.charAt(k) < s.charAt(i)) {
                    l = i;
                    break;
                }
            char temp = s.charAt(k);
            s.setCharAt(k, s.charAt(l));
            s.setCharAt(l, temp);

            StringBuffer tempString = new StringBuffer(s.substring(k + 1));
            tempString.reverse();
            s.replace(k+1, s.length(), tempString.toString());
        } 
    }
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("carbon");
        printpermutation(s);
    }
}
