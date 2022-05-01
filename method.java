class method {
    static int charCount (String s) {
        char[] cArray = s.toCharArray();
        int total = 0;
        for (char c: cArray) {
            total++;
        }
        return total;
    }
}