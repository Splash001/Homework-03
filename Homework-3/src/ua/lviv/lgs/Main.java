package ua.lviv.lgs;

public class Main {
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		r1.setLength(12.4);
		r1.setWidth(22.7);
		
		Round ro1 = new Round();
		ro1.setDiametr(22.2);
		ro1.setRadius(11.1);
		
		
		System.out.println("����� ������������ = " + r1.getArea());
		System.out.println("�������� ������������ = " + r1.getPerimetr());
		System.out.println("����� ���� = " + ro1.getRoundArea());
		System.out.println("������� ���� = " + ro1.getRoundLength());
		
		//just update
    }

}
