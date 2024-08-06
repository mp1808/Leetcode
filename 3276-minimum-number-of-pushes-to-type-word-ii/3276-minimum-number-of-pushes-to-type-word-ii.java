class Solution {
    public int minimumPushes(String word) {
         int len = word.length();
        int charFreq[] = new int[26];
        int charCost[] = new int[26];
        int keyChrMpCnt[] = new int[8];
        for(var chr : word.toCharArray()){
            charFreq[chr - 'a']--;
        }
        Arrays.sort(charFreq);
        for(int chrIndx = 0; chrIndx < 26; chrIndx++){
            if(charFreq[chrIndx] < 0){
                int minMappedKey = -1, keyMpCnt = Integer.MAX_VALUE;
                for(int keyIndx = 0; keyIndx < 8; keyIndx++){
                    if(keyMpCnt > keyChrMpCnt[keyIndx]){
                        keyMpCnt = keyChrMpCnt[keyIndx];
                        minMappedKey = keyIndx;
                    }
                }
                keyChrMpCnt[minMappedKey]++;
                charCost[chrIndx] = (keyMpCnt+1) * charFreq[chrIndx] * -1; 
            }
        }
        int totalCost = 0;
        for(var cost : charCost)totalCost += cost;
        return totalCost;
    }
}