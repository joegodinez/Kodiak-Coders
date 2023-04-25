import java.util.Date;

class vacation{
    private int vacation_id;
    private double budget, spent;
    private String name;
    private date start_date, end_date;
    //default class characteristics
    public car(String name){
        this.name = name;
        this.budget = 0;
        this.spent = 0;
        this.vacation_id = 999999999;
        this.start_date = new Date();
        this.end_date = new Date();
    }
    public double calcCosts(destinations[]){
        for(int i = 0; i < destinations.len, i++){
            double j += destinations[i].cost;
        }
        return j;
    }

    public bool onBudget(budget, spent){
        if(budget - spent) >= 0{
            return true;
        } else {
            return false;
        }
    }

    //todo: new technique 
    public int calcLength(start_date, end_date){

    }

}
