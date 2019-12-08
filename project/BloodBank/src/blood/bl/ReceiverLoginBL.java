package blood.bl;

import blood.dl.ReceiverLoginDL;
import blood.dto.ReceiverLoginDTO;

public class ReceiverLoginBL {

	public static ReceiverLoginDTO validateUser(ReceiverLoginDTO user1) {
		ReceiverLoginDTO user2 = null;
		try {
			user2 = ReceiverLoginDL.validateUser(user1);

		} catch (Exception e) {
			System.out.println("**Error** : " + e.getMessage());

		}

		return user2;
	}

}
