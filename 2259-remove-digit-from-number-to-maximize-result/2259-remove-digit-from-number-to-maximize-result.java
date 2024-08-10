class Solution {
    public String removeDigit(String n, char d) {
        int l=n.length();
        String max="";
        for(int i=0;i<n.length();i++){
            //check kro the place where you are finding the same digit
        if(n.charAt(i)==d){
            //create thr number without that didgit
        String z=n.substring(0,i)+n.substring(i+1,l);
        //compare it to thr previously formed digits 
          if(z.compareTo(max)>0)
          //store karo
          max=z;
    }}
    return max;
    }
}