package Except;
public class CreditLimit extends Exception{
	public String toString(){
		return "Registered credits should not be greater than 30";
	}
}
