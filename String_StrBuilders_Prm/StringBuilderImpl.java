package String_StrBuilders_Prm;


class StringBuilderImpl{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {

            char ch =(char)('a' + i);  // char a
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.toString());
        StringBuilder name = new StringBuilder();
        name.append("Hameed");

        // reverse
        name.reverse();

        System.out.println(name);
    }
}
