package textonlyrpg;

public class Topics {
	public int TopicNo = 1;//TopicNo ID
	public String TopicName = "TestTopic1";
	public String TopicDisc = "TestTopic1";
	public int TopicText = 0;
	//Topic Lines or turns?
	static int i = 0;
	
	
	public Topics(int TopicNo, String TopicName, String TopicDisc, int TopicText){
		this.TopicNo = TopicNo;
		this.TopicName = TopicName;
		this.TopicDisc = TopicDisc;
		this.TopicText = TopicText;
	}  
	
	public int getTopicNo(){
		return TopicNo;
	}
	
	public String getTopicName(){
		return TopicName;
	}
	
	public String getTopicDisc(){
		return TopicDisc;
	}

	public static Topics[] TopicList(int[] Topic1){
		int TopicTotal = TopicTotal(Topic1);
		Topics[] TopicList = new Topics[TopicTotal];{
			int i = 0;
			while(i < (TopicTotal - 1)){
				TopicList[i] = new Topics(00, "", "No Disc", 0);
				i = i + 1;
			}
			int Total = 0;
			if(Topic1[0] == 1){
				TopicList[Total] = new Topics(1, "TestTopic1", "TestTopic1", 1);
				Total = Total + 1;
			}
			if(Topic1[1] == 1){
				TopicList[Total]  = new Topics(2, "TestTopic2", "TestTopic2", 2);
				Total = Total + 1;
			}
			if(Topic1[2] == 1){
				TopicList[Total]  = new Topics(3, "TestTopic3", "TestTopic3", 3);
				Total = Total + 1;
			}
			if(Topic1[3] == 1){
				TopicList[Total]  = new Topics(4, "TestTopic4", "TestTopic4", 4);
				Total = Total + 1;
			}
			if(Topic1[4] == 1){
				TopicList[Total]  = new Topics(5, "TestTopic5", "TestTopic5", 5);
				Total = Total + 1;
			}
			if(Topic1[5] == 1){
				TopicList[Total]  = new Topics(6, "TestTopic6", "TestTopic6", 6);
				Total = Total + 1;
			}
			if(Topic1[6] == 1){
				TopicList[Total]  = new Topics(7, "TestTopic7","TestTopic7", 7);
				Total = Total + 1;
			}
			if(Topic1[7] == 1){
				TopicList[Total]  = new Topics(8, "TestTopic8","TestTopic8", 8);
				Total = Total + 1;
			}
			if(Topic1[8] == 1){
				TopicList[Total]  = new Topics(9, "TestTopic9","TestTopic9", 9);
				Total = Total + 1;
			}
			if(Topic1[9] == 1){
				TopicList[Total]  = new Topics(10, "TestTopic10","TestTopic10", 10);
				Total = Total + 1;
			}
			if(Topic1[10] == 1){
				TopicList[Total]  = new Topics(10, "TestTopic11","TestTopic11", 11);
				Total = Total + 1;
			}
		}
		return TopicList;
	}
	
	//
	
	public static int TopicNo(int[] TopicFound, int TopicNo){
		int Index = 0;
		int i = 0;
		while(i < TopicNo - 1){
			Index = Index + TopicFound[i];
			i = i + 1;
		}
		return Index;
	}
	
	public static int TopicTotal(int[] TopicFound){
		int Total = 0;
		int i = 0;
		while(i < TopicFound.length){
			Total = Total + TopicFound[i];
			i = i + 1;
		}
		return Total;
	}
}
