package za.ac.tut.ejb.bl;

import jakarta.ejb.Local;


@Local
public interface ArithmeticSBLocal {
    
    public void initUsername(String username);
    
    public void initChoosenTest(String chosenTest);
    
    public void updateCorrectAnswerCount();
    
    public void updateWrongAnswerCount();
}
