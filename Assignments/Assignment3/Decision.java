import java.util.*;

public class Decision implements IDecision{
    private String m_question;
    private IDecision m_yes;
    private IDecision m_no;
    private String m_yesTerminal;
    private String m_noTerminal;
    
    public Decision(String question){
        m_question = question;
    }
    
    public void setYes(IDecision yes){
        m_yes = yes;
    }
    
    public void setNo(IDecision no){
        m_no = no;
    }
    
    public void setYesTerminal(String terminal){
        m_yesTerminal = terminal;
    }
    
    public void setNoTerminal(String terminal){
        m_noTerminal = terminal;
    }
    
    public IDecision ask(){
        
        System.out.println(m_question);
        Scanner read = new Scanner(System.in);
        String in = read.next().toLowerCase();
        
        if(in.equals("y") && m_yes != null){
            return m_yes;
        }else if(in.equals("n") && m_no != null){
            return m_no;
        }else if(in.equals("y") && m_yes == null){
            System.out.println(m_yesTerminal);
            return null;
        }else if(in.equals("n") && m_no == null){
            System.out.println(m_noTerminal);
            return null;
        }else
            return null;
    }
}