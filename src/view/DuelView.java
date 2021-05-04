package view;

import controller.DuelController;
import model.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuelView {
    private User user;
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
            /*Matcher matcher1 = getCommandMatcher(command, "([1-5])");
            Matcher matcher2 = getCommandMatcher(command, "--opponent");
            Matcher matcher3 = getCommandMatcher(command, "--monster ");
            Matcher matcher4 = getCommandMatcher(command, "--spell ");

            //harif
            if (matcher3.find() && matcher1.find()) {
                //monster
            }
            if (matcher4.find() && matcher1.find()) {
                //spell
            }*/
        if (command.equals("select -d")) {
            try {
                duelController.unselectCard();
            } catch (Exception exception) {
                printText(exception.getMessage());
            }
        }
        Matcher matcher = getCommandMatcher(command, "select ([\\w -]+)");
        if (matcher.matches()) {
            try {
                duelController.selectCard(matcher.group(1));
            } catch (Exception exception) {
                printText(exception.getMessage());
            }
            return false;
        }
        if (command.equals("next phase")) {
           duelController.goNextPhase();
        }
        if (command.startsWith("menu enter ")) {
            printText("menu navigation is not possible");
            return false;
        }
        printText("invalid command");
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
