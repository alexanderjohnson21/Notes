package Notes;

public class Chp1 {
  public static void main(String[] args){//public- makes the code public; static- there can only be one copy; void is the return type- not expecting a value back; could be double, int, etc. which will return a value; 
    int varName; //this is a declaration
    varName = Integer.MIN_VALUE;
    System.out.println (varName-1);

    //talking about sals home opening football
    int salsScore;
    int dmaScore;
    int thisIsTheScoreForTheTotal; //camelcase example
    salsScore = 44;
    dmaScore = 25;
    thisIsTheScoreForTheTotal = dmaScore+salsScore;
    System.out.println((dmaScore+salsScore)/10.0);
    System.out.println(thisIsTheScoreForTheTotal);

    String greeting = "hello";
    System.out.println(greeting);
    
    int month=9;
    //month= month+1;
    month -= 3;
    //month++ is to add one; month -- is to subtract one
    // +=1; -=1; /= 1; *=1; %=1; compound for addition, subrtraction, multiplication, mod, and division
    System.out.println(month);

    int y=2;
    y %=2;
    System.out.println(y);

    // 


  
  
  
  
  
  
  
  }
      
      

}


