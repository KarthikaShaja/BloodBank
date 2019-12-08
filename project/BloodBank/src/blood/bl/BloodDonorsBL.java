package blood.bl;

import java.util.ArrayList;

import blood.dl.BloodDonorsDL;
import blood.dto.AdminAcceptDonorDTO;
import blood.dto.BloodDonorsDTO;

public class BloodDonorsBL {

	public static int addToBloodDonors(AdminAcceptDonorDTO accept) {
		int result = 0;

		try {

			result = BloodDonorsDL.addToBloodDonors(accept);

		} catch (Exception e)

		{
			result = -1;
			System.out.println("");
			e.printStackTrace();
		}

		return result;
	}

	public static ArrayList<BloodDonorsDTO> getDonors() {

		ArrayList<BloodDonorsDTO> donorss = null;

		try {
			donorss = BloodDonorsDL.getDonors();
		}

		catch (Exception e) {
			System.out.println("**Error** : BloodDonorsBL.getDonors " + e.getMessage());

		}

		return donorss;
	}

}
