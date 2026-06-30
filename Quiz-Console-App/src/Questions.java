public class Questions {
    private int id;
    private String Questions;
    private String[] Ops=new String[4];
    private String Ans;
    // Constructor
    public Questions(int id, String questions, String[] ops, String ans) {
        this.id = id ;
        this.Questions = questions;
        this.Ops = ops;
        this.Ans = ans;
    }

    //Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //Getter & Setter
    public String getQuestions() {
        return Questions;
    }

    public void setQuestions(String questions) {
        this.Questions = questions;
    }
    //Getter & Setter
    public String[] getOps() {
        return Ops;
    }

    public void setOps(String[] ops) {
        this.Ops = ops;
    }
    //Getter & Setter
    public String getAns() {
        return Ans;
    }

    public void setAns(String ans) {
        this.Ans = ans;
    }

}
