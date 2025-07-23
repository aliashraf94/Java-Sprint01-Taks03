public class Month {
    private String name;

    // Constructor
    public Month(String name){
        this.name = name;
    }

    // Equals method to compare two Month objects by their name
    public boolean equals (Object obj) {
        if (obj instanceof Month) {
            Month other = (Month) obj;
            return this.name.equals(other.name);
        }

        return false;
    }

    // To pint Month Name

    public String toString() {
        return name;
    }

    // HashCode method when overriding equals
    public int hashCode() {
        return name.hashCode();
    }

}
