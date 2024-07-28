package TestScripts;

import org.testng.annotations.Test;

import GenericUtils.BaseClass2;

public class DWSTC001 extends BaseClass2{
@Test
public void verify_a_product_can_be_added_to_the_cart() {
     bp.getElectronicsLink().click();
     ep.getCellPhoneLink().click();
     ep.getSmartPhoneLink().click();
     ep.getAddToCartBtn().click();
     bp.getShoppingCartLink().click();
     scp.getProductDetails();
     
	}

}