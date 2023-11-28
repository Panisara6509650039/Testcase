package Question1;

public class Calculator {
public double convertFarenheitToCelsius (double Fh) {
	double C = (5.0/9.0)*(Fh - 32.0);
	return C;
}
public double kilopound (double Kg) {
	double pound = Kg/0.454 ;
	return pound;
}
public double poundkilo (double pound) {
	double Kg = pound*0.454 ; 
	return Kg;
}
}
