package Day4;

interface EcommercePayment {
    void makePayment();
}

abstract class PaymentSystems implements EcommercePayment {
    double amount;

    PaymentSystems(double amount) {
        this.amount = amount;
    }

    void showSuccessMessage() {
        System.out.println("Payment is successful: " + amount);
    }
}

class DebitCardPayment extends PaymentSystems {
    DebitCardPayment(double amount) {
        super(amount);
    }

    public void makePayment() {
        System.out.println("Debit Card payment is done...");
        showSuccessMessage();
    }
}

class NetBankingPayment extends PaymentSystems {
    NetBankingPayment(double amount) {
        super(amount);
    }

    public void makePayment() {
        System.out.println("Net Banking payment is done...");
        showSuccessMessage();
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        PaymentSystems ep = new DebitCardPayment(34000);
        ep.makePayment();

        System.out.println();

        PaymentSystems ep2 = new NetBankingPayment(55000);
        ep2.makePayment();
    }
}
