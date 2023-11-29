package Notes;

public class Reverse {
    public static void main(String[] args){
        System.out.println(reverse("strong"));
    }

    public static String reverse (String word){
        String reversedString = "";
        String letter;
        for (int a = 0; a < word.length(); a++){
            letter = word.substring(a, a+1);
            reversedString = letter + reversedString;
        }
        return reversedString;
    }



}



