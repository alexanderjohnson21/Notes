package Notes;

public class longestStreak {
    
    public static void main (String[] args){
       Streak("CCAAAAATTT!");

    }

        public static void Streak(String str){

            int streakCount = 1;
            int highScoreStreak= 0;
            String letter = "";

            for (int i = 0;  i < str.length()-1; i++ ){
                
                if (str.substring(i, i+1).equals(str.substring(i+1,i+2))){
                    streakCount ++;
                    if( streakCount > highScoreStreak){
                        letter = str.substring(i, i+1);
                        highScoreStreak = streakCount;

                    }
                }
                else {
                    streakCount = 1;
                }
            }
            
            System.out.println(letter + " " + highScoreStreak);
        }




}   
