package com.company;

import java.util.ArrayList;
import java.util.List;
//Задача №5 Вариант 5
public class Main {
    public static void main(String[] args) {
        AnalysisResult analysisResult = new AnalysisResult();

        Patient patient1 = new Patient("Иван");
        Patient patient2 = new Patient("Мария");

        analysisResult.addObserver(patient1);
        analysisResult.addObserver(patient2);

        analysisResult.updateResult("Результат анализа: норма");

        analysisResult.removeObserver(patient1);

        analysisResult.updateResult("Результат анализа: требуется дополнительное обследование");
    }
}
