package controller;

import controller.exeption.*;
import model.*;
import view.DuelView;

public class DuelController {

    private User player;
    private User rival;
    private int roundNumber;
    private Card selectedCard;
    private int roundCounter;
    private Phase phase;

    public DuelController(User player, User rival, int roundNumber) {
        this.player = player;
        this.rival = rival;
        this.roundNumber = roundNumber;
        this.roundCounter = 0;
        this.selectedCard = null;
    }

    public void selectCard(String address) {

    }

    public void unselectCard() throws Exception {
        if (this.selectedCard == null) {
            throw new NoCardSelected();
        } else {
            this.selectedCard = null;
            DuelView.printText("card deselected");
        }
    }

    public void summonMonster() throws Exception {
        MonsterCard monsterCard = (MonsterCard) selectedCard;
        if (this.selectedCard == null) {
            throw new NoCardSelected();
        } else if (/*todo*/) {
            throw new CanNotSummon();
        } else if (!(phase.equals(Phase.MAIN_PHASE1) || (phase.equals(Phase.MAIN_PHASE2)))) {
            throw new ImproperPhase();
        } else if (this.player.getBoard().isFullMonsterZone()){
            throw new FullMonsterZone();
        } else if (hasSummonedInThisTurn) {
            throw new AlreadySummoned();
        } else if (monsterCard.getLevel() <= 4){
            //Todo
            DuelView.printText("summoned successfully");
        }
    }

    public void tributeOneMonster() {

    }

    public void tributeTwoMonsters() {

    }

    public void setMonster() {

    }

    public void changePosition() {

    }

    public void flipSummon() {

    }

    public void attackMonster(int monsterNumber) {

    }

    public void attackMonsterOO(int monsterNumber) {

    }

    public void attackMonsterDO(int monsterNumber) {

    }

    public void attackMonsterDH(int monsterNumber) {

    }

    public void directAttack() {

    }

    public void activateSpell() {

    }

    public void setSpell() {

    }

    public void setTrap() {

    }

    public void printBoard() {

    }

    public void activateSpellOrTrapInRivalsTurn() {

    }

    public void showGraveyard() {

    }

    public void ritualSummon() {

    }

    public void specialSummon() {

    }

    public void showCard() {

    }

    public void surrender() {

    }

    public User shouldEndGame() {
        return null;
    }

    public void endGame(User loser) {

    }

    public void goNextPhase(){

    }


}
