import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BookMap {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		Scanner book = getBookScanner(console);
		Map<String, Integer> bookMap = new TreeMap<String, Integer>();
		
		while(book.hasNextLine()) {
			String line = book.nextLine();
			line = formatLine(line);
			System.out.println(line);
			Scanner lineScan = new Scanner(line);
			while(lineScan.hasNext()) {
				String token = lineScan.next();
				if(bookMap.containsKey(token)) {
					int value = bookMap.get(token);
					bookMap.put(token, value + 1);
				} else {
					bookMap.put(token, 1);
				}
			}
			lineScan.close();
		}
		console.close();
		book.close();
	}

public static String formatLine(String s) {
	s = s.toLowerCase();
	s = s.replace('.', ' ');
	s = s.replace(',', ' ');
	s = s.replace('!', ' ');
	s = s.replace('?', ' ');
	s = s.replace(':', ' ');
	s = s.replace(';', ' ');
	s = s.replace('"', ' ');
	s = s.replace('(', ' ');
	s = s.replace(')', ' ');
	return s;
	
}


public static Scanner getBookScanner(Scanner console) throws FileNotFoundException {
	System.out.println("Give me a book file: ");
	File f = new File(console.nextLine());
	Scanner S = new Scanner(f);
	return S;
	}
}