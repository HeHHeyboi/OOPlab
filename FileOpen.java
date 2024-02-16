import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> wordsMap = new HashMap<String, Integer>();
		String filePaht = "D:\\663380211-0\\fruits.txt";
		int count = 0;
		File file = new File(filePaht);
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(scanner.hasNext()) {
			String[] token = scanner.nextLine().split(",");
			for(var key: token) {
				System.out.println(key);
				wordsMap.put(key, count);
			}
			
		}
		System.out.println(wordsMap);
		
	}

}
