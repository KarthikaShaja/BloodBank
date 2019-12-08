package blood.bl;

import blood.dl.AdminProfileDL;
import blood.dto.AdminProfileDTO;

public class AdminProfileBL {
	
	public static int getCount (String donor_id)
	{
		AdminProfileDTO donor=null;
		int count=0;
		try
		{
			count=AdminProfileDL.getCount(donor_id);
		}
		catch(Exception e)
		{
			System.out.println("**error** AdminProfileBL:getCount"+e.getMessage());
		}
		
		return count;
	}


}
