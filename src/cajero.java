import javax.swing.JOptionPane;

public class cajero {
//programa que simule un cajero automatico con un saldo 
	public static void main(String[] args) {
		
		/* declaramos como constante el monto inicial para poder tener una cuenta en el banco
		 luego la persona podra retirar o ahorrar mas dinero*/
		final int monto_inicial = 1000000;
		
		int opcion;  
		float ingreso, saldoActual, retiro;
		
		// el \n es para dar saltos de linea para que los mensajes salgan uno debajo de otro.
		opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico\n"
				+            "        BANKVIZCAINO \n"
				+ " Operacion que desea realizar\n"
				+ "1. ingresar dinero a la cuenta\n"
				+ "2. retirar dinero de la cuenta\n"
				+ "3. salir"));
		
		// utilizamos el condicional switch para darnos cuentas de las opciones que escogera el usuario
		switch(opcion) {
		case 1: ingreso = Integer.parseInt(JOptionPane.showInputDialog ("ingrese el dinero"));
				saldoActual = monto_inicial + ingreso;
				JOptionPane.showMessageDialog(null,"el saldo actual es " + saldoActual);
				break;
		
		case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("cantidad que desea retirar"));
			
			if(retiro>monto_inicial) {
				JOptionPane.showMessageDialog(null, "saldo insuficiente");
				
			}
			else {
				saldoActual = monto_inicial - retiro;
				JOptionPane.showMessageDialog(null, "espere\n"
						+ "retirando dinero\n"
						+   " dale OK\n "
						+ "para continuar");
				JOptionPane.showMessageDialog(null,"el saldo restante es: " + saldoActual);
				}
			   break;
			   
		case 3: JOptionPane.showMessageDialog(null, "salir");
		break;
		
		default: JOptionPane.showMessageDialog(null, "error de marcacion");
		break;
		} 
		
		

	}

}
