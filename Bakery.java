public class Bakery {
    public static void main(String[] args) {
        // 1. Declare your variables below; 40 pies and 70 cupcakes
        int pies = 40;
        int cupcakes = 70;
        // 2. Someone purchased 25 pies, leaving 15 left
        pies = 15;
        // 3. A witch incinerates your cupcakes
        cupcakes = 0;
        // 4. A witch turns your remaining pies into cupcakes
        cupcakes = pies;
        pies = 0;
        // 5. Print the number of pies and the number of cupcakes left
        System.out.println(pies);
        System.out.println(cupcakes);
    }
}
