public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(20000.0);

        try {
            while (true) {
                account.withDraw(6000);
            }
        } catch (LimitException e) {
            System.out.println("Итоговая сумма:"+ account.getAmount());
            System.out.println("Оставшееся сумма" + e.getRemainingAmount());
        }
    }
}
