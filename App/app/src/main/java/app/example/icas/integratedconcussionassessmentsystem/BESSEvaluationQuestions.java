package app.example.icas.integratedconcussionassessmentsystem;

/**
 * Created by mkaka on 2016-12-05.
 */

public class BESSEvaluationQuestions {

    String questions[] = {  "Footwear",
                            "Dominant Foot",
                            "Testing Surface"};
    int index, max;

    /* Constructor */
    public BESSEvaluationQuestions() {
        this.index = 0;
        this.max = 3;
    }

    public String getCurrentQuestion(){
        return questions[this.index];
    }

    public void incrementIndex(){
        if(this.index < this.max) {
            this.index++;
        }
    }

    public void decrementIndex(){
        if(this.index > 0){
            this.index --;
        }
    }

    /* getters and setters */
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getMaxIndex(){
        return this.max;
    }

}
