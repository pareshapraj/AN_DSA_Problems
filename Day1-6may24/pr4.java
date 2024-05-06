// https://www.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution {
    public List<String> find_permutation(String S) {
       List<String> res = generateUniquePermutations(S);
       Collections.sort(res);
       return res;
    }
    public static List<String> generateUniquePermutations(String str){
        List<String> result = new ArrayList<>();
        char[] chars = str.toCharArray();
        generateUniquePermutations(chars, 0,chars.length-1,result);
        return result;
    }
    
    public static void generateUniquePermutations(char[] chars, int start,int end, List<String> result) {
        if (start == end) {
            result.add(new String(chars));
            return;
        }
        Set<Character> seen = new HashSet<>();
        for (int i = start; i <= end; i++) {
            if (!seen.contains(chars[i])) {
                seen.add(chars[i]);
                swap(chars, i, start);
                generateUniquePermutations(chars, start + 1,end, result);
                swap(chars, i, start);
            }
    }
    }
      public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}