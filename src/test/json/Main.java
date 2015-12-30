package test.json;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) throws Exception {
		testJsonList();
	}

	public static void testJsonList() throws Exception {
		File file = new File("D:\\DriverWorkSpace\\JavaTest\\src\\test\\json\\listjson");
		// System.out.println(file.exists());
		BufferedReader reader = new BufferedReader(new FileReader(file));
		StringBuffer buffer = new StringBuffer();
		for (String line = null; (line = reader.readLine()) != null;) {
			System.out.println(line);
			buffer.append(line);
		}

		List<String> list = new Gson().fromJson(buffer.toString(), List.class);
		String[] fromJson = new Gson().fromJson(buffer.toString(), String[].class);
		
		List<String> asList = Arrays.asList(fromJson);
		Object[] array = list.toArray();
		
//		String[] strs = (String[]) array;
		System.out.println(list);
	}

}
