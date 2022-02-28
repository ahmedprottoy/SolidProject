public class PhoneNotification implements NotificatiionService,Call{

    @Override
    public void sendOTP() {

        System.out.println("Transaction successfull \nSent Via Phone Text");
    }

    @Override
    public void sendTransactionReport(String message) {

        System.out.println(message);
    }

    @Override
    public void getCall() {
        System.out.println("Calling In A Few Minutes...");
    }
    
}
