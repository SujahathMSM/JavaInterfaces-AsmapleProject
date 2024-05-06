public class MobilePhone implements Telephone {
    private String phoneNumber;
    private boolean ringing;
    private boolean powerOn;

    public MobilePhone(String number){
        this.phoneNumber = number;
    }

    @Override
    public void answer() {
        if (ringing && powerOn){
            System.out.println("Hello there, I am asnwering the phone");
        } else {
            ringing = false;
        }
        
    }

    @Override
    public boolean callPhone(String myNumber) {
        if (myNumber == phoneNumber && powerOn){
            ringing = true;
            System.out.println("Phone Ringing");
        } else {
            System.out.println("Entered a Wronh number of Phone is off");
            ringing = false;
        }
        return false;
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now Dialling on: "+ phoneNumber);
        
    }

    @Override
    public boolean isRinging() {
        return ringing;
    }

    @Override
    public void powerOn() {
        powerOn = true;
        System.out.println("Phone is powered ON");
        
    }
    
}
