import java.util.HashMap;

public class Main5 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            if (map.get(s.charAt(i-1)) < map.get(s.charAt(i))) {
                result -= map.get(s.charAt(i-1));
            } else {
                result += map.get(s.charAt(i-1));
            }
        }
        result += map.get(s.charAt(s.length()-1));
        System.out.println(result);
    }
    public static void main1(String[] args) {
        String s = "XII";
        HashMap<Character, Integer> roma = new HashMap<>();
        roma.put('I', 1);
        roma.put('V', 5);
        roma.put('X', 10);
        roma.put('L', 50);
        roma.put('C', 100);
        roma.put('D', 500);
        roma.put('M', 1000);

        int result = 0;
        int prevalue = roma.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int curval = roma.get(s.charAt(i));
            if (curval > prevalue) {
                result -= prevalue;
            } else {
                result += prevalue;
            }
            prevalue = curval;
        }
        //特殊情况
        //I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
        //X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
        //C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
    }
}
