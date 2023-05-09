package jp.co.aforce.test;

public class Main {
	public static void main(String[] args) {
		
		PracticeTest8 pt8 = new PracticeTest8();
		//1
		pt8.printHello();
		//2
		pt8.printRandomMessage();
		//3
		pt8.printMessage("Hello");
		//4
		pt8.printMessage("yaa", 4);
		//5
		pt8.printRectangleArea(4, 20);
		//6
		System.out.println(pt8.getWeatherForecast());
		//7
		System.out.println(pt8.isEvenNumber(7));
		//8
		System.out.println(pt8.getMessage("栗山", false));
		//9
		String str = pt8.getLongestString(new String[] {"おはよう", "久しぶり","やあ","こんに"});
		System.out.println(str);
		//10
		Person person = new Person("栗山",23);
		boolean isAdult = pt8.isAdult(person);
		System.out.println(pt8.isAdult(person));
	}
	

}
