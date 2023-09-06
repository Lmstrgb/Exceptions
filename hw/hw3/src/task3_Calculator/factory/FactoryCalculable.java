package task3_Calculator.factory;
import task3_Calculator.calculatorNormal.Calculable;

public interface FactoryCalculable {
    Calculable createNormalCalculator();
    Calculable createEngineerCalculator();

    Calculable createMiniCalculator();
}
