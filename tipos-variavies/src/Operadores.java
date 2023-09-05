public class Operadores {
    public static void main(String[] args) throws Exception {

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
         
        int testeUnary1 = 1;
        testeUnary1 = - testeUnary1;

        System.out.println(testeUnary1);
        testeUnary1 = - testeUnary1;
        System.out.println(testeUnary1);
        ++testeUnary1;
        System.out.println(testeUnary1);

        //fazendo o mesmo com tipos booleanos
        boolean variable = true;
        variable = !variable;
        System.out.println(variable);
        variable = !variable;
        System.out.println(variable);
        
    }





}

