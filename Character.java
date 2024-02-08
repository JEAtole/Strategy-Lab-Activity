public class Character{

    private String charType;
    private ActionStrategy actionStrategy;

    public Character(CharType charType){
        this.charType = charType;
    }

    public void attack() {
        System.out.println(charType.getClass().getSimpleName() + charType.attack());
    }


    public void defend() {
        System.out.println(charType.getClass().getSimpleName() + charType.defend());
    }
}