package Java_projects.example;


public class practiceQuestion1 {
    public static void main(String[] args) {
        String arr[] = {"hello","banana"};
        findStringVowelFirstAndLast(arr.length,arr);
    }

    public static String findStringVowelFirstAndLast(int input1, String input2[]) {
        String str = "";
        boolean isString = true;
        for(int i=0;i<input1;i++){
            String temp = input2[i].toLowerCase();
                if(temp.charAt(0)== 'a' || temp.charAt(0)== 'e' || temp.charAt(0)== 'i' || temp.charAt(0)== 'o' || temp.charAt(0)== 'u'){

                    if(temp.charAt(temp.length()-1)== 'a' || temp.charAt(temp.length()-1)== 'e' || temp.charAt(temp.length()-1)== 'i' || temp.charAt(temp.length()-1)== 'o' || temp.charAt(temp.length()-1)== 'u'){

                        str += temp;
                        isString = false;
                    } 
            } 
        }
        if(isString) {
            System.out.println("no matches found");
        }
        return str;
    }
}
