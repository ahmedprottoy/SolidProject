public class EmailNotification implements NotificatiionService{

    @Override
    public void sendOTP() {
        System.out.println("Transaction successfull\nSend via email");
    }

    @Override
    public void sendTransactionReport(String message) {
        System.out.println(message);
    }

}
