public class Deposit implements Transactions{
    
    int amount;
    String acNumber;
    Deposit( String acNumber , int amount){

        this.acNumber = acNumber;
        this.amount = amount;
    }
    public String doTransaction(){
        String message = "Dear Sir, Your A/C " + acNumber + " Has Been Credited By Taka " + amount ;
        return message;
    }

    
     
}
