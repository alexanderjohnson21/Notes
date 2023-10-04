package Notes;

public class Chp2 {
    
    public static void main(String[] args){
        TwoSidedCoin notAdamsCoin = new TwoSidedCoin ("Not Culinary Club", 40, 65, "");
        String[] parts = {"Tyler", "Jake" , "Alex" , "Joe"};
        notAdamsCoin.gainParticipant(parts); 
        System.out.println(notAdamsCoin.getInactiveMembers());
    }
       
}