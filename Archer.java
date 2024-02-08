public class Archer implements CharType{

    @Override
    public String attack(){
        return " shoots arrow.\n";
    }

    @Override
    public String defend(){
        return " defends using shield.\n";
    }

}