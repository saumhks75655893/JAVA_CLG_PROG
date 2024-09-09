
import java.util.*;

// JAVA OOPS PRACTICE PROJECT ( ATM MACHINE ) 

class ATM {
    float balance;
    int pin = 2580;

    
    ATM()
    {
        System.out.println("Enter your pin for varification : ");
        Scanner sc = new Scanner(System.in); 
        int enteredPin = sc.nextInt(); 
        if(enteredPin == pin)
        {
            System.out.println("Varification successful !!! ");
            menu(); 
        }
        else
        {
            System.out.println("Enter a valid pin !!!! ");
            ATM user1 = new ATM();
        }
    
    }

    public void menu() {
        System.out.println("1. Check account balance ");
        System.out.println("2. Withdraw money  ");
        System.out.println("3. Deposite money  ");
        System.out.println("4. Exit ");

        System.out.println("Enter your choice from { 1, 2, 3, 4}  :  ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            accountBalance();
        } else if (choice == 2) {
            withdrawMoney();
        } else if (choice == 3) {
            depositeMoney();
        } else if (choice == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice !!!!! ");
        }
    }

    public void accountBalance() {
        System.out.println("Account balance is : " + balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter ammount to withdraw : ");
        Scanner sc = new Scanner(System.in);
        float wAmount = sc.nextFloat();

        if (wAmount > balance) {
            System.out.println("Insufficient balance !! ");

        } else {
            balance = balance - wAmount;
            System.out.println("Money withdraw successfully and Remaining balance is : " + balance);

        }
        menu();
    }

    public void depositeMoney() {
        System.out.println("How much money do you want to deposite : ");
        Scanner sc = new Scanner(System.in);
        float dMoney = sc.nextFloat();

        balance = balance + dMoney;
        System.out.println("Money deposited successfully and the Now the balance is : " + balance);
        menu();
    }
}

public class OOPS_PRACTICE_PROJECT {
    public static void main(String[] args) {
        ATM user1 = new ATM();
        // user1.menu();
    }
}
