class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> symbols = new HashMap<>();
        symbols.put('(', ')');
        symbols.put('[', ']');
        symbols.put('{', '}');
        Stack<Character> sStack = new Stack<>();

        for (char i: s.toCharArray()){
            if (symbols.get(i)!=null){
                sStack.push(i);
            }
            else {
                if(sStack.isEmpty() || i!= symbols.get(sStack.peek())){
                    return false;
                }
                sStack.pop();
            }
        }

        return (sStack.isEmpty());
    }
}
