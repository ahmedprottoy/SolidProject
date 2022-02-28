public class Withdraw implements Transactions{
    int amount;
    String acNumber;
    Withdraw(String acNumber , int amount){

        this.acNumber = acNumber;
        this.amount = amount;
    }
    @Override
    public String doTransaction(){
        String message = "Dear Sir, Your A/C " + acNumber + " Has Been Dedited By Taka " + amount ;
        return message;
    }
}
