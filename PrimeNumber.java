import java.util.*;  

class PrimeNumber {

    static Integer prime(Integer x)
    {
	for(int i=2; i<x/2; i++)
	{
		if(x%i==0)
                {
                      return 0;
                }
        }
        return 1;
    } 
    public static void main(String[] args) {
        System.out.println(prime(Integer.parseInt(args[0])));
    }

}