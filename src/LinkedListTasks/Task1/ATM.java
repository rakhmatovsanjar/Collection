package LinkedListTasks.Task1;

import java.util.ArrayList;

class ATM {
    private int balance = 0;
    private int count = 0;
    private ArrayList<Money> monies = new ArrayList<>();
    private MessageInterface messageListener;
    private ShowMoneyInfoInterface moneyListener;

    public void addMoneys(ArrayList<Money> moneys) {
        for (Money money : moneys) {
            balance += money.getAmount();
            count++;
        }
        messageListener.showMessage("Pul qo'shildi. Joriy balans: " + balance);
    }

    public void setMessageListener(MessageInterface messageListener) {
        this.messageListener = messageListener;
    }

    public void setShowMoneyInfoInterface(ShowMoneyInfoInterface moneyListener) {
        this.moneyListener = moneyListener;
    }

    public void isGetMoney(int getSum) {
        if (getSum <= balance) {
            balance -= getSum;
            messageListener.showMessage("Muvaffaqiyatli narx olingan. Joriy balans: " + balance);
        } else {
            messageListener.showMessage("Xatolik: yetarli mablag' mavjud emas.");
        }
    }

    public int getBalance() {
        return balance;
    }
}
