import java.util.Scanner;

public class TranscationProgram {
    interface Transaction {
        void withdraw(int amt);
        void deposit(int amt);
        int viewBalance();
    } // end of Transaction interface

    class BankAccount implements Transaction {
        private int initialAmount;

        BankAccount(int initialBalance) {
            this.initialAmount = initialBalance;
        }

        public void withdraw(int amt) {
            if (initialAmount - amt < 0) {
                System.out.println("Insufficient Balance");
            } else {
                initialAmount -= amt;
            }
        }

        public void deposit(int amt) {
            initialAmount += amt;
        }

        public int viewBalance() {
            return initialAmount;
        }
    } // end of BankAccount class

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialBalance = sc.nextInt();
        Transaction account = new TranscationProgram().new BankAccount(initialBalance);

        int N = sc.nextInt();

        for (int ctr = 1; ctr <= N; ctr++) {
            int amt = sc.nextInt();

            if (amt > 0) {
                account.deposit(amt);
            } else {
                account.withdraw(-amt);
            }

            System.out.println(account.viewBalance());
        }
        sc.close();
    } // end of main method
} // end of TranscationProgram class
/*
 * Example Input/Output 1:

Input:

1000

4

-500

-1000

2000

-1000

Output:

500

Insufficient Balance

500

2500

1500

Explanation:

The balance in the bank account is 1000.

1st transaction: 500 debited. Now the balance becomes 500.

2nd transaction: The amount to be debited is 1000, which is greater than the ba "Insufficient Balance" is printed. The balance remains the same 500.

3rd transaction: 2000 credited. Now the balance becomes 2500.

4th transaction: 1000 debited. Now the balance becomes 1500.
 */
