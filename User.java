import java.util.ArrayList;
import java.util.HashMap;

public class User {
	//������User���ܧY�i�I�s��class�A�åB����Robot�^��
	public static String[] UserSelect(String type) {
		if (type.contains("�^��")) {
			return	UserReply(type);
		} else {
			return	UserQuestion(type);
		}
	}

	private static String[] UserReply(String type) {
		String Reply[] = new String[3];
		Reply[2] = "Robot";
		switch (type) {
		case "�^�Х�q��T":
			break;
		case "�^�Ц�{":
			break;
		case "�^�Ц�J��T":
			break;
		case "�^�Щ��a��T":
			break;
		case "�^�Ь���":
			break;
		case "�^�Э���":
			String ReplyType = "�ݭ���";
			Reply[0] = RobotReply.getRandomQuestion(ReplyType);
			Reply[1] = ReplyType;
		case "�^�Э�����T":
			break;
		case "�^�ЮȹC�覡":
			break;
		case "�^�ЮȹC�P��":
			break;
		case "�^�ЮȹC�ɶ�":
			break;
		case "�^�ЮȹC�z��":
			break;
		case "�^�ж}��ɶ�":
			break;
		case "�^�в�����T":
			break;
		case "�^�д��I":
			break;
		case "�^�зPı":
			break;
		case "�^�л���":
			break;
		}
		
		return Reply;
	}

	private static String[] UserQuestion(String type) {
		String Reply[] = new String[3];
		Reply[2] = "Robot";
		switch (type) {
		case "�ݥ�q��T":
			break;
		case "�ݦa�}":
			break;
		case "�ݦa�I":
			break;
		case "�ݭ���":
			Reply[0] = RobotReply.getRandomAnswer(type);
			Reply[1] = type;
			break;
		case "�ݴ��I":
			break;
		case "�ݴ��I��T":
			break;
		case "�ݶ}��ɶ�":
			break;
		}
		
		return Reply;
	}
}
