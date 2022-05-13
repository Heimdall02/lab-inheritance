public class Warlock extends Character{
    Warlock(String name, int lev, int Hp, int Mp){
        super(name, lev, Hp, Mp);
    }
    //Skills Method
    public void soulBloom(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Soul Bloom (Damage - 40)");
        int damagePoints = 40;
        int manaCost = 20;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void Necromancy(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Necromancy (Damage - 50)");
        int damagePoints = 50;
        int manaCost = 20;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    }
    public void Revitalize(){
        super.healthPoints += 20;
        super.manaPoints += 20;
        System.out.println(super.characterName + " restored Hp and Mp by 20" + "\n");
    }
}
