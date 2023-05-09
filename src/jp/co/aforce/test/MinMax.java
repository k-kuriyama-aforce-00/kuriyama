package jp.co.aforce.test;

public class MinMax {
	
	static  int getMaxValue(int a, int b,int c) {
		int num;
		num = a;
		if(num < b) num = b;
		if(num < c) num = c;
		return num;
	}
	
	static int getMinValue(int a, int b,int c) {
		int num;
		num = a;
		if(num > b) num = b;
		if(num > c) num = c;
		return num;
	}

}
