public class BlueHairDecorator extends CosmeticDecorator {

    public BlueHairDecorator(CharacterType cosmos)
    {
        super(cosmos);

    }

    @Override
    public void clothingOption() {
        cosmo.clothingOption();
        applyBlueHair(cosmo);

    }

    private void applyBlueHair(CharacterType cosmo)
    {
        System.out.println("Blue Hair");
    }


}
