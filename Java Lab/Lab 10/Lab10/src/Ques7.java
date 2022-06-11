public class Ques7 {
    public static void main(String[] args) {
        String s1 = "Nikhil";
        String s2 = "Gupta";
        System.out.println("s1.regionMatches() : " + s1.regionMatches(1, s2, 1, 3));
        System.out.println("s1.startsWith() : " + s1.startsWith("Nik", 1));
        System.out.println("s1.startsWith() : " + s1.startsWith("Gup"));
        System.out.println("s2.endsWith() : " + s2.endsWith("hil"));
        System.out.println("s1.compareTo() : " + s2.compareTo(s1));
        s1 = s1 +" "+ s2;
        System.out.println("s1.indexOf() : " + s1.indexOf('l'));
//        System.out.println("s1.indexOf('l',5) : " + s1.indexOf('l',5));
        System.out.println("s1.indexOf() : " + s1.indexOf("il"));
//        System.out.println("s1.indexOf(ik,5) : " + s1.indexOf("ik",5));

    }
}