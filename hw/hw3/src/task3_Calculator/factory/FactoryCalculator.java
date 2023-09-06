package task3_Calculator.factory;

import task3_Calculator.calculatorEngineer.EngineerCalc;
import task3_Calculator.calculatorNormal.Calculable;
import task3_Calculator.calculatorNormal.NormalCalc;
import task3_Calculator.miniCalculator.MiniCalc;

public class FactoryCalculator implements  FactoryCalculable{
    @Override
    public Calculable createNormalCalculator() {
        return new NormalCalc();
    }

    @Override
    public Calculable createEngineerCalculator() {
        return new EngineerCalc();
    }

    @Override
    public Calculable createMiniCalculator() {
        return new MiniCalc();
    }
}
