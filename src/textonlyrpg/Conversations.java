package textonlyrpg;


public class Conversations {
	//Want to call it talk text...

	String Text1 = "";
	String Text2 = "";
	
	public static String[] LoadText(int TextNo){
		String Text1 = "";
		String Text2 = "";
		String HText1 = "";
		String HText2 = "";
		String[] TalkText = new String[4];{
			TalkText[0] = Text1;
			TalkText[1] = Text2;
			TalkText[2] = HText1;
			TalkText[3] = HText2;
		}
		
		if(TextNo == 0){
			Text1 = "";
			Text2 = "";
			HText1 = "";
			HText2 = "";
		}
		if(TextNo == 33){//Intro: New to town
			Text1 = "According to the letter,";
			Text2 = "This is the place.";
			HText1 = "Spy: Someone's coming!";
			HText2 = "";
		}
		if(TextNo == 34){//Intro: 
			Text1 = "Maybe the Elder";
			Text2 = "knows something...";
			HText1 = "Spy: Who is that?";
			HText2 = "";
		}
		if(TextNo == 35){//Intro: 
			Text1 = "He is the leader";
			Text2 = "of this town.";
			HText1 = "Spy:...";
			HText2 = "Looks like an adventurer";
		}
		if(TextNo == 36){//Intro: 
			Text1 = "Unlocked \"Move\" Option";
			Text2 = "";
			HText1 = "Spy: What is that?";
			HText2 = "";
		}
		if(TextNo == 37){//Intro: 
			Text1 = "New Note: \"Move\"";
			Text2 = "";
			HText1 = "Spy: A notebook?";
			HText2 = "";
		}
		if(TextNo == 38){//Intro: 
			Text1 = "Unlocked \"Notes\" Option";
			Text2 = "";
			HText1 = "Spy: What's he writing?";
			HText2 = "";
		}
		if(TextNo == 39){//Intro: 
			Text1 = "New Note: \"Notes\"";
			Text2 = "";
			HText1 = "Spy: Strange...";
			HText2 = "Maybe I should watch for a little while...";
		}
		
		if(TextNo == 1){//Topic1
			Text1 = "Topic1 Text";
			Text2 = "";
		}
		if(TextNo == 2){//Topic2
			Text1 = "Topic2 Text";
			Text2 = "How Long Can This Text Really Be?";//How Long Can This Text Reall
		}
		if(TextNo == 3){//Topic3
			Text1 = "Topic3 Text";
			Text2 = "";
		}
		if(TextNo == 4){//Topic4
			Text1 = "Topic4 Text";
			Text2 = "";
		}
		if(TextNo == 5){//Topic5
			Text1 = "Topic5 Text";
			Text2 = "";
		}
		if(TextNo == 6){//Topic6
			Text1 = "Topic6 Text";
			Text2 = "";
		}
		if(TextNo == 7){//Topic7
			Text1 = "Topic7 Text";
			Text2 = "";
		}
		if(TextNo == 8){//Topic8
			Text1 = "Topic8 Text";
			Text2 = "";
		}
		if(TextNo == 9){//Topic9
			Text1 = "Topic9 Text";
			Text2 = "";
		}
		if(TextNo == 10){//Topic10
			Text1 = "Topic10 Text";
			Text2 = "";
		}
		if(TextNo == 11){//Topic11
			Text1 = "Topic11 Text";
			Text2 = "";
		}
		
		if(TextNo == 12){//Tavern1
			Text1 = "TavernText1";//Topic1
			Text2 = "";
		}
		if(TextNo == 13){//Tavern2
			Text1 = "TavernTopic2";//Topic2
			Text2 = "";
		}
		
		if(TextNo == 14){//Topic1
			Text1 = "Topic1 Text2";
			Text2 = "";
		}
		if(TextNo == 15){//Topic1
			Text1 = "Topic1 Text3";
			Text2 = "";
		}
		if(TextNo == 16){//BattleTest
			Text1 = "Battle Text1";
			Text2 = "";
		}
		if(TextNo == 17){//BattleTest
			Text1 = "Battle Text2!!";
			Text2 = "";
		}
		if(TextNo == 18){//RecipeTest
			Text1 = "Recipe Text1";
			Text2 = "";
		}
		if(TextNo == 19){//NoteTest
			Text1 = "Note Text1";
			Text2 = "";
		}
		if(TextNo == 20){//ItemTest
			Text1 = "Item Text1";
			Text2 = "";
		}
		if(TextNo == 21){//AreaTest
			Text1 = "Area Text1";
			Text2 = "Found TestArea3!";
		}
		if(TextNo == 22){//Cooking Failed
			Text1 = "Cook: It Didn't Work,";
			Text2 = "Sorry";
		}
		if(TextNo == 23){//Cooking Success TestFood
			Text1 = "Cook: Here you go!";
			Text2 = "Obtained TestItem3.";
		}
		if(TextNo == 24){//Cooking Success Bomb
			Text1 = "Cook: How Strange!";
			Text2 = "Obtained a bomb???";
		}
		if(TextNo == 25){//AreaTest
			Text1 = "The KeyItem!";
			Text2 = "Unlocked TestArea4";
		}
		if(TextNo == 26){//TestBoss Defeated
			Text1 = "Boss Defeated";
			Text2 = "";
		}
		if(TextNo == 27){//TestBoss Defeated
			Text1 = "Obtained a";
			Text2 = "Key Item";
		}
		if(TextNo == 28){//TestBoss Defeated
			Text1 = "Unlocked TestBoss";
			Text2 = "Inventor Battle";
		}
		if(TextNo == 29){//TestBoss Found
			Text1 = "Found TestBoss";
			Text2 = "";
		}
		if(TextNo == 30){//TestBoss Found
			Text1 = "Battle Start!";
			Text2 = "";
		}
		if(TextNo == 31){//Cooked Some Bread
			Text1 = "CooK: Here you go!";
			Text2 = "";
		}
		if(TextNo == 32){//Cooked Some Bread
			Text1 = "Got Fresh Bread";
			Text2 = "";
		}
		
		if(TextNo == 40){//Test Cutscene Entering Feild Area
			Text1 = "IT'S ON FIRE!";
			Text2 = "";
		}
		if(TextNo == 41){//Test Cutscene Entering Field Area
			Text1 = "...";
			Text2 = "Wait a second";
		}
		if(TextNo == 42){//Test Cutscene Entering Field Area
			Text1 = "It isn't moving?";
			Text2 = "Wierd";
		}
		
		if(TextNo == 43){//Test Summoning an Enemy
			Text1 = "Dummy summoned";
			Text2 = "another monster!";
		}
		
		if(TextNo == 44){//Test Other Battle Events
			Text1 = "Dummy attacked!";
			Text2 = "";
		}
		if(TextNo == 45){//Test Other Battle Events
			Text1 = "Dummy used";
			Text2 = "a special attack!";
		}
		if(TextNo == 46){//Test Other Battle Events
			Text1 = "Dummy tackled";
			Text2 = "with critical force!";
		}
		
		if(TextNo == 47){//Test SnowStorm
			Text1 = "You took damage";
			Text2 = "from the storm!";
		}
		if(TextNo == 48){//Test SnowStorm
			Text1 = "The snowstorm rages";
			Text2 = "with critical force!";
		}
		if(TextNo == 49){//Test Snowstorm
			Text1 = "The snowstorm";
			Text2 = "continues...";
		}
	
		if(TextNo == 50){//Test Status
			Text1 = "You became";
			Text2 = "Poisoned!";
		}
		if(TextNo == 51){//Test Status??
			Text1 = "Nothing Happened?";
			Text2 = "";
		}
		if(TextNo == 51){//Find TestArea2
			Text1 = "It looks like...";
			Text2 = "another place";
		}
		
		if(TextNo == 51){//Find TestArea2
			Text1 = "It looks like...";
			Text2 = "another place";
		}
		
		if(TextNo == 52){// /Hint Potions
			Text1 = "I should gather";
			Text2 = "some potions...";
		}		   //How Long Can This Text Reall       <- Max Text Length
		
		if(TextNo == 53){// /Hint Potions
			Text1 = "Maybe slimes in the feild";
			Text2 = "area will have some...";
		}		   //How Long Can This Text Reall     
		
		//Welcome to the Town
		if(TextNo == 54){// Meeting the Elder for the first time
			Text1 = "Elder: Ah, welcome!";
			Text2 = "Have you come to help us?";
		}		   //How Long Can This Text Reall   
		
		if(TextNo == 55){// Meeting the Elder for the first time
			Text1 = "Yes, I took the job.";
			Text2 = "I also got the letter.";
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 56){// Meeting the Elder for the first time
			Text1 = "Monster troubles...";
			Text2 = "Is it a dragon?";
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 57){// Meeting the Elder for the first time
			Text1 = "Elder: D... Dragon?";
			Text2 = "No no, nothing like that.";
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 58){// Meeting the Elder for the first time
			Text1 = "Elder: Monsters have been";
			Text2 = "attacking more than usual.";
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 59){// Meeting the Elder for the first time
			Text1 = "Elder: We need you to find";
			Text2 = "out why. Can you help us?";
		}		   //How Long Can This Text Reall  
		
//		if(TextNo == 60){// Meeting the Elder for the first time
//			Text1 = "Elder: We need you to find";
//			Text2 = "out why. Can you help us?";
//		}		   //How Long Can This Text Reall  
		
		if(TextNo == 61){// Meeting the Elder for the first time
			Text1 = "I can, but I need to know.";
			Text2 = "Where do I start?";
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 62){// Meeting the Elder for the first time
			Text1 = "Elder: The field up north.";
			Text2 = "That's where they attack.";
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 63){// Meeting the Elder for the first time
			Text1 = "Elder: This town has a few";
			Text2 = "places that may help you.";
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 64){// Meeting the Elder for the first time
			Text1 = "Elder: The Market, where";
			Text2 = "where they sell many things.";
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 65){// Meeting the Elder for the first time
			Text1 = "Elder: The Weaponsmith";
			Text2 = "who can make you weapons.";
		}		   //How Long Can This Text Reall 
		
		if(TextNo == 66){// Meeting the Elder for the first time
			Text1 = "Elder: The Armorsmith";
			Text2 = "who may make you armor.";
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 67){// Meeting the Elder for the first time
			Text1 = "Elder: The cook, who cooks";
			Text2 = "adventurers' ingredients."; //Who cooks adventurers food?
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 68){// Meeting the Elder for the first time
			Text1 = "Elder: And, a local Tavern";
			Text2 = "You may hear some rumors."; 
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 69){// Field Area, An investigation begins!
			Text1 = "So this is the feild.";
			Text2 = "It seems very large."; 
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 70){// Field Area, An investigation begins!
			Text1 = "I need to check it in parts.";
			Text2 = "I guess I'll call this..."; 
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 71){// Field Area, An investigation begins!
			Text1 = "Feild Area 1";
			Text2 = "That sounds right."; 
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 72){// Being attacked! A slime
			Text1 = "...!";
			Text2 = ""; 
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 73){// The First Slime, a mighty foe?
			Text1 = "That was fast!";
			Text2 = ""; 
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 74){// The First Slime, a mighty foe?
			Text1 = "Maybe a little too fast.";
			Text2 = "I wonder how many are here?"; 
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 75){// The Second Slime, A potion appears!
			Text1 = "A potion. Maybe from a";
			Text2 = "merchant? "; 
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 76){// The Second Slime, A potion appears!
			Text1 = "Could that be why they";
			Text2 = "have been attacking?"; 
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 77){// The Third Slime, A sword recipe
			Text1 = "Hm? A paper.";
			Text2 = "Looks like sword plans?"; 
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 78){// The Third Slime, A sword recipe
			Text1 = "I could use a weapon.";
			Text2 = "Now I just need metal..."; 
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 102){// The Third Slime, A sword recipe
			Text1 = "Metal could be hard to find";
			Text2 = "at least around here"; 
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 79){// The Forth Slime, Metal
			Text1 = "Aha! Some metal!";
			Text2 = "Just what I needed."; //I can use this...
		}		   //How Long Can This Text Reall 
		
		if(TextNo == 80){// The Forth Slime, Metal
			Text1 = "More things from merchants.";
			Text2 = "How long has this gone on?"; 
		}		   //How Long Can This Text Reall 
		
		if(TextNo == 103){// The Third Slime, A sword recipe
			Text1 = "And why metal?";
			Text2 = "Something weird is going on."; 
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 81){// The Fifth Slime
			Text1 = "How many of these are there?";
			Text2 = "Fighting them isn't working."; 
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 82){// The Fifth Slime
			Text1 = "I better search some more.";
			Text2 = "The answer should be close."; 
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 104){// The Fifth Slime I had to add more
			Text1 = "Something is leading them";
			Text2 = "I wonder...."; 
		}		   //How Long Can This Text Reall  
		
		if(TextNo == 83){// The Giant Slime
			Text1 = "Is this the slime's boss?";
			Text2 = "IT'S HUGE!"; 
		}		   //How Long Can This Text Reall 
		
		if(TextNo == 84){// The Giant Slime Defeated
			Text1 = "It's defeated, but...";
			Text2 = "Is that really the cause?"; 
		}		   //How Long Can This Text Reall 
		
		if(TextNo == 85){// The Giant Slime Defeated
			Text1 = "I need to tell the elder.";
			Text2 = "Something doesn't seem right"; 
		}		   //How Long Can This Text Reall
		
		if(TextNo == 86){// The Elder: After Giant Slime
			Text1 = "I defeated a giant slime.";
			Text2 = "Though, I bet there's more."; 
		}		   //How Long Can This Text Reall
		
		if(TextNo == 87){// The Elder: After Giant Slime
			Text1 = "Elder: Your right I'm";
			Text2 = "afraid. there's ghosts too"; 
		}		   //How Long Can This Text Real
		
		if(TextNo == 88){// The Elder: After Giant Slime
			Text1 = "Elder: And golems, someone";
			Text2 = "saw a suit of armor too..."; 
		}		   //How Long Can This Text Real
		
		if(TextNo == 89){// The Elder: After Giant Slime
			Text1 = "Sounds like a lot!";
			Text2 = "I better get started then!"; 
		}		   //How Long Can This Text Real
		
		if(TextNo == 90){// The Elder: After Giant Slime
			Text1 = "End of the Demo";
			Text2 = "Thanks for playing!"; 
		}		   //How Long Can This Text Real
		
		if(TextNo == 91){//
			Text1 = "";
			Text2 = "";
			HText1 = "This is a text template";
			HText2 = "for copy pasting";
			        //How Long Can This Text Real ly be? Apparently not THIS long....
		}
		if(TextNo == 91){//
			Text1 = "";
			Text2 = "";
			HText1 = "";
			HText2 = "";
			        //How Long Can This Text Real
		}
		
		if(TextNo == 92){// Secret Boss
			Text1 = "It's a golem...";
			Text2 = "Made of Pancakes?";
			HText1 = "";
			HText2 = "";
			        //How Long Can This Text Real
		}
		
		if(TextNo == 93){// Ending 1
			Text1 = "Is that it?";
			Text2 = "";
			HText1 = "";
			HText2 = "";
			        //How Long Can This Text Real
		}
		if(TextNo == 94){// Ending 1
			Text1 = "I defeated it?";
			Text2 = "";
			HText1 = "";
			HText2 = "";
			        //How Long Can This Text Real
		}
		if(TextNo == 95){// Ending 1
			Text1 = "I can't believe it!";
			Text2 = "I did it!";
			HText1 = "";
			HText2 = "";
			        //How Long Can This Text Real
		}
		if(TextNo == 96){// Ending 1
			Text1 = "That can't be it can it?";
			Text2 = "";
			HText1 = "";
			HText2 = "";
			        //How Long Can This Text Real
		}
		if(TextNo == 97){// Ending 1
			Text1 = "I should get going then.";
			Text2 = "I have to find that dragon.";
			HText1 = "";
			HText2 = "";
			        //How Long Can This Text Real
		}
		
		if(TextNo == 98){// Final Boss
			Text1 = "This is the source of";
			Text2 = "all the monsters?";
			HText1 = "";
			HText2 = "";
			        //How Long Can This Text Real
		}
		if(TextNo == 99){// Final Boss
			Text1 = "A... weapon?";
			Text2 = "Some kind of cursed weapon?";
			HText1 = "";
			HText2 = "";
			        //How Long Can This Text Real
		}
		if(TextNo == 100){// Coded Edge
			Text1 = "\"It glows with a powerful                            This is something you will not see"; //But apparently someone is now.
			Text2 = "light\"";
			HText1 = "";
			HText2 = "";
			        //How Long Can This Text Real
		}
		
		if(TextNo == 101){//
			Text1 = "                                             T s  S  c e ";
			Text2 = "";
			HText1 = "e t  e r t";
			HText2 = "";
			        //How Long Can This Text Real
		}
		
		//104 newest
		
		if(TextNo == 105){//Cooked Some Food 2
			Text1 = "Cook: It turned out good~!";
			Text2 = "";
			HText1 = "";
			HText2 = "";
			//       How Long Can This Text Real
		}
		
//		if(TextNo == ??){//
//			Text1 = "";
//			Text2 = "";
//			HText1 = "";
//			HText2 = "";
//			        //How Long Can This Text Real
//		}
		
		
		TalkText[0] = Text1;
		TalkText[1] = Text2;
		TalkText[2] = HText1;
		TalkText[3] = HText2;
		return TalkText;
	}
}
