package week1.day2;

public class Mymobile {
     public void makeCall() {
    	 System.out.println("make call");
     }
     public void sendMsg() {
    	 System.out.println("send message");
     }
     private void payBills() {
    	 System.out.println("pay bills");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Mymobile obj= new Mymobile();
         obj.makeCall();
         obj.sendMsg();
         obj.payBills();
         
	}

}
