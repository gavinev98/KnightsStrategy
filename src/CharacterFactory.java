import TemplateMethod.LootMethod;

public class CharacterFactory {

    //Using Composition
    SimpleCharacterFactory characterFactory;

    public CharacterFactory(SimpleCharacterFactory characterFactory)
    {
        this.characterFactory = characterFactory;
    }

    public Character createCharacter(String characterType, String name, double health, String attackotions,String special,String clothing)
    {
        Character character;

        character = characterFactory.createCharacter(characterType,name,health,attackotions, special,clothing);



        character.getName();
        character.getHealth();
        character.getClothingOptions();
        character.getSpecialAbility();



        return character;
    }
}
