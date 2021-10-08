/*
Name:Amit Paul
Id:2012020164
Section:D
Email:2012020164_@lus.ac.bd
*/
package amitpaul;


public class Main {
    public static void main(String[] args) {
        Player player  = new Player("Shakib",75);
        Cricket cricket = new Cricket("International Match",20,player);
        cricket.display();
        Football football = new Football();
    }
}
