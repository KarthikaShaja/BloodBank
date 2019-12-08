package blood.bl;

import java.util.ArrayList;

import blood.dl.ReceiverDL;
import blood.dto.ReceiverDTO;

public class ReceiverBL {

	public static int addReceiver(ReceiverDTO receiver) {
		int result = 0;

		try {

			result = ReceiverDL.addReceiver(receiver);

		} catch (Exception e)

		{
			result = -1;
			System.out.println("");
		}

		return result;
	}

	public static ArrayList<ReceiverDTO> getReceivers() {

		ArrayList<ReceiverDTO> receivers = null;

		try {
			receivers = ReceiverDL.getReceivers();
		}

		catch (Exception e) {
			System.out.println("**Error** : StudentBL.getStudents " + e.getMessage());

		}

		return receivers;
	}

	public static ReceiverDTO getReceiver(String patient_id) {

		int result;
		ReceiverDTO receiver = new ReceiverDTO();

		try {

			receiver = ReceiverDL.getReceiver(patient_id);

		} catch (Exception e) {
			result = -1;
			System.out.println("**Error** : DonorBL.getDonor() " + e.getMessage());

		}

		return receiver;
	}

	public static int deleteReceiver(String patient_id) {

		int result = 0;

		try {

			result = ReceiverDL.deleteReceiver(patient_id);

		} catch (Exception e) {
			result = -1;
			System.out.println("**Error** : ReceiverDL.deleteReceiver " + e.getMessage());

		}

		return result;

	}

}
