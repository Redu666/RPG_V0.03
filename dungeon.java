package moje;
import moje.pin;
import moje.postac;
import java.lang.Math;
import java.util.Random;


public class dungeon {
	public static int dg1(int lvl,int str,int agi,int mp,int hp, int plus){
		Random r = new Random();
		
		int poziomMoba=r.nextInt(2)+1+plus;
		int tura = 0;
		int silaAtaku,obrona;
		int exp;
		int wygrana = 0;
		int mnoznik = 1;
		int silaMob;
		int strMob=r.nextInt(5)+10*poziomMoba*mnoznik*plus;
		int agiMob=r.nextInt(5)+10*poziomMoba*mnoznik*plus;
		int hpMob=r.nextInt(50)+50*poziomMoba*mnoznik*plus;
		pin.putString(" Twoj przeciwnik  STR : " + strMob + " AGI : " + agiMob + " HP : " + hpMob + " LVL : " + poziomMoba);
		
		do {
		obrona = agi+(r.nextInt(10));
		silaAtaku = str+r.nextInt(10);
		silaMob =strMob+(r.nextInt(5));
			if(tura==0){
				silaAtaku =5+ str+r.nextInt(10)-(agiMob+r.nextInt(5))*lvl;
				if (silaAtaku>1)
				hpMob -= silaAtaku;
				else
				silaAtaku=0;
				if(hpMob>0)
					pin.putString("\nZadales " + silaAtaku + " Obrazen. Pozostalo mu " + hpMob + " Zycia");
				else{
					pin.putString("\n\nWygrales ! Gratulacje ");
					wygrana=1;
				}
				tura=1;
				
			}
			else {
				obrona = agi+(r.nextInt(10));
				silaMob =strMob+(r.nextInt(5)-obrona);
				if (silaMob>0)
				hp -= silaMob;
				else
				silaMob=0;	
				if (hp>0)
					pin.putString(" Przeciwnik zadal " + silaMob + " Obrazen  . Pozostalo " + hp + " Zycia");
				else {
					pin.putString("\n\nPrzegrales Ofermo !");
					wygrana=0;
				}
				
				tura=0;
			}
			pin.manySec(5); // CZAS !!!!
			
		}
		while (hp>0 && hpMob >0);
		pin.text();
		if (wygrana==1){
			exp = 20*poziomMoba;
		}
		else
			exp = 3;
		
		
		return exp;
		
		
		
		
	}
	
	public static int dg2(int lvl,int str,int agi,int mp,int hp){
		return 0;
	}
	
	public static int dg3(int lvl,int str,int agi,int mp,int hp){
		return 0;
	}
	
			
	public static int dungeon(int level, int levelGracza,int str,int agi,int mp,int hp){
		int exp=0;
		switch (level){
		
		case 1 :{
				exp =dg1(levelGracza,str,agi,mp,hp,0);
			break;
		}
		case 2 :{
				exp =dg1(levelGracza,str,agi,mp,hp,3);
			break;
		}
		case 3 :{
				exp =dg1(levelGracza,str,agi,mp,hp,6);
			break;
		}
		
		
		
		}
		return exp;
		
	}
}
