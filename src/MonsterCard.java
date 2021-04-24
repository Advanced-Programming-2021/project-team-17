import sun.rmi.log.LogInputStream;

import java.util.ArrayList;
import java.util.List;

public class MonsterCard extends Card{
    int level;
    List<MonsterTypes> type = new ArrayList<MonsterTypes>();
    int attack;
    int defence;

    public int getAttack() {
        return this.attack;
    }

    public int getDefence() {
        return this.defence;
    }

    public int getLevel() {
        return this.level;
    }

    public List<MonsterTypes> getType(){
        return this.type;
    }

    @Override
    public String toString() {
        return "MonsterCard{" +
                "level=" + level +
                ", type=" + type +
                ", attack=" + attack +
                ", defence=" + defence +
                '}';
    }
}
