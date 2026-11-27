class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();

    for (String i: strs){
        char[] arr = i.toCharArray();
        Arrays.sort(arr);
        String key = new String(arr);
        anagrams.computeIfAbsent(key,k->new ArrayList<>()).add(i);
    }
    return new ArrayList<>(anagrams.values());
    }
}
