public class LambdaScopes {


    public static void main(String[] args) {
        LambdaScopes lambdaScopes = new LambdaScopes();
        lambdaScopes.probandoVariableLocal();
    }


    /*
    En el ambito local las variables que vaya a usar dentro de mi expresión lambda actuan como final implicitamente,
     donde las puedo usar, más no se pueden modificar
     */
    public void probandoVariableLocal() {
        double v3 = 32;
        Operation operation = ((value1, value2) -> {
            //v3 = 23;
            return (value1 + value2 + v3) / 3;
        });
        System.out.println("Resultado: " + operation.calculate(44, 77));
    }
}
