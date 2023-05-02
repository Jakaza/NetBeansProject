package za.ac.tut.ejb.bl;

import jakarta.ejb.Stateful;
import za.ac.tut.model.Candidate;

@Stateful
public class ArithmeticSB implements ArithmeticSBLocal {
    private Candidate candidate = new Candidate();

    
    @Override
    public void initUsername(String username){
      candidate.setUsername(username);
    }
    
    @Override
    public void initChoosenTest(String chosenTest){
          candidate.setChoosenTestOp(chosenTest);
    }
    
    @Override
    public void updateCorrectAnswerCount(){
        Integer correcntAnswer = candidate.getCorrectAnswer();
        correcntAnswer++;
        candidate.setCorrectAnswer(correcntAnswer);
    }
    
    @Override
    public void updateWrongAnswerCount(){
        Integer wrongAnswer = candidate.getWrongAnswer();
        wrongAnswer++;
        candidate.setWrongAnswer(wrongAnswer);
    }

}
