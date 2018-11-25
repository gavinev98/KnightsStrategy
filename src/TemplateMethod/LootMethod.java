package TemplateMethod;

public abstract class LootMethod {

    // Using final keyword so child classes cannot override it. Algorithm structure
       public final void Loot()
        {
            chooseEnemy();
            confuseEnemy();
            StealfromEnemy();
        }

        // Implementing abstract methods because subclasses will handle them different. I will let subclass worry about implementation.
          abstract void chooseEnemy();
          abstract  void confuseEnemy();
          abstract  void StealfromEnemy();


    // hook methods


}
