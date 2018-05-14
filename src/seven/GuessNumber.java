package seven;

import java.util.Scanner;

class GuessNumber
{
	public static void main(String[]args) {
		
		int num =(int)(Math.random()*100)+1;
		
		while(true) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入1-100");
			int guessNum=sc.nextInt();
			
			if(num==guessNum) {
				
				System.out.println("对了");
				break;
				
				
				
			}else if(num>guessNum){
				
				System.out.println("小了");
			}else {
				System.out.println("大了");
			}
		}
		
	}

}
