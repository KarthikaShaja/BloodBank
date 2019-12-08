package blood.bl;

import blood.dl.UserDL;
import blood.dto.UserDTO;

public class UserBL {

	public static UserDTO validateUser(UserDTO user1) {
		UserDTO user2 = null;
		try {
			user2 = UserDL.validateUser(user1);

		} catch (Exception e) {
			System.out.println("**Error** : " + e.getMessage());

		}

		return user2;
	}

}
