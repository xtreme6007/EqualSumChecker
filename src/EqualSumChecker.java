public class EqualSumChecker {

    public static boolean hasEqualSum (int param1, int param2, int param3) {
        int sum = param1 + param2;
        if(sum == param3) {
            return true;
        }
        return false;

    }
}
