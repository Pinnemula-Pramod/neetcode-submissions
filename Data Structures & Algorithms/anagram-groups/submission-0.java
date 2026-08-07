class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        HashMap<String,List<String>> map= new HashMap<>();
        int n=s.length;
        for(int i=0;i<n;i++){
            String temp=s[i];
            int count[]=new int[26];
            for(int j=0;j<temp.length();j++){
                count[temp.charAt(j)-'a']++;
            }
            StringBuilder key1=new StringBuilder();
            for(int k=0;k<26;k++){
                while(count[k]>0){
                    key1.append('a'+k);
                    count[k]--;
                }
            }
            String key=key1.toString();
            if(map.containsKey(key)){
                map.get(key).add(temp);
            }
            else{
              List<String> a=new ArrayList<>();
              a.add(temp);
              map.put(key,a);
            }
        }
        List<List<String>> list = new ArrayList<>();
        for(String  key :map.keySet()){
            List<String> store= new ArrayList<>();
            for(int i=0;i<map.get(key).size();i++){
             store.add(map.get(key).get(i));
            }
            list.add(store);
        }
        return list;
    }
}
