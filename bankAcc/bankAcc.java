public class BankAcc {
    String name;
    double money;

    void deposit(double val) {
        money += val;
    }

    void withdraw(double valor) {
        if (val <= money) {
            money -= val;
        } else {
            System.out.println("no money :( ");
        }
    }
}  

    void print() {
        System.out.println("Name: " + name);
        System.out.println("Money: " + money);
    }

    public static void main(String[] args) {
        BankAcc acc = new BankAcc();
        acc.name = "Neu";
        acc.money = 999.0;

        acc.print();
        acc.deposit(429.0);
        acc.print();
        acc.withdraw(29.0); 
        acc.print(); 
        acc.withdraw(999.0);
    }
}