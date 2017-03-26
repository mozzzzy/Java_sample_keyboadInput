import java.io.*;
 
class Keyinput {
	public static void main (String[ ] args) throws IOException {
		System.out.println("文章を入力してください。");
		
		BufferedReader input =
			new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		
		System.out.println("入力された文章は「"+str+"」です。");
	}
}
