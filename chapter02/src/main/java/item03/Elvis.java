package item03;

public class Elvis {

    private static final Elvis uniqueElvis = new Elvis();

    public static final Elvis getInstance(){
        return uniqueElvis;
    }

}
