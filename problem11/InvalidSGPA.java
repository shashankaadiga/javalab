package Except;
public class InvalidSGPA extends Exception{
	public String toString(){
		return "SGPA cannot be above 10";
	}
}