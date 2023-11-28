package Question2;

public class TestLoan {
	public static void main(String[] args) { 
        Loan loan1 = new Loan(); 
        loan1.set_amount(5_000_000); 
        loan1.set_period(10); 
        loan1.set_rate(10);
        loan1.MonthPayment();
        System.out.printf("กู้เงิน %,.2f บาท\n", loan1.get_amount()); 
        System.out.printf("  ต้องการผ่อนชำระ %.0f ปี\n", loan1.get_period()); 
        System.out.printf("  ดอกเบี้ย %.0f present ต่อปี\n", loan1.get_rate()); 
        System.out.printf("  ต้องชำระ %,.2f ต่อเดือน\n", loan1.get_month()); 
    }
}
