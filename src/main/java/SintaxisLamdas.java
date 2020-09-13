public class SintaxisLamdas {

    public static void main(String[] args) {
        SintaxisLamdas sntx = new SintaxisLamdas();
        sntx.forma4();
    }

    public void forma1() {
        Operation operation = (double v1, double v2) -> (v1 + v2) / 2;
        System.out.println("1.El resultado es: " + operation.calculate(43, 94));
    }

    //Sin especificar el tipo de parametro
    public void forma2() {
        Operation operation = (v1, v2) -> (v1 + v2) / 2;
        System.out.println("2.El resultado es: " + operation.calculate(43, 94));
    }

    //Englobando mi operación en {} y definiendo el return, esto es recomendable cuando necesito definir más de una línea
    public void forma3() {
        Operation operation = (v1, v2) -> {
            int a = 2;
            return (v1 + v2) * 2 / 2;
        };
        System.out.println("3.El resultado es: " + operation.calculate(43, 94));
    }

    //Sin parametros, aunque para esto como estoy usando una interfaz tengo que cambiar la interfaz
    // y que no reciba parametros
    public void forma4() {
        Operation2 operation2 = () -> {
            double v1 = 53;
            double v2 = 34;
            return (v1 + v2) / 2;
        };
        System.out.println("4.El resultado es: " + operation2.calculateWithOutParameters());
    }

}
