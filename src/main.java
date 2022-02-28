import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Choose Option : \n Press 1 - To Create New Account \n Press 2 - Already Got an Account");

            int n = input.nextInt();

            if (n == 1) {
                String name, Age, Phone, Acc_type;
                System.out.print("Enter Your Name :");
                name = input.next();
                System.out.print("Enter Your Age :");
                Age = input.next();
                System.out.print("Enter Your Phone No :");
                Phone = input.next();
                System.out.print("Preferred Account Type :");
                Acc_type = input.next();

                Account a = new Account(name, Age, Phone, Acc_type);
            }
            else{
                System.out.println("Get ATM Services - ");
                System.out.print("Name : ");
                String name = input.next();
                System.out.print("Account number : ");
                String acNumber = input.next();

                int option;
                int amount = 0;
                System.out.println("Select Desired Services : \n1. Deposit \n2. Withdraw \n3. Exit ");
                option = input.nextInt();
                while (option != 66) {

                    if (option == 1 || option == 2) {
                        Transactions t;
                        System.out.print("Amount: ");
                        amount = input.nextInt();
                        if (option == 1) {
                            t = (Transactions) new Deposit(acNumber, amount);

                        }
                        else {
                            t = (Transactions) new Withdraw(acNumber, amount);

                        }
                        String message = t.doTransaction();
                        System.out.print("Get Notification Via :\n 4. Email \n 5. Phone\n");
                        int medium = input.nextInt();
                        if (medium ==4) {
                            EmailNotification email = new EmailNotification();
                            //email.sendOTP();
                            email.sendTransactionReport(message);
                            email.sendOTP();
                        } else if (medium ==5) {
                            PhoneNotification pn = new PhoneNotification();
                            pn.sendTransactionReport(message);
                            pn.sendOTP();
                        }
                    } else if (option == 3) {
                        break;
                    }
                }
            }
        }

    }
}
