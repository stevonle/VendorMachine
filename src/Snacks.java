import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private String snackSlot;
    private String snackName;
    private double snackCost;
    private String snackType;
    private int snackStock = 6;
    private List<String[]> snackList = new ArrayList<>();

    public Snacks() {
    }

    public Snacks(String snackSlot, String snackName, double snackCost, String snackType) {
        this.snackSlot = snackSlot;
        this.snackName = snackName;
        this.snackCost = snackCost;
        this.snackType = snackType;
    }

    public void stockUpdate() {
        if (this.snackStock > 0) {
            this.snackStock -= 1;
        }

    }

    public String snackTypeMessage(String snackType) {
        if (snackType.equals("Munchy")) {
            return "Munchy, Munchy, so Good!";
        } else if (snackType.equals("Candy")) {
            return "Sugar, Sugar, so Sweet!";
        } else if (snackType.equals("Drink")) {
            return "Drinky, Drinky, Slurp Slurp!";
        } else if (snackType.equals("Gum")) {
            return "Chewy, Chewy, Lots O Bubbles!";
        } else return "";
    }

    public String getSnackSlot() {
        return snackSlot;
    }

    public String getSnackName() {
        return snackName;
    }

    public double getSnackCost() {
        return snackCost;
    }

    public String getSnackType() {
        return snackType;
    }

    public int getSnackStock() {
        return snackStock;
    }

    public List<String[]> getSnackList() {
        return snackList;
    }

    public void setSnackStock(int snackStock) {
        this.snackStock = snackStock;
    }
}
