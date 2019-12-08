package blood.dl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import blood.dto.AdminAcceptDonorDTO;
import blood.dto.DonorDTO;

public class AdminAcceptDonorDL
{
	public static int addToAdminAccept(DonorDTO donor)
	{
		int result = 0;
		String query;
		PreparedStatement ps;
		Connection con =null;
		try
		{
	
			con = DBHelper.getConnection();
			query = "INSERT INTO ADMIN_ACCEPT(donor_id,donor_name,blood_grp,gender,age,phone,height,weight,dod)VALUES(?,?,?,?,?,?,?,?,?)";
			ps=con.prepareStatement(query);
			ps.setString(1, donor.getDonor_id());
			ps.setString(2, donor.getDonor_name());
			ps.setString(3, donor.getBlood_grp());
			ps.setString(4, donor.getGender());
			ps.setString(5, donor.getAge());
			ps.setLong(6, donor.getPhone());
			ps.setFloat(7, donor.getHeight());
			ps.setFloat(8, donor.getWeight());
			ps.setString(9, donor.getDod());
			result = ps.executeUpdate();
			
		}
		catch(Exception e) 
		{
			result = -1;
			//System.out.println("Test1:"+donor.getDonor_id());
			//System.out.println("Test2:"+donor.getDonor_name());
			System.out.println("**Error** : AdminAcceptDL.addToAdminAccept "+e.getMessage());
           // e.printStackTrace();
			
		}
		
		return result;
	}
	
	public static ArrayList<AdminAcceptDonorDTO> getAccepts()
{
	ArrayList<AdminAcceptDonorDTO> accepts = null;
	String query;
	Connection con = null;
	Statement statement = null;
	ResultSet resultSet = null;
	AdminAcceptDonorDTO accept = null;

	
	try
	{
		accepts = new ArrayList<AdminAcceptDonorDTO>();
		query="SELECT * FROM ADMIN_ACCEPT ";
		con = DBHelper.getConnection();
		statement = con.createStatement();
		resultSet = statement.executeQuery(query);
		while(resultSet.next())
		{
			accept = new AdminAcceptDonorDTO();
			
			accept.setDonor_id(resultSet.getString("DONOR_ID"));
			accept.setDonor_name(resultSet.getString("DONOR_NAME"));
			accept.setBlood_grp(resultSet.getString("BLOOD_GRP"));
			accept.setGender(resultSet.getString("GENDER"));
			accept.setAge(resultSet.getString("AGE"));
			accept.setPhone(resultSet.getLong("PHONE"));
			accept.setHeight(resultSet.getFloat("HEIGHT"));
			accept.setWeight(resultSet.getFloat("WEIGHT"));
			accept.setDod(resultSet.getString("DOD"));
			accepts.add(accept);
			
		}
		resultSet.close();
		statement.close();
		con.close();
	}
	catch(Exception e) 
	{
		System.out.println("**Error** : AdminAcceptDL.getAccepts "+e.getMessage());
		
	}
	
	return accepts;

}

}
