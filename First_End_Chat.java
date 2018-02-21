import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class First_End_Chat {
	private static ArrayList<String[]> First = new ArrayList<String[]>();
	private static ArrayList<String[]> End = new ArrayList<String[]>();
	private static String[] file = { "first", "end" };
	private static String path = "C:\\Users\\River\\Desktop\\Sentence_Generator\\";
	private static int play;
	private static int eat;

	First_End_Chat() {
		First = new ArrayList<String[]>();
		End = new ArrayList<String[]>();
		ReadFirst();
		ReadEnd();
	}

	// �ثe���o��ƥ���hashmap�A����i��n��linkedhashmap�b���ޤW���ֳt
	public static String[] getFirst() {
		int index = 0;
		int i = (int) (Math.random() * First.size());
		if (i == eat || i == play)
			i++;
		
		String[] st = First.get(i);
		if (i < eat) {
			HashMap<String,HashMap<String,String>> emapAction = Data.getData("emapAction");
			System.out.println("�}������:��, �H���y���ѦҡG" + i);
			int getindex = (int) (Math.random() * emapAction.size());
			for (String name : emapAction.keySet()) {
				if (index == getindex) {
					st[0] = st[0].replace("__", name);
					RecordKeyN.rknadd(name);
					break;
				}
				index++;
			}
		} else {
			System.out.println("�}������:�Y, �H���y���ѦҡG" + i);
			HashMap<String,HashMap<String,String>> foodshop = Data.getData("FoodShop");
			int getindex = (int) (Math.random() * foodshop.size());
			for (String name : foodshop.keySet()) {
				if (index == getindex) {
					st[0] = st[0].replace("__", name);
					RecordKeyN.rknadd(name);
					break;
				}
				index++;
			}
		}
		return st;
	}

	public static String[] getEnd() {
		int i = (int) (Math.random() * End.size());
		return End.get(i);
	}

	// ���F�Ϲjplay �� eat�y���A�]�mplay && eat�������ޡA�b�üƥͦ����׶}�C
	private static void ReadFirst() {
		int i = 0;
		String type = "�^�д��I";
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(path + file[0] + "\\" + file[0] + ".txt"), "utf8"));
			while (br.ready()) {
				String brStr = br.readLine();
				if (brStr.equals("��")) {
					type = "�^�д��I";
					play = i;
				} else if (brStr.equals("�Y")) {
					type = "�^�Э���";
					eat = i;
				}
				String[] stemp = new String[3];
				stemp[0] = brStr;
				stemp[1] = type;
				stemp[2] = "User";
				First.add(stemp);
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void ReadEnd() {
		String type = "�@��y";
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(path + file[1] + "\\" + file[1] + ".txt"), "utf8"));
			while (br.ready()) {
				String brStr = br.readLine();

				String[] stemp = new String[3];
				stemp[0] = brStr;
				stemp[1] = type;
				stemp[2] = "User";
				End.add(stemp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
