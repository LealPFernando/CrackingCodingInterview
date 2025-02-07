public class ArraysAndStrigs {

    public static void main(String[] args) {
//        System.out.println(isUnique("aasd"));

    }


//    Implement an algorithm to determine if a string has all unique characters.
//    What if you cannot use additional data structures?
    public static boolean isUnique(String s) {
        // Use Set to save the characters and check if the exists while iterating the string
//        Set<Character> charactersSet = new HashSet<Character>();
//        for(int index = 0; index < s.length(); index++) {
//            if(charactersSet.contains(s.charAt(index))) {
//                return false;
//            } else {
//                charactersSet.add(s.charAt(index));
//            }
//        }
//        return true;

        // Without HashMap
        boolean[] charSet = new boolean[128]; // Total characters of ASCII
        for(int index = 0; index < s.length(); index++) {
            if(charSet[s.charAt(index)]){
                return  false;
            } else {
                charSet[s.charAt(index)] = true;
            }
        }
        return true;
    }
}
