public class Remove_Duplicate_String {
    public static void remDup(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam
        char curChar = str.charAt(idx);
        if(map[curChar - 'a']== true){
            remDup(str, idx+1, newStr, map);
        }
        else {
            map[curChar - 'a'] = true;
            remDup(str, idx+1, newStr.append(curChar), map);

        }
    }
    public static void main(String[] args) {
        String str = "appaannakcollagheeee";
        remDup(str, 0, new StringBuilder(""), new boolean[26]);    
        
    }
}
