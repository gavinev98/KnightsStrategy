public abstract class CosmeticDecorator implements CharacterType {

     CharacterType cosmo;

     public CosmeticDecorator(CharacterType cosmo)
     {
         this.cosmo = cosmo;
     }

    @Override
    public void clothingOption() {
        cosmo.clothingOption();
    }
}
