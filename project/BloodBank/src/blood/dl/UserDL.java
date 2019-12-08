package blood.dl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import blood.dto.UserDTO;

public class UserDL {


	public static UserDTO validateUser(UserDTO user1)
	{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet resultSet = null;
		UserDTO user2 = null;
		String query="";
		try
		{	
			query="SELECT * FROM TBL_USER WHERE USER_ID =? AND PASSWORD = ?";
			con = DBHelper.getConnection();
			ps= con.prepareStatement(query);
			ps.setString(1, user1.getUser_id());
			ps.setString(2, user1.getPassword());
			resultSet = ps.executeQuery();
			if(resultSet.next())
			{
				user2 = new UserDTO();
				user2.setUser_id(resultSet.getString("USER_ID"));
				user2.setUser_name(resultSet.getString("USER_NAME"));
				
			}
			
			
		}
		catch(Exception e) 
		{
			System.out.println("**Error** : "+e.getMessage());
			
		}
		
		return user2;
	}
}
