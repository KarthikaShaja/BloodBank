package blood.dl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



import blood.dto.*;

public class BankDL {
	
	public static int addBlood(DonorDTO donor)
	{
		int result;
		Connection con=null;
		PreparedStatement ps=null;
		try
		{
			
			con=DBHelper.getConnection();
			String sql="INSERT INTO BLOOD_BANK(blood_grp) VALUES(?)";
			ps=con.prepareStatement(sql);
			ps.setString(1,donor.getBlood_grp());
			//ps.setString(2,donor.getDate_of_receiving);
			
			
			result=ps.executeUpdate();
			
		}
		catch(Exception e) 
		{
			result = -1;
			System.out.println("**Error** : BankDL.addBlood() "+e.getMessage());
			
		}
		
		return result;
	}	
	
	
	public static ArrayList<BankDTO> getBloods()
{
	ArrayList<BankDTO> bloods = null;
	String query;
	Connection con = null;
	Statement statement = null;
	ResultSet resultSet = null;
	BankDTO blood = null;

	
	try
	{
		bloods = new ArrayList<BankDTO>();
		query="SELECT * FROM BLOOD_BANK ";
		con = DBHelper.getConnection();
		statement = con.createStatement();
		resultSet = statement.executeQuery(query);
		while(resultSet.next())
		{
			blood = new BankDTO();
			blood.setBlood_grp(resultSet.getString("BLOOD_GRP"));
        }
	}
	catch(Exception e) 
	{
		System.out.println("**Error** : BankDL.getBloods "+e.getMessage());
		
	}
	return bloods;
}
}
