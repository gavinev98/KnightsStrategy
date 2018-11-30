package FactoryMethod;

import Models.Character;
import Models.Dragon;
import Models.Troll;
import TemplateMethod.HitAndRunMethod;
import TemplateMethod.UndercoverMethod;

public class SimpleCharacterFactory {

        public Character createCharacter(String characterType, String name, double health,String clothing)
        {


            Character type = null;


            if(characterType.equals("T"))
            {
                type = new Troll(name,health,clothing, new HitAndRunMethod());
            }
            else
                if(characterType.equals("D"))
                {
                   type = new Dragon(name,health,clothing, new UndercoverMethod());
                }

                return type;


        }

}
