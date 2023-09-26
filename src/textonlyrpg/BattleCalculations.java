package textonlyrpg;

public class BattleCalculations {
	//public int[] Atk;
	//public int[] Def;
	//public int[] Dmg;
	
	public static int[] CalculateDmg(int Atk1, int Atk2, int Atk3, int Atk4, int AtkType, int AtkElement, int Def1, int Def2, int Def3, int Def4, double[] Weakness, int[] WeaknessType, int CriticalMode){//
		int[] Dmg = new int[4];{
			Dmg[0] = 0;
			Dmg[1] = 0;
			Dmg[2] = 0;
			Dmg[3] = 0;
		}
		int[] XAtk = new int[4];{//NewAtk?
			XAtk[0] = 0;
			XAtk[1] = 0;
			XAtk[2] = 0;
			XAtk[3] = 0;
		}
		
		int XAttack = (Atk1*1000) + (Atk2*100) + (Atk3*10) + (Atk4);
		if(CriticalMode == 1){
			XAttack *= 2;
		}
		
		if((WeaknessType[AtkElement] == 0 || WeaknessType[AtkElement] == 3)  && WeaknessType[AtkType] != 1 && AtkElement != 0){//Multiply like Normal
			XAttack *= Weakness[AtkElement];
		}
		else if(WeaknessType[AtkElement] == 5 && WeaknessType[AtkType] != 1 && AtkElement != 0){//Add Bonus
			XAttack += Weakness[AtkElement];
		}

		//Calculate Weakness
		if(((WeaknessType[AtkType] == 0 || WeaknessType[AtkType] == 3) && WeaknessType[AtkElement] != 2  && AtkElement != 0) || ((WeaknessType[AtkType] == 0 || WeaknessType[AtkType] == 3) && AtkElement == 0)){//Multiply like Normal
			XAttack *= Weakness[AtkType];
		}//Multiply like Normal End
		else if((WeaknessType[AtkType] == 5 && WeaknessType[AtkElement] != 2 && AtkElement != 0) || (WeaknessType[AtkType] == 5 && AtkElement == 0)){//Add Bonus
			XAttack += Weakness[AtkType];
		}//Add Bonus End
		
		else if(WeaknessType[AtkElement] == 2 && WeaknessType[AtkType] == 1 && AtkElement != 0){//???  Elemental Only, Physical Only
			XAttack *= Weakness[AtkElement];
			XAttack *= Weakness[AtkType];
		}
		else if(WeaknessType[AtkElement] == 1 && WeaknessType[AtkType] == 2 && AtkElement != 0){//??? Physical Only, Elemental Only
			XAttack = 0;//Null Attack?
		}
		
		//Deflect, not Absorb
		if(((WeaknessType[AtkElement] == 6 || WeaknessType[AtkType] == 6) && WeaknessType[AtkElement] != 3 && WeaknessType[AtkType] != 3 && AtkElement != 0) || (WeaknessType[AtkType] == 6 && AtkElement == 0)){
			XAttack = 0;
		}
		
		if(XAttack >= 1000){
			XAtk[0] = XAttack/1000;
			XAttack = XAttack%1000;
		}
		if(XAttack >= 100){
			XAtk[1] = XAttack/100;
			XAttack = XAttack%100;
		}
		if(XAttack >= 10){
			XAtk[2] = XAttack/10;
			XAttack = XAttack%10;
		}
		XAtk[3] = XAttack;

		Atk1 = XAtk[0];
		Atk2 = XAtk[1];
		Atk3 = XAtk[2];
		Atk4 = XAtk[3];
		
		//if(WeaknessType[AtkType] == 1){//Physical Only
			//
		//}
		//if(WeaknessType[AtkType] == 2){//Elemental Only
			//
		//}
		//if(WeaknessType[AtkType] == 3){//Absorb
			//
		//}
		//if(WeaknessType[AtkType] == 4){//Pierce!
			//Takes all Attack as damage, avoiding defense!
		//}
//		if(WeaknessType[AtkType] == 5){//Add?
//			XAtk[0] += Weakness[AtkType]/1000
//			XAtk[1] += (Weakness[AtkType]%1000)/100;
//			XAtk[2] += ((Weakness[AtkType]%1000)%100)/10;
//			XAtk[3] += (((Weakness[AtkType]%1000)%100)%10);
//		}

		//Pierce or Absorb
		if(WeaknessType[AtkType] == 3 || WeaknessType[AtkType] == 4 || WeaknessType[AtkElement] == 3 || WeaknessType[AtkElement] == 4){
			Dmg[3] = Atk4;
			Dmg[2] = Atk3;
			Dmg[1] = Atk2;
			Dmg[0] = Atk1;
		}
		else{//Normal Defense Calculate
			if(Atk4 >= Def4){
				Dmg[3] = Atk4 - Def4;
			}
			else if(Atk4 < Def4 && (Atk3 != 0)){//?    Atk4 = 10 Def4 = 25
				//int Def4X = Def4/10 - Atk4/10;//Used if Def4 is greater than 10.
				Dmg[3] = (10 + Atk4) - Def4;	// Dmg4 = (Atk3X10 + Atk4) - Def4
				Dmg[2] = Dmg[2] - 1;			//Dmg3 = Dmg3 - ((Atk3X10 + Atk4) - Def4)/10
			}
			else if(Atk4 < Def4 && (Atk3 == 0)){//? Atk 2, Atk1
				Dmg[3] = 0;
			}
		
			if(Atk3 >= Def3){
				Dmg[2] = Dmg[2] + Atk3 - Def3;
			}
			else if(Atk3 < Def3 && (Atk2 != 0)){//Atk3 = 10 Def3 = 25
				Dmg[2] = Dmg[2] + (10 + Atk3) - Def3;
				Dmg[1] = Dmg[1] + 1;
			}
			else if(Atk3 < Def3 && (Atk2 == 0)){//? Atk1
				Dmg[2] = 0;
			}
		
			if(Atk2 >= Def2){
				Dmg[1] = Dmg[1] + Atk2 - Def2;
			}
			else if(Atk2 < Def2 && (Atk1 != 0)){//Atk2 = 10 Def2 = 25
				Dmg[1] = Dmg[1] + (10 + Atk2) - Def2;
				Dmg[0] = Dmg[0] + 1;
			}
			else if(Atk2 < Def2 && (Atk1 == 0)){
				Dmg[1] = 0;
			}
		
			if(Atk1 >= Def1){
				Dmg[0] = Dmg[0] + Atk1 - Def1;
			}
			else if(Atk1 < Def1){
				Dmg[0] = 0;
			}
		
		}//If Normal Defense Calculation
		
		//Calculate Damage Theory Regular HP
		//HP1 HP2 HP3 HP4
		//Atk1 Atk2 Atk3 Atk4
		//Def1 Def2 Def3 Def4
		
		return Dmg;
	}//Calculate Damage End
	
	public static int[] CalculateNORMALDmg(int Atk1, int Atk2, int Atk3, int Atk4, int AtkType, int AtkElement, int Def1, int Def2, int Def3, int Def4, double[] Weakness, int[] WeaknessType){
		int[] Dmg = new int[4];{
			Dmg[0] = 0;
			Dmg[1] = 0;
			Dmg[2] = 0;
			Dmg[3] = 0;
		}
		
		int[] XAtk = new int[4];{//NewAtk?
			XAtk[0] = Atk1;
			XAtk[1] = Atk2;
			XAtk[2] = Atk3;
			XAtk[3] = Atk4;
		}
		
		XAtk[0] *= Weakness[AtkType];
		XAtk[1] *= Weakness[AtkType];
		XAtk[2] *= Weakness[AtkType];
		XAtk[3] *= Weakness[AtkType];
		//int XAtk1;
		int XAtk2;
		int XAtk3;
		int XAtk4;
		if(XAtk[3] >= 10){
			XAtk4 = XAtk[3]/10;
			XAtk[3] -= XAtk4 *10;
			XAtk[2] += XAtk4;
		}
		if(XAtk[2] >= 10){
			XAtk3 = XAtk[2]/10;
			XAtk[2] -= XAtk3 *10;
			XAtk[1] += XAtk3;
		}
		if(XAtk[1] >= 10){
			XAtk2 = XAtk[1]/10;
			XAtk[1] -= XAtk2 *10;
			XAtk[0] += XAtk2;
		}
		
		Atk1 = XAtk[0];
		Atk2 = XAtk[1];
		Atk3 = XAtk[2];
		Atk4 = XAtk[3];
		
		if(Atk4 >= Def4){
			Dmg[3] = Atk4 - Def4;
		}
		else if(Atk4 < Def4 && (Atk3 != 0)){//?    Atk4 = 10 Def4 = 25 Negative
			Dmg[3] = (10 + Atk4) - Def4;
			Dmg[2] = Dmg[2] - 1;
		}
		else if(Atk4 < Def4 && (Atk3 == 0)){//?
			Dmg[3] = 0;
		}
		
		if(Atk3 >= Def3){
			Dmg[2] = Dmg[2] + Atk3 - Def3;
		}
		else if(Atk3 < Def3 && (Atk2 != 0)){
			Dmg[2] = Dmg[2] + (10 + Atk3) - Def3;
			Dmg[1] = Dmg[1] + 1;
		}
		else if(Atk3 < Def3 && (Atk2 == 0)){
			Dmg[2] = 0;
		}
		
		if(Atk2 >= Def2){
			Dmg[1] = Dmg[1] + Atk2 - Def2;
		}
		else if(Atk2 < Def2 && (Atk1 != 0)){
			Dmg[1] = Dmg[1] + (10 + Atk2) - Def2;
			Dmg[0] = Dmg[0] + 1;
		}
		else if(Atk2 < Def2 && (Atk1 == 0)){
			Dmg[1] = 0;
		}
		
		if(Atk1 >= Def1){
			Dmg[0] = Dmg[0] + Atk1 - Def1;
		}
		else if(Atk1 < Def1){
			Dmg[0] = 0;
		}
		
		//Calculate Damage Theory Regular HP
		//HP1 HP2 HP3 HP4
		//Atk1 Atk2 Atk3 Atk4
		//Def1 Def2 Def3 Def4
		
		return Dmg;
	}//Calculate NORMAL Damage End
	
	public static int[] CalculatePlayerDmg(int Atk1, int Atk2, int Atk3, int Atk4, int AtkType, int AtkElement, int Def1, int Def2, int Def3, int Def4, 
			Items currentHood, Items currentHelmet, Items currentRobe, Items currentArmor, Items CurrentShirt, Items currentGauntlets, Items currentGloves, Items currentPants, Items currentSocks, Items currentBoots, int CriticalMode, double[] PlayerWeaknesses){//
		int[] Dmg = new int[4];{
			Dmg[0] = 0;
			Dmg[1] = 0;
			Dmg[2] = 0;
			Dmg[3] = 0;
		}
		int[] XAtk = new int[4];{//NewAtk?
			XAtk[0] = 0;
			XAtk[1] = 0;
			XAtk[2] = 0;
			XAtk[3] = 0;
		}
		
		//Calculate Defence with Armor ArmorDef
		int HoodDef = (currentHood.MDmg1*1000 + currentHood.MDmg2*100 + currentHood.MDmg3*10 + currentHood.MDmg4);
		int HelmetDef = (currentHelmet.MDmg1*1000 + currentHelmet.MDmg2*100 + currentHelmet.MDmg3*10 + currentHelmet.MDmg4);
		int RobeDef = (currentRobe.MDmg1*1000 + currentRobe.MDmg2*100 + currentRobe.MDmg3*10 + currentRobe.MDmg4);
		int ArmorDef = (currentArmor.MDmg1*1000 + currentArmor.MDmg2*100 + currentArmor.MDmg3*10 + currentArmor.MDmg4);
		int ShirtDef = (CurrentShirt.MDmg1*1000 + CurrentShirt.MDmg2*100 + CurrentShirt.MDmg3*10 + CurrentShirt.MDmg4);
		int GuantletDef = (currentGauntlets.MDmg1*1000 + currentGauntlets.MDmg2*100 + currentGauntlets.MDmg3*10 + currentGauntlets.MDmg4);
		int GloveDef = (currentGloves.MDmg1*1000 + currentGloves.MDmg2*100 + currentGloves.MDmg3*10 + currentGloves.MDmg4);
		int PantsDef = (currentPants.MDmg1*1000 + currentPants.MDmg2*100 + currentPants.MDmg3*10 + currentPants.MDmg4);
		int SocksDef = (currentSocks.MDmg1*1000 + currentSocks.MDmg2*100 + currentSocks.MDmg3*10 + currentSocks.MDmg4);
		int BootsDef = (currentBoots.MDmg1*1000 + currentBoots.MDmg2*100 + currentBoots.MDmg3*10 + currentBoots.MDmg4);
		
		//double[] PlayerWeaknesses = {};
		
		
		
		int PlayerDef = Def1*1000 + Def2*100 + Def3*10 + Def4;
		PlayerDef -= (HoodDef + HelmetDef + RobeDef + ArmorDef + ShirtDef + GuantletDef + GloveDef + PantsDef+ SocksDef + BootsDef);
		
		if(PlayerDef > 1000){
			Def1 = PlayerDef/1000;
			PlayerDef = PlayerDef%1000;
		}
		if(PlayerDef > 100){
			Def2 = PlayerDef/100;
			PlayerDef = PlayerDef%100;
		}
		if(PlayerDef > 10){
			Def3 = PlayerDef/10;
			PlayerDef = PlayerDef%10;
		}
		Def4 = PlayerDef;
		
////		//Calculate Weakness
////		if(WeaknessType[AtkType] == 0){//Multiply
			int XAttack = (Atk1*1000) + (Atk2*100) + (Atk3*10) + (Atk4);
			XAttack *= PlayerWeaknesses[AtkType];
			System.out.println("Player Resistance is..." + PlayerWeaknesses[AtkType]);
			System.out.println("Current ENEMY aTTACK tYPE IS " + AtkType);
			if(AtkElement != 0){
				XAttack *= PlayerWeaknesses[AtkElement];
			}
					
			if(CriticalMode == 1){
				XAttack = XAttack*2;
			}
			//XAttack *= Weakness[AtkType];
			if(XAttack > 1000){
				XAtk[0] = XAttack/1000;
				XAttack = XAttack%1000;
			}
			if(XAttack > 100){
				XAtk[1] = XAttack/100;
				XAttack = XAttack%100;
			}
			if(XAttack > 10){
				XAtk[2] = XAttack/10;
				XAttack = XAttack%10;
			}
			XAtk[3] = XAttack;

			Atk1 = XAtk[0];
			Atk2 = XAtk[1];
			Atk3 = XAtk[2];
			Atk4 = XAtk[3];
////		}
////		if(WeaknessType[AtkType] == 1){//Add
////			XAtk[0] += Weakness[AtkType]/1000;
////			XAtk[1] += (Weakness[AtkType]%1000)/100;
////			XAtk[2] += ((Weakness[AtkType]%1000)%100)/10;
////			XAtk[3] += (((Weakness[AtkType]%1000)%100)%10);
////		}
//		//if(WeaknessType[AtkType] == 2){//Pierce!
//			//Takes all Attack as damage, avoiding defense!
//		//}
		
		if(Atk4 >= Def4){
			Dmg[3] = Atk4 - Def4;
		}
		else if(Atk4 < Def4 && (Atk3 != 0)){//?    Atk4 = 10 Def4 = 25
			//int Def4X = Def4/10 - Atk4/10;//Used if Def4 is greater than 10.
			Dmg[3] = (10 + Atk4) - Def4;	// Dmg4 = (Atk3X10 + Atk4) - Def4
			Dmg[2] = Dmg[2] - 1;			//Dmg3 = Dmg3 - ((Atk3X10 + Atk4) - Def4)/10
		}
		else if(Atk4 < Def4 && (Atk3 == 0)){//? Atk 2, Atk1
			Dmg[3] = 0;
		}
		
		if(Atk3 >= Def3){
			Dmg[2] = Dmg[2] + Atk3 - Def3;
		}
		else if(Atk3 < Def3 && (Atk2 != 0)){//Atk3 = 10 Def3 = 25
			Dmg[2] = Dmg[2] + (10 + Atk3) - Def3;
			Dmg[1] = Dmg[1] + 1;
		}
		else if(Atk3 < Def3 && (Atk2 == 0)){//? Atk1
			Dmg[2] = 0;
		}
		
		if(Atk2 >= Def2){
			Dmg[1] = Dmg[1] + Atk2 - Def2;
		}
		else if(Atk2 < Def2 && (Atk1 != 0)){//Atk2 = 10 Def2 = 25
			Dmg[1] = Dmg[1] + (10 + Atk2) - Def2;
			Dmg[0] = Dmg[0] + 1;
		}
		else if(Atk2 < Def2 && (Atk1 == 0)){
			Dmg[1] = 0;
		}
		
		if(Atk1 >= Def1){
			Dmg[0] = Dmg[0] + Atk1 - Def1;
		}
		else if(Atk1 < Def1){
			Dmg[0] = 0;
		}
		
		
		//Calculate Damage Theory Regular HP
		//HP1 HP2 HP3 HP4
		//Atk1 Atk2 Atk3 Atk4
		//Def1 Def2 Def3 Def4
		
		return Dmg;
	}//Calculate Player Damage End
	
	public static int[] CalculateHp(int Hp1, int Hp2, int Hp3, int Hp4, int Dmg1, int Dmg2, int Dmg3, int Dmg4){
		int[] Hp = new int[4];{
			Hp[0] = 0;
			Hp[1] = 0;
			Hp[2] = 0;
			Hp[3] = 0;
		}
		
		if(Hp4 >= Dmg4){
			Hp4 = Hp4 - Dmg4;
		}
		else if(Hp4 < Dmg4 && (Hp3 != 0 || Hp2 != 0 || Hp1 != 0)){
			Hp4 = (10 + Hp4) - Dmg4;
			Dmg3 = Dmg3 + 1;
		}
		else if(Hp4 < Dmg4 && (Hp3 == 0 && Hp2 == 0 && Hp1 == 0)){//?
			Hp4 = 0;
		}
		
		if(Hp4 > 9){
			int HPOVER = Hp4/10;
			Hp3 += HPOVER;
			Hp4 -= HPOVER*10;
		}
		
		if(Hp3 >= Dmg3){
		Hp3 = Hp3 - Dmg3;
		}
		else if(Hp3 < Dmg3 && (Hp2 != 0 || Hp1 != 0)){
			Hp3 = (10 + Hp3) - Dmg3;
			Dmg2 = Dmg2 + 1;
		}
		else if(Hp3 < Dmg3 && (Hp2 == 0 && Hp1 == 0)){
			Hp3 = 0;
			Hp4 = 0;
		}
		
		if(Hp3 > 9){
			int HPOVER = Hp3/10;
			Hp2 += HPOVER;
			Hp3 -= HPOVER*10;
		}
		
		if(Hp2 >= Dmg2){
			Hp2 = Hp2 - Dmg2;
		}
		else if(Hp2 < Dmg2 && (Hp1 != 0)){
			Hp2 = (10 + Hp2) - Dmg2;
			Dmg1 = Dmg1 + 1;
		}
		else if(Hp2 < Dmg2 && (Hp1 == 0)){
			Hp2 = 0;
			Hp3 = 0;
			Hp4 = 0;
		}
		
		if(Hp2 > 9){
			int HPOVER = Hp2/10;
			Hp1 += HPOVER;
			Hp2 -= HPOVER*10;
		}
		
		if(Hp1 >= Dmg1){
			Hp1 = Hp1 - Dmg1;
		}
		else if(Hp1 < Dmg1){
			Hp1 = 0;
			Hp2 = 0;
			Hp3 = 0;
			Hp4 = 0;
		}
		
		Hp[0] = Hp1;
		Hp[1] = Hp2;
		Hp[2] = Hp3;
		Hp[3] = Hp4;
		
		return Hp;
	}
	
	public static int[] CalculateGlitchedHp(int Hp1, int Hp2, int Hp3, int Hp4, int Dmg1, int Dmg2, int Dmg3, int Dmg4, int DigetMAX){
		int[] Hp = new int[4];{
			Hp[0] = 0;
			Hp[1] = 0;
			Hp[2] = 0;
			Hp[3] = 0;
		}
		
		//int remainder;
		int Multiplier = 1;
		
		System.out.println("HP1 " + Hp1);
		System.out.println("HP2 " + Hp2);
		System.out.println("HP3 " + Hp3);
		System.out.println("HP4 " + Hp4);
		
		if(Hp4 >= Dmg4){//okay
			Hp4 = Hp4 - Dmg4;
		}
		else if(Hp4 < Dmg4 && (Hp3 != 0 || Hp2 != 0 || Hp1 != 0)){
			if(Dmg4 > (DigetMAX + 1)){//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX Normal HP...
				Multiplier = Dmg4/(DigetMAX + 1);
			}
			else
				Multiplier = 1;
			Hp4 = (Multiplier*(DigetMAX + 1) + Hp4) - Dmg4;
			Dmg3 = Dmg3 + Multiplier;
		}
		else if(Hp4 < Dmg4 && (Hp3 == 0 && Hp2 == 0 && Hp1 == 0)){//?
			Hp4 = 0;
		}
		
		if(Hp4 > DigetMAX){
			int HPOVER = Hp4/(DigetMAX + 1);
			Hp3 += HPOVER;
			Hp4 -= HPOVER*(DigetMAX + 1);
		}
		//System.out.println("HP4 " + Hp4);
		
		if(Hp3 >= Dmg3){
			Hp3 = Hp3 - Dmg3;
		}
		else if(Hp3 < Dmg3 && (Hp2 != 0 || Hp1 != 0)){
			if(Dmg3 > (DigetMAX + 1)){
				Multiplier = Dmg3/(DigetMAX + 1);
			}
			else
				Multiplier = 1;
			Hp3 = (Multiplier*(DigetMAX + 1) + Hp3) - Dmg3;
			Dmg2 = Dmg2 + Multiplier;
		}
		else if(Hp3 < Dmg3 && (Hp2 == 0 && Hp1 == 0)){
			Hp3 = 0;
			Hp4 = 0;
		}
		
		if(Hp3 > DigetMAX){
			int HPOVER = Hp3/(DigetMAX + 1);
			Hp2 += HPOVER;
			Hp3 -= HPOVER*(DigetMAX + 1);
		}
		//System.out.println("HP3 " + Hp3);
		
		if(Hp2 >= Dmg2){
			Hp2 = Hp2 - Dmg2;
		}
		else if(Hp2 < Dmg2 && (Hp1 != 0)){
			if(Dmg2 > (DigetMAX + 1)){
				Multiplier = Dmg2/(DigetMAX + 1);
			}
			else
				Multiplier = 1;
			Hp2 = (Multiplier*(DigetMAX + 1) + Hp2) - Dmg2;
			Dmg1 = Dmg1 + Multiplier;
		}
		else if(Hp2 < Dmg2 && (Hp1 == 0)){
			Hp2 = 0;
			Hp3 = 0;
			Hp4 = 0;
		}
		
		if(Hp2 > DigetMAX){
			int HPOVER = Hp2/(DigetMAX + 1);
			Hp1 += HPOVER;
			Hp2 -= HPOVER*(DigetMAX + 1);
		}
		//System.out.println("HP2 " + Hp2);
		
		if(Hp1 >= Dmg1){
			Hp1 = Hp1 - Dmg1;
		}
		else if(Hp1 < Dmg1){
			Hp1 = 0;
			Hp2 = 0;
			Hp3 = 0;
			Hp4 = 0;
		}
		//System.out.println("HP1 " + Hp1);
		
		Hp[0] = Hp1;
		Hp[1] = Hp2;
		Hp[2] = Hp3;
		Hp[3] = Hp4;
		
		return Hp;
	}
	
	//Negative Damage
	public static int[] RecoverHp(int Hp1, int Hp2, int Hp3, int Hp4, int Hp1Max, int Hp2Max, int Hp3Max, int Hp4Max, int Dmg1, int Dmg2, int Dmg3, int Dmg4){
		int[] Hp = new int[4];{
			Hp[0] = 0;
			Hp[1] = 0;
			Hp[2] = 0;
			Hp[3] = 0;
		}
		//Calculate Recover Theory Regular HP
		//HP1 HP2 HP3 HP4
		//Atk1 Atk2 Atk3 Atk4
		//Def1 Def2 Def3 Def4
		
		if(Hp3 == Hp3Max && Hp2 == Hp2Max && Hp1 == Hp1Max){
			if((Hp4Max - Hp4) >= -Dmg4){ //HP Recover
				Hp4 = Hp4 - Dmg4;
				Dmg4 = 0;
			}
			else if((Hp4Max - Hp4) < -Dmg4 && (Hp3 == Hp3Max && Hp2 == Hp2Max && Hp1 == Hp1Max)){ //HP Max
				Hp4 = Hp4Max;
				Dmg4 = 0;
			}
			}
			if(Hp3Max != Hp3 || Hp2Max != Hp2 || Hp1Max != Hp1){//Still Has Damage
				Hp4 = Hp4 - Dmg4;
				if(Hp4 >= 10){
					Hp4 = Hp4 - 10;
					Dmg3 = Dmg3 - 1;
				}
				Dmg4 = 0;
			}
			System.out.println("HP4 " + Hp4);
			
			if(Hp2 == Hp2Max && Hp1 == Hp1Max){
				if((Hp3Max - Hp3) >= -Dmg3){ //HP Recover
					Hp3 = Hp3 - Dmg3;
					Dmg3 = 0;
				}
				else if((Hp3Max - Hp3) < -Dmg3 && (Hp2 == Hp2Max && Hp1 == Hp1Max)){ //HP Max
					Hp3 = Hp3Max;
					Dmg3 = 0;
				}
				}
				if(Hp2Max != Hp2 || Hp1Max != Hp1){//Still has Damage
					Hp3 = Hp3 - Dmg3;
					if(Hp3 >= 10){
						Hp3 = Hp3 - 10;
						Dmg2 = Dmg2 - 1;
					}
					Dmg3 = 0;
				}
				System.out.println("HP3 " + Hp3);
			
			if(Hp1 == Hp1Max){
				if((Hp2Max - Hp2) >= -Dmg2){ //HP Recover
					Hp2 = Hp2 - Dmg2;
					Dmg2 = 0;
				}
				else if((Hp2Max - Hp2) < -Dmg2 && (Hp1 == Hp1Max)){ //HP Max
					Hp2 = Hp2Max;
					Dmg2 = 0;
				}
				}
				if(Hp1Max != Hp1){//Still has Damage
					Hp2 = Hp2 - Dmg2;
					if(Hp2 >= 10){
						Hp2 = Hp2 - 10;
						Dmg1 = Dmg1 - 1;
					}
					Dmg2 = 0;
				}
				System.out.println("HP2 " + Hp2);//
			
			
			if((Hp1Max - Hp1) >= -Dmg1){ //HP Recover
				Hp1 = Hp1 - Dmg1;
				Dmg1 = 0;
				//If Negative HP, a toggle might be important?
			}
			else if((Hp1Max - Hp1) < -Dmg1){ //HP Max
				Hp1 = Hp1Max;
				Dmg1 = 0;
			}							
			
			Hp[0] = Hp1;
			Hp[1] = Hp2;
			Hp[2] = Hp3;
			Hp[3] = Hp4;
		
		return Hp;
	}//RecoverHP End
	
	//Negative Damage
	public static int[] RecoverGlitchedHp(int Hp1, int Hp2, int Hp3, int Hp4, int Hp1Max, int Hp2Max, int Hp3Max, int Hp4Max, int Dmg1, int Dmg2, int Dmg3, int Dmg4, int HPDigetMAX){
		int[] Hp = new int[4];{
			Hp[0] = 0;
			Hp[1] = 0;
			Hp[2] = 0;
			Hp[3] = 0;
		}
		//Calculate Recover Theory Regular HP
		//HP1 HP2 HP3 HP4
		//Atk1 Atk2 Atk3 Atk4
		//Def1 Def2 Def3 Def4
		int Multiplier = -1;
		
		if(Hp3 == Hp3Max && Hp2 == Hp2Max && Hp1 == Hp1Max){
			if((Hp4Max - Hp4) >= -Dmg4){ //HP Recover
				Hp4 = Hp4 - Dmg4;
				Dmg4 = 0;
			}
			else if((Hp4Max - Hp4) < -Dmg4 && (Hp3 == Hp3Max && Hp2 == Hp2Max && Hp1 == Hp1Max)){ //HP Max
				Hp4 = Hp4Max;
				Dmg4 = 0;
			}
			}
			if(Hp3Max != Hp3 || Hp2Max != Hp2 || Hp1Max != Hp1){//Still Has Damage
				Hp4 = Hp4 - Dmg4;
				if(Hp4 >= HPDigetMAX + 1){
					Multiplier = Dmg4/(HPDigetMAX + 1);
					if(-Dmg4 > (HPDigetMAX + 1)){
						Multiplier = Dmg4/(HPDigetMAX + 1);
					}
					else
						Multiplier = -1;
					Hp4 = Hp4 - (Multiplier*(HPDigetMAX + 1));
					Dmg3 = Dmg3 + Multiplier;
				}
				Dmg4 = 0;
			}
			System.out.println("HP4 " + Hp4);
			
			if(Hp2 == Hp2Max && Hp1 == Hp1Max){
				if((Hp3Max - Hp3) >= -Dmg3){ //HP Recover
					Hp3 = Hp3 - Dmg3;
					Dmg3 = 0;
				}
				else if((Hp3Max - Hp3) < -Dmg3 && (Hp2 == Hp2Max && Hp1 == Hp1Max)){ //HP Max
					Hp3 = Hp3Max;
					Dmg3 = 0;
				}
				}
				if(Hp2Max != Hp2 || Hp1Max != Hp1){//Still has Damage
					Hp3 = Hp3 - Dmg3;
					if(Hp3 >= HPDigetMAX + 1){
						Multiplier = Dmg3/(HPDigetMAX + 1);
						if(-Dmg3 > (HPDigetMAX + 1)){
							Multiplier = Dmg3/(HPDigetMAX + 1);
						}
						else
							Multiplier = -1;
						Hp3 = Hp3 - (Multiplier*(HPDigetMAX + 1));
						Dmg2 = Dmg2 + Multiplier;
					}
					Dmg3 = 0;
				}
				System.out.println("HP3 " + Hp3);
			
			if(Hp1 == Hp1Max){
				if((Hp2Max - Hp2) >= -Dmg2){ //HP Recover
					Hp2 = Hp2 - Dmg2;
					Dmg2 = 0;
				}
				else if((Hp2Max - Hp2) < -Dmg2 && (Hp1 == Hp1Max)){ //HP Max
					Hp2 = Hp2Max;
					Dmg2 = 0;
				}
				}
				if(Hp1Max != Hp1){//Still has Damage
					Hp2 = Hp2 - Dmg2;
					if(Hp2 >= HPDigetMAX + 1){
						Multiplier = Dmg4/(HPDigetMAX + 1);
						if(-Dmg2 > (HPDigetMAX + 1)){
							Multiplier = Dmg2/(HPDigetMAX + 1);
						}
						else
							Multiplier = -1;
						Hp2 = Hp2 - (Multiplier*(HPDigetMAX + 1));
						Dmg1 = Dmg1 + Multiplier;
					}
					Dmg2 = 0;
				}
				System.out.println("HP2 " + Hp2);//
			
			
			if((Hp1Max - Hp1) >= -Dmg1){ //HP Recover
				Hp1 = Hp1 - Dmg1;
				Dmg1 = 0;
				//If Negative HP, a toggle might be important?
			}
			else if((Hp1Max - Hp1) < -Dmg1){ //HP Max
				Hp1 = Hp1Max;
				Dmg1 = 0;
			}					
			System.out.println("HP1 " + Hp1);
			
			Hp[0] = Hp1;
			Hp[1] = Hp2;
			Hp[2] = Hp3;
			Hp[3] = Hp4;
			System.out.println(Hp[0]);
			System.out.println(Hp[1]);
			System.out.println(Hp[2]);
			System.out.println(Hp[3]);
		
		return Hp;
	}//RecoverGlitchedHP End
}