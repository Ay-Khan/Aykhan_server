package ArrayDZ;

import java.util.ArrayList;

public class BankApplication {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    // Добавляет новый объект Account
    public void addAccount(Account a){
        accounts.add(a);
    }
// Удаляет объект со списка под индексом i
    public void removeAccount(int i){
        accounts.remove(i);
    }
// Возвращает объект Account у кого самый высокий баланс
    public Account getMaxAccount(){
        double max=0;
        Account account=null;
        for (int i=0;i<accounts.size();i++) {
            if (accounts.get(i).getBalance()>max)
                account=accounts.get(i);
        }
       return account;
    }

// Возвращает среднее значение баланса пользователей
    public double getAverageBalance(){
        double srzn=0;
        double sum=0;
        for (int i=0;i<accounts.size();i++){
            sum+=accounts.get(i).getBalance();
            srzn=sum/accounts.size();
        }
        return srzn;
    }
    // Возвращает сумму баланса пользователей
    public double getTotalBalance(){
        double sum=0;
        for (int i=0;i<accounts.size();i++){
            sum+=accounts.get(i).getBalance();
        }
        return sum;
    }

    // Возвращает количество пользователей
    public int totalAccounts(){
        return accounts.size();
    }
// Возвращает имя банка, количество счетов, сумму баланса и среднее значение баланса
    public String getBankData(){
        return accounts.toString();
    }

}
