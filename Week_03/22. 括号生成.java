class Solution {
    public  List<String> generateParenthesis(int n) {
        return parenthesis(0, 0, n, "");
    }
    List<String> list = new ArrayList<>();
    private  List<String> parenthesis(int left, int right, int n, String string) {
        if (left == n && right == n) {
            list.add(string);
            return list;
        }
        if (right >= n) {
            return list;
        }
        if (right > left) {
            return list;
        }
        if (left < n) {
            parenthesis(left + 1, right, n, string + "(");
        }
        if (right < n) {
            parenthesis(left, right + 1, n, string + ")");
        }
        return list;
    }
}