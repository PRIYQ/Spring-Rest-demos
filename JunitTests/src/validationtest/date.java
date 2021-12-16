package validationtest;
import java.util.regex.Pattern;

public class date {
	public  boolean test(String value, String regex)
	{
		return Pattern.compile(regex).matcher(value).matches();
	}

}

