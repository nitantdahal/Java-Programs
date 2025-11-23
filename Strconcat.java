public class Strconcat {
    public static void main(String[] args) {
        String firstname = "Muktiraj ";
        String lastname = "Dahal";
        System.out.println(firstname + " " + lastname); // Most preferred
        System.out.println(firstname.concat(lastname));
        System.out.println(firstname + lastname);

        String name = "Nitant";
        int age = 20;
        System.out.println("My name is " + name + " and I am " + age + " years old.");

        String a = "My ";
        String b = "Name ";
        String c = "is ";
        String d = "Muktiraj ";
        String e = "Dahal";
        String result = a.concat(b).concat(c).concat(d).concat(e);
        System.out.println(result);

    }
}
