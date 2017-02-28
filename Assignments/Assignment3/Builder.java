public class Builder{
    
    public IDecision buildWizard(){
        IDecision dec1 = new Decision("Do you want to buy a snowboard?");
        IDecision dec2 = new Decision("Have you snowboarded before?");
        IDecision dec3 = new Decision("Are you an expert?");
        IDecision dec4 = new Decision("Do you like to go fast?");
        IDecision dec5 = new Decision("Do you want to buy downhill skis?");
        IDecision dec6 = new Decision("Have you gone skiing before?");
        IDecision dec7 = new Decision("Are you an expert?");
        IDecision dec8 = new Decision("Do you like to jump?");
        
        dec1.setYes(dec2);
        dec1.setNo(dec5);
        dec2.setYes(dec3);
        dec2.setNoTerminal("Buy the XG100");
        dec3.setYes(dec4);
        dec3.setNoTerminal("buy the XG200");
        dec4.setYesTerminal("Buy the XG300");
        dec4.setNoTerminal("Buy the XG200");
        dec5.setYes(dec6);
        dec5.setNoTerminal("Try skiing someday!");
        dec6.setYes(dec7);
        dec6.setNoTerminal("Buy the ZR100");
        dec7.setYes(dec8);
        dec7.setNoTerminal("Buy the ZR200");
        dec8.setYesTerminal("Buy the ZR300");
        dec8.setNoTerminal("Buy the ZR200");
        
        return dec1;
    }
}