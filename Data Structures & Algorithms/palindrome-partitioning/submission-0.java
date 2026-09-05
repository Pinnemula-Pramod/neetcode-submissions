class Solution {
public void slove(String s,int ind,List<List<String>> list,List<String> temp){
    if(ind==s.length()){
        list.add( new ArrayList<>(temp));
        return;
    }
    for(int i=ind;i<s.length();i++){
        if(ispal(s.substring(ind,i+1))){
            temp.add(s.substring(ind,i+1));
            slove(s,i+1,list,temp);
             temp.remove(temp.size()-1);
        }
    }
    
}
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        slove(s,0,list,temp);
        return list;
    }
    public boolean ispal(String s){
        int right=s.length()-1;
        int left=0;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
