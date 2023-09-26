package textonlyrpg;

public class Market {
	public int ItemNo = 1;//NoteNo ID
	public String ItemName = "TestItem1";
	//Itemtype?
	public String ItemDisc = "TestItem1";
	public int ItemType = 1;
	public int ItemPrice = 3;
	public int Qty = 0;
	static int i = 0;
	
	
	public Market(int ItemNo, String ItemName, String ItemDisc, int ItemType, int ItemPrice, int Qty){
		this.ItemNo = ItemNo;
		this.ItemName = ItemName;
		this.ItemDisc = ItemDisc;
		this.ItemType = ItemType;
		this.ItemPrice = ItemPrice;
		this.Qty = Qty;
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
		//1 = Normal Purchase
		//2 = Recipe Cook
		//3 = Recipe Weapon
		//4 = Recipe Armor
	}
	
	public int getPrice(){
		return ItemPrice;
	}

	public static Market[] MarketList(int[] Item1){//list
		int ItemTotal = MarketTotal(Item1);
		Market[] MarketData = new Market[ItemTotal];{
			int i = 0;
			while(i < (ItemTotal - 1)){
				MarketData[i] = new Market(00, "", "No Disc", 0, 3, 0);
				i = i + 1;
			}
			int Total = 0;
			if(Item1[0] == 1){
				MarketData[Total] = new Market(2, "Bread Dough", "Fresh?", 1, 3, 9999);
				Total = Total + 1;
			}
			if(Item1[1] == 1){//Gloves Recipe
				MarketData[Total] = new Market(7, "Recipe", "For Armor?", 4, 3, 1);
				Total = Total + 1;
			}
			if(Item1[2] == 1){
				MarketData[Total] = new Market(289, "TestItem1", "TestItem1", 1, 3, 9999);//278
				Total = Total + 1;
			}
			if(Item1[3] == 1){
				MarketData[Total]  = new Market(290, "TestItem2", "TestItem2", 1, 3, 9999);//279
				Total = Total + 1;
			}
			if(Item1[4] == 1){
				MarketData[Total]  = new Market(291, "TestItem3", "TestItem3", 1, 3, 9999);//280
				Total = Total + 1;
			}
			if(Item1[5] == 1){
				MarketData[Total]  = new Market(292, "TestItem4", "TestItem4", 1, 3, 9999);//281
				Total = Total + 1;
			}
			if(Item1[6] == 1){
				MarketData[Total]  = new Market(293, "TestItem5", "TestItem5", 1, 3, 9999);//282
				Total = Total + 1;
			}
			if(Item1[7] == 1){
				MarketData[Total]  = new Market(294, "TestItem6", "TestItem6", 1, 3, 9999);//283
				Total = Total + 1;
			}
			if(Item1[8] == 1){
				MarketData[Total]  = new Market(295, "TestItem7", "TestItem7", 1, 3, 9999);//284
				Total = Total + 1;
			}
			if(Item1[9] == 1){
				MarketData[Total]  = new Market(296, "TestItem8", "TestItem8", 1, 3, 9999);//285
				Total = Total + 1;
			}
			if(Item1[10] == 1){
				MarketData[Total]  = new Market(297, "TestItem9", "TestItem9", 1, 3, 9999);//286
				Total = Total + 1;
			}
			if(Item1[11] == 1){
				MarketData[Total]  = new Market(298, "TestItem10", "TestItem10", 1, 3, 9999);//287
				Total = Total + 1;
			}
			if(Item1[12] == 1){
				MarketData[Total]  = new Market(299, "TestItem11", "TestItem11", 1, 3, 9999);//288
				Total = Total + 1;
			}
		}
		return MarketData;
	}
	
	public static int ShopItemNo(int[] EventShop, int ItemNo){
		int Index = 0;
		int i = 0;
		while(i < ItemNo - 1){
			Index = Index + EventShop[i];
			i = i + 1;
		}
		return Index;
	}
	public static int MarketTotal(int[] Item1Found){
		int Total = 0;
		int i = 0;
		while(i < Item1Found.length){
			Total = Total + Item1Found[i];
			i = i + 1;
		}
		return Total;
	}
}
