package mathtask;
import org.apache.commons.math3.stat.*;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.util.*;

public class Main {
    /**
     * Создать свой Java Maven проект;
     * Добавьте зависимость commons-math3 (предназначена для решения
     * математических задач) и изучить интерфейс библиотеки.
     * Воспользоваться пакетом org.apache.commons.math3.stat и классом DescriptiveStatistics.
     * ○ Создать коллекцию из числовых элементов.
     * ○ С помощью объекта DescriptiveStatistics вычислить минимальное и максимальное значение,
     * сумму и среднее арифметическое.
     * Воспользоваться пакетом org.apache.commons.math3.util. С помощью класса ArithmeticUtils найти :
     * ○ факториал числа N.
     * ○ Наименьшее общее частное двух чисел
     * ○ Наибольший общий делитель двух чисел
     * ○ Проверить что число N это степень двойки
     * @param args
     */
    public static void main(String[] args) {
        double[] number = new double[] {1.00, 5.00, 23.00, 7.00};
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics(number);
        System.out.println(descriptiveStatistics.getMax());
        System.out.println(descriptiveStatistics.getMean());
        System.out.println(descriptiveStatistics.getMin());
        System.out.println(descriptiveStatistics.getSum());
        System.out.println(ArithmeticUtils.factorial(3));
        System.out.println(ArithmeticUtils.lcm(4, 8));
        System.out.println(ArithmeticUtils.gcd(4, 8));
        System.out.println(ArithmeticUtils.isPowerOfTwo(6));

    }
}
