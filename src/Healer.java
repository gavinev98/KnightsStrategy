import java.util.Arrays;

public class Healer extends Character implements IsAlive {


    public Healer(String name, double health, String[] attackOptions, String[] specialAbility, String[] clothingOptions) {
        super(name, health, attackOptions, specialAbility, clothingOptions);
    }


    @Override
    public boolean isAlive() {
        return false;
    }
}
