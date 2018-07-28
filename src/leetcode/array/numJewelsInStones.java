package leetcode.array;

public class numJewelsInStones{
    public int numJewelsInStones(String J,String S){
        int numJ = J.length();
        int numS = S.length();
        if(numJ == 0||numS == 0){
            return 0;
        }
        int n = 0;
        for(int i = 0;i<numJ;i++){
            for(int j = 0;j<numS;j++){
                if(S.charAt(j) == J.charAt(i)){
                    n++;
                }
            }
        }
        return n;
    }
}
