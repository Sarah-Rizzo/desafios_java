public class Pet {


    private final String name; // é necessario definir um construtor ou atribuir um valor.

    private static boolean clean;


    public Pet(String name) {
        this.name = name;
        this.clean = false;
    }

    public String getName() {
        return name;
    }

    public static boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}