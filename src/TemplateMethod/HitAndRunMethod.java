package TemplateMethod;

public class HitAndRunMethod extends LootMethod {


    @Override
    void chooseEnemy() {
        System.out.println("Target Identified: Wizard");
    }

    @Override
    void confuseEnemy() {
        System.out.println("Approaching Wizard from behind");

    }

    @Override
    void StealfromEnemy() {
        System.out.println("Grabbed wand running away now!");

    }
}
