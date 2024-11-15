package textonlyrpg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class passwordRW {
	
	GamePanel gp;
	
	public passwordRW(GamePanel gp) {
		this.gp = gp;
		
	}
	
	public static void savePassword(String NewerPassword){
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("password.txt"));
			//String.valueof(int)
			bw.write(NewerPassword);
			//bw.newLine();
			
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//Savepassword End
	
	public static String loadPassword(){
		
		String readerinput = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("password.txt"));
			
			
			
			try {
				readerinput = br.readLine();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(readerinput != "zzz") {
			return readerinput;
		}
		else
			return "Not Working";
		
	}//LoadPasswordEnd

}//Password RW end
