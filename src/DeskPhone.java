public class DeskPhone implements Telephone {
    private String myNumber;
    private boolean ringing;

    public DeskPhone(String number){
        this.myNumber = number;
    }

    @Override
    public void answer() {
        if (ringing){
            System.out.println("Answerig the deskphone");
            ringing = false;
        } else {
            System.out.println("Phone is not ringing");
        }
        
    }

    @Override
    public boolean callPhone(String number) {
        if (number == myNumber){
            ringing = true;
            System.out.println("Phone Ringing");
        } else {
            ringing = false;
            System.out.println("Entered a wrong Number");
        }
        return ringing;
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing "+phoneNumber+"on Deskphone");
        
    }

    @Override
    public boolean isRinging() {
        return ringing;
    }

    @Override
    public void powerOn() {
        System.out.println("DeskPhone always will be powered ON");
        
    }
    
}
