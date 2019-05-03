package com.mkyong.hashing;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
 	System.out.println( "Hello World!" );
	System.out.println( "Hello World!" );
    }

    public boolean isPrime(int n){

	boolean prime=true;
	for(int i =2;i<=n;i++){
	    if(n%i==0){
	prime = false;
	break;
}
}
return prime;	
}
}
