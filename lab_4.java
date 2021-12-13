import java.util.Scanner;

/*
�������� ���������, ��������� �� �������������� ������� A ����������� N ��������, ������
������ ����� X. � ���������� ������ ���������� ������ �� ������� �����������. �� ����� ������
���������� ��� ������������ ��������� �������, ��� � ��������.
*/

public class lab_4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        //����������
        int array[], arraySize = 0;

        System.out.print("������� ����������� �������: ");
        while (!in.hasNextInt()) {
            System.out.println("������! ����������� ������ ���� ������! ���������� ��� ���.");
            System.out.print("������� ����������� �������: ");
            in.next();
        }
        arraySize = in.nextInt();


        //�����������
        array = new int[arraySize];
        int count_x = 0;

        //�������������
        for (int i = 0; i < array.length; i++) {
            System.out.print("������� " + i + "-� ������� �������: ");
            while (!in.hasNextInt()) {
                System.out.println("������! ������� ����� �����!");
                System.out.print("������� " + i + "-� ������� �������: ");
                in.next();
            }
            array[i] = in.nextInt();
        }

        System.out.print("������� ��������, ������� ����� ���������: ");
        while (!in.hasNextInt()) {
            System.out.println("������! ������� ����� �����!");
            System.out.print("������� ��������, ������� ����� ���������: ");
            in.next();
        }
        int X = in.nextInt();


        //������������ ��������� �������
        System.out.print("������ �� ���������� ���� ��������� " + X + ": ");
        for (int elem : array) {
            System.out.print(elem + " ");
            if (elem == X) {
                count_x++;
            }
        }
        System.out.println();



        //��������������
        int[] copy = new int[array.length - count_x];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != X) {
                copy[index] = array[i];
                index++;
            }
        }

        //�������� ��������� �������
        System.out.print("������ ����� ���������� ���� ��������� " + X + ": ");
        for (int elem : copy)
            System.out.print(elem + " ");
        System.out.println();

        in.close();
    }
}
