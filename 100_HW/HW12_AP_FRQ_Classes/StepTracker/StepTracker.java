public class StepTracker{
    private int steps;
    private int days;
    private int activeDays;
    private int minSteps;
   
    public StepTracker(int m){
     minSteps = m;
     steps = 0;
     days = 0;
     activeDays = 0;
    }
    public int activeDays(int i){
        return activeDays;
    }

    
    public double averageSteps(){
        if(days == 0){
            return 0.0;
        }
        else{
            return (double)steps/days;
        }
        
    }
    public void addDailySteps(int i){
        steps = i+steps
        days++;
        if(i>=minSteps){
            activeDays++
        }
    }

}