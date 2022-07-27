package wipro;

import java.util.*;

//Find pin
public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;
        int input4 = 37;
        System.out.println(findPin(input1,input2,input3,input4));
        sc.close();
    }
    public static  int findPin(int input1,int input2,int input3,int input4){
    int result = 0;
		if(input4%2==0){
            result = ((evenPos(input1) + evenPos(input2) + evenPos(input3)) - (oddPos(input1)+oddPos(input2)+oddPos(input3)));
		} else{
            result = ((oddPos(input1)+oddPos(input2)+oddPos(input3))-(evenPos(input1) + evenPos(input2) + evenPos(input3)));
		}
		return result;
	}

	public static  int evenPos(int num){
		int sum = 0;	
		String str = num+"";
		for(int i = 0;i<4;i++){
			if(i%2 == 0){
				sum += Integer.parseInt(str.charAt(i)+"");
			}
		}
		return sum;
	}

    public static  int oddPos(int num){
		int sum = 0;
		String str = num+"";
		for(int i = 0;i<4;i++){
			if(i%2 != 0){
				sum += Integer.parseInt(str.charAt(i)+"");
			}
		}
		return sum;
	}
}
