package blood.bl;

import java.util.ArrayList;

import blood.dl.AdminAcceptDonorDL;
import blood.dto.AdminAcceptDonorDTO;
import blood.dto.DonorDTO;

public class AdminAcceptDonorBL {
	public static int addToAdminAccept(DonorDTO donor) {
		int result = 0;

		try {

			result = AdminAcceptDonorDL.addToAdminAccept(donor);

		} catch (Exception e)

		{
			result = -1;
			System.out.println("");
			e.printStackTrace();
		}

		return result;
	}

	public static ArrayList<AdminAcceptDonorDTO> getAccepts() {

		ArrayList<AdminAcceptDonorDTO> accepts = null;

		try {
			accepts = AdminAcceptDonorDL.getAccepts();
		}

		catch (Exception e) {
			System.out.println("**Error** : AdminAcceptBL.getAccepts " + e.getMessage());

		}

		return accepts;
	}

}
