import java.util.ArrayList;
import java.util.List;

public class User {

   // private static ArrayList<User> allUsers;
    private static List<User> allUsers = new ArrayList<>();
    private String username;
    private String password;
    private String nickname;
    private int score;
    //private ArrayList<Card> allCards;
    private static List<Card> allCards = new ArrayList<>();
    //private ArrayList<Deck> allDecks;
    private static List<Deck> allDecks = new ArrayList<>();
    private Deck currentActiveDeck;
    private int lifePoint;
    private Board board;
    private int money;

    public User(String username, String nickname, String password){
        if (allUsers == null)
            allUsers = new ArrayList<User>();
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        setScore(0);
        setMoney(0);
    }

    public static User getUserByUsername (String username){
       /*     if (allUsers == null){
                allUsers = new ArrayList<User>();
                return null;
            }
        */
        for (int i = 0; i < allUsers.size(); i++)
            if (allUsers.get(i).getUsername().equals(username))
                return allUsers.get(i);
            return null;
    }

    public static User getUserByNickname (String nickname){
       /* if (allUsers == null) {
            allUsers = new ArrayList<User>();
            return null;
        }*/
        for (int i = 0; i < allUsers.size(); i++)
            if (allUsers.get(i).getNickname().equals(nickname))
                return allUsers.get(i);
            return null;
    }

    public void increaseScore (int amount){ this.score += amount; }

    public void decreaseScore (int amount){ this.score -= amount; }

    public void increaseLifePoint (int amount){ this.lifePoint += amount; }

    public void decreaseLifePoint (int amount){ this.lifePoint -= amount; }

    //TODO get deck by name


    public String getUsername() { return username; }

    public String getPassword() { return password; }

    public String getNickname() { return nickname; }

    public int getScore() { return score; }

    public Deck getActiveDeck() { return currentActiveDeck; }

    public Board getBoard() { return board; }

    //TODO

    public int getLifePoint() { return lifePoint; }

    //TODO

    public void setLifePoint(int lifePoint) { this.lifePoint = lifePoint; }

    //TODO

    public void setScore(int score) { this.score = score; }

    //TODO

    public void setMoney(int money) { this.money = money; }

    public void setPassword(String password) { this.password = password; }

    public void setNickname(String nickname) { this.nickname = nickname; }

    public void setActiveDeck(Deck currentActiveDeck) { this.currentActiveDeck = currentActiveDeck; }
}
