package com.company;

import java.util.ArrayList;
import java.util.List;
//������ �5 ������� 5
public class Main {
    public static void main(String[] args) {
        AnalysisResult analysisResult = new AnalysisResult();

        Patient patient1 = new Patient("����");
        Patient patient2 = new Patient("�����");

        analysisResult.addObserver(patient1);
        analysisResult.addObserver(patient2);

        analysisResult.updateResult("��������� �������: �����");

        analysisResult.removeObserver(patient1);

        analysisResult.updateResult("��������� �������: ��������� �������������� ������������");
    }
}
