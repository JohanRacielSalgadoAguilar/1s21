public class p2p10{
	public static void main(String[] args) {
		if (args.length == 3){
			char operacion = args[1].charAt(0);
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[2]);
			int r = 0;
			switch(operacion){
			case 'x':r=a*b; break;
			case '+':r=a+b; break;
			case '-':r=a+b; break;
			case '/':r=a/b; break;
			}
			System.out.println("No se puede la operacion " + r);
		}else{
			System.out.println("No se puede realizar la operacion");
		}
	}
}