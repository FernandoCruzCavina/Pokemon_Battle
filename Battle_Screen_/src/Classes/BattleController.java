package Classes;

import Poderes.Moves;
import Pokemons.Ampharos;
import Pokemons.Blastoise;
import Pokemons.Blissey;
import Pokemons.Bronzong;
import Pokemons.Charmeleon;
import Pokemons.Gardevoir;
import Pokemons.Gengar;
import Pokemons.Greninja;
import Pokemons.Noivern;
import Pokemons.Pokemon;
import Pokemons.Venusaur;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
/**
 *
 * @author ElthonBicudo
 */
public class BattleController {
    //Pokémons
    Charmeleon charmeleon = new Charmeleon();
    Ampharos ampharos = new Ampharos();
    Blastoise blastoise = new Blastoise();
    Gengar gengar = new Gengar();
    Blissey blissey = new Blissey();
    Noivern noivern = new Noivern();
    Venusaur venusaur = new Venusaur();
    Gardevoir gardevoir = new Gardevoir();
    Greninja greninja = new Greninja();
    Bronzong bronzong = new Bronzong();
    
    //Pokémons atuais da batalha
    private Pokemon currentPlayerPokemon = charmeleon;
    private Pokemon currentEnemyPokemon = noivern;
    
    //Pokemons fora da batalha
    private Pokemon []outPlayerPokemon = {blastoise, gengar, venusaur, blissey};
    private Pokemon []outEnemyPokemon = {ampharos , gardevoir, bronzong, greninja}; 
    
    Random rand = new Random();
    
    //variaveis da batalha
    private int playerDMG;
    private int enemyDMG;
        
    private int altDMG;
    
    private Moves movePlayer;
    private Moves moveEnemy;
    
    private int currentPlayerAction;
    private int currentEnemyAction;
    
    private int attackAction;
    
    private boolean turnPlayer;
    
    private boolean  missAttackPlayer = false;
    private boolean missAttackEnemy = false;

    // fim das variaveis
    
    public void turnControl(){
        //inimigo escolhendo uma acao
        currentEnemyAction = rand.nextInt(1,3);
        
        //situações de batalha
        if(currentPlayerAction == 1 && currentEnemyAction == 1){
            if(currentPlayerPokemon.getSpeed()>= currentEnemyPokemon.getSpeed()){
                turnPlayer = true;
                enemyDecision();
                turnVerified();
                turnVerified();

            } else {
                turnPlayer = false;
                enemyDecision();
                turnVerified();
                turnVerified();
            }
        } else if(currentPlayerAction == 1 && currentEnemyAction == 2){
            turnPlayer = true;
            defendTurn();
            turnVerified();
            
        } else if(currentPlayerAction == 2 && currentEnemyAction == 1){
            turnPlayer = false;
            enemyDecision();
            defendTurn();
            turnVerified();
        } else if (currentPlayerAction == 2 && currentEnemyAction == 2){
        }
    }
    
    
    private void defendTurn(){
        if(currentEnemyAction == 2){
            movePlayer.getAccuracy();
            movePlayer.setAccuracy(movePlayer.getAccuracy() - currentPlayerPokemon.defense());
            gainMana(currentEnemyPokemon, 15);
        } else if(currentPlayerAction == 2){
            moveEnemy.getAccuracy();
            moveEnemy.setAccuracy(moveEnemy.getAccuracy() - currentEnemyPokemon.defense());
            gainMana(currentPlayerPokemon, 15);
        }
    }
    
    private void turnVerified (){
        if (turnPlayer) {
            playerTurn();
        } else {
            enemyTurn();
        }
    }
    
    private void playerTurn(){
        if(currentPlayerPokemon.getCurrentHP()>0){
            int chanceAttack = rand.nextInt(100);
            missAttackPlayer = false;

            currentPlayerPokemon.setMana(currentPlayerPokemon.getMana()-movePlayer.getCost());

            if (movePlayer.getAccuracy() > chanceAttack){
                playerDMG = currentPlayerPokemon.attack(currentEnemyPokemon, movePlayer);

                stab(movePlayer, currentEnemyPokemon);
                playerDMG= playerDMG*altDMG;
                        
                missAttackPlayer = false;
                currentEnemyPokemon.setCurrentHP(currentEnemyPokemon.getCurrentHP() - playerDMG);
            } else {
                gainMana(currentPlayerPokemon, 10);
                missAttackPlayer = true;
            } 
        }
        turnPlayer = false;
    }
    
    private void enemyDecision(){
         attackAction = rand.nextInt(4);
        if(currentEnemyPokemon.getMana()>currentEnemyPokemon.getAttacks()[attackAction].getCost()){
            moveEnemy = currentEnemyPokemon.getAttacks()[attackAction];
            currentEnemyPokemon.setMana(currentEnemyPokemon.getMana()-moveEnemy.getCost());
        }
        else{
            attackAction = rand.nextInt(3);
            moveEnemy = currentEnemyPokemon.getAttacks()[attackAction];
        }
    }
    
    private void enemyTurn(){
        if(currentEnemyPokemon.getCurrentHP()>0){
            int chanceAttack = rand.nextInt(100);
            missAttackEnemy = false;


            if (moveEnemy.getAccuracy() > chanceAttack){
                enemyDMG = currentEnemyPokemon.attack(currentPlayerPokemon, moveEnemy);

                stab(moveEnemy, currentPlayerPokemon);
                enemyDMG= enemyDMG*altDMG;

                missAttackEnemy = false;
                currentPlayerPokemon.setCurrentHP(currentPlayerPokemon.getCurrentHP()-enemyDMG);
            } else {
                gainMana(currentEnemyPokemon, 10);
                missAttackEnemy = true;
            }
        }
        turnPlayer = true;
        
    }
    
    public void gainMana(Pokemon pokemon, int num) {
        pokemon.setMana(pokemon.getMana() + num);
    }

    public int getCurrentPlayerAction() {
        return currentPlayerAction;
    }

    public int getCurrentEnemyAction() {
        return currentEnemyAction;
    }

    public int getPlayerDMG() {
        return playerDMG;
    }

    public int getEnemyDMG() {
        return enemyDMG;
    }

    public boolean isMissAttackPlayer() {
        return missAttackPlayer;
    }

    public boolean isMissAttackEnemy() {
        return missAttackEnemy;
    }   

    public Pokemon getCurrentePlayerPokemon() {
        return currentPlayerPokemon;
    }

    public Pokemon getCurrenteEnemyPokemon() {
        return currentEnemyPokemon;
    }

    public void setCurrentPlayerPokemon(Pokemon currentPlayerPokemon) {
        this.currentPlayerPokemon = currentPlayerPokemon;
    }

    public void setCurrentEnemyPokemon() {
        for (int i =0; i<this.outEnemyPokemon.length; i++){
            if(outEnemyPokemon[i].getCurrentHP()>=0){
                this.currentEnemyPokemon = outEnemyPokemon[i];
            }
        }
    }
    
    public Pokemon getOutPokemon(int i) {
        return outPlayerPokemon[i];
    }

    public Pokemon getOutEnemyPokemon(int i) {
        return outEnemyPokemon[i];
    }

    public void setOutPokemon(Pokemon outPokemon, int i) {
        this.outPlayerPokemon[i] = outPokemon;
    }

    public void setOutEnemyPokemon(Pokemon[] outEnemyPokemon) {
        this.outEnemyPokemon = outEnemyPokemon;
    }

    public Moves getMovePlayer() {
        return movePlayer;
    }

    public Moves getMoveEnemy() {
        return moveEnemy;
    }
    
    public void playerAttacks(int i){
        currentPlayerAction = 1;
        movePlayer = currentPlayerPokemon.getAttacks()[i];
    }
    
    public void PlayerDefend(){
        currentPlayerAction = 2;
    }
    
    public void gameInit(){
       charmeleon.setCurrentHP(charmeleon.getHP());
        gengar.setCurrentHP(gengar.getHP());
        venusaur.setCurrentHP(venusaur.getHP());
        blissey.setCurrentHP(blissey.getHP());
        blastoise.setCurrentHP(blastoise.getHP());
        ampharos.setCurrentHP(ampharos.getHP());
        noivern.setCurrentHP(noivern.getHP());
        gardevoir.setCurrentHP(gardevoir.getHP());
    }
    
    public double stabDecision(String attackerType, String defenderType) {
        return typeEffectiveness.getOrDefault(attackerType, new HashMap<>()).getOrDefault(defenderType, 1);
    }
    
    private void stab(Moves attacker, Pokemon attacked){
        int altDMG_one = 1;
        int altDMG_two = 1;
        if(attacked.getAttribute2()==null){
            altDMG_one = (int) stabDecision(attacker.getAttribute(), attacked.getAttribute());
        } else {
            altDMG_one = (int) stabDecision(attacker.getAttribute(), attacked.getAttribute());
            altDMG_two = (int) stabDecision(attacker.getAttribute(), attacked.getAttribute2());
        }
        altDMG = Math.max(altDMG_one, altDMG_two);
    }
    
    private static final Map<String,  Map<String, Integer>> typeEffectiveness = new HashMap<>();

    static {
        //Normal type
        Map<String, Integer> normalEffectiveness = new HashMap<>();
        normalEffectiveness.put("Rock", 1/2);
        normalEffectiveness.put("Steel", 1/2);
        normalEffectiveness.put("Ghost", 0);
        typeEffectiveness.put("Normal", normalEffectiveness);

        //Fire type
        Map<String, Integer> fireEffectiveness = new HashMap<>();
        fireEffectiveness.put("Fire", 1/2);
        fireEffectiveness.put("Water", 1/2);
        fireEffectiveness.put("Rock", 1/2);
        fireEffectiveness.put("Dragon", 1/2);
        fireEffectiveness.put("Grass", 2);
        fireEffectiveness.put("Ice", 2);
        fireEffectiveness.put("Bug", 2);
        fireEffectiveness.put("Steel", 2);
        typeEffectiveness.put("Fire", fireEffectiveness);

        //Water type
        Map<String, Integer> waterEffectiveness = new HashMap<>();
        waterEffectiveness.put("Fire", 2);
        waterEffectiveness.put("Water", 1/2);
        waterEffectiveness.put("Grass", 1/2);
        waterEffectiveness.put("Ground", 2);
        waterEffectiveness.put("Rock", 2);
        waterEffectiveness.put("Dragon", 1/2);
        typeEffectiveness.put("Water", waterEffectiveness);

        //Grass type
        Map<String, Integer> grassEffectiveness = new HashMap<>();
        grassEffectiveness.put("Fire", 1/2);
        grassEffectiveness.put("Water", 2);
        grassEffectiveness.put("Grass", 1/2);
        grassEffectiveness.put("Poison", 1/2);
        grassEffectiveness.put("Ground", 2);
        grassEffectiveness.put("Flying", 1/2);
        grassEffectiveness.put("Bug", 1/2);
        grassEffectiveness.put("Rock", 2);
        grassEffectiveness.put("Dragon", 1/2);
        grassEffectiveness.put("Steel", 1/2);
        typeEffectiveness.put("Grass", grassEffectiveness);

        //Electric type
        Map<String, Integer> electricEffectiveness = new HashMap<>();
        electricEffectiveness.put("Water", 2);
        electricEffectiveness.put("Electric", 1/2);
        electricEffectiveness.put("Grass", 1/2);
        electricEffectiveness.put("Ground", 0);
        electricEffectiveness.put("Flying", 2);
        electricEffectiveness.put("Dragon", 1/2);
        typeEffectiveness.put("Electric", electricEffectiveness);

        //Ice type
        Map<String, Integer> iceEffectiveness = new HashMap<>();
        iceEffectiveness.put("Fire", 1/2);
        iceEffectiveness.put("Water", 1/2);
        iceEffectiveness.put("Grass", 2);
        iceEffectiveness.put("Ice", 1/2);
        iceEffectiveness.put("Ground", 2);
        iceEffectiveness.put("Flying", 2);
        iceEffectiveness.put("Dragon", 2);
        iceEffectiveness.put("Steel", 1/2);
        typeEffectiveness.put("Ice", iceEffectiveness);

        //Fighting type
        Map<String, Integer> fightingEffectiveness = new HashMap<>();
        fightingEffectiveness.put("Normal", 2);
        fightingEffectiveness.put("Ice", 2);
        fightingEffectiveness.put("Rock", 2);
        fightingEffectiveness.put("Dark", 2);
        fightingEffectiveness.put("Steel", 2);
        fightingEffectiveness.put("Poison", 1/2);
        fightingEffectiveness.put("Flying", 1/2);
        fightingEffectiveness.put("Psychic", 1/2);
        fightingEffectiveness.put("Bug", 1/2);
        fightingEffectiveness.put("Fairy", 1/2);
        fightingEffectiveness.put("Ghost", 0);
        typeEffectiveness.put("Fighting", fightingEffectiveness);

        //Poison type
        Map<String, Integer> poisonEffectiveness = new HashMap<>();
        poisonEffectiveness.put("Grass", 2);
        poisonEffectiveness.put("Poison", 1/2);
        poisonEffectiveness.put("Ground", 1/2);
        poisonEffectiveness.put("Rock", 1/2);
        poisonEffectiveness.put("Ghost", 1/2);
        poisonEffectiveness.put("Steel", 0);
        poisonEffectiveness.put("Fairy", 2);
        typeEffectiveness.put("Poison", poisonEffectiveness);

        //Ground type
        Map<String, Integer> groundEffectiveness = new HashMap<>();
        groundEffectiveness.put("Fire", 2);
        groundEffectiveness.put("Electric", 2);
        groundEffectiveness.put("Grass", 1/2);
        groundEffectiveness.put("Poison", 2);
        groundEffectiveness.put("Flying", 0);
        groundEffectiveness.put("Bug", 1/2);
        groundEffectiveness.put("Rock", 2);
        groundEffectiveness.put("Steel", 2);
        typeEffectiveness.put("Ground", groundEffectiveness);

        //Flying type
        Map<String, Integer> flyingEffectiveness = new HashMap<>();
        flyingEffectiveness.put("Electric", 1/2);
        flyingEffectiveness.put("Grass", 2);
        flyingEffectiveness.put("Fighting", 2);
        flyingEffectiveness.put("Bug", 2);
        flyingEffectiveness.put("Rock", 1/2);
        flyingEffectiveness.put("Steel", 1/2);
        typeEffectiveness.put("Flying", flyingEffectiveness);

        //Psychic type
        Map<String, Integer> psychicEffectiveness = new HashMap<>();
        psychicEffectiveness.put("Fighting", 2);
        psychicEffectiveness.put("Poison", 2);
        psychicEffectiveness.put("Psychic", 1/2);
        psychicEffectiveness.put("Dark", 0);
        psychicEffectiveness.put("Steel", 1/2);
        typeEffectiveness.put("Psychic", psychicEffectiveness);

        //Bug type
        Map<String, Integer> bugEffectiveness = new HashMap<>();
        bugEffectiveness.put("Fire", 1/2);
        bugEffectiveness.put("Grass", 2);
        bugEffectiveness.put("Fighting", 1/2);
        bugEffectiveness.put("Poison", 1/2);
        bugEffectiveness.put("Flying", 1/2);
        bugEffectiveness.put("Psychic", 2);
        bugEffectiveness.put("Ghost", 1/2);
        bugEffectiveness.put("Dark", 2);
        bugEffectiveness.put("Steel", 1/2);
        bugEffectiveness.put("Fairy", 1/2);
        typeEffectiveness.put("Bug", bugEffectiveness);

        //Rock type
        Map<String, Integer> rockEffectiveness = new HashMap<>();
        rockEffectiveness.put("Fire", 2);
        rockEffectiveness.put("Ice", 2);
        rockEffectiveness.put("Fighting", 1/2);
        rockEffectiveness.put("Ground", 1/2);
        rockEffectiveness.put("Flying", 2);
        rockEffectiveness.put("Bug", 2);
        rockEffectiveness.put("Steel", 1/2);
        typeEffectiveness.put("Rock", rockEffectiveness);

        //Ghost type
        Map<String, Integer> ghostEffectiveness = new HashMap<>();
        ghostEffectiveness.put("Normal", 0);
        ghostEffectiveness.put("Psychic", 2);
        ghostEffectiveness.put("Ghost", 2);
        ghostEffectiveness.put("Dark", 1/2);
        typeEffectiveness.put("Ghost", ghostEffectiveness);

        //Dragon type
        Map<String, Integer> dragonEffectiveness = new HashMap<>();
        dragonEffectiveness.put("Dragon", 2);
        dragonEffectiveness.put("Steel", 1/2);
        dragonEffectiveness.put("Fairy", 0);
        typeEffectiveness.put("Dragon", dragonEffectiveness);

        //Dark type
        Map<String, Integer> darkEffectiveness = new HashMap<>();
        darkEffectiveness.put("Fighting", 1/2);
        darkEffectiveness.put("Psychic", 2);
        darkEffectiveness.put("Ghost", 2);
        darkEffectiveness.put("Dark", 1/2);
        darkEffectiveness.put("Fairy", 1/2);
        typeEffectiveness.put("Dark", darkEffectiveness);

        //Steel type
        Map<String, Integer> steelEffectiveness = new HashMap<>();
        steelEffectiveness.put("Fire", 1/2);
        steelEffectiveness.put("Water", 1/2);
        steelEffectiveness.put("Electric", 1/2);
        steelEffectiveness.put("Ice", 2);
        steelEffectiveness.put("Rock", 2);
        steelEffectiveness.put("Steel", 1/2);
        steelEffectiveness.put("Fairy", 2);
        typeEffectiveness.put("Steel", steelEffectiveness);

        //Fairy type
        Map<String, Integer> fairyEffectiveness = new HashMap<>();
        fairyEffectiveness.put("Fire", 1/2);
        fairyEffectiveness.put("Fighting", 2);
        fairyEffectiveness.put("Poison", 1/2);
        fairyEffectiveness.put("Dragon", 2);
        fairyEffectiveness.put("Dark", 2);
        fairyEffectiveness.put("Steel", 1/2);
        typeEffectiveness.put("Fairy", fairyEffectiveness);
    }
}