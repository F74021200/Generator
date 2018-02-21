import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Robot {
	public static String[] RobotSelect(String type) {
		if(type.contains("�^��")) {
			return RobotReply(type);
		}else {
			return RobotQuestion(type);
		}
	}
	private static String[] RobotReply(String type) {
		String Reply[] = new String[3];
		Reply[2] = "User";
		switch (type) {
		case "�^�Щ��a��T":
			break;
		case "�^�Цa�I":
			break;
		case "�^�Э���":
			break;
		case "�^�д��I��T":
			break;
		case "�^�д��I":
			break;
		case "�^�ж}��ɶ�":
			break;
		}
		
		return Reply;
	}

	private static String[] RobotQuestion(String type) {

		String Reply[] = new String[3];
		Reply[2] = "User";
		switch (type) {
		case "�ݥ�q��T":
			break;
		case "�ݦa�}":
			break;
		case "�ݦa�I":
			break;
		case "�ݦ�{":
			break;
		case "�ݩ��a":
			break;
		case "�ݬ���":
			break;
		case "�ݭ���":
			break;
		case "�ݭ�����T":
			break;
		case "�ݮȹC�覡":
			break;
		case "�ݮȹC�P��":
			break;
		case "�ݮȹC�ɶ�":
			break;
		case "�ݮȹC�z��":
			break;
		case "�ݮȹC�O��":
			break;
		case "�ݮȹC�ǳƱ���":
			break;
		case "�ݮȹC�ʶR��T":
			break;
		case "�ݮɶ�":
			break;
		case "�ݲ�����T":
			break;
		case "�ݴ��I":
			break;
		case "�ݴ��I��T":
			break;
		case "�ݶZ��":
			break;
		case "�ݶ}��ɶ�":
			break;
		case "�ݷP��":
			break;
		case "�ݻ���":
			break;
		}
		
		return Reply;
	}
}
