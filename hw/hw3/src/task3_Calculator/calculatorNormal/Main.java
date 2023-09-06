package task3_Calculator.calculatorNormal;

import task3_Calculator.decorator.DecEngineerCalculator;
import task3_Calculator.decorator.DecMiniCalculator;
import task3_Calculator.decorator.DecNormalCalculator;
import task3_Calculator.decorator.DecoratorCalculator;
import task3_Calculator.factory.FactoryCalculable;
import task3_Calculator.factory.FactoryCalculator;

public class Main {
    public static void main(String[] args) {
        FactoryCalculable calculatorFactory = new FactoryCalculator();

        Calculable normalCalculator = calculatorFactory.createNormalCalculator();
        DecoratorCalculator normalDecCalc = new DecNormalCalculator(normalCalculator);

        Calculable engineerCalculator = calculatorFactory.createEngineerCalculator();
        DecoratorCalculator engineerDecCalculator = new DecEngineerCalculator(engineerCalculator);
        //NormalCalc calculator = new NormalCalc(); //было изначально

        Calculable miniCalculator = calculatorFactory.createMiniCalculator();
        DecoratorCalculator miniDecCalculator = new DecMiniCalculator(miniCalculator);

        //ViewCalc view = new ViewCalc(normalDecCalc);
       // ViewCalc viewEng = new ViewCalc(engineerDecCalculator);
        ViewCalc viewMini = new ViewCalc(miniDecCalculator);
        //view.run();  //режим обычный
        //viewEng.run(); //режим инженерный
        viewMini.run(); //режим мини

    }
}
