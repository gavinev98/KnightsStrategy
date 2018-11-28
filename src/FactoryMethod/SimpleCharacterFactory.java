package FactoryMethod;

import Models.Character;
import Models.Dragon;
import Models.Troll;
import TemplateMethod.HitAndRunMethod;
import TemplateMethod.UndercoverMethod;

public class SimpleCharacterFactory {

        public Character createCharacter(String characterType, String name, double health, String attackotions,String clothing)
        {


            Character type = null;


            if(characterType.equals("T"))
            {
                type = new Troll(name,health,attackotions,clothing, new HitAndRunMethod());
            }
            else
                if(characterType.equals("D"))
                {
                   type = new Dragon(name,health,attackotions,clothing, new UndercoverMethod());
                }

                return type;


        }

}
