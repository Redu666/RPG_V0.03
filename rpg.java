import moje.pin;
import moje.postac;
import moje.dungeon;
import moje.equip;
import moje.punkty;
import moje.level;

public class rpg {

	static int charC;
	static String nameU;
	static int str, agi, mp, hp, lvl,exp, wybor,lvlTest;

	public static void intro() {
		pin.clearScr(); // tutaj wszystko wymazuje zeby bylo kozacko w miare xD
						// a nie burdel
		lvl =level.podajLevel(exp);
		System.out.print("====================||RPG||==================\n");

		pin.putString("        Witaj w Swiecie Przygody.\n");
														
	}

	public static void dungeon(){
		
		intro();
		
		do {
			intro(); // odswierzam intro
			pin.putString(nameU + " " + moje.postac.imieSila(str, agi, mp, hp, lvl) + " Exp : "+ exp + "\n");
			pin.putString("Dungeon \n1 : Level 1-3 \n2 : Level 4-6 \n3 : Level 7-10");
			
			wybor = pin.number();
		} while (wybor >= 4 || wybor <= 0);
		
		exp += dungeon.dungeon(wybor,lvl,str,agi,mp,hp);
		gra();
		}
	public static void equip(){
		intro();
		pin.putString(nameU + " " + moje.postac.imieSila(str, agi, mp, hp, lvl) + "\n");
		pin.putString("Ekwipunek");
		pin.number();
		gra();
	}
	public static void punkty(){
		intro();
		pin.putString(nameU + " " + moje.postac.imieSila(str, agi, mp, hp, lvl) + "\n");
		pin.putString("Punkty");
		pin.number();
		gra();
	}
	public static void costam(){
		intro();
		pin.putString(nameU + " " + moje.postac.imieSila(str, agi, mp, hp, lvl) + "\n");
		pin.putString("Cos Tam hahaha xD");
		pin.number();
		gra();
	}
	public static void gra() {
	
		do {
			intro(); // odswierzam intro
			pin.putString(nameU + "        " + moje.postac.imieSila(str, agi, mp, hp, lvl) + " Exp : "+ exp);
			pin.putString("\nWybierz akcje \n   1 : Dungeony \n   2 : Ekwipunek \n   3 : Rozdawanie punktow \n   4 : csotam");
			
			if(lvl > lvlTest){
			hp = hp+(lvl*20);
			str = str+(lvl*10);
			lvlTest=lvl;
			}
			
			wybor = pin.number();
		} while (wybor >= 5 || wybor <= 0);
		switch (wybor) {
		case 1: {
			dungeon();
			break;
		}
		case 2: {
			equip();
			break;
		}
		case 3: {
			punkty();
			break;
		}
		case 4: {
			costam();
			break;

		}
		}

	}

	public static void start() {

		exp = 0;
		lvl =level.podajLevel(exp);
		lvlTest = 1;
		str = 20;
		agi = 10;
		mp = 10;
		hp = 100;
		intro(); // odswierzam intro xD
		pin.putString("             Podaj Swe imie Podrozniku !\nImie:");
		nameU = pin.text();

		do {
			intro(); // odswierzam intro
			pin.putString(
					"\n           \nWybierz Klase bohatera \n(1)Wojownik \n(2) Elf \n(3) Magiczny Jednorozec  \nKlasa:");

			charC = pin.number();
		} while (charC >= 4 || charC <= 0);
		// Tutaj Trzeba by cos dalej napisac(no i kurde napisalem xd)
		intro();
		pin.putString(nameU + " " + moje.postac.imieSila(str, agi, mp, hp, lvl));
		pin.putString("\nWybrales Klase : ");

		switch (charC) {
		case 1: {
			pin.putString(" Wojownik - Swoja sila przewyzszach wielu innych lecz jestes dosc powolny!");
			str +=5;
			hp +=80;
			break;
		}
		case 2: {
			pin.putString(
					" Elf - Zwinnosc to twoj glowny atut lecz w starciach wrecz silny przeciwnik ma przewage nad tobą");
			agi +=5;
			hp +=30;
			break;
		}
		case 3: {
			pin.putString(
					" Magiczny Jednorozec - Niedobory w Sile i zrecznosci nadrabiasz magią ktora potrafi byc zabójcza");
			str +=3;
			agi +=3;
			hp += 35;
			mp +=40;
			break;
		}

		}
		pin.putString(" (Nacisnij dowolny klawisz aby kontynuowac)");
		pin.text();
		gra();
	}

	public static void main(String[] args) {
		
		start();

	}

}
