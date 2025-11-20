public class Varkeyword {
    public static void main(String[] args) {

        /*  var keyword automatically know the type of data.
        It runs only if value given while initializing */

        var x = 5;
        var y = 3.5;
        var name = "Mukti ";
        var isJavaFun = true;
        var myChar = 'M';

        System.out.println(x);
        System.out.println(y);
        System.out.println(name);
        System.out.println(isJavaFun);
        System.out.println(myChar);

        var a; // This will show error in your code 
        a = 5; 

        System.out.println(a);
    }
}