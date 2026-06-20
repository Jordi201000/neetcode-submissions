class Solution {

    public String encode(List<String> strs) {
       StringBuilder output = new StringBuilder();
        for (String curr:strs){
        output.append(curr.length()).append("#").append(curr);
        }
        return output.toString();
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();
        int index=0;
        int myLength = 0;
        while(index < str.length()){
            int j=index;
            while(str.charAt(j)!='#'){
                j++;
            }
        myLength = Integer.parseInt(str.substring(index,j));
                index=j+1;
                j=index+myLength;
        output.add(str.substring(index,j));
                index=j;
        }

        return output;
    }
}
