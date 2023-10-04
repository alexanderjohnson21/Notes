package Notes;

public class addString {
    
    public static void main(String[] args){
        
        String a = "alex";

        String g = "\\";
        System.out.println(a + g);

        String h = "\"";
        System.out.println(a + h);

        
        String one = "hello";
        String two = "goodbye";
        System.out.println(one + " " + two);
        one += " " + two;
        System.out.println(one);

        System.out.println(one +1+1);
        one +=1 +1;
        System.out.println(one);
        System.out.println(one+ true);
        
    }

}
