// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 1 April 2021
// File: Main.java
// Latihan soal responsi minggu ke 11, Soal 2

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Section 1 ---");
        GhostPokemon g1 = new GhostPokemon();
        Pokemon f1 = new FightingPokemon();
        Pokemon n1 = new NormalPokemon();
        Pokemon p1 = new Pokemon();
        System.out.println(g1.getName());
        System.out.println(f1.getName());
        System.out.println(n1.getName());
        System.out.println(p1.getName());
        GhostPokemon gastly = new GhostPokemon("Gastly");
        FightingPokemon machop = new FightingPokemon("Machop");
        NormalPokemon rattata = new NormalPokemon("Rattata");
        Pokemon bigboss = new Pokemon("Big Boss");
        System.out.println(gastly.getName());
        System.out.println(machop.getName());
        System.out.println(rattata.getName());
        System.out.println(bigboss.getName());
        gastly.displayClass();
        machop.displayClass();
        rattata.displayClass();
        bigboss.displayClass();
        gastly.setUniqueID("G1");
        machop.setUniqueID(12);
        System.out.println(gastly.getUniqueID());
        System.out.println(machop.getUniqueID());

        System.out.println("--- Section 2 ---");
        gastly.checkElement();
        machop.checkElement();
        rattata.checkElement();
        gastly.specialSkill();
        machop.displayAura();
        gastly.displayAura();
        machop.specialSkill();

        System.out.println("--- Section 3 ---");
        PokemonAction<GhostPokemon> gastlyAct = new PokemonAction<GhostPokemon>(gastly);
        PokemonAction<NormalPokemon> rattataAct = new PokemonAction<NormalPokemon>(rattata);
        gastlyAct.displayPokemonClass();
        rattataAct.displayPokemonClass();
        System.out.println("Gastly vs Rattata");
        for(int i = 0; i < 10; i++){
            if(i<7){
                gastlyAct.attack();
                rattataAct.defense();
            } else{
                rattataAct.attack();
                gastlyAct.defense();
            }
        }
        rattataAct.useSkill();
        gastlyAct.useSkill();
        rattataAct.run();

        System.out.println("--- Section 4 ---");
        System.out.println("New Battle Found");
        PokemonAction<FightingPokemon> machopAct = new PokemonAction<FightingPokemon>(machop);
        PokemonAction<Pokemon> bigbossAct = new PokemonAction<Pokemon>(bigboss);
        machopAct.displayPokemonClass();
        bigbossAct.displayPokemonClass();
        System.out.println("Big Boss vs Machop");
        for(int i = 0; i < 12; i++){
            if(i<4){
                machopAct.attack();
                bigbossAct.defense();
            } else{
                bigbossAct.attack();
                machopAct.defense();
            }
        }
        machopAct.useSkill();
        bigbossAct.useSkill();
        machopAct.run();
        System.out.println("All Battle Finished");
    }
}
