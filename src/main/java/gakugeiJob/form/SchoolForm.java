package gakugeiJob.form;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Minlength;
import org.seasar.struts.annotation.Required;

public class SchoolForm {

	@Required
	@Maxlength(maxlength = 12)
	@Mask(mask = "^[A-Za-z0-9]+$")
	public String userId;
	
	@Required
	@Maxlength(maxlength = 12)
	@Minlength(minlength = 6)
	@Mask(mask = "^[A-Za-z0-9]+$")
	public String userPass;
	
	@Required
	@Maxlength(maxlength = 50)
	public String name;
	
	@Maxlength(maxlength = 100)
	public String address;
	
	@Maxlength(maxlength = 20)
	public String kinds;
	
	@Required
	@IntegerType
	@Maxlength(maxlength = 12)
	public String phoneNumber;
	
	@Maxlength(maxlength = 100)
	public String url;
	
	@Maxlength(maxlength = 100)
	public String oneThing;

	@Required
	@Maxlength(maxlength = 100)
	public String mailAddress;
	
}
