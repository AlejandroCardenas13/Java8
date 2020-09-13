import java.util.*;

public class LamdaApp {
    private final List<String> list = Arrays.asList("Mavs", "Rockets", "Lakers", "Clippers");

    public static void main(String[] args) {
        LamdaApp lamdaApp = new LamdaApp();
        //   lamdaApp.ordenImperativo();
        //lamdaApp.ordenDeclarativo();
        // lamdaApp.calcularImperativa();
        lamdaApp.calcularDeclarativo();
    }

    //Forma Imperativa
    public void ordenImperativo() {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (String element : list) {
            System.out.println(element);
        }
    }

    //Forma Declarativa 1
    public void ordenDeclarativo() {
        Collections.sort(list, (String o1, String o2) -> o1.compareTo(o2));
        for (String element : list) {
            System.out.println(element);
        }
    }

    //Forma Declarativa 2
    public void ordenDeclarativo2() {
        Collections.sort(list, String::compareTo);
        for (String element : list) {
            System.out.println(element);
        }
    }

    //Forma Declarativa 3
    public void ordenDeclarativo3() {
        list.sort(String::compareTo);
        for (String element : list) {
            System.out.println(element);
        }
    }


    //Trabajando lamdas con una interfaz
    public void calcularImperativa() {
        Operation operation = new Operation() {
            @Override
            public double calculate(double value1, double value2) {
                return (value1 + value2) / 2;
            }
        };
        System.out.println("El resultado es: " + operation.calculate(43, 64));
    }

    public void calcularDeclarativo() {
        Operation operation = (double v1, double v2) -> (v1 + v2) / 2;
        System.out.println("El resultado es: " + operation.calculate(43, 94));
    }
}
