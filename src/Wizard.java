public class Wizard extends Character{
    Wizard(String name, int lev, int Hp, int Mp){
        super(name, lev, Hp, Mp);
    }
    //Skills Method
    public void fireStorm(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 50)");
        int damagePoints = 50;
        int manaCost = 20;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void fireBeam(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Fire Beam (Damage - 40)");
        int damagePoints = 40;
        int manaCost = 20;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    }
    public void Heal(){
        super.healthPoints += 20;
        super.manaPoints += 20;
        System.out.println(super.characterName + " casted self heal (Hp and Mp restored by 20)" + "\n");
    }
    
}

