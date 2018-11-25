public abstract class CosmeticDecorator implements CharacterClothing {

     CharacterClothing cosmo;

     public CosmeticDecorator(CharacterClothing cosmo)
     {

         this.cosmo = cosmo;
     }

    @Override
    public void clothingOption() {
        cosmo.clothingOption();
    }
}
