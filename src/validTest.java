
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class validTest {
	
	private validation v;
	private String fname;
	private String number;
	
	@Before
	public void setUp()
	{
		fname ="Tinu";
		number="9854567676";
	}
	
	@Test
	public void nameValidation()
	{
		boolean ans1=v.nameValidation(fname);
		Assert.assertEquals(true, ans1);
		fname ="Tinu";
		boolean ans2 = v.nameValidation(fname);
		Assert.assertEquals(false, ans2);
	}
	
	@Test
	public void phoneNumberValidation()
	{
		
		boolean ans = v.phoneNumberValidation(number);
		Assert.assertEquals(true, ans);
		
		number = "9854567676";
		boolean ans3 = v.phoneNumberValidation(number);
		Assert.assertEquals(false, ans3);
}
}
