package Question2;

public class Loan {

			private double month; // Month payment 
		    private double amount; // loan amount 
		    private double rate; // rate of loan 
		    private int period; // Installment period 
		 
		    // get Month payment 
		    public double get_month() { 
		        return month; 
		    } 
		 
		    // get loan amount 
		    public double get_amount() { 
		        return amount; 
		    } 
		 
		    // get rate of loan 
		    public double get_rate() { 
		        return rate; 
		    } 
		 
		    // get Installment period 
		    public double get_period() { 
		        return period; 
		    } 
		 
		    // set Monthly payment 
		    public void set_month(double p) { 
		        this.month = p; 
		    } 
		 
		    // set loan amount 
		    public void set_amount(double a) { 
		        this.amount = a; 
		    } 
		 
		    // set rate of loan 
		    public void set_rate(double r) { 
		        this.rate = r; 
		    } 
		 
		    // set Installment period 
		    public void set_period(int n) { 
		        this.period = n; 
		    }
		    // calculate Monthly payment 
		    public void MonthPayment() { 
		        double r = ((rate / 100) / 12); 
		        int n = period * 12; 
		        this.month = (amount * r * Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1);
		    }
		}


