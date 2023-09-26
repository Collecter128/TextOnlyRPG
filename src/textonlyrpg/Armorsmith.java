package textonlyrpg;

public class Armorsmith {
	public int RecipeNo = 1;
	public int ItemNo = 1;
	public String ItemName = "TestItem1";
	public String ItemDisc = "TestItem1";
	public int MaterialNo1 = 0;
	public String Material1Name = "";
	public int MaterialNo2 = 0;
	public String Material2Name = "";
	public int ItemType = 1;
	public int RecipeMade = 1;
	public int Price;
	static int i = 0;
	
	
	public Armorsmith(int RecipeNo, int ItemNo, String ItemName, String ItemDisc, int MaterialNo1, String Material1Name, int MaterialNo2, String Material2Name, int ItemType, int RecipeMade, int Price){
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
	
	public int getItemType(){
		return ItemType;
	}
	
	public int getMaterialNo1(){
		return MaterialNo1;
	}
	
	public int getMaterialNo2(){
		return MaterialNo2;
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
	
	
	//Armorsmith(RecipeNo, ItemNo, ItemName, ItemDisc, MaterialNo1, MaterialNo2, ItemType, RecipeMade, Price)
	public static Armorsmith[] ArmorList(int[] ArmorFound, int[] ArmorMade){
		int ArmorTotal = ArmorTotal(ArmorFound);
		Armorsmith[] AData = new Armorsmith[ArmorTotal];{
			int i = 0;
			while(i < (ArmorTotal - 1)){
				AData[i] = new Armorsmith(00, 00, "", "No Disc", 0, "", 0, "", 0, 0, 0);
				i = i + 1;
			}
			int Total = 0;

			if(ArmorFound[0] == 1){
				if(ArmorMade[0] == 0){
					AData[Total] = new Armorsmith(1, 289, "???", "???", 1, "TestItem1?", 0, "", 1, 0, 3);
					//AData[Total] = new Armorsmith(2, 8, "???", "???", 1, "TestItem1?", 0, "", 1, 0, 3);
				}
				if(ArmorMade[0] == 1){
					AData[Total] = new Armorsmith(1, 289, "AItem1", "TestItem1", 289, "TestItem1", 0, "", 1, 1, 3);
					//AData[Total] = new Armorsmith(2, 8, "AItem1", "TestItem1", 8, "TestItem1", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}
			if(ArmorFound[1] == 1){
				if(ArmorMade[1] == 0){
					AData[Total] = new Armorsmith(2, 290, "???", "???", 1, "???", 0, "", 1, 0, 3);
					//AData[Total] = new Armorsmith(3, 9, "???", "???", 1, "???", 0, "", 1, 0, 3);
				}
				if(ArmorMade[1] == 1){
					AData[Total] = new Armorsmith(2, 290, "AItem2", "TestItem2", 1, "Potion??", 0, "", 1, 1, 3);
					//AData[Total] = new Armorsmith(3, 9, "AItem2", "TestItem2", 1, "Potion??", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}
//			if(ArmorFound[2] == 1){
//				if(ArmorMade[2] == 0){
//					AData[Total] = new Armorsmith(3, 3, "???", "???", 0, "", 0, "", 1, 0, 3);
//				}
//				if(ArmorMade[2] == 1){
//					AData[Total] = new Armorsmith(3, 3, "AItem3", "TestItem3", 0, "", 0, "", 1, 1, 3);
//				}
//				Total = Total + 1;
//			}
			if(ArmorFound[2] == 1){
				if(ArmorMade[2] == 0){
					AData[Total] = new Armorsmith(3, 292, "???", "???", 0, "", 0, "", 1, 0, 3);
					//AData[Total] = new Armorsmith(4, 11, "???", "???", 0, "", 0, "", 1, 0, 3);
				}
				if(ArmorMade[2] == 1){
					AData[Total] = new Armorsmith(3, 292, "AItem3", "TestItem4", 0, "", 0, "", 1, 1, 3);
					//AData[Total] = new Armorsmith(4, 11, "AItem3", "TestItem4", 0, "", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}
//			if(ArmorFound[3] == 1){
//			if(ArmorMade[2] == 0){
//				AData[Total] = new Armorsmith(4, 5, "???", "???", 0, "", 0, "", 1, 0, 3);
//			}
//			if(ArmorMade[2] == 1){
//				AData[Total] = new Armorsmith(4, 282, "AItem4", "TestItem5", 0, "", 0, "", 1, 1, 3);
//			}
//			Total = Total + 1;
//		}
			if(ArmorFound[3] == 1){
				if(ArmorMade[3] == 0){
					AData[Total] = new Armorsmith(4, 294, "???", "???", 0, "", 0, "", 1, 0, 3);
					//AData[Total] = new Armorsmith(5, 13, "???", "???", 0, "", 0, "", 1, 0, 3);
				}
				if(ArmorMade[3] == 1){
					AData[Total] = new Armorsmith(4, 294, "AItem4", "TestItem6", 292, "TestItem4", 0, "", 1, 1, 3);
					//AData[Total] = new Armorsmith(5, 13, "AItem4", "TestItem6", 11, "TestItem4", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}
			//ArmorFound[4] == 1?
			
			if(ArmorFound[4] == 1){//Hood
				if(ArmorMade[4] == 0){
					AData[Total] = new Armorsmith(5, 176, "???", "Head Armor", 95, "Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[4] == 1){
					AData[Total] = new Armorsmith(5, 176, "Hood", "Head Armor", 95, "Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Hood
			if(ArmorFound[5] == 1){
				if(ArmorMade[5] == 0){
					AData[Total] = new Armorsmith(6, 177, "???", "Body Armor", 95, "Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[5] == 1){
					AData[Total] = new Armorsmith(6, 177, "Robe", "Body Armor", 95, "Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//robe
			if(ArmorFound[6] == 1){
				if(ArmorMade[6] == 0){
					AData[Total] = new Armorsmith(7, 178, "???", "Basic Armor?", 95, "Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[6] == 1){
					AData[Total] = new Armorsmith(7, 178, "Shirt", "Basic Armor?", 95, "Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//shirt
			if(ArmorFound[7] == 1){//Gloves
				if(ArmorMade[7] == 0){
					AData[Total] = new Armorsmith(8, 179, "???", "Hand Armor", 95, "Cloth", 0, "", 1, 0, 3);
					//AData[Total] = new Armorsmith(1, 7, "???", "Hand Armor", 4, "Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[7] == 1){
					AData[Total] = new Armorsmith(8, 179, "Gloves", "Hand Armor", 95, "Cloth", 0, "", 1, 1, 3);
					//AData[Total] = new Armorsmith(1, 7, "Gloves", "Hand Armor", 4, "Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Gloves
			if(ArmorFound[8] == 1){//Pants
				if(ArmorMade[8] == 0){
					AData[Total] = new Armorsmith(9, 180, "???", "Leg Armor", 95, "Cloth", 0, "", 1, 0, 3);
					//AData[Total] = new Armorsmith(1, 7, "???", "Hand Armor", 4, "Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[8] == 1){
					AData[Total] = new Armorsmith(9, 180, "Pants", "Leg Armor", 95, "Cloth", 0, "", 1, 1, 3);
					//AData[Total] = new Armorsmith(1, 7, "Gloves", "Hand Armor", 4, "Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Pants
			if(ArmorFound[9] == 1){//Socks
				if(ArmorMade[9] == 0){
					AData[Total] = new Armorsmith(10, 181, "???", "Foot Armor?", 95, "Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[9] == 1){
					AData[Total] = new Armorsmith(10, 181, "Socks", "Foot Armor?", 95, "Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Socks
			
			if(ArmorFound[10] == 1){//Ghost Hood
				if(ArmorMade[10] == 0){
					AData[Total] = new Armorsmith(11, 182, "???", "Head Armor", 96, "Ghost Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[10] == 1){
					AData[Total] = new Armorsmith(11, 182, "Ghost Hood", "Head Armor", 96, "Ghost Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Ghost Hood
			if(ArmorFound[11] == 1){
				if(ArmorMade[11] == 0){
					AData[Total] = new Armorsmith(12, 183, "???", "Body Armor", 96, "Ghost Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[11] == 1){
					AData[Total] = new Armorsmith(12, 183, "Ghost Robe", "Body Armor", 96, "Ghost Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Ghost robe
			if(ArmorFound[12] == 1){
				if(ArmorMade[12] == 0){
					AData[Total] = new Armorsmith(13, 184, "???", "Basic Armor?", 96, "Ghost Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[12] == 1){
					AData[Total] = new Armorsmith(13, 184, "Ghost Shirt", "Basic Armor?", 96, "Ghost Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Ghost shirt
			if(ArmorFound[13] == 1){//Gloves
				if(ArmorMade[13] == 0){
					AData[Total] = new Armorsmith(14, 185, "???", "Hand Armor", 96, "Ghost Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[13] == 1){
					AData[Total] = new Armorsmith(14, 185, "GhostGloves", "Hand Armor", 96, "Ghost Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Ghost Gloves
			if(ArmorFound[14] == 1){//Ghost Pants
				if(ArmorMade[14] == 0){
					AData[Total] = new Armorsmith(15, 186, "???", "Leg Armor", 96, "Ghost Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[14] == 1){
					AData[Total] = new Armorsmith(15, 186, "GhostPants", "Leg Armor", 96, "Ghost Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//GhostPants
			if(ArmorFound[15] == 1){//Ghost Socks
				if(ArmorMade[15] == 0){
					AData[Total] = new Armorsmith(16, 187, "???", "Foot Armor?", 96, "Ghost Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[15] == 1){
					AData[Total] = new Armorsmith(16, 187, "GhostSocks", "Foot Armor?", 96, "Ghost Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//GhostSocks
			
			if(ArmorFound[16] == 1){//Dark Hood
				if(ArmorMade[16] == 0){
					AData[Total] = new Armorsmith(17, 188, "???", "Head Armor", 97, "Dark Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[16] == 1){
					AData[Total] = new Armorsmith(17, 188, "DarkHood", "Head Armor", 97, "Dark Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Dark Hood
			if(ArmorFound[17] == 1){
				if(ArmorMade[17] == 0){
					AData[Total] = new Armorsmith(18, 189, "???", "Body Armor", 97, "Dark Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[17] == 1){
					AData[Total] = new Armorsmith(18, 189, "DarkRobe", "Body Armor", 97, "Dark Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Dark robe
			if(ArmorFound[18] == 1){
				if(ArmorMade[18] == 0){
					AData[Total] = new Armorsmith(19, 190, "???", "Basic Armor?", 97, "Dark Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[18] == 1){
					AData[Total] = new Armorsmith(19, 190, "DarkShirt", "Basic Armor?", 97, "Dark Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Dark shirt
			if(ArmorFound[19] == 1){//Dark Gloves
				if(ArmorMade[19] == 0){
					AData[Total] = new Armorsmith(20, 191, "???", "Hand Armor", 97, "Dark Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[19] == 1){
					AData[Total] = new Armorsmith(20, 191, "DarkGloves", "Hand Armor", 97, "Dark Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Dark Gloves
			if(ArmorFound[20] == 1){//Dark Pants
				if(ArmorMade[20] == 0){
					AData[Total] = new Armorsmith(21, 192, "???", "Leg Armor", 97, "Dark Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[20] == 1){
					AData[Total] = new Armorsmith(21, 192, "DarkPants", "Leg Armor", 97, "Dark Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Dark Pants
			if(ArmorFound[21] == 1){//Dark Socks
				if(ArmorMade[21] == 0){
					AData[Total] = new Armorsmith(22, 193, "???", "Foot Armor?", 97, "Dark Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[21] == 1){
					AData[Total] = new Armorsmith(22, 193, "DarkSocks", "Foot Armor?", 97, "Dark Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Dark Socks
			
			if(ArmorFound[22] == 1){//Chain Hood
				if(ArmorMade[22] == 0){
					AData[Total] = new Armorsmith(23, 194, "???", "Head Chain Armor", 100, "Chain", 0, "", 1, 0, 3);
				}
				if(ArmorMade[22] == 1){
					AData[Total] = new Armorsmith(23, 194, "ChainHood", "A hood of Chain", 100, "Chain", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Chain Hood
			if(ArmorFound[23] == 1){//Chain robe
				if(ArmorMade[23] == 0){
					AData[Total] = new Armorsmith(24, 195, "???", "Chain back armor", 100, "Chain", 0, "", 1, 0, 3);
				}
				if(ArmorMade[23] == 1){
					AData[Total] = new Armorsmith(24, 195, "ChainRobe", "A chain cloak", 100, "Chain", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Chain Robe
			if(ArmorFound[24] == 1){//Chain Armor
				if(ArmorMade[24] == 0){
					AData[Total] = new Armorsmith(25, 196, "???", "Chain armor", 100, "Chain", 0, "", 1, 0, 3);
				}
				if(ArmorMade[24] == 1){
					AData[Total] = new Armorsmith(25, 196, "ChainArmor", "It's Chainmail", 100, "Chain", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Chain Armor
			
			if(ArmorFound[25] == 1){//Slime Armor
				if(ArmorMade[25] == 0){
					AData[Total] = new Armorsmith(26, 197, "???", "Slime???", 98, "Slime Jell", 0, "", 1, 0, 3);
				}
				if(ArmorMade[25] == 1){
					AData[Total] = new Armorsmith(26, 197, "SlimeArmor", "Armor made of slime", 98, "Slime Jell", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Slime Armor
			if(ArmorFound[26] == 1){//Golem Armor
				if(ArmorMade[26] == 0){
					AData[Total] = new Armorsmith(27, 198, "???", "Golem???", 99, "Golem Clay", 0, "", 1, 0, 3);
				}
				if(ArmorMade[26] == 1){
					AData[Total] = new Armorsmith(27, 198, "GolemArmr", "Armor made of clay", 99, "Golem Clay", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Golem Armor
			
			if(ArmorFound[27] == 1){//Icy Helmet
				if(ArmorMade[27] == 0){
					AData[Total] = new Armorsmith(28, 199, "???", "It's a Helmet?", 81, "Ice", 0, "", 1, 0, 3);
				}
				if(ArmorMade[27] == 1){
					AData[Total] = new Armorsmith(28, 199, "IcyHelmet", "Helmet made of ice?", 81, "Ice", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Icy Armor
			if(ArmorFound[28] == 1){//Icy Armor
				if(ArmorMade[28] == 0){
					AData[Total] = new Armorsmith(29, 200, "???", "It's an Armor?", 81, "Ice", 0, "", 1, 0, 3);
				}
				if(ArmorMade[28] == 1){
					AData[Total] = new Armorsmith(29, 200, "Icy Armor", "Armor made of ice?", 81, "Ice", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Icy Armor
			if(ArmorFound[29] == 1){//Icy Gauntlets
				if(ArmorMade[29] == 0){
					AData[Total] = new Armorsmith(30, 201, "???", "It's gauntlets?", 81, "Ice", 0, "", 1, 0, 3);
				}
				if(ArmorMade[29] == 1){
					AData[Total] = new Armorsmith(30, 201, "IcyGntlets", "Gloves made of ice?", 81, "Ice", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Icy Gauntlets
			if(ArmorFound[30] == 1){//Icy Boots
				if(ArmorMade[30] == 0){
					AData[Total] = new Armorsmith(31, 202, "???", "It's boots?", 81, "Ice", 0, "", 1, 0, 3);
				}
				if(ArmorMade[30] == 1){
					AData[Total] = new Armorsmith(31, 202, "Icy Boots", "Boots made of ice?", 81, "Ice", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Icy Boots
			
			if(ArmorFound[31] == 1){//Rubber Armor
				if(ArmorMade[31] == 0){
					AData[Total] = new Armorsmith(32, 203, "???", "Armor", 101, "Rubber", 0, "", 1, 0, 3);
				}
				if(ArmorMade[31] == 1){
					AData[Total] = new Armorsmith(32, 203, "Rbr Armor", "Tough armor", 101, "Rubber", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Rubber Armor
			
			if(ArmorFound[32] == 1){//Pancake Armor
				if(ArmorMade[32] == 0){
					AData[Total] = new Armorsmith(33, 204, "???", "Armor?", 6, "PancakeMix", 0, "", 1, 0, 3);
				}
				if(ArmorMade[32] == 1){
					AData[Total] = new Armorsmith(33, 204, "PnCkArmor", "A bread armor?", 6, "PancakeMix", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Pancake Armor
			
			if(ArmorFound[33] == 1){//Pancake Armor W. Syrup
				if(ArmorMade[33] == 0){
					AData[Total] = new Armorsmith(34, 205, "???", "Armor?", 204, "PnCkArmor", 35, "Syrup", 1, 0, 3);
				}
				if(ArmorMade[33] == 1){
					AData[Total] = new Armorsmith(34, 205, "PnCkArWS", "Better bread armor?", 204, "PnCkArmor", 35, "Syrup", 1, 1, 3);
				}
				Total = Total + 1;
			}//Pancake Armor W. Syrup
			
			if(ArmorFound[34] == 1){//Alloy A
				if(ArmorMade[34] == 0){
					AData[Total] = new Armorsmith(35, 106, "Alloy A", "Metal A+B", 102, "Metal A", 103, "Metal B", 1, 0, 3);
				}
				if(ArmorMade[34] == 1){
					AData[Total] = new Armorsmith(35, 106, "Alloy A", "A useful alloy", 102, "Metal A", 103, "Metal B", 1, 1, 3);
				}
				Total = Total + 1;
			}//Alloy A
			
			if(ArmorFound[35] == 1){//Alloy B
				if(ArmorMade[35] == 0){
					AData[Total] = new Armorsmith(36, 107, "Alloy B", "Metal B+C", 103, "Metal B", 104, "Metal C", 1, 0, 3);
				}
				if(ArmorMade[35] == 1){
					AData[Total] = new Armorsmith(36, 107, "Alloy B", "A useful alloy", 103, "Metal B", 104, "Metal C", 1, 1, 3);
				}
				Total = Total + 1;
			}//Alloy B
			
			if(ArmorFound[36] == 1){//Alloy D
				if(ArmorMade[36] == 0){
					AData[Total] = new Armorsmith(37, 108, "Alloy D", "Metal A+C", 102, "Metal A", 104, "Metal C", 1, 0, 3);
				}
				if(ArmorMade[36] == 1){
					AData[Total] = new Armorsmith(37, 108, "Alloy D", "A useful alloy", 102, "Metal A", 104, "Metal C", 1, 1, 3);
				}
				Total = Total + 1;
			}//Alloy D
			
			if(ArmorFound[37] == 1){//Alloy I
				if(ArmorMade[37] == 0){
					AData[Total] = new Armorsmith(38, 109, "Alloy I", "Metal C + E", 104, "Metal C", 105, "Metal E", 1, 0, 3);
				}
				if(ArmorMade[37] == 1){
					AData[Total] = new Armorsmith(38, 109, "Alloy I", "A useful alloy", 104, "Metal C", 105, "Metal E", 1, 1, 3);
				}
				Total = Total + 1;
			}//Alloy I
			
		}
		return AData;
	}
	
	//MakeArmor
	
	public static int ArmorNo(int[] ArmorFound, int ArmorNo){
		int Index = 0;
		int i = 0;
		while(i < ArmorNo - 1){
			Index = Index + ArmorFound[i];
			i = i + 1;
		}
		return Index;
	}
	
	public static int ArmorTotal(int[] ArmorFound){
		int Total = 0;
		int i = 0;
		while(i < ArmorFound.length){
			Total = Total + ArmorFound[i];
			i = i + 1;
		}
		return Total;
	}
}
