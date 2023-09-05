public class Operadores {
    public static void main(String[] args) throws Exception {

        System.out.println("Resultados dos testes com operadores aritméticos:");
        //testando operadores de atribuição e aritméticos
        int plus = 1+1;
        int subtract = 1-1;
        int multiplie = 2*2;
        double divide = 5.0/2.0; // é importante notar que os números precisaram ser
        // descritos com precisão numérica, do contrário, o programa entenderia que
        // o resultado deveria ser um inteiro e nos entregaria 2 ao invés de 2.5
        int module = 5%2;

        System.out.println(plus);
        System.out.println(subtract);
        System.out.println(multiplie);
        System.out.println(divide);
        System.out.println(module);

        // testando operações unárias
        System.out.println("Resultados dos testes com operadores unários:"); 
        int testeUnary1 = 1;
        testeUnary1 = - testeUnary1;

        System.out.println(testeUnary1);
        testeUnary1 = - testeUnary1;
        System.out.println(testeUnary1);
        ++testeUnary1;
        System.out.println(testeUnary1);

        System.out.println("Resultados dos testes com operadores unários booleanos:");
        //fazendo o mesmo com tipos booleanos
        boolean variable = true;
        variable = !variable;
        System.out.println(variable);
        variable = !variable;
        System.out.println(variable);
        
        //testando operadores ternários:
        System.out.println("Resultados dos testes com operadores ternários:");
        int numero1 = 6;
        int numero2 = 2;
        int numero3 = 6;

        String result1 = numero1==numero2 ? "verdadeiro" : "falso";
        String result2 = numero1==numero3 ? "verdadeiro" : "falso";
        System.out.println(result1);
        System.out.println(result2);

        //testes com operadores relacionais:
        System.out.println("Resultados dos testes com operadores relacionais:");

        short alpha = 10;
        short omega = 20;

        //testa se alpha é igual a omega:
        boolean yesNo1 = alpha == omega;
        //testa se alpha é diferente de omega:
        boolean yesNo2 = alpha != omega;
        //testa se alpha é maior ou igual a omega:
        boolean yesNo3 = alpha >= omega;
        //testa se alpha é menor ou igual a omega:
        boolean yesNo4 = alpha <= omega;
        //testa se alpha é maior que omega:
        boolean yesNo5 = alpha > omega;
        //testa se alpha é menor que omega:
        boolean yesNo6 = alpha < omega;
        System.out.println(yesNo1);
        System.out.println(yesNo2);
        System.out.println(yesNo3);
        System.out.println(yesNo4);
        System.out.println(yesNo5);
        System.out.println(yesNo6);




    }





}

