import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MoneyBalance {
    private BigDecimal currentBalance = new BigDecimal("0");

    public MoneyBalance(){
    }

    public BigDecimal addToCurrentBalance(BigDecimal moneyFed){
        currentBalance = (currentBalance.add(moneyFed));
        return currentBalance;
        //BigDecimal moneyFedDecimal = new BigDecimal(moneyFed);
    }

    public BigDecimal subtractFromCurrentBalance(BigDecimal cost){
        if(currentBalance.subtract(cost).compareTo(BigDecimal.ZERO) >= 0){
            currentBalance = (currentBalance.subtract(cost));
        }
        return currentBalance;
    }

    public Map<String, Integer> giveChange(){
        BigDecimal balance = this.currentBalance;
        int nickels = 0;
        int quarters = 0;
        int dimes = 0;
        int dollars = 0;
        Map<String, Integer> changeMap = new HashMap<String, Integer>();

        while(balance.doubleValue() >= 1.0){
            balance = balance.subtract(BigDecimal.ONE);
            dollars += 1;
        }
        while(balance.doubleValue() >= 0.25){
            balance = balance.subtract(new BigDecimal(".25"));
            quarters += 1;
        }
        while(balance.doubleValue() >= 0.1){
            balance = balance.subtract(new BigDecimal(".1"));
            dimes += 1;
        }
        while(balance.doubleValue() >= 0.05){
            balance = balance.subtract(new BigDecimal(".05"));
            nickels += 1;
        }
        changeMap.put("dollars", dollars);
        changeMap.put("quarters", quarters);
        changeMap.put("dimes", dimes);
        changeMap.put("nickels", nickels);
        return changeMap;
    }

    public BigDecimal bogodoSale(int bogodoCounter, MoneyBalance inputMoney){
        if (bogodoCounter % 2 == 0) {
            currentBalance = currentBalance.add(BigDecimal.ONE);
        }
        return currentBalance;
    }

    public BigDecimal getCurrentBalance() {
        this.currentBalance = this.currentBalance.setScale(2);
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }
}
