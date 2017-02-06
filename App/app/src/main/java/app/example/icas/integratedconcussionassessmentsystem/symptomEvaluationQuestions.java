package app.example.icas.integratedconcussionassessmentsystem;

/**
 * Created by mkaka on 2016-12-05.
 */

public class symptomEvaluationQuestions {

    String questions[] = {  "Headache",
                            "Pressure in head",
                            "Neck Pain",
                            "Nausea or vomiting Dizziness",
                            "Blurred vision",
                            "balance problems",
                            "Sensitivity to light",
                            "Sensitivity to noise",
                            "Feeling slowed down",
                            "Feeling like “in a fog“",
                            "“Don’t feel right”",
                            "Difficulty concentrating",
                            "Difficulty remembering",
                            "Fatigue or low energy",
                            "Confusion Drowsiness",
                            "Trouble falling asleep",
                            "More emotional",
                            "Irritability Sadness",
                            "Nervous or Anxious"};
    int index, max;

    /* Constructor */
    public symptomEvaluationQuestions() {
        this.index = 0;
        this.max = 19;
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
