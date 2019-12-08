package blood.bl;

import java.util.ArrayList;

import blood.dl.DonorDL;
import blood.dto.AdminAcceptDonorDTO;
import blood.dto.DonorDTO;

public class DonorBL {

	public static int addDonor(DonorDTO donor) {
		int result = 0;

		try {

			result = DonorDL.addDonor(donor);

		} catch (Exception e)

		{
			result = -1;
			System.out.println("");
		}

		return result;
	}

	public static ArrayList<DonorDTO> getDonors() {

		ArrayList<DonorDTO> donors = null;

		try {
			donors = DonorDL.getDonors();
		}

		catch (Exception e) {
			System.out.println("**Error** : DonorBL.getDonors " + e.getMessage());

		}

		return donors;
	}

	public static AdminAcceptDonorDTO getDonor(String donor_id) {
		System.out.println("inside BL " + donor_id);
		int result;
		AdminAcceptDonorDTO accept = new AdminAcceptDonorDTO();

		try {

			accept = DonorDL.getDonor(donor_id);

		} catch (Exception e) {
			result = -1;
			System.out.println("**Error** : DonorBL.getDonor() " + e.getMessage());

		}

		return accept;
	}

	public static int deleteDonor(String donor_id) {
		int result;

		try {

			result = DonorDL.deleteDonor(donor_id);

		} catch (Exception e) {
			result = -1;
			System.out.println("**Error** : DonorBL.deleteDonor() " + e.getMessage());

		}

		return result;
	}

	public static DonorDTO getBank(String donor_id) {

		int result;
		DonorDTO donor = new DonorDTO();

		try {

			donor = DonorDL.getBank(donor_id);

		} catch (Exception e) {
			result = -1;
			System.out.println("**Error** : DonorBL.getBank() " + e.getMessage());

		}

		return donor;
	}

	public static DonorDTO getDonor1(String donor_id) {
		System.out.println("inside BL " + donor_id);
		int result;
		DonorDTO donor = new DonorDTO();

		try {

			donor = DonorDL.getDonor1(donor_id);

		} catch (Exception e) {
			result = -1;
			System.out.println("**Error** : DonorBL.getDonor() " + e.getMessage());

		}

		return donor;
	}

	public static int updateDonor(DonorDTO donor) {
		int result = 0;

		try {
			result = DonorDL.updateDonor(donor);

		} catch (Exception e) {
			System.out.println("**error** DonorBL:updateDonor" + e.getMessage());
		}
		return result;
	}

	public static ArrayList<DonorDTO> getBloodGrps(String blood_grp) {

		int result;

		ArrayList<DonorDTO> donors = null;

		try {

			donors = DonorDL.getBloodGrps(blood_grp);

		} catch (Exception e) {
			result = -1;
			System.out.println("**Error** : DonorBL.getBank() " + e.getMessage());

		}

		return donors;
	}

	public static int addOneTimeDonor(DonorDTO donor) {
		int result = 0;

		try {

			result = DonorDL.addOneTimeDonor(donor);

		} catch (Exception e)

		{
			result = -1;
			System.out.println("");
		}

		return result;
	}

}
