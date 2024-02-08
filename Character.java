public class Character{

    private String charType;
    private AttackStrategy attackStrategy;
    private DefenceStrategy defenceStrategy;

    public Character(String charType, AttackStrategy attackStrategy, DefenceStrategy defenceStrategy){
        this.charType = charType;
        this.attackStrategy = attackStrategy;
        this.defenceStrategy = defenceStrategy;
    }

    public void attack() {
        System.out.println(charType + attackStrategy.attack());
    }


    public void defend() {
        System.out.println(charType + defenceStrategy.defend());
    }
}