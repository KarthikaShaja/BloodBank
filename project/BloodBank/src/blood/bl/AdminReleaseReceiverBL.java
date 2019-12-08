package blood.bl;

import java.util.ArrayList;
import blood.dl.AdminReleaseReceiverDL;
import blood.dto.AdminReleaseReceiverDTO;
import blood.dto.ReceiverDTO;

public class AdminReleaseReceiverBL {
	public static int addToAdminRelease(ReceiverDTO receiver) {
		int result = 0;

		try {

			result = AdminReleaseReceiverDL.addToAdminRelease(receiver);

		} catch (Exception e)

		{
			result = -1;
			System.out.println("");
			e.printStackTrace();
		}

		return result;
	}

	public static ArrayList<AdminReleaseReceiverDTO> getReleases() {

		ArrayList<AdminReleaseReceiverDTO> releases = null;

		try {
			releases = AdminReleaseReceiverDL.getReleases();
		}

		catch (Exception e) {
			System.out.println("**Error** : AdminReleaseReceiverBL.getReleases " + e.getMessage());

		}

		return releases;
	}

}
