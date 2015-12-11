package moje;

public class level {

	public static int podajLevel(int exp){
		int level =1  ;
	if (exp>0){
		level=1;
	}
	if (exp>100){
		level=2;
	}		
	if (exp>200){
		level=3;
	}		
	if (exp>300){
		level=4;
	}		
	if (exp>400){
		level=5;
	}		
	if (exp>500){
		level=6;
	}		
	if (exp>600){
		level=7;
	}		
	if (exp>700){
		level=8;
	}		
	if (exp>800){
		level=9;
	}
	if (exp>900){
		level=10;
	}	
	return level ;
	}
	
}
