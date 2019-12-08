package blood.bl;

import java.util.ArrayList;

import blood.dl.BankDL;
import blood.dto.BankDTO;
import blood.dto.DonorDTO;

public class BankBL {

	public static int addBlood(DonorDTO donor) {
		int result = 0;

		try {

			result = BankDL.addBlood(donor);

		} catch (Exception e)

		{
			result = -1;
			System.out.println("");
			e.printStackTrace();
		}

		return result;
	}

	public static ArrayList<BankDTO> getBloods() {

		ArrayList<BankDTO> donors = null;

		try {
			donors = BankDL.getBloods();
		}

		catch (Exception e) {
			System.out.println("**Error** : BankBL.getBloods " + e.getMessage());

		}

		return donors;
	}

}
