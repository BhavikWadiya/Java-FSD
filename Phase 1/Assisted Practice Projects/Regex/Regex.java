package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		String regex = "^(?=.*[A-Z]).{8,}";
		String input = "bhavikWadiya404";
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(input);
		if(match.matches())
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}
