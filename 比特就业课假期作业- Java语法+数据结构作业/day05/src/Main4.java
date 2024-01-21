public class Main4 {
    public static void main(String[] args) {
        int i= 3;
        String result = new String();
        switch (i) {
            case 1:
                result = result + "him";
            case 2:
                result += "her";
            case 3:
                result += "it ";
            default:
                result += "me ";
        }
        System.out.println(result);
    }
}
