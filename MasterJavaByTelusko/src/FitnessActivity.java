class FitnessActivity {
    private String activityType;
    private int duration;
    FitnessActivity(String activityType, int duration){
        this.activityType=activityType;
        this.duration=duration;
    }
    void displayDetails(){
        System.out.println("Actity: "+activityType
                +", Duration: "+duration+"mins");
    }
    public static void main(String[] args){
        FitnessActivity report = new FitnessActivity("RUNNING",30);
        FitnessActivity walkingReport = new FitnessActivity("WALKING", 30);
        report.displayDetails();
        walkingReport.displayDetails();
    }
}
