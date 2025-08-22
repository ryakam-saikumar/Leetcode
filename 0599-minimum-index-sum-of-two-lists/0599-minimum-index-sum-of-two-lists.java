class Solution {
    public String[] findRestaurant(String[] l1, String[] l2) {
        List<String> l = new ArrayList<>();
        for (int i = 0; i < l1.length; i++) {
            l.add(l1[i]);
        }

        int min = Integer.MAX_VALUE;
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < l2.length; i++) {
            if (l.contains(l2[i])) {
                for (int j = 0; j < l1.length; j++) {
                    if (l2[i].equals(l1[j])) {   
                        if (min > i + j) {
                            ans.clear();         
                            ans.add(l1[j]);
                            min = i + j;
                        } else if (min == i + j) {
                            ans.add(l1[j]);     
                        }
                        break;
                    }
                }
            }
        }

        String[] str = new String[ans.size()];
        int idx = 0;
        for (String s : ans) {
            str[idx++] = s;
        }

        return str;
    }
}
