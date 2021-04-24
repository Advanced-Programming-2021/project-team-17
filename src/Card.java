public class Card {
    private String name;
    private String description;

    public String toString(){
        String toBeReturned = this.name+":"+this.description;
        return toBeReturned;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
}
