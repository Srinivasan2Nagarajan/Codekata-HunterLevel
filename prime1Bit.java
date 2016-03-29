import java.math.*;

public class Prime {

public boolean primeCheck(BigInteger n) //My BigInteger version , returns true if number is Prime, false if not
{
      if (n.intValue()==2) //case n =2, function returns true. 
      { 
        return true;
      }

      for (int i=2;i<=(int)Math.sqrt(n.intValue())+1;i++) //loops through 2 to sqrt(n). 
      { 
        if (n.intValue()%i==0)  //if a divisor is found, its not prime. returns false
        { 
          return false;
        }
      }
      return true; //if all cases are not divisible by n, it is prime.
    }
}
