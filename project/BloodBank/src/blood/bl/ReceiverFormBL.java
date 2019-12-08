package blood.bl;

import java.util.ArrayList;

import blood.dl.ReceiverFormDL;
import blood.dto.ReceiverFormDTO;

public class ReceiverFormBL {

	public static int addReceiver(ReceiverFormDTO receiver1) {
		int result = 0;

		try {

			result = ReceiverFormDL.addReceiver(receiver1);

		} catch (Exception e)

		{
			result = -1;
			System.out.println("");
		}

		return result;
	}

	public static ArrayList<ReceiverFormDTO> getReceivers() {

		ArrayList<ReceiverFormDTO> receiverss = null;

		try {
			receiverss = ReceiverFormDL.getReceivers();
		}

		catch (Exception e) {
			System.out.println("**Error** : ReceiverFormBL.getReceiverss " + e.getMessage());

		}

		return receiverss;
	}

}
