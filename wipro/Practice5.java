package wipro;

import java.io.*;
import  java.util.*;

// Read only region start
class Practice5 {

    public static void main(String[] args) {
        encodeThreeStrings("Jhon","Johny","Janardhan");
    }

	public static class Result{
		public final String output1;
		public final String output2;
		public final String output3;

		public Result(String out1, String out2, String out3){
			output1 = out1;
			output2 = out2;
			output3 = out3;
		}
	}
	
    public static Result encodeThreeStrings(String input1,String input2,String input3){
    	// Read only region end
        String[] ip1parts = new String[3];
		String[] ip2parts = new String[3];
		String[] ip3parts = new String[3];
		
		ip1parts = getParts(input1);
		ip2parts = getParts(input2);
		ip3parts = getParts(input3);
		//System.out.println(ip2parts[0] + ip2parts[1] + ip2parts[2]);
		
		StringBuilder output1 = new StringBuilder (ip1parts[0] + ip2parts[0] + ip3parts[0]);
		StringBuilder output2 = new StringBuilder (ip1parts[1] + ip2parts[1] + ip3parts[1]);
		StringBuilder output3 = new StringBuilder (ip1parts[2] + ip2parts[2] + ip3parts[2]);
		
		for (int i = 0; i < output3.length(); i++) {
			if (Character.isLowerCase(output3.charAt(i)))
				output3.setCharAt(i, Character.toUpperCase(output3.charAt(i)));
			else
				output3.setCharAt(i, Character.toLowerCase(output3.charAt(i)));
		}
		return new Result(output1.toString(), output2.toString(), output3.toString());
    }
	
	public static String[] getParts(String str) {
		int len = str.length();
		String[] parts = new String[3];
		int partLen = len / 3;
		
		// System.out.println("str: " + str + " len: " + len + " partLen: " + partLen);
		// System.out.println(new String("HelloWorld").substring(3, 6));
		
		if (len % 3 == 0) {
			parts[0] = str.substring(0, partLen);
			parts[1] = str.substring(partLen, 2 * partLen);
			parts[2] = str.substring(2 * partLen, len);
			System.out.println("case 0: " + parts[0] + " " + parts[1] + " " + parts[2]);
		} else if (len % 3 == 1) {
			parts[0] = str.substring(0, partLen);
			parts[1] = str.substring(partLen, 2 * partLen + 1);
			parts[2] = str.substring(2 * partLen + 1, len);
			System.out.println("case 1: " + parts[0] + " " + parts[1] + " " + parts[2]);
		} else if (len % 3 == 2) {
			parts[0] = str.substring(0, partLen + 1);
			parts[1] = str.substring(partLen + 1, 2 * partLen + 1);
			parts[2] = str.substring(2 * partLen + 1, len);
			System.out.println("case 2: " + parts[0] + " " + parts[1] + " " + parts[2]);
		}
		
		return parts;
	}
}