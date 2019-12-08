package blood.dl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import blood.dto.AdminAcceptDonorDTO;
import blood.dto.BloodDonorsDTO;

public class BloodDonorsDL {
	
	public static int addToBloodDonors(AdminAcceptDonorDTO accept)
	{
		int result = 0;
		String query;
		PreparedStatement ps;
		Connection con =null;
		try
		{
			
			con = DBHelper.getConnection();
			query = "INSERT INTO BLOOD_DONORS(donor_id,donor_name,blood_grp,gender,age,phone,height,weight,dod)VALUES(?,?,?,?,?,?,?,?,?)";
			ps=con.prepareStatement(query);
			ps.setString(1, accept.getDonor_id());
			ps.setString(2, accept.getDonor_name());
			ps.setString(3, accept.getBlood_grp());
			ps.setString(4, accept.getGender());
			ps.setString(5, accept.getAge());
			ps.setLong(6, accept.getPhone());
			ps.setFloat(7, accept.getHeight());
			ps.setFloat(8, accept.getWeight());
			ps.setString(9, accept.getDod());
			result = ps.executeUpdate();
			
		}
		catch(Exception e) 
		{
			result = -1;
			System.out.println("**Error** : BloodDonorsDL.addToBloodDonors "+e.getMessage());
         
			
		}
		
		return result;
	}
	
	public static ArrayList<BloodDonorsDTO> getDonors()
{
	ArrayList<BloodDonorsDTO> donorss = null;
	String query;
	Connection con = null;
	Statement statement = null;
	ResultSet resultSet = null;
	BloodDonorsDTO donor1  = null;

	
	try
	{
		donorss = new ArrayList<BloodDonorsDTO>();
		query="SELECT * FROM BLOOD_DONORS ";
		con = DBHelper.getConnection();
		statement = con.createStatement();
		resultSet = statement.executeQuery(query);
		while(resultSet.next())
		{
			donor1 = new BloodDonorsDTO();
			
			donor1.setDonor_id(resultSet.getString("DONOR_ID"));
			donor1.setDonor_name(resultSet.getString("DONOR_NAME"));
			donor1.setBlood_grp(resultSet.getString("BLOOD_GRP"));
			donor1.setGender(resultSet.getString("GENDER"));
			donor1.setAge(resultSet.getString("AGE"));
			donor1.setPhone(resultSet.getLong("PHONE"));
			donor1.setHeight(resultSet.getFloat("HEIGHT"));
			donor1.setWeight(resultSet.getFloat("WEIGHT"));
			donor1.setDod(resultSet.getString("DOD"));
			donorss.add(donor1);
			
		}
		resultSet.close();
		statement.close();
		con.close();
	}
	catch(Exception e) 
	{
		System.out.println("**Error** : BloodDonorsDTO.getDonorss "+e.getMessage());
		
	}
	
	return donorss;

}

}
