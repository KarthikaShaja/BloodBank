package blood.dl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import blood.dto.ReceiverFormDTO;

public class ReceiverFormDL {
	
	public static int addReceiver(ReceiverFormDTO receiver1)
	{
		int result = 0;
		String query;
		PreparedStatement ps;
		Connection con;
		try
		{
			con = DBHelper.getConnection();
			query = "INSERT INTO RECEIVER_FORM(patient_id,patient_name,blood_grp,gender,hospital_name,hospital_patient_id,phone)VALUES(?,?,?,?,?,?,?)";
			ps=con.prepareStatement(query);
			ps.setString(1, receiver1.getPatient_id());
			ps.setString(2, receiver1.getPatient_name());
			ps.setString(3, receiver1.getBlood_grp());
			ps.setString(4, receiver1.getGender());
			ps.setString(5, receiver1.getHos_name());
			ps.setString(6, receiver1.getHos_pat_id());
			ps.setLong(7, receiver1.getPhone());
			result = ps.executeUpdate();
			
		}
		catch(Exception e) 
		{
			result = -1;
			System.out.println("**Error** : ReceiverDL.addReceiver1 "+e.getMessage());
			
		}
		
		return result;
	}
	
	public static ArrayList<ReceiverFormDTO> getReceivers()
	{
		ArrayList<ReceiverFormDTO> receiverss = null;
		String query;
		Connection con = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ReceiverFormDTO receiver1 = null;
		
		try
		{
			receiverss = new ArrayList<ReceiverFormDTO>();
			query="SELECT * FROM RECEIVER_FORM order by PATIENT_ID";
			con = DBHelper.getConnection();
			statement = con.createStatement();
			resultSet = statement.executeQuery(query);
			while(resultSet.next())
			{
				receiver1 = new ReceiverFormDTO();
				
				receiver1.setPatient_id(resultSet.getString("PATIENT_ID"));
				receiver1.setPatient_name(resultSet.getString("PATIENT_NAME"));
				receiver1.setBlood_grp(resultSet.getString("BLOOD_GRP"));
				receiver1.setGender(resultSet.getString("GENDER"));
				receiver1.setHos_name(resultSet.getString("HOSPITAL_NAME"));
				receiver1.setHos_pat_id(resultSet.getString("HOSPITAL_PATIENT_ID"));
				receiver1.setPhone(resultSet.getLong("PHONE"));

				receiverss.add(receiver1);
				
			}
			resultSet.close();
			statement.close();
			con.close();
		}
		catch(Exception e) 
		{
			System.out.println("**Error** : ReceiverDL.getReceivers "+e.getMessage());
			
		}
		
		return receiverss;
		
		}

}
