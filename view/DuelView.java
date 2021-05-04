package view;

import controller.DuelController;
import model.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuelView {
//    private User user;
    private DuelController duelController;

    public DuelView(User user, User rival, int roundNumber) {
        duelController = new DuelController(user, rival, roundNumber);
    }

    public void getCommandForDuel() {
        String command;
        while (true) {
            command = ScannerClassForView.getScanner().nextLine();
            if (processCommand(command)) break;
        }
    }

    private boolean processCommand(String command) {
        if(command.matches("select -d")){
            try {
                //TODO
            }
            catch (Exception exception){
                printText(exception.getMessage());
            }
        }
            Matcher matcher = getCommandMatcher(command, "select ([\\w -]+)");
        if (matcher.matches()) {
            try {
                //TODO tabeo seda bezan
            }
            catch (Exception exception){
                printText(exception.getMessage());
            }
            return false;
        }
        if(command.matches("next phase")){
            //TODO
        }
        if(command.startsWith("menu enter ")){
            printText("menu navigation is not possible");
            return false;
        }
        return false;
    }

    public String getCardForTribute() {
        return "1";
    }

    public String getAnswerForActivateSpellOrTrapInRivalsTurn() {
        return "1";
    }

    static public void getBackForShowGraveYard() {
        ScannerClassForView.getScanner().nextLine();
    }

    static public void printException(Exception output) {

    }

    static public void printText(String output) {
        System.out.println(output);
    }

    private Matcher getCommandMatcher(String command, String regex) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(command);
    }
    /*public void exitMenu(){

    }*/
}
