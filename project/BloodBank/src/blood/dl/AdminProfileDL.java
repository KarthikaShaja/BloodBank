package blood.dl;

import java.sql.*;
import java.util.ArrayList;

import blood.dto.AdminProfileDTO;;

public class AdminProfileDL {

	public static int getCount(String donor_id)
	{
		ArrayList<AdminProfileDTO> donors=null;
		Connection con=null;
		Statement statement=null;
		ResultSet resultSet=null;
		AdminProfileDTO donor=null;
		int count=0;
		try
		{
			String query = "SELECT COUNT(*) FROM BLOOD_DONORS where DONOR_ID='"+donor_id+"'";
			con=DBHelper.getConnection();
			statement=con.createStatement();
			resultSet=statement.executeQuery(query);
			resultSet.next();
			count=resultSet.getInt(1);
			//System.out.println(count);
		}catch(Exception e)
		{
			System.out.println("**error** AdminProfileBL:getCount"+e.getMessage());
		}
		return count;
		
	}	

}
