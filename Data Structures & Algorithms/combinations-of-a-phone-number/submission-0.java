class Solution {
public void slove(String d,int ind,List<String> list ,
StringBuilder sb,HashMap<Integer,List<Character>>map){
    if(sb.length()==d.length()){
        list.add(sb.toString());
        return;
    }
    for(int i=ind;i<d.length();i++){
        int dig=d.charAt(i)-'0';
        for(int j=0;j<map.get(dig).size();j++){
          sb.append(map.get(dig).get(j));
          slove(d,i+1,list,sb,map);
          sb.deleteCharAt(sb.length()-1);
        }
    }
}
    public List<String> letterCombinations(String s) {
        if(s.length()==0) return new ArrayList<>();
        List<String> list = new ArrayList<>();
        //List<String> temp = new ArrayList<>();
        HashMap<Integer,List<Character>> map = new HashMap<>();
        map.put(2, new ArrayList<>(Arrays.asList('a', 'b', 'c')));
        map.put(3,new ArrayList<>(Arrays.asList('d','e','f')));
        map.put(4,new ArrayList<>(Arrays.asList('g','h','i')));
        map.put(5,new ArrayList<>(Arrays.asList('j','k','l')));
        map.put(6,new ArrayList<>(Arrays.asList('m','n','o')));
        map.put(7,new ArrayList<>(Arrays.asList('p','q','r','s')));
        map.put(8,new ArrayList<>(Arrays.asList('t','u','v')));
        map.put(9,new ArrayList<>(Arrays.asList('w','x','y','z')));
        StringBuilder sb= new StringBuilder();
        slove(s,0,list,sb,map);

        return list;
    }
}
