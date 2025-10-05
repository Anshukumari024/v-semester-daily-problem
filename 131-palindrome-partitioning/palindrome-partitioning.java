class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list=new ArrayList<>();
        List<String> ll=new ArrayList<>();
        part(s,list,ll);
        return list;
        
    }
    public void part(String s,List<List<String>> list,List<String> ll){
        if(s.length()==0){
            list.add(new ArrayList<String>(ll));
            return;
        }
        for(int cut=1;cut<=s.length();cut++){
            String str=s.substring(0,cut);
            if(isPal(str)){
                ll.add(str);
                part(s.substring(cut),list,ll);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean isPal(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}


}