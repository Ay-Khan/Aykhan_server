package ArrayDZ;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        BankApplication bankApplication=new BankApplication();
        BankApplication bankApplication1=new BankApplication();
        BankApplication bankApplication2=new BankApplication();

        ArrayList<Account> accounts=new ArrayList<>();
        accounts.add(new Account(11,"Kit","Loo",10000));
        accounts.add(new Account(12,"Mike","Kolya",20000));
        accounts.add(new Account(13,"Nik","Kito",30000));

        bankApplication.setAccounts(accounts);
        bankApplication1.addAccount(new Account(22,"kjh","fds",30000));
        bankApplication1.addAccount(new Account(32,"kjh","fds",70000));
        bankApplication1.addAccount(new Account(42,"kjh","fds",80000));

        bankApplication2.addAccount(new Account(33,"asd","aert",40000));
        bankApplication2.addAccount(new Account(43,"asd","aert",50000));
        bankApplication2.addAccount(new Account(43,"asd","aert",60000));


       /* System.out.println(bankApplication.getAverageBalance());
        System.out.println(bankApplication1.getAverageBalance());
        System.out.println(bankApplication2.getAverageBalance());*/

        ArrayList<BankApplication> bankApplications=new ArrayList<BankApplication>();
        bankApplications.add(bankApplication);
        bankApplications.add(bankApplication1);
        bankApplications.add(bankApplication2);

        bubbleSort(bankApplications);


        for (int i=0;i<bankApplications.size();i++){
            System.out.println(bankApplications.get(i).getAverageBalance());
        }

    }

    public static void bubbleSort(ArrayList<BankApplication> bankApplications){
        for (int i=0;i<bankApplications.size();i++){
            for(int j=0;j<bankApplications.size();j++){
                if(bankApplications.get(i).getAverageBalance()<bankApplications.get(j).getAverageBalance()){
                    BankApplication bubble=null;
                    bubble=bankApplications.get(i);
                    bankApplications.set(i,bankApplications.get(j));
                    bankApplications.set(j,bubble);
                }
            }
        }


    }



}
