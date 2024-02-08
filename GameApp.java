public class GameApp {

    public static void main(String[] args) {
        
        Character char1 = new Character("Archer", new ShootArrow(), new Dodge());
        char1.attack();
        char1.defend();

        Character char2 = new Character("Wizard", new CastSpell(), new CreateBarrier());
        char2.attack();
        char2.defend();

        Character char3 = new Character("Knight", new SwingSword(), new Shield());
        char3.attack();
        char3.defend();

    }

}