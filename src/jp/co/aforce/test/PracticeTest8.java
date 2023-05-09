package jp.co.aforce.test;

public class PracticeTest8 {
	//問題１
	public void printHello() {
		System.out.println("Hello");
	}
	//問題２
	public void printRandomMessage() {
		int n = (int)(3 * Math.random());
		if(n == 0)System.out.println("こんばんは");
		if(n == 1)System.out.println("こんにちは");
		if(n == 2)System.out.println("おはよう");
	}
	//問題３
	public void printMessage(String message) {
		System.out.println(message);
	}
	//問題４
	public void printMessage(String message,int count) {
		for(int i = 1 ; i <= count ; i++) {
			System.out.println(message);
		}
	}
	//問題5
	public void printRectangleArea(double height, double width) {
		System.out.println(height * width);
	}
	//問題6
	public String getWeatherForecast() {
		int n =(int)(3 * Math.random());
		int k =(int)(4 * Math.random());
		String day = null;
		String weath = null;
		switch(n) {
		case 0:
			day = "今日";
			break;
		case 1:
			day = "明日";
			break;
		case 2:
			day = "明後日";
			break;
		}
		switch(k) {
		case 0:
			weath = "晴れ";
			break;
		case 1:
			weath = "曇り";
			break;
		case 2:
			weath = "雨";
			break;
		case 3:
			weath = "雪";
			break;
		
		}
		return day + "の天気は" + weath + "でしょう";
	}
	//問題７
	public boolean isEvenNumber(int value) {
		return value%2 == 0;	
	}
	//問題８
	public String getMessage(String name, boolean isKid) {
		String mw = null;
		if(isKid = true)mw = "ちゃん";
		if(isKid = false)mw = "さん";
				
		return "こんにちは。" + name + mw + "。";
	}
	//問題９
	public String getLongestString(String[] array) {
		int leng = 0;
		
		for(int m = 0; m < array.length; m++) {
			if(array[m].length() >= array[leng].length()) {
				leng = m;
			} 
		}
		return  array[leng];
	}
	//問題10
	public boolean isAdult(Person person) {
		return person.getAge() >= 20;
	}
	
}
