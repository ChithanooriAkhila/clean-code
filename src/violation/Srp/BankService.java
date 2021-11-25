package violation.Srp;

public class BankService {
    public long deposit(long amount,String accountNo){
        //deposit amount
        return 0;
    }
    public long withDraw(long amount,String accountNo){
        //withdraw amount
        return 0;
    }
    public void printPassBook(){
       //update transaction data in passbook
    }
    public void getLoanInterestINfo(String loanType){
        if(loanType.equals("home loan")){
            //do some thing
        }
        if(loanType.equals("personal loan")){
            //do some thing
        }
        if(loanType.equals("car")){
            //do something
        }
    }
    public void sendOTP(String medium){
        if(medium.equals("email")){
            //write email related logic
            //use JavaMailSenderAPi
        }
    }
}
