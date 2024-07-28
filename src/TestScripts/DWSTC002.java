package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenericUtils.BaseClass2;

@Listeners(GenericUtils.BaseClass2.class)
public class DWSTC002 extends BaseClass2 {
	
	@Test
	public void verify_user_is_able_to_add_a_product_tp_cart()
	{
		Assert.fail();
	}
}