package homework4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("������:\n"
				+ "1) ������� � ������� One Two Three\n"
				+ "2) ��� ����� 563.25638 ��������� ���������� 5+6-3+2-5+6-3+8\n"
				+ "3) ����� ����������� ����� - 200000. ������� ������� ������� ������\n"
				);

		System.out.print("������� ����� ������, ��������� ������� ����� ������� - ");
		Scanner sc= new Scanner(System.in);
        int n_task=sc.nextInt();
	        
		Zadanija res_zadanija = new Zadanija();
        switch (n_task) {
            case 1:  res_zadanija._1();
                     break;
            case 2:  res_zadanija._2();
                     break;
            case 3:  res_zadanija._3();
                     break;
            default: System.out.println("�� ����� ����� ����� ����");
                     break;
        }
  
	}

}
