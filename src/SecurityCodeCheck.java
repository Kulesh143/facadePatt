public class SecurityCodeCheck {
    private int securityCode=1234;
    public int getSecurityCOde(){
        return securityCode;
    }
    public boolean isSecCodeCorrect(int secCodeToCheck){
        if(secCodeToCheck==getSecurityCOde()){
            return true;
        }else{
            return false;
        }
    }
}
