import java.util.Scanner;

class ATM{
    float Balance= 50000;
    int atmpin=4223;

    public void checkpin(){
        System.out.println("Welcome to ATM, Don't remove your card.");
        System.out.print("Please enter Your Pin: ");
        Scanner sc=new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin == atmpin){
            menu();
        }
        else{
            System.out.println("Please enter a vaild pin");
            checkpin();
        }
    }

    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance: ");
        System.out.println("2. Withdraw Money"); 
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc=new Scanner(System.in);
        int option= sc.nextInt();

        if(option == 1){
            checkBalance();
        }
        else if(option == 2){
            withdrawMoney();
        }
        else if(option == 3){
            depositMoney();
        }
        else if(option == 4){
            System.out.println("Thank You, Please collect your card");;
        }
        else{
            System.out.println("Enter a VALID option");
        }    
    }

    public void checkBalance(){
        System.out.println("Balance: "+ Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter Amount to withdraw: ");
        Scanner sc=new Scanner(System.in);
        float amount= sc.nextFloat();
        if(amount<=Balance){
            Balance = Balance - amount;
            System.out.println("Money Withdraw Successfully");
        }
        else{
            System.out.println("Insufficient Balance");
        }
        System.out.println("Your Account Balance: "+ Balance);

        menu();
    }

    public void depositMoney(){
        System.out.println("Enter the Amount to deposit: ");
        Scanner sc=new Scanner(System.in);
        float amount= sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        System.out.println("Your Account Balance: "+ Balance);
        menu();
    }
}
