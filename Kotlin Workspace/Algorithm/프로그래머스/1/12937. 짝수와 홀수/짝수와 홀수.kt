class Solution {
    fun solution(num: Int): String {
        var answer = ""
        answer = if (num % 2 == 0) {
            "Even"
        } else {
            "Odd"
        }
        return answer
    }
}