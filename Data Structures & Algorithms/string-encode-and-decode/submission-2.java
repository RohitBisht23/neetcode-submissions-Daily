class Solution {

    public String encode(List<String> strs) {
        String ans = "";

        for(int i=0; i<strs.size(); i++) {
            ans = ans+strs.get(i);
            ans+=":;";
        }
        System.out.println(ans);
        return ans;
    }

    public List<String> decode(String str) {
        List<String> li = new ArrayList<>();

        StringBuilder sb=new StringBuilder("");
        int i = 0;
        while(i < str.length()) {
            if(str.charAt(i) == ':' && str.charAt(i+1) == ';') {
                li.add(sb.toString());
                sb.setLength(0);
                i+=2;
                continue;
            } else {
                sb.append(str.charAt(i));
            }
            i++;
        }

        return li;
    }
}
