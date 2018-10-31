public class CharacterFactory {

        public Character createCharacter(String characterType)
        {
            String name1 = "Troll";
            double health1 = 67;
            String[] attackOptions1 = {"Looting"};
            String[] specialAbility1 = {"Looting x2"};
            String[] clothingOptions1 = {"Blue Hair"};

            String name2 = "Dragon";
            double health2 = 67;
            String[] attackOptions2 = {"Breath Fire"};
            String[] specialAbility2 = {"Breath Fire x2"};
            String[] clothingOptions2 = {"Blue Hair"};

            Character type = null;


            if(characterType.equals("T"))
            {
                return new Troll(name1,health1,attackOptions1,specialAbility1,clothingOptions1);
            }
            else
                if(characterType.equals("D"))
                {
                    return new Dragon(name2,health2,attackOptions2,specialAbility2,clothingOptions2);
                }
                else
                return null;


        }

}
