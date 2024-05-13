class SimilarPairs {
    public int similarPairs(String[] words) {
        int out = 0;
        for(int i=0; i<words.length-1; i++){
            Set<Character> temp = new HashSet<>();
            for(int k=0; k<words[i].length(); k++){
                temp.add(words[i].charAt(k));
            }
            
            for(int j=i+1; j<words.length; j++){
                Set<Character> temp1 = new HashSet<>();
                String s = words[j];
                
                for(int t=0; t<s.length(); t++){
                    temp1.add(s.charAt(t));
                }
                if(temp.equals(temp1)){
                    out++;
                }
            }
            
        }
        return out;
    }
}
