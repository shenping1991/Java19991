
public class PrimitiveTypeTest {
	
	public static void main(String[] args) {
		//byte
		System.out.println("�������ͣ�byte ������λ����"+Byte.SIZE);
		System.out.println("��װ�ࣺjava.lang.Byte");
		System.out.println("��Сֵ��Byte.MIN_VAlUE="+Byte.MIN_VALUE);
		System.out.println("���ֵ��Byte.Max_Value="+Byte.MAX_VALUE);
		
		//short
		System.out.println("�������ͣ�short ������λ����"+Short.SIZE);
		System.out.println("��װ�ࣺjava.lang.Short");
		System.out.println("��Сֵ��Short.MIN_VALUE="+Short.MIN_VALUE);
		System.out.println("���ֵ��Short_MAX_VALUE="+Short.MAX_VALUE);
		System.out.println();
		
		//Integer
		System.out.println("�������ͣ�int ������λ����"+Integer.SIZE);
		System.out.println("��װ�ࣺjava.lang.Integer");
		System.out.println("��Сֵ��Integer.MIN_VALUE="+Integer.MIN_VALUE);
		System.out.println("���ֵ��Integer.MAX_VALUE="+Integer.MAX_VALUE);
		System.out.println();
		
		//long
		System.out.println("�������ͣ�long ������λ����"+Long.SIZE);
		System.out.println("��װ�ࣺjava.lang.Long");
		System.out.println("��Сֵ��Long.MIN_VALUE="+Long.MIN_VALUE);
		System.out.println("���ֵ��Long.MAX_VALUE="+Long.MAX_VALUE);
		System.out.println();
		
		//float
		System.out.println("�������ͣ�float ������λ����"+Float.SIZE);
		System.out.println("��װ�ࣺjava.lang.Float");
		System.out.println("��Сֵ��Float.MIN_VALUE="+Float.MIN_VALUE);
		System.out.println("���ֵ��Float.MAX_VALUE="+Float.MAX_VALUE);
		System.out.println();
		
		//double
		System.out.println("�������ͣ�double ������λ����"+Double.SIZE);
		System.out.println("��װ�ࣺjava.lang.Double");
		System.out.println("��Сֵ��Double.MIN_VALUE="+Double.MIN_VALUE);
		System.out.println("���ֵ��Double.MAX_VALUE="+Double.MAX_VALUE);
		System.out.println();//
		
		
		//char
		System.out.println("�������ͣ�char ������λ����"+Character.SIZE);
		System.out.println("��װ�ࣺjava.lang.Character");
		System.out.println("��Сֵ��Character.MIN_VALUE="+(int)Character.MIN_VALUE);
		System.out.println("���ֵ��Character.MAX_VALUE="+(int)Character.MAX_VALUE);
		System.out.println();
		
		//����
		final double PI=3.1415927;
		//ǰ׺ 0 ��ʾ 8 ���ƣ���ǰ׺ 0x ���� 16 ����
		int a=0144;
		int b=0x64;
		System.out.println(b);
		//��  ------------------------------------>  ��
		//byte,short,char��> int ��> long��> float ��> double
		
	}
	
	
}
