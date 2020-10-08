import java.io.*;

public class Fraction{
	private double num;
	private double den;

	public Fraction (){

		this.num = 0;
		this.den = 1;
	}
	public Fraction (double x, double y){

		this.num = x;
		this.den = y;
	}

	public double getNum(){
		return this.num;
	}

	public double getDen(){
		return this.den;
	}


	public double CalculFraction(){

		return this.num/this.den;
	}

	public String toString(){
		return this.num + "/" + this.den  + " = " + CalculFraction();
	}

}