public class Knight implements CharType{

    @Override
    public String attack(){
        return " attacks with a sword.\n";
    }

    @Override
    public String defend() {
        return " uses shield/ dodges/ casts barrier.\n";
    }

}