package p_3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

//		<<薦嬢庚 庚薦>>
//		  鯉妊 : 娃舘廃 薦嬢庚生稽 据馬澗 庚舌聖 識澱馬食 刃失 背左切.
//		  推姥 : if庚引 case庚聖 承依.
//		  窒径 森獣 :
//		  	袴軒 嬢凹 巷賢 降 巷賢 降~
//			(舘降/荊) : 荊
//			(1. 据杷什/2. 蝶爽杖/3. 錘疑差) : 2
//			||||||||
//			|(しけし)|
//			|| || ||
//			|     |
//			|     |
//			| | | |
// 			 ＜   ＜ 
// 			
// 			
// 			袴軒 嬢凹 巷賢 降 巷賢 降~
//			(舘降/荊) : 舘降
//			(1. 据杷什/2. 蝶爽杖/3. 錘疑差) : 1
//			||||||||
//			|(しさし)|
// 			 ||||||
// 			 ||||||
//			||||||||
//  		      ＜  ＜ 
//  		      
//  		      
//  		         袴軒 嬢凹 巷賢 降 巷賢 降~
//			(舘降/荊) : 荊
//			(1. 据杷什/2. 蝶爽杖/3. 錘疑差) : 3
//			||||||||
//			|(しけし)|
//			|| || ||
//			|     |
//			(     )
//			|  |  |
//  			  ＜ ＜ 

		

		Q3 q = new Q3();
		q.Q3_1();
	}

	public void Q3_1() {
		char select;
		int num1 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("袴軒 嬢凹 巷賢 降 巷賢 降~");

		System.out.print("(舘/荊) : ");
		select = sc.nextLine().charAt(0);
		System.out.print("(1. 据杷什/2. 蝶爽杖/3. 錘疑差) : ");
		num1 = sc.nextInt();

		if(select == '舘') {
			System.out.println("||||||||");
			System.out.println("|(しさし)|");
		}else if(select == '荊'){
			System.out.println("||||||||");
			System.out.println("|(しけし)|");
			System.out.println("|| || ||");
		}

		switch (num1) {
		case 1:
			System.out.println(" ||||||");
			System.out.println(" ||||||");
			System.out.println("||||||||");
			System.out.println("  ＜  ＜ ");
			break;
		case 2:
			System.out.println("|     |");
			System.out.println("|     |");
			System.out.println("| | | |");
			System.out.println(" ＜   ＜ ");
			break;
		case 3:
			System.out.println("|     |");
			System.out.println("(     )");
			System.out.println("|  |  |");
			System.out.println("  ＜ ＜ ");
			break;

		default:System.out.println("穴欠偶虞");break;
		}

	}

}
