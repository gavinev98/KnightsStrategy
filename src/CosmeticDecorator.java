public abstract class CosmeticDecorator implements Cosmetics {

     Cosmetics cosmo;

     public CosmeticDecorator(Cosmetics cosmo)
     {
         this.cosmo = cosmo;
     }

    @Override
    public String clothingOption() {
        return cosmo.clothingOption();
    }
}
