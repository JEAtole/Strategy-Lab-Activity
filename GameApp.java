public class GameApp {

    public static void main(String[] args) {
        
        Character char1 = new Character(new Archer());
        char1.attack();
        char1.defend();

        Character char2 = new Character(new Wizard());
        char2.attack();
        char2.defend();

        Character char3 = new Character(new Knight());
        char3.attack();
        char3.defend();

    }

}