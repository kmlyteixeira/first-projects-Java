public class FuncoesString {
    public static void main(String[] args) {
        /*Funções Interessantes para String 
        • Formatar: toLowerCase() transformar para minusculo
                    toUpperCase() transformar para minusculo
                    trim() remover espaços
        • Recortar: substring(inicio) 
                    substring(inicio, fim)
        • Substituir: Replace(char, char)
                    Replace(string, string)
        • Buscar: IndexOf buscar posicao
                LastIndexOf
        • str.Split(" ") recortar*/

        String original = "ahsbhj HSBAKJS sjjkk KKK";
        String func1 = original.toLowerCase();
        String func2 = original.toUpperCase();
        String func3 = original.trim();
        String func4 = original.substring(2);
        String func5 = original.substring(2, 9);
        String func6 = original.replace("a", "x");
        String func7 = original.replace("ahs", "abc");
        int func8 = original.indexOf("bh");
        int func9 = original.lastIndexOf("jk");

        System.out.println(func1);
        System.out.println(func2);
        System.out.println(func3);
        System.out.println(func4);
        System.out.println(func5);
        System.out.println(func6);  
        System.out.println(func7);
        System.out.println(func8);
        System.out.println(func9);

//---------------------FUNÇÃO SPLIT-----------------------
        
        String testSplit = "potato apple lemon";
        String[] vect = testSplit.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println(" 1º " + word1);
        System.out.println(" 2º " + word2);
        System.out.println(" 3º " + word3);
    }
}
