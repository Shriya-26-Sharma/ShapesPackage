class ArraytoString {
    public static void main(String[] args) {
        String [] arr =new String[]{"Array ","of ","words"," which ","is"," getting ","converted "+"to"+" string"};
        StringBuilder sb =new StringBuilder();
        for (String str : arr) {
            sb.append(str).append("  ");
        }
        System.out.println(sb);
    }
}
