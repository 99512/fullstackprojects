package switchandloops;

public class ForEachLoop {
		public static void main(String[] arg) {
			int a[]=new int[5],i;
			a[0]=12;
			a[1]=23;
			a[2]=23;
			a[3]=23;
			a[4]=23;
			int b=5;
			for(i=0;i<=4;i++) {
				System.out.println(a[i]);
			}
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
			for(int j:a) {
				System.out.println(j);
				
			}
}
	}



