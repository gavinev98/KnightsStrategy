public class CharacterFactory {

        public Character createCharacter(String characterType)
        {
            Character type = null;


            if(characterType.equals("T"))
            {
                return new Troll();

            }
            else
                if(characterType.equals("D"))
                {
                    return new Dragon();
                }
                else
                return null;


        }

}
