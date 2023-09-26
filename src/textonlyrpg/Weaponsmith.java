package textonlyrpg;

public class Weaponsmith {
	public int RecipeNo = 1;
	public int ItemNo = 1;
	public String ItemName = "TestItem1";//?
	public String ItemDisc = "TestItem1";//?
	public int MaterialNo1 = 0;
	public String Material1Name = "";
	public int MaterialNo2 = 0;
	public String Material2Name = "";
	public int ItemType = 1;
	public int RecipeMade = 0;
	public int Price;
	static int i = 0;
	
	
	public Weaponsmith(int RecipeNo, int ItemNo, String ItemName, String ItemDisc, int MaterialNo1, String Material1Name, int MaterialNo2, String Material2Name, int ItemType, int RecipeMade, int Price){
		this.RecipeNo = RecipeNo;
		this.ItemNo = ItemNo;
		this.ItemName  = ItemName;
		this.ItemDisc = ItemDisc;
		this.MaterialNo1 = MaterialNo1;
		this.Material1Name = Material1Name;
		this.MaterialNo2 = MaterialNo2;
		this.Material2Name = Material2Name;
		this.ItemType = ItemType;
		this.RecipeMade = RecipeMade;
		this.Price = Price;
	}
	
	public int getRecipeNo(){
		return RecipeNo;
	}
	
	public int getItemNo(){
		return ItemNo;
	}
	
	public String getItemName(){
		return ItemName;
	}
	
	public String getItemDisc(){
		return ItemDisc;
	}
	
	public int getMaterialNo1(){
		return MaterialNo1;
	}
	
	public int getMaterialNo2(){
		return MaterialNo2;
	}
	
	public int getItemType(){
		return ItemType;
	}
	
	public int getRecipeMade(){
		return RecipeMade;
	}
	
	public int getPrice(){
		return Price;
	}

	//Cook
	//Weaponsmith
	//Armorsmith
	
	//Weaponsmith(RecipeNo, ItemNo, ItemName, ItemDisc, MaterialNo1, MaterialNo2, ItemType, RecipeMade, Price)
	public static Weaponsmith[] WeaponList(int[] WeaponsFound, int[] WeaponsMade){
		int WeaponTotal = WeaponTotal(WeaponsFound);
		Weaponsmith[] WData = new Weaponsmith[WeaponTotal];{
			int i = 0;
			while(i < (WeaponTotal - 1)){
				WData[i] = new Weaponsmith(00, 00, "", "No Disc", 0, "", 0, "", 0, 0, 0);
				i = i + 1;
			}
			int Total = 0;
			if(WeaponsFound[0] == 1){//Sword
				if(WeaponsMade[0] == 0){//what happens if the item is different?
					WData[Total] = new Weaponsmith(1, 125, "???", "A Sharp Weapon", 103, "MetalB", 0, "", 1, 0, 3);// ??? or ????
					//WData[Total] = new Weaponsmith(1, 6, "???", "A Sharp Weapon", 5, "MetalB", 0, "", 1, 0, 3);// ??? or ????
				}
				if(WeaponsMade[0] == 1){
					WData[Total] = new Weaponsmith(1, 125, "Sword", "A Sharp Weapon", 103, "MetalB", 0, "", 1, 1, 3);
					//WData[Total] = new Weaponsmith(1, 6, "Sword", "A Sharp Weapon", 5, "MetalB", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Sword
			
			
			if(WeaponsFound[1] == 1){//TestItem1
				if(WeaponsMade[1] == 0){//what happens if the item is different?
					WData[Total] = new Weaponsmith(2, 289, "???", "???", 1, "TestItem1", 0, "", 1, 0, 3);// ??? or ????
					//WData[Total] = new Weaponsmith(2, 8, "???", "???", 1, "TestItem1", 0, "", 1, 0, 3);// ??? or ????
				}
				if(WeaponsMade[1] == 1){
					WData[Total] = new Weaponsmith(2, 289, "WItem1", "TestItem1", 289, "TestItem1", 0, "", 1, 1, 3);
					//WData[Total] = new Weaponsmith(2, 8, "WItem1", "TestItem1", 8, "TestItem1", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//TestItem1
			
			if(WeaponsFound[2] == 1){//TestItem2
				if(WeaponsMade[2] == 0){
					WData[Total] = new Weaponsmith(3, 290, "???", "???", 1, "TestItem1", 0, "", 1, 0, 3);
					//WData[Total] = new Weaponsmith(3, 9, "???", "???", 1, "TestItem1", 0, "", 1, 0, 3);
				}
				if(WeaponsMade[2] == 1){
					WData[Total] = new Weaponsmith(3, 290, "WItem2", "TestItem2", 289, "TestItem1", 0, "", 1, 1, 3);
					//WData[Total] = new Weaponsmith(3, 9, "WItem2", "TestItem2", 9, "TestItem1", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//TestItem2
			
			if(WeaponsFound[3] == 1){//TestItem4
				if(WeaponsMade[3] == 0){
					WData[Total] = new Weaponsmith(4, 292, "???", "???", 1, "TestItem1", 0, "", 1, 0, 3);
					//WData[Total] = new Weaponsmith(4, 11, "???", "???", 1, "TestItem1", 0, "", 1, 0, 3);
				}
				if(WeaponsMade[3] == 1){
					WData[Total] = new Weaponsmith(4, 292, "WItem4", "TestItem4", 289, "TestItem1", 0, "", 1, 1, 3);
					//WData[Total] = new Weaponsmith(4, 11, "WItem4", "TestItem4", 8, "TestItem1", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//TestItem4
			
			if(WeaponsFound[4] == 1){//TestItem5
				if(WeaponsMade[4] == 0){
					WData[Total] = new Weaponsmith(5, 293, "???", "???", 1, "TestItem1", 0, "", 1, 0, 3);
					//WData[Total] = new Weaponsmith(5, 12, "???", "???", 1, "TestItem1", 0, "", 1, 0, 3);
				}
				if(WeaponsMade[4] == 1){
					WData[Total] = new Weaponsmith(5, 293, "WItem5", "TestItem5", 292, "TestItem4", 0, "", 1, 1, 3);
					//WData[Total] = new Weaponsmith(5, 12, "WItem5", "TestItem5", 11, "TestItem4", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//TestItem5
			
			if(WeaponsFound[5] == 1){//TestBomb
				if(WeaponsMade[5] == 0){
					WData[Total] = new Weaponsmith(6, 296, "???", "???", 1, "TestItem1", 0, "", 1, 0, 3);
					//WData[Total] = new Weaponsmith(6, 15, "???", "???", 1, "TestItem1", 0, "", 1, 0, 3);
				}
				if(WeaponsMade[5] == 1){
					WData[Total] = new Weaponsmith(6, 296, "WItem6", "TestBomb", 292, "TestItem4", 0, "", 1, 1, 3);
					//WData[Total] = new Weaponsmith(6, 15, "WItem6", "TestBomb", 11, "TestItem4", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//TestBomb
			
			if(WeaponsFound[6] == 1){//Firesword
				if(WeaponsMade[6] == 0){
					WData[Total] = new Weaponsmith(7, 126, "???", "???", 126, "Sword", 112, "FireEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[6] == 1){
					WData[Total] = new Weaponsmith(7, 126, "Firesword", "A Sword of Fire", 126, "Sword", 112, "FireEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Firesword
			
			if(WeaponsFound[7] == 1){//Watersword
				if(WeaponsMade[7] == 0){
					WData[Total] = new Weaponsmith(8, 127, "???", "???", 126, "Sword", 113, "WaterEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[7] == 1){
					WData[Total] = new Weaponsmith(8, 127, "Watersword", "A Sword of Water", 126, "Sword", 113, "WaterEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Watersword
			
			if(WeaponsFound[8] == 1){//Windsword
				if(WeaponsMade[8] == 0){
					WData[Total] = new Weaponsmith(9, 128, "???", "???", 126, "Sword", 114, "WindEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[8] == 1){
					WData[Total] = new Weaponsmith(9, 128, "Windsword", "A Sword of Wind", 126, "Sword", 114, "WindEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Windsword
			
			if(WeaponsFound[9] == 1){//Earthsword
				if(WeaponsMade[9] == 0){
					WData[Total] = new Weaponsmith(10, 129, "???", "???", 126, "Sword", 115, "EarthEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[9] == 1){
					WData[Total] = new Weaponsmith(10, 129, "Earthsword", "A Sword of Earth", 126, "Sword", 115, "EarthEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Earthsword
			
			if(WeaponsFound[10] == 1){//Electricsword
				if(WeaponsMade[10] == 0){
					WData[Total] = new Weaponsmith(11, 130, "???", "???", 126, "Sword", 116, "ElecEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[10] == 1){
					WData[Total] = new Weaponsmith(11, 130, "Elecsword", "A Sword of Electric", 126, "Sword", 116, "ElecEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Electricsword
			
			if(WeaponsFound[11] == 1){//Icesword
				if(WeaponsMade[11] == 0){
					WData[Total] = new Weaponsmith(12, 131, "???", "???", 126, "Sword", 117, "IceEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[11] == 1){
					WData[Total] = new Weaponsmith(12, 131, "Ice sword", "A Sword of Ice", 126, "Sword", 117, "IceEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Icesword
			
			if(WeaponsFound[12] == 1){//Lightsword
				if(WeaponsMade[12] == 0){
					WData[Total] = new Weaponsmith(13, 132, "???", "???", 126, "Sword", 118, "LightEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[12] == 1){
					WData[Total] = new Weaponsmith(13, 132, "Lightsword", "A Sword of Light", 126, "Sword", 118, "LightEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Lightsword
			
			if(WeaponsFound[13] == 1){//Darksword
				if(WeaponsMade[13] == 0){
					WData[Total] = new Weaponsmith(14, 133, "???", "???", 126, "Sword", 119, "DarkEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[13] == 1){
					WData[Total] = new Weaponsmith(14, 133, "Darksword", "A Sword of Dark", 126, "Sword", 119, "DarkEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Darksword
			
			if(WeaponsFound[14] == 1){//Sw0rd
				if(WeaponsMade[14] == 0){
					WData[Total] = new Weaponsmith(15, 134, "???", "*1B6", 126, "Sword", 280, "Glitch", 1, 0, 3);
				}
				if(WeaponsMade[14] == 1){
					WData[Total] = new Weaponsmith(15, 134, "Sw0rd", "It glows a strange color", 126, "Sword", 280, "Glitch", 1, 1, 3);
				}
				Total = Total + 1;
			}//Sw0rd
			
			if(WeaponsFound[15] == 1){//NULL Sword
				if(WeaponsMade[15] == 0){
					WData[Total] = new Weaponsmith(16, 135, "???", "    ", 126, "Sword", 281, "NULL", 1, 0, 3);
				}
				if(WeaponsMade[15] == 1){
					WData[Total] = new Weaponsmith(16, 135, "NULLSword", "NULL", 126, "Sword", 281, "NULL", 1, 1, 3);
				}
				Total = Total + 1;
			}//NULL Sword
			
			if(WeaponsFound[16] == 1){//Mystery Sword
				if(WeaponsMade[16] == 0){
					WData[Total] = new Weaponsmith(17, 136, "?????", "?????", 126, "Sword", 284, "?", 1, 0, 3);
				}
				if(WeaponsMade[16] == 1){
					WData[Total] = new Weaponsmith(17, 136, "MytrySword", "?????", 126, "Sword", 284, "?", 1, 1, 3);
				}
				Total = Total + 1;
			}//Mystery Sword
			
			if(WeaponsFound[17] == 1){//Corroded Sword
				if(WeaponsMade[17] == 0){
					WData[Total] = new Weaponsmith(18, 137, "_&F8B", "F-*75$", 126, "Sword", 283, "Item/Corr.Name", 1, 0, 3);
				}
				if(WeaponsMade[17] == 1){
					WData[Total] = new Weaponsmith(18, 137, "CorrSword", "Crrrrrrrrrrrrr", 126, "Sword", 283, "Item/Corr.Name", 1, 1, 3);
				}
				Total = Total + 1;
			}//Corroded Sword
			
			if(WeaponsFound[18] == 1){//Corroded Sword Beta Recipe
				if(WeaponsMade[18] == 0){
					WData[Total] = new Weaponsmith(19, 137, "*&YMv", "F-*75$", 126, "Sword", 282, "RustedMetal", 1, 0, 3);
				}
				if(WeaponsMade[18] == 1){
					WData[Total] = new Weaponsmith(19, 137, "CorrSword", "Crrrrrrrrrrrrr", 126, "Sword", 282, "RustyMetal", 1, 1, 3);
				}
				Total = Total + 1;
			}//Corroded Sword Beta
			
			if(WeaponsFound[19] == 1){//AdminSword
				if(WeaponsMade[19] == 0){
					WData[Total] = new Weaponsmith(20, 138, "REDACTED", "Classified", 281, "NULL", 284, "???", 1, 0, 3);
				}
				if(WeaponsMade[19] == 1){
					WData[Total] = new Weaponsmith(20, 138, "AdminSword", "Classified", 281, "NULL", 284, "???", 1, 1, 3);
				}
				Total = Total + 1;
			}//AdminSword
			
			if(WeaponsFound[20] == 1){//ALLSword
				if(WeaponsMade[20] == 0){
					WData[Total] = new Weaponsmith(21, 139, "ALL", "???", 281, "NULL", 280, "Glitch", 1, 0, 3);
				}
				if(WeaponsMade[20] == 1){
					WData[Total] = new Weaponsmith(21, 139, "ALLSword", "Has all elements?", 281, "NULL", 280, "Glitch", 1, 1, 3);
				}
				Total = Total + 1;
			}//ALLSword
			
			//-----------------------------------------------------------------------------------------------------
			
			if(WeaponsFound[21] == 1){//Lance
				if(WeaponsMade[21] == 0){//what happens if the item is different?
					WData[Total] = new Weaponsmith(22, 140, "???", "A Long Weapon", 107, "AlloyB", 0, "", 1, 0, 3);// ??? or ????
				}
				if(WeaponsMade[21] == 1){
					WData[Total] = new Weaponsmith(22, 140, "Lance", "A Long Weapon", 107, "AlloyB", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Lance
			
			if(WeaponsFound[22] == 1){//FireLance
				if(WeaponsMade[22] == 0){
					WData[Total] = new Weaponsmith(23, 141, "???", "???", 140, "Lance", 112, "FireEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[22] == 1){
					WData[Total] = new Weaponsmith(23, 141, "FireLance", "A Lance of Fire", 140, "Lance", 112, "FireEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//FireLance
			
			if(WeaponsFound[23] == 1){//WaterLance
				if(WeaponsMade[23] == 0){
					WData[Total] = new Weaponsmith(24, 142, "???", "???", 140, "Lance", 113, "WaterEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[23] == 1){
					WData[Total] = new Weaponsmith(24, 142, "WaterLance", "A Lance of Water", 140, "Lance", 113, "WaterEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//WaterLance
			
			if(WeaponsFound[24] == 1){//WindLance
				if(WeaponsMade[24] == 0){
					WData[Total] = new Weaponsmith(25, 143, "???", "???", 140, "Lance", 114, "WindEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[24] == 1){
					WData[Total] = new Weaponsmith(25, 143, "WindLance", "A Lance of Wind", 140, "Lance", 114, "WindEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//WindLance
			
			if(WeaponsFound[25] == 1){//EarthLance
				if(WeaponsMade[25] == 0){
					WData[Total] = new Weaponsmith(26, 144, "???", "???", 140, "Lance", 115, "EarthEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[25] == 1){
					WData[Total] = new Weaponsmith(26, 144, "EarthLance", "A Lance of Earth", 140, "Lance", 115, "EarthEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//EarthLance
			
			if(WeaponsFound[26] == 1){//ElecLance
				if(WeaponsMade[26] == 0){
					WData[Total] = new Weaponsmith(27, 145, "???", "???", 140, "Lance", 116, "ElecEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[26] == 1){
					WData[Total] = new Weaponsmith(27, 145, "ElecLance", "A Lance of Electric", 140, "Lance", 116, "ElecEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//ElectricLance
			
			if(WeaponsFound[27] == 1){//IceLance
				if(WeaponsMade[27] == 0){
					WData[Total] = new Weaponsmith(28, 146, "???", "???", 140, "Lance", 117, "IceEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[27] == 1){
					WData[Total] = new Weaponsmith(28, 146, "Ice Lance", "A Lance of Ice", 140, "Lance", 117, "IceEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//IceLance
			
			if(WeaponsFound[28] == 1){//LightLance
				if(WeaponsMade[28] == 0){
					WData[Total] = new Weaponsmith(29, 147, "???", "???", 140, "Lance", 118, "LightEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[28] == 1){
					WData[Total] = new Weaponsmith(29, 147, "LightLance", "A Lance of Light", 140, "Lance", 118, "LightEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//LightLance
			
			if(WeaponsFound[29] == 1){//DarkLance
				if(WeaponsMade[29] == 0){
					WData[Total] = new Weaponsmith(30, 148, "???", "???", 140, "Lance", 119, "DarkEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[29] == 1){
					WData[Total] = new Weaponsmith(30, 148, "DarkLance", "A Lance of Dark", 140, "Lance", 119, "DarkEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//DarkLance
			
			//-----------------------------------------------------------------------------------------------------
			
			if(WeaponsFound[30] == 1){//Axe
				if(WeaponsMade[30] == 0){//what happens if the item is different?
					WData[Total] = new Weaponsmith(31, 149, "???", "A Wide Weapon", 106, "AlloyA", 0, "", 1, 0, 3);// ??? or ????
				}
				if(WeaponsMade[30] == 1){
					WData[Total] = new Weaponsmith(31, 149, "Axe", "A Wide Weapon", 106, "AlloyA", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Axe
			
			if(WeaponsFound[31] == 1){//FireAxe
				if(WeaponsMade[31] == 0){
					WData[Total] = new Weaponsmith(32, 150, "???", "???", 149, "Axe", 112, "FireEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[31] == 1){
					WData[Total] = new Weaponsmith(32, 150, "FireAxe", "An Axe of Fire", 149, "Axe", 112, "FireEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//FireAxe
			
			if(WeaponsFound[32] == 1){//WaterAxe
				if(WeaponsMade[32] == 0){
					WData[Total] = new Weaponsmith(33, 151, "???", "???", 149, "Axe", 113, "WaterEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[32] == 1){
					WData[Total] = new Weaponsmith(33, 151, "WaterAxe", "An Axe of Water", 149, "Axe", 113, "WaterEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//WaterAxe
			
			if(WeaponsFound[33] == 1){//WindAxe
				if(WeaponsMade[33] == 0){
					WData[Total] = new Weaponsmith(34, 152, "???", "???", 149, "Axe", 114, "WindEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[33] == 1){
					WData[Total] = new Weaponsmith(34, 152, "WindAxe", "An Axe of Wind", 149, "Axe", 114, "WindEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//WindAxe
			
			if(WeaponsFound[34] == 1){//EarthAxe
				if(WeaponsMade[34] == 0){
					WData[Total] = new Weaponsmith(35, 153, "???", "???", 149, "Axe", 115, "EarthEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[34] == 1){
					WData[Total] = new Weaponsmith(35, 153, "EarthAxe", "An Axe of Earth", 149, "Axe", 115, "EarthEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//EarthAxe
			
			if(WeaponsFound[35] == 1){//ElecAxe
				if(WeaponsMade[35] == 0){
					WData[Total] = new Weaponsmith(36, 154, "???", "???", 149, "Axe", 116, "ElecEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[35] == 1){
					WData[Total] = new Weaponsmith(36, 154, "ElecAxe", "An Axe of Electric", 149, "Axe", 116, "ElecEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//ElectricAxe
			
			if(WeaponsFound[36] == 1){//IceAxe
				if(WeaponsMade[36] == 0){
					WData[Total] = new Weaponsmith(37, 155, "???", "???", 149, "Axe", 117, "IceEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[36] == 1){
					WData[Total] = new Weaponsmith(37, 155, "Ice Axe", "An Axe of Ice", 149, "Axe", 117, "IceEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//IceAxe
			
			if(WeaponsFound[37] == 1){//LightAxe
				if(WeaponsMade[37] == 0){
					WData[Total] = new Weaponsmith(38, 156, "???", "???", 149, "Axe", 118, "LightEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[37] == 1){
					WData[Total] = new Weaponsmith(38, 156, "LightAxe", "An Axe of Light", 149, "Axe", 118, "LightEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//LightAxe
			
			if(WeaponsFound[38] == 1){//DarkAxe
				if(WeaponsMade[38] == 0){
					WData[Total] = new Weaponsmith(39, 157, "???", "???", 149, "Axe", 119, "DarkEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[38] == 1){
					WData[Total] = new Weaponsmith(39, 157, "DarkAxe", "An Axe of Dark", 149, "Axe", 119, "DarkEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//DarkAxe
			
			//-----------------------------------------------------------------------------------------------------
			
			if(WeaponsFound[39] == 1){//Hammer
				if(WeaponsMade[39] == 0){//what happens if the item is different?
					WData[Total] = new Weaponsmith(40, 158, "???", "A Heavy Weapon", 108, "AlloyD", 0, "", 1, 0, 3);// ??? or ????
				}
				if(WeaponsMade[39] == 1){
					WData[Total] = new Weaponsmith(40, 158, "Hammer", "A Heavy Weapon", 108, "AlloyD", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Hammer
			
			if(WeaponsFound[40] == 1){//FireHammer
				if(WeaponsMade[40] == 0){
					WData[Total] = new Weaponsmith(41, 159, "???", "???", 158, "Hammer", 112, "FireEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[40] == 1){
					WData[Total] = new Weaponsmith(41, 159, "FireHmr", "A Hammer of Fire", 158, "Hammer", 112, "FireEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//FireHammer
			
			if(WeaponsFound[41] == 1){//WaterHammer
				if(WeaponsMade[41] == 0){
					WData[Total] = new Weaponsmith(42, 160, "???", "???", 158, "Hammer", 113, "WaterEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[41] == 1){
					WData[Total] = new Weaponsmith(42, 160, "WaterHmr", "A Hammer of Water", 158, "Hammer", 113, "WaterEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//WaterHammer
			
			if(WeaponsFound[42] == 1){//WindHammer
				if(WeaponsMade[42] == 0){
					WData[Total] = new Weaponsmith(43, 161, "???", "???", 158, "Hammer", 114, "WindEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[42] == 1){
					WData[Total] = new Weaponsmith(43, 161, "WindHmr", "A Hammer of Wind", 158, "Hammer", 114, "WindEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//WindHammer
			
			if(WeaponsFound[43] == 1){//EarthHammer
				if(WeaponsMade[43] == 0){
					WData[Total] = new Weaponsmith(44, 162, "???", "???", 158, "Hammer", 115, "EarthEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[43] == 1){
					WData[Total] = new Weaponsmith(44, 162, "EarthHmr", "A Hammer of Earth", 158, "Hammer", 115, "EarthEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//EarthHammer
			
			if(WeaponsFound[44] == 1){//ElecHammer
				if(WeaponsMade[44] == 0){
					WData[Total] = new Weaponsmith(45, 163, "???", "???", 158, "Hammer", 116, "ElecEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[44] == 1){
					WData[Total] = new Weaponsmith(45, 163, "ElecHmr", "A Hammer of Electric", 158, "Hammer", 116, "ElecEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//ElectricHammer
			
			if(WeaponsFound[45] == 1){//IceHammer
				if(WeaponsMade[45] == 0){
					WData[Total] = new Weaponsmith(46, 164, "???", "???", 158, "Hammer", 117, "IceEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[45] == 1){
					WData[Total] = new Weaponsmith(46, 164, "Ice Hmr", "A Hammer of Ice", 158, "Hammer", 117, "IceEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//IceHammer
			
			if(WeaponsFound[46] == 1){//LightHammer
				if(WeaponsMade[46] == 0){
					WData[Total] = new Weaponsmith(47, 165, "???", "???", 158, "Hammer", 118, "LightEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[46] == 1){
					WData[Total] = new Weaponsmith(47, 165, "LightHmr", "A Hammer of Light", 158, "Hammer", 118, "LightEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//LightHammer
			
			if(WeaponsFound[47] == 1){//DarkHammer
				if(WeaponsMade[47] == 0){
					WData[Total] = new Weaponsmith(48, 166, "???", "???", 158, "Hammer", 119, "DarkEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[47] == 1){
					WData[Total] = new Weaponsmith(48, 166, "DarkHmr", "A Hammer of Dark", 158, "Hammer", 119, "DarkEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//DarkHammer
			
			//-----------------------------------------------------------------------------------------------------
			
			if(WeaponsFound[48] == 1){//Pole
				if(WeaponsMade[48] == 0){//what happens if the item is different?
					WData[Total] = new Weaponsmith(49, 167, "???", "A light Weapon", 108, "AlloyD", 0, "", 1, 0, 3);// ??? or ????
				}
				if(WeaponsMade[48] == 1){
					WData[Total] = new Weaponsmith(49, 167, "Pole", "A light Weapon", 108, "AlloyD", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Pole
			
			if(WeaponsFound[49] == 1){//FirePole
				if(WeaponsMade[49] == 0){
					WData[Total] = new Weaponsmith(50, 168, "???", "???", 167, "Pole", 112, "FireEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[49] == 1){
					WData[Total] = new Weaponsmith(50, 168, "FirePole", "A Pole of Fire", 167, "Pole", 112, "FireEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//FirePole
			
			if(WeaponsFound[50] == 1){//WaterPole
				if(WeaponsMade[50] == 0){
					WData[Total] = new Weaponsmith(51, 169, "???", "???", 167, "Pole", 113, "WaterEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[50] == 1){
					WData[Total] = new Weaponsmith(51, 169, "WaterPole", "A Pole of Water", 167, "Pole", 113, "WaterEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//WaterPole
			
			if(WeaponsFound[51] == 1){//WindPole
				if(WeaponsMade[51] == 0){
					WData[Total] = new Weaponsmith(52, 170, "???", "???", 167, "Pole", 114, "WindEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[51] == 1){
					WData[Total] = new Weaponsmith(52, 170, "WindPole", "A Pole of Wind", 167, "Pole", 114, "WindEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//WindPole
			
			if(WeaponsFound[52] == 1){//EarthPole
				if(WeaponsMade[52] == 0){
					WData[Total] = new Weaponsmith(53, 171, "???", "???", 167, "Pole", 115, "EarthEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[52] == 1){
					WData[Total] = new Weaponsmith(53, 171, "EarthPole", "A Pole of Earth", 167, "Pole", 115, "EarthEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//EarthPole
			
			if(WeaponsFound[53] == 1){//ElecPole
				if(WeaponsMade[53] == 0){
					WData[Total] = new Weaponsmith(54, 172, "???", "???", 167, "Pole", 116, "ElecEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[53] == 1){
					WData[Total] = new Weaponsmith(54, 172, "ElecPole", "A Pole of Electric", 167, "Pole", 116, "ElecEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//ElectricPole
			
			if(WeaponsFound[54] == 1){//IcePole
				if(WeaponsMade[54] == 0){
					WData[Total] = new Weaponsmith(55, 173, "???", "???", 167, "Pole", 117, "IceEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[54] == 1){
					WData[Total] = new Weaponsmith(55, 173, "Ice Pole", "A Pole of Ice", 167, "Pole", 117, "IceEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//IcePole
			
			if(WeaponsFound[55] == 1){//LightPole
				if(WeaponsMade[55] == 0){
					WData[Total] = new Weaponsmith(56, 174, "???", "???", 167, "Pole", 118, "LightEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[55] == 1){
					WData[Total] = new Weaponsmith(56, 174, "LightPole", "A Pole of Light", 167, "Pole", 118, "LightEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//LightPole
			
			if(WeaponsFound[56] == 1){//DarkPole
				if(WeaponsMade[56] == 0){
					WData[Total] = new Weaponsmith(57, 175, "???", "???", 167, "Pole", 119, "DarkEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[56] == 1){
					WData[Total] = new Weaponsmith(57, 175, "DarkPole", "A Pole of Dark", 167, "Pole", 119, "DarkEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//DarkPole
			
			//-----------------------------------------------------------------------------------------------------
			
			if(WeaponsFound[57] == 1){//Bomb
				if(WeaponsMade[57] == 0){//what happens if the item is different?
					WData[Total] = new Weaponsmith(58, 271, "???", "An explosive", 111, "Gunpowder", 0, "", 1, 0, 3);// ??? or ????
				}
				if(WeaponsMade[57] == 1){
					WData[Total] = new Weaponsmith(58, 271, "Bomb", "An explosive", 111, "Gunpowder", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Bomb
			
			if(WeaponsFound[58] == 1){//FireBomb
				if(WeaponsMade[58] == 0){
					WData[Total] = new Weaponsmith(59, 272, "???", "???", 271, "Bomb", 112, "FireEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[58] == 1){
					WData[Total] = new Weaponsmith(59, 272, "FireBomb", "A Bomb of Fire", 271, "Bomb", 112, "FireEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//FireBomb
			
			if(WeaponsFound[59] == 1){//WaterBomb
				if(WeaponsMade[59] == 0){
					WData[Total] = new Weaponsmith(60, 273, "???", "???", 271, "Bomb", 113, "WaterEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[59] == 1){
					WData[Total] = new Weaponsmith(60, 273, "WaterBomb", "A Bomb of Water", 271, "Bomb", 113, "WaterEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//WaterBomb
			
			if(WeaponsFound[60] == 1){//WindBomb
				if(WeaponsMade[60] == 0){
					WData[Total] = new Weaponsmith(61, 274, "???", "???", 271, "Bomb", 114, "WindEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[60] == 1){
					WData[Total] = new Weaponsmith(61, 274, "WindBomb", "A Bomb of Wind", 271, "Bomb", 114, "WindEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//WindBomb
			
			if(WeaponsFound[61] == 1){//EarthBomb
				if(WeaponsMade[61] == 0){
					WData[Total] = new Weaponsmith(62, 275, "???", "???", 271, "Bomb", 115, "EarthEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[61] == 1){
					WData[Total] = new Weaponsmith(62, 275, "EarthBomb", "A Bomb of Earth", 271, "Bomb", 115, "EarthEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//EarthBomb
			
			if(WeaponsFound[62] == 1){//ElecBomb
				if(WeaponsMade[62] == 0){
					WData[Total] = new Weaponsmith(63, 276, "???", "???", 271, "Bomb", 116, "ElecEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[62] == 1){
					WData[Total] = new Weaponsmith(63, 276, "ElecBomb", "A Bomb of Electric", 271, "Bomb", 116, "ElecEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//ElectricBomb
			
			if(WeaponsFound[63] == 1){//IceBomb
				if(WeaponsMade[63] == 0){
					WData[Total] = new Weaponsmith(64, 277, "???", "???", 271, "Bomb", 117, "IceEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[63] == 1){
					WData[Total] = new Weaponsmith(64, 277, "Ice Bomb", "A Bomb of Ice", 271, "Bomb", 117, "IceEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//IceBomb
			
			if(WeaponsFound[64] == 1){//LightBomb
				if(WeaponsMade[64] == 0){
					WData[Total] = new Weaponsmith(65, 278, "???", "???", 271, "Bomb", 118, "LightEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[64] == 1){
					WData[Total] = new Weaponsmith(65, 278, "LightBomb", "A Bomb of Light", 271, "Bomb", 118, "LightEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//LightBomb
			
			if(WeaponsFound[65] == 1){//DarkBomb
				if(WeaponsMade[65] == 0){
					WData[Total] = new Weaponsmith(66, 279, "???", "???", 271, "Bomb", 119, "DarkEnrgy", 1, 0, 3);
				}
				if(WeaponsMade[65] == 1){
					WData[Total] = new Weaponsmith(66, 279, "DarkBomb", "A Bomb of Dark", 271, "Bomb", 119, "DarkEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//DarkBomb
			
			if(WeaponsFound[66] == 1){//BigBomb
				if(WeaponsMade[66] == 0){
					WData[Total] = new Weaponsmith(67, 297, "???", "???", 271, "Bomb", 111, "gunpowdr", 1, 0, 3);
				}
				if(WeaponsMade[66] == 1){
					WData[Total] = new Weaponsmith(67, 297, "BigBomb", "A huge Bomb", 271, "Bomb", 111, "gunpowder", 1, 1, 3);
				}
				Total = Total + 1;
			}//BigBomb
			
			if(WeaponsFound[67] == 1){//BugBomb
				if(WeaponsMade[67] == 0){
					WData[Total] = new Weaponsmith(68, 298, "???", "???", 271, "Bomb", 280, "Glitch", 1, 0, 3);
				}
				if(WeaponsMade[67] == 1){
					WData[Total] = new Weaponsmith(68, 298, "BugBomb", "A Bugged Bomb", 271, "Bomb", 280, "Glitch", 1, 1, 3);
				}
				Total = Total + 1;
			}//BugBomb
			
			//-----------------------------------------------------------------------------------------------------
			
		}//End of Construct Weaponlist
		return WData;
	}//Weaponlist End
	
	//MakeWeapon
	
	public static int WeaponNo(int[] WeaponFound, int WeaponNo){
		int Index = 0;
		int i = 0;
		while(i < WeaponNo - 1){
			Index = Index + WeaponFound[i];
			i = i + 1;
		}
		return Index;
	}
	
	public static int WeaponTotal(int[] WeaponFound){
		int Total = 0;
		int i = 0;
		while(i < WeaponFound.length){
			Total = Total + WeaponFound[i];
			i = i + 1;
		}
		return Total;
	}
}
