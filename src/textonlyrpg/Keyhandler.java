package textonlyrpg;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyhandler implements KeyListener{
	
	static boolean EnterPressed = false;
	static boolean UpPressed = false;
	static boolean DownPressed = false;
	static boolean RightPressed = false;
	static boolean LeftPressed = false;
	
	static boolean DashPressed = false;
	static boolean PPressed = false;
	static boolean APressed = false;
	static boolean SPressed = false;
	static boolean WPressed = false;
	static boolean OPressed = false;
	static boolean RPressed = false;
	static boolean DPressed = false;
	static boolean LPressed = false;
	static boolean VPressed = false;
	static boolean EPressed = false;
	static boolean BPressed = false;
	static boolean NPressed = false;
	static boolean IPressed = false;
	static boolean CPressed = false;
	static boolean HPressed = false;
	
	static boolean TPressed = false;
	static boolean FPressed = false;
	static boolean GPressed = false;
	static boolean XPressed = false;
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}//KeyTyped End

	@Override
	public void keyPressed(KeyEvent e) {
		
		int keycode = e.getKeyCode();
		if(keycode == KeyEvent.VK_UP) {
			UpPressed = true;
			
		}//KeyCode Up End
		
		if(keycode == KeyEvent.VK_DOWN) {
			DownPressed = true;
			
		}//KeyCode Down End
		
		if(keycode == KeyEvent.VK_LEFT) {
			LeftPressed = true;
			
		}//KeyCode Left End
		
		if(keycode == KeyEvent.VK_RIGHT) {
			RightPressed = true;
			
		}//KeyCode Right End
		
		
		if(keycode == KeyEvent.VK_ENTER) {
			EnterPressed = true;
			//System.out.println("It is working!");
			
		}//KeyCode Enter End
		
		if(keycode == KeyEvent.VK_BACK_SLASH) {
			DashPressed = true;
			
		}//KeyCode / End
		if(keycode == KeyEvent.VK_P) {
			PPressed = true;
			
		}//KeyCode P End
		if(keycode == KeyEvent.VK_A) {
			APressed = true;
			
		}//KeyCode A End
		if(keycode == KeyEvent.VK_S) {
			SPressed = true;
			
		}//KeyCode S End
		if(keycode == KeyEvent.VK_W) {
			WPressed = true;
			
		}//KeyCode W End
		if(keycode == KeyEvent.VK_O) {
			OPressed = true;
			
		}//KeyCode O End
		if(keycode == KeyEvent.VK_R) {
			RPressed = true;
			
		}//KeyCode R End
		if(keycode == KeyEvent.VK_D) {
			DPressed = true;
			
		}//KeyCode D End
		if(keycode == KeyEvent.VK_L) {
			LPressed = true;
			
		}//KeyCode L End
		if(keycode == KeyEvent.VK_V) {
			VPressed = true;
			
		}//KeyCode V End
		if(keycode == KeyEvent.VK_E) {
			EPressed = true;
			
		}//KeyCode E End
		if(keycode == KeyEvent.VK_B) {
			BPressed = true;
			
		}//KeyCode B End
		if(keycode == KeyEvent.VK_N) {
			NPressed = true;
			
		}//KeyCode N End
		if(keycode == KeyEvent.VK_I) {
			IPressed = true;
			
		}//KeyCode I End
		if(keycode == KeyEvent.VK_C) {
			CPressed = true;
			
		}//KeyCode C End
		if(keycode == KeyEvent.VK_H) {
			HPressed = true;
			
		}//KeyCode H End
		if(keycode == KeyEvent.VK_T) {
			TPressed = true;
			
		}//KeyCode T End
		if(keycode == KeyEvent.VK_F) {
			FPressed = true;
			
		}//KeyCode F End
		if(keycode == KeyEvent.VK_G) {
			GPressed = true;
			
		}//KeyCode G End
		if(keycode == KeyEvent.VK_X) {
			XPressed = true;
			
		}//KeyCode X End
		
	}//Key Pressed End

	@Override
	public void keyReleased(KeyEvent e) {
		
		int keycode = e.getKeyCode();
		if(keycode == KeyEvent.VK_UP) {
			UpPressed = false;
		}//KeyCode Up End
		if(keycode == KeyEvent.VK_DOWN) {
			DownPressed = false;
		}//KeyCode Down End
		if(keycode == KeyEvent.VK_RIGHT) {
			RightPressed = false;
		}//KeyCode Right End
		if(keycode == KeyEvent.VK_LEFT) {
			LeftPressed = false;
		}//KeyCode Left End
		
		if(keycode == KeyEvent.VK_ENTER) {
			EnterPressed = false;
		}//KeyCode Enter End
		
		if(keycode == KeyEvent.VK_BACK_SLASH) {
			DashPressed = false;
		}//KeyCode / End
		if(keycode == KeyEvent.VK_P) {
			PPressed = false;
		}//KeyCode P End
		if(keycode == KeyEvent.VK_A) {
			APressed = false;
		}//KeyCode A End
		if(keycode == KeyEvent.VK_S) {
			SPressed = false;
		}//KeyCode S End
		if(keycode == KeyEvent.VK_W) {
			WPressed = false;
		}//KeyCode W End
		if(keycode == KeyEvent.VK_O) {
			OPressed = false;
		}//KeyCode O End
		if(keycode == KeyEvent.VK_R) {
			RPressed = false;
		}//KeyCode R End
		if(keycode == KeyEvent.VK_D) {
			DPressed = false;
		}//KeyCode D End
		if(keycode == KeyEvent.VK_L) {
			LPressed = false;
		}//KeyCode L End
		if(keycode == KeyEvent.VK_V) {
			VPressed = false;
		}//KeyCode V End
		if(keycode == KeyEvent.VK_E) {
			EPressed = false;
		}//KeyCode E End
		if(keycode == KeyEvent.VK_B) {
			BPressed = false;
		}//KeyCode B End
		if(keycode == KeyEvent.VK_N) {
			NPressed = false;
		}//KeyCode N End
		if(keycode == KeyEvent.VK_I) {
			IPressed = false;
		}//KeyCode I End
		if(keycode == KeyEvent.VK_C) {
			CPressed = false;
		}//KeyCode C End
		if(keycode == KeyEvent.VK_H) {
			HPressed = false;
		}//KeyCode H End
		if(keycode == KeyEvent.VK_T) {
			TPressed = false;
		}//KeyCode T End
		if(keycode == KeyEvent.VK_F) {
			FPressed = false;
		}//KeyCode F End
		if(keycode == KeyEvent.VK_G) {
			GPressed = false;
		}//KeyCode G End
		if(keycode == KeyEvent.VK_X) {
			XPressed = false;
		}//KeyCode X End
	}//KeyReleased End

	
}//Keyhandler End
