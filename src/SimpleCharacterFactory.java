import TemplateMethod.HitAndRunMethod;
import TemplateMethod.LootMethod;
import TemplateMethod.UndercoverMethod;

public class SimpleCharacterFactory {

        public Character createCharacter(String characterType, String name, double health, String attackotions, String special, String clothing)
        {


            Character type = null;


            if(characterType.equals("T"))
            {
                type = new Troll(name,health,attackotions,special,clothing, new HitAndRunMethod());
            }
            else
                if(characterType.equals("D"))
                {
                   type = new Dragon(name,health,attackotions,special,clothing, new UndercoverMethod());
                }

                return type;


        }

}
