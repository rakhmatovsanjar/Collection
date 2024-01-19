package LinkedListTasks.Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        MessageInterface messageListener = new MessageInterface() {
            @Override
            public void showMessage(String message) {
                System.out.println(message);
            }
        };

        ShowMoneyInfoInterface moneyListener = new ShowMoneyInfoInterface() {
            @Override
            public String showMoneyData(String amount, int count) {
                return amount + " dan " + count + " ta";
            }
        };

        atm.setMessageListener(messageListener);
        atm.setShowMoneyInfoInterface(moneyListener);

        ArrayList<Money> moneys = new ArrayList<>();
        moneys.add(new Money(1000));
        moneys.add(new Money(3000));
        atm.addMoneys(moneys);

        System.out.println("Joriy balans: " + atm.getBalance());

        atm.isGetMoney(5000);
        atm.isGetMoney(2000);
    }
}
