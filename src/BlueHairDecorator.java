public class BlueHairDecorator extends CosmeticDecorator {

    public BlueHairDecorator(CharacterClothing cosmos)
    {
        super(cosmos);

    }

    @Override
    public void clothingOption() {
        cosmo.clothingOption();
        applyBlueHair(cosmo);

    }

    private void applyBlueHair(CharacterClothing cosmo)
    {
        System.out.println("Blue Hair");
    }


}
