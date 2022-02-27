public class Account {
    String name,Age,Phone,Acc_type;

    Account(String n,String a,String p,String acc){
        name = n;
        Age = a;
        Phone = p;
        Acc_type = acc;
        show();
    }

    public void show(){
        System.out.println("New Account Has Been Created ! ");
    }
}
