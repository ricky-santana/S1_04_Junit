package nivel3;

public class Calculator {
    private double totalAcumulate;

    public Calculator(){
        this.totalAcumulate = 0;
    }

    public double getTotalAcumulate(){
        return this.totalAcumulate;
    }

    public void add(double amount){
        this.totalAcumulate += amount;
    }
    public void subtract(double amout){
        this.totalAcumulate -= amout;
    }
    public void multiply(double amount){
        this.totalAcumulate *= amount;
    }
    public void divide (double amount){

        if (amount == 0){
            throw new ArithmeticException();
        }
        this.totalAcumulate /= amount;
    }

    public void reset(){
        this.totalAcumulate = 0;
    }

}
