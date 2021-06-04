public class URLifyString {
    public String urlify(String string, int trueLength) {
        return method2(string, trueLength);
    }

    private String method2(String string, int trueLength) {
       return string.trim().replaceAll(" ", "%20");
    }

    private String method1(String string, int trueLength) {
        char[] charArray = string.toCharArray();
        char[] newArray = new char[charArray.length];
        int j = 0;
        for (int i = 0; i < trueLength; i++) {
            if (charArray[i] == ' '){
                newArray[j++] = '%';
                newArray[j++] = '2';
                newArray[j++] = '0';
            }else {
                newArray[j++] = charArray[i];
            }
        }
        return new String(newArray);
    }
}
