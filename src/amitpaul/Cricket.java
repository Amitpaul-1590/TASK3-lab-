/*
Name:Amit Paul
Id:2012020164
Section:D
Email:cse_2012020164@lus.ac.bd
*/
package amitpaul;

public class Cricket extends Sports {
    
    String matchType;
    int over;
    Player player;
    
    Cricket(String matchType, int over,Player player ){
           this.matchType = matchType;
           this.over = over;
           this.player = player;
    }
    void display(){
        System.out.println("MatchType :"+matchType);
        System.out.println("Over :"+over);
        System.out.println("Player Name :"+player.playerName);
        System.out.println("jersey Number :"+player.jerseyNumber);
    }
}
