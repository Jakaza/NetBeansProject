package za.ac.tut.model;

public class Candidate {
    
    private String username;
    private String choosenTestOp;
    private Integer correctAnswer;
    private Integer wrongAnswer;
    private Integer currentNumQuiz;
    private Integer marks;

    public Candidate() {
        correctAnswer = 0;
        wrongAnswer = 0;
        marks = 0;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getChoosenTestOp() {
        return choosenTestOp;
    }

    public void setChoosenTestOp(String choosenTestOp) {
        this.choosenTestOp = choosenTestOp;
    }

    public Integer getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Integer correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Integer getWrongAnswer() {
        return wrongAnswer;
    }

    public void setWrongAnswer(Integer wrongAnswer) {
        this.wrongAnswer = wrongAnswer;
    }

    public Integer getCurrentNumQuiz() {
        return currentNumQuiz;
    }

    public void setCurrentNumQuiz(Integer currentNumQuiz) {
        this.currentNumQuiz = currentNumQuiz;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }
    
    
    
    
}
