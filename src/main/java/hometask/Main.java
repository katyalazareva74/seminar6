package hometask;

import java.util.HashMap;
import java.util.Map;

public class Main {
    /**
     * Создать свой Java Maven или Gradle проект;
     * Самостоятельно реализовать код для демонстрации парадокса Монти Холла;
     * Сохранить результат в HashMap<шаг теста, результат>
     * Вывести на экран статистику по победам и поражениям
     * @param args
     */
    public static void main(String[] args) {
        Map<Integer, String> doors = new HashMap<>();
        doors.put(1, "автомобиль");
        doors.put(2, "коза");
        doors.put(3, "коза");
        int count=1000;
        Map<Integer, Integer> strategy1 = Strategy.strateg(doors, count, "автомобиль");
        long sum1 = strategy1.values().stream().filter(val->val==1).count();
        System.out.println("Количество выигрешей "+sum1);
        float m=count/100.0f;
        float a =sum1/m;
        System.out.printf("Выигрыш при стратегии не менять свой выбор составил - %.1f процентов\n", a);
        Map<Integer, Integer> strategy2 = Strategy.strateg(doors, count, "коза");
        long sum2 = strategy2.values().stream().filter(val->val==1).count();
        System.out.println("Количество выигрешей "+sum2);
        a =sum2/m;
        System.out.printf("Выигрыш при стратегии смены выбора составил - %.1f процентов\n", a);
    }
}
