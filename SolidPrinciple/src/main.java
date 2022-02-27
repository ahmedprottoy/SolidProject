import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Choose Option : \n Press 1 - if you're new user \n press 2 - if you already have account.");

            int n = input.nextInt();
            if (n == 1) {
                String name, Age, Phone, Acc_type;
                System.out.print("Enter your name :");
                name = input.next();
                System.out.print("Enter your Age :");
                Age = input.next();
                System.out.print("Enter your Phone No :");
                Phone = input.next();
                System.out.print("Prefered Account Type :");
                Acc_type = input.next();

                Account a = new Account(name, Age, Phone, Acc_type);
            } else {
                System.out.println("To get the bank service enter your name and account number : ");
                System.out.print("Name: ");
                String name = input.next();
                System.out.print("Account number : ");
                String acNumber = input.next();

                String option;
                int amount = 0;
                System.out.println("Services : \nDeposit \nWithdraw \nLoanservice \nCheck balance \nTo sign out enter 'Exit'");
                while ((option = input.next()) != "reject") {

                    if (option.equalsIgnoreCase("deposit") || option.equalsIgnoreCase("withdraw")) {
                        Transactions t;
                        System.out.print("Amount: ");
                        amount = input.nextInt();
                        if (option.equalsIgnoreCase("deposit")) {
                            t = (Transactions) new Deposit(name, acNumber, amount);

                        } else {
                            t = (Transactions) new Withdraw(name, acNumber, amount);

                        }
                        String message = t.doTransaction();
                        //b.doCalc(amount);
                        System.out.print("Send notification at : ");
                        //String medium = input.nextLine();
                        String medium = input.next();
                        if (medium.equalsIgnoreCase("Email")) {
                            EmailNotification email = new EmailNotification();
                            //email.sendOTP();
                            email.sendTransactionReport(message);
                            email.sendOTP();
                        } else if (medium.equalsIgnoreCase("phone")) {
                            PhoneNotification pn = new PhoneNotification();
                            pn.sendTransactionReport(message);
                            pn.sendOTP();
                        }
                    } else if (option.equalsIgnoreCase("Exit")) {
                        break;
                    } else {
                        System.out.println("Unknown keyword");
                    }
                }
            }
        }

    }
}
