package Java_projects.backtracking;


// print all possible string with character A,B,C
public class possibleString {
    public static void main(String[] args) {
        String str = "ABC";
        allPossibleString(str,"",0);
    }

    public static void allPossibleString(String str, String prem, int idx) {
        //BaseCase
        if(str.length() == 0){
            System.out.println(prem);
            return;
        }
        for(int i = 0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            System.out.println(currChar);
            System.out.println(newStr);
            System.out.println(prem+currChar);
            allPossibleString(newStr, prem+currChar, idx+1);
        }

    }

}
