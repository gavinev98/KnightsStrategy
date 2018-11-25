package TemplateMethod;

public class UndercoverMethod extends LootMethod {
    @Override
    void chooseEnemy() {
        System.out.println("Wizard identified as target");
    }

    @Override
    void confuseEnemy() {
        System.out.println("Approaching Wizard cause distraction");
    }

    @Override
    void StealfromEnemy() {
        System.out.println("Grabbed wand now walking away");
    }
}
