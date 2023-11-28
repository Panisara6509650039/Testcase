package Question3;

public class Triangle {
	// The length of each side of the triangle 
    private double a = 0; 
    private double b = 0; 
    private double c = 0; 
 
    // get side a 
    public double getA() { 
        return a; 
    } 
 
    // get side b 
    public double getB() { 
        return b; 
    } 
 
    // get side c 
    public double getC() { 
        return c; 
    } 
 
    // set side a 
    public void setA(double a) { 
        if (a > 0) { 
            this.a = a; 
        } 
    } 
 
    // set side b 
    public void setB(double b) { 
        if (b > 0) { 
            this.b = b; 
        } 
    } 
 
    // set side c 
    public void setC(double c) { 
        if (c > 0) { 
            this.c = c; 
        } 
    } 
 
    // calculate Area 
    public double calculateArea() { 
        double s = (a + b + c) / 2.0; 
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
    } 
 
    // it that the right triangle or not
    public boolean isTheRightTriangle() { 
        double c_squared = Math.pow(c, 2); 
        double a_squared = Math.pow(a, 2); 
        double b_squared = Math.pow(b, 2); 
        return c_squared == (a_squared + b_squared); 
    }
}
