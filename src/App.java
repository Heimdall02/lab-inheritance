public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("~~~Wizards and Warlocks~~~\n");

        Wizard Merlin = new Wizard("Merlin", 0, 100, 200);
        Warlock Saruman = new Warlock("Saruman", 0, 100, 200);
        
        //Battle sequencs
        Merlin.fireStorm(Saruman);
        Saruman.soulBloom(Merlin);
        Merlin.Heal();
        Saruman.Necromancy(Merlin);
        Merlin.fireBeam(Saruman);
        Saruman.Necromancy(Merlin);
    }
}

