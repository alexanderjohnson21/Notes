package Notes;

public class TwoSidedCoin {
    //instance variables are the first thing in our class

    private String club= "";
    private int numOfActive;
    private int numOfInactive;
    private int totalPeople;
    private String president;

    //Following instance variable above we have the constructor
    TwoSidedCoin(String club, int active, int inactive, String president){
        this.club = club;
        this.numOfActive = active;
        this.numOfInactive = inactive;
        this.totalPeople = active + inactive;
        this.president = president;
    }

    // two functions
    public void gainParticipant(String[] adds){
        this.numOfInactive += adds.length;
        this.totalPeople += adds.length;
    }

    public void lostParticipants(String[] loses){
        this.numOfActive -= loses.length;
        this.totalPeople -= loses.length;
    }

}