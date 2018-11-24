import TemplateMethod.HitAndRunMethod;
import TemplateMethod.LootMethod;

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
                   type = new Dragon(name,health,attackotions,special,clothing, new HitAndRunMethod());
                }

                return type;


        }

}
