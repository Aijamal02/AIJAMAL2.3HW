public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit (double sum){
        amount= amount+sum;
    }
    public void withDraw(int sum) throws LimitException{
        if(sum>amount){
            throw new LimitException("Запрошенная сумма больше текущего баланса" + "Остаток" +amount);
        }
        amount=amount-sum;
    }

}
