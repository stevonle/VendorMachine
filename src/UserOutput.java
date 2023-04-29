import java.util.List;
import java.util.Map;

public class UserOutput {
    public void displayMessage(String message)
    {
        System.out.println();
        System.out.println(message);
        System.out.println();
    }

    public void displayHomeScreen()
    {
        System.out.println("***************************************************");
        System.out.println("                      Home");
        System.out.println("***************************************************");
        System.out.println();
    }

    public void displaySnackList(List<Snacks> vendorSnackList)
    {
        System.out.println("Slot | Name | Cost | Type | Stock Left");
        for (Snacks eachItem : vendorSnackList) {
            System.out.print(eachItem.getSnackSlot() + " | ");
            System.out.print(eachItem.getSnackName() + " | ");
            System.out.print("$" + eachItem.getSnackCost() + " | ");
            System.out.print(eachItem.getSnackType() + " | ");
            System.out.println(eachItem.getSnackStock());
        }
        System.out.println();
    }

    public void notEnoughMoney() {
        System.out.println("You don't have enough money.");
    }

    public void outOfStock() {
        System.out.println("ITEM NO LONGER AVAILABLE");

    }

    public void invalidSlotMessage(){
        System.out.println("That slot does not exist on this machine.");
    }

    public void chooseItem() {
        System.out.println("Please choose the item you would like");
    }

    public void dispensingMessage(Snacks eachItem) {
        System.out.println("Dispensing " + eachItem.getSnackName() + " $" + eachItem.getSnackCost());
        System.out.println(eachItem.snackTypeMessage(eachItem.getSnackType()));
    }

    public void feedMessage() {
        System.out.println("Please feed me money. Only $1, $5, $10, $20 bills are accepted");

    }

    public void invalidBillMessage() {
        System.out.println("Not a valid bill.");

    }

    public void displayBalance(MoneyBalance inputMoney) {
        System.out.println("Current balance: $" + inputMoney.getCurrentBalance());
        System.out.println();
    }

    public void displayEndTransaction(Map<String, Integer> endMap2){
        System.out.println("Here's your change! Dollars: " + endMap2.get("dollars") + " Quarters: " + endMap2.get("quarters") + " Dimes: " + endMap2.get("dimes") + " Nickels: " + endMap2.get("nickels"));

    }
}
