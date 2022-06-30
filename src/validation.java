import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validation { 
	
	public void check(boolean ans) {
		if(ans)
		{
			System.out.println("Valid");
			
		}
		else
		{
			System.out.println("InValid");
		}
	
		
	}
	public boolean nameValidation(String name)
	{
		String regex="^[A-Z]{1}+[a-z]{2,}$";
		Pattern pt=Pattern.compile(regex);
		Matcher mt=pt.matcher(name);
		check(mt.find());
		return mt.matches();
	}
	public boolean phoneNumberValidation(String phone)
	{
		String regex="^(91|0)?+[7-9]{1}+[0-9]{9}$";
		Pattern pt=Pattern.compile(regex);
		Matcher mt=pt.matcher(phone);
		check(mt.find());
		return mt.matches();
		
	}
}
