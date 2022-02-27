public class Deposit implements Transactions{
    
    int amount =0;
    String name ,  acNumber;
    Deposit(String name , String acNumber , int amount){
        this.name = name;
        this.acNumber = acNumber;
        this.amount = amount;
    }
    public String doTransaction(){
        String message = name+" deposit " +amount+"$ at account "+acNumber ;
        return message;
    }

    
     
}
