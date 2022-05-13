public class Character {
    public String characterName;
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    Character(){
        
    }
    Character(String name, int lev, int Hp, int Mp){
        characterName = name;
        level = lev;
        healthPoints = Hp;
        manaPoints = Mp;
    }
    public void showName(){
        System.out.println("Character Initialized : " + characterName);
    }

    // method to Damage Target Character
    public void damageTarget(Character enemyCharacter,int damagePoints,int manaCost){
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("enemy character HP Left = " + enemyCharacter.healthPoints + "\n");
        manaPoints = manaPoints - manaCost;

        //Prompts the defeated charcter and increases the level of the winner
        if (enemyCharacter.healthPoints <= 0) {
            System.out.println(enemyCharacter.characterName + " is defeated.");
            level += 10;
            System.out.println(characterName + " Level up!!");
        }
    }
    public void addLevel(Character name){
        name.level += 10;
        System.out.println(name.characterName + " Level Up!");
    }

} 
