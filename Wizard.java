public class Wizard implements CharType{

    @Override
    public String attack(){
        return " casts a spell.\n";
    }

    @Override
    public String defend(){
        return " creates barrier.\n";
    }

}