import java.math.BigInteger;


public class BigFactorial {
	BigInteger factorial(long numero){
		if (numero == 1){
			return BigInteger.ONE;
		}
		else{
			return (new BigInteger(String.valueOf(numero))).multiply(factorial(numero-1));
		}
	}
}
