package textonlyrpg;

public class Notes {
	public int NoteNo = 1;//NoteNo ID
	public String NoteName = "TestNote1";
	public String NoteDisc = "TestNote1";
	public String NoteDisc2 = "";
	static int i = 0;
	
	
	public Notes(int NoteNo, String NoteName, String NoteDisc, String NoteDisc2){
		this.NoteNo = NoteNo;
		this.NoteName = NoteName;
		this.NoteDisc = NoteDisc;
		this.NoteDisc2 = NoteDisc2;
	}
	
	public int getNoteNo(){
		return NoteNo;
	}
	
	public String getNoteName(){
		return NoteName;
	}
	
	public String getNoteDisc(){
		return NoteDisc;
	}
	
	public String getNoteDisc2(){
		return NoteDisc2;
	}

	public static Notes[] NoteBook(int[] Note1){
		int NoteTotal = NoteTotal(Note1);
		System.out.println(NoteTotal);
		Notes[] Notebook = new Notes[NoteTotal];{
			int i = 0;
			while(i < (NoteTotal - 1)){
				Notebook[i] = new Notes(000, "", "No Note", "");
				i = i + 1;
			}
			int Total = 0;
			if(Note1[15] == 1){//Notes
				Notebook[Total]  = new Notes(16, "Notes","Better take notes", "Info is helpful");
				Total = Total + 1;
			}
			if(Note1[16] == 1){//Move
				Notebook[Total]  = new Notes(17, "Move","Might find more if", "I check everywhere");
				Total = Total + 1;
			}
			if(Note1[0] == 1){
				Notebook[Total] = new Notes(1, "TestNote1", "Story Note", "");
				Total = Total + 1;
			}
			if(Note1[1] == 1){
				Notebook[Total]  = new Notes(2, "TestNote2", "Actions Note", "");
				Total = Total + 1;
			}
			if(Note1[2] == 1){
				Notebook[Total]  = new Notes(3, "TestNote3", "Mission Note", "");
				Total = Total + 1;
			}
			if(Note1[3] == 1){
				Notebook[Total]  = new Notes(4, "TestNote4", "Items Note", "");
				Total = Total + 1;
			}
			if(Note1[4] == 1){
				Notebook[Total]  = new Notes(5, "TestNote5", "Ingredient Note", "");
				Total = Total + 1;
			}
			if(Note1[5] == 1){
				Notebook[Total]  = new Notes(6, "TestNote6", "Metal Note", "");
				Total = Total + 1;
			}
			if(Note1[6] == 1){
				Notebook[Total]  = new Notes(7, "TestNote7","Alloy Note", "");
				Total = Total + 1;
			}
			if(Note1[7] == 1){
				Notebook[Total]  = new Notes(8, "TestNote8","Gunpowder Note", "");
				Total = Total + 1;
			}
			if(Note1[8] == 1){
				Notebook[Total]  = new Notes(9, "TestNote9","Energy Note", "");
				Total = Total + 1;
			}
			if(Note1[9] == 1){
				Notebook[Total]  = new Notes(10, "TestNote10","Recipe Note", "");
				Total = Total + 1;
			}
			if(Note1[10] == 1){
				Notebook[Total]  = new Notes(11, "TestNote11","Weapon Note", "");
				Total = Total + 1;
			}
			if(Note1[11] == 1){
				Notebook[Total]  = new Notes(12, "TestNote12","Armor Note", "");
				Total = Total + 1;
			}
			if(Note1[12] == 1){
				Notebook[Total]  = new Notes(13, "TestNote13","Character Note", "");
				Total = Total + 1;
			}
			if(Note1[13] == 1){
				Notebook[Total]  = new Notes(14, "TestNote14","Area Note", "");
				Total = Total + 1;
			}
			if(Note1[14] == 1){
				Notebook[Total]  = new Notes(15, "TestNote15","Password Note", "");
				Total = Total + 1;
			}
		}
		return Notebook;
	}
	
	public static int NoteNo(int[] Note1Found, int NoteNo){
		int Index = 0;
		int i = 0;
		while(i < NoteNo - 1){
			Index = Index + Note1Found[i];
			i = i + 1;
		}
		return Index;
	}
	
	public static int NoteTotal(int[] Note1Found){
		int Total = 0;
		int i = 0;
		while(i < Note1Found.length){
			Total = Total + Note1Found[i];
			i = i + 1;
		}
		return Total;
	}
}
