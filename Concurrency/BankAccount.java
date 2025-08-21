public class BankAccount {
    private long balance ;
    public synchronized void deposit(long amount){
        balance += amount;
    }
    public void withdraw(long amount){
        if(balance>=amount)
            balance-=amount;
    }
    public long getbalance (){
        return this.balance ;
    }
}
