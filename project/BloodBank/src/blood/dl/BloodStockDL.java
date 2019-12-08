package blood.dl;

import java.sql.Connection;
import java.sql.PreparedStatement;



public class BloodStockDL {
	
	public static int getCount(String blood_grp)
	{
		int result = 0;
		PreparedStatement ps;
		Connection con =null;
		
		
		try
		{
			System.out.println("Inside DL " +blood_grp);
			con = DBHelper.getConnection();	
			String sql = "UPDATE BLOOD_BANK SET COUNT = COUNT+1 WHERE BLOOD_GRP =?"; 
			ps=con.prepareStatement(sql);
			System.out.println(sql);
		    ps.setString(1, blood_grp);
		    result = ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println("**Error** : BloodStocktDL.getCount "+e.getMessage());
		}
		return result;
		
		
	}
	
	public static int getCountt(String blood_grp)
	{
		int result = 0;
		PreparedStatement ps;
		Connection con =null;
		
		
		try
		{
			System.out.println("Inside DL " +blood_grp);
			con = DBHelper.getConnection();	
			String sql = "UPDATE BLOOD_BANK SET COUNT = COUNT-1 WHERE BLOOD_GRP =?"; 
			ps=con.prepareStatement(sql);
			System.out.println(sql);
		    ps.setString(1, blood_grp);
		    result = ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println("**Error** : BloodStocktDL.getCountt "+e.getMessage());
		}
		return result;
		
		
	}
}
