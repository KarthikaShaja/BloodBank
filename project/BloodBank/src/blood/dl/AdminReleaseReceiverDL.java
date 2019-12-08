package blood.dl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import blood.dto.*;

public class AdminReleaseReceiverDL 
{


	public static int addToAdminRelease(ReceiverDTO receiver)
	{
		int result = 0;
		String query;
		PreparedStatement ps;
		Connection con =null;
		try
		{
		
			con = DBHelper.getConnection();
			query ="INSERT INTO ADMIN_RELEASE(patient_id,patient_name,blood_grp,gender,hospital_name,hospital_patient_id,phone)VALUES(?,?,?,?,?,?,?)";
			ps=con.prepareStatement(query);
			ps.setString(1, receiver.getPatient_id());
			ps.setString(2, receiver.getPatient_name());
			ps.setString(3, receiver.getBlood_grp());
			ps.setString(4, receiver.getGender());
			ps.setString(5, receiver.getHos_name());
			ps.setString(6, receiver.getHos_pat_id());
			ps.setLong(7, receiver.getPhone());
			
			result = ps.executeUpdate();
			
		}
		catch(Exception e) 
		{
			result = -1;
			//System.out.println("Test1:"+receiver.getreceiver_id());
			//System.out.println("Test2:"+receiver.getreceiver_name());
			System.out.println("**Error** : AdminReleaseReceiverDL.addToAdminRelease "+e.getMessage());
           // e.printStackTrace();
			
		}
		
		return result;
	}
	
	public static ArrayList<AdminReleaseReceiverDTO> getReleases()
{
	ArrayList<AdminReleaseReceiverDTO> releases = null;
	String query;
	Connection con = null;
	Statement statement = null;
	ResultSet resultSet = null;
	AdminReleaseReceiverDTO release = null;

	
	try
	{
		releases = new ArrayList<AdminReleaseReceiverDTO>();
		query="SELECT * FROM ADMIN_RELEASE ";
		con = DBHelper.getConnection();
		statement = con.createStatement();
		resultSet = statement.executeQuery(query);
		while(resultSet.next())
		{
			release = new AdminReleaseReceiverDTO();
			
			release.setPatient_id(resultSet.getString("PATIENT_ID"));
			release.setPatient_name(resultSet.getString("PATIENT_NAME"));
			release.setBlood_grp(resultSet.getString("BLOOD_GRP"));
			release.setGender(resultSet.getString("GENDER"));
			release.setHos_name(resultSet.getString("HOSPITAL_NAME"));
			release.setHos_pat_id(resultSet.getString("HOSPITAL_PATIENT_ID"));
			release.setPhone(resultSet.getLong("PHONE"));
			
			releases.add(release);
			
		}
		resultSet.close();
		statement.close();
		con.close();
	}
	catch(Exception e) 
	{
		System.out.println("**Error** : AdminReleaseDL.getReleases "+e.getMessage());
		
	}
	
	return releases;

}

}
