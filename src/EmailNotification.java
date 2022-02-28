public class EmailNotification implements NotificatiionService{

    @Override
    public void sendOTP() {
        System.out.println("Transaction successful\nSent Via Email");
    }

    @Override
    public void sendTransactionReport(String message) {
        System.out.println(message);
    }

}
