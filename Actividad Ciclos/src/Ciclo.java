import javax.swing.JOptionPane;

public class Ciclo {

	public static void main(String[] args) {
		int codMenuPpal=0, codMenuTipico=0, codMenuCarta=0, codMenuInternacional=0,contadorPlatos=0,
				cantPlatosTipicos=0,cantPlatosCarta=0,cantPlatosInternacional=0, valorPago=0;
		String nombre="";
		nombre=JOptionPane.showInputDialog("Ingrese su nombre");
		do {
			String menu = "Hola! "+nombre+"\nEL MENU DEL ES RESTAURANTE\n\n";
			menu+="1. Plato Tipico\n";
			menu+="2. Plato a la Carta\n";
			menu+="3. Plato Internacional\n";
			menu+="4. Salir\n\n";
			menu+="5. Imprimir Facutra\n";
			menu+="Por favor selecciones una opcion\n";
			codMenuPpal=Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (codMenuPpal) {
			case 1:
				do {
				String menuTipico="MENU TIPICO\n\n";
				menuTipico+="1. Arroz con chicharron y tajadas fritas\n";
				menuTipico+="2. Alitas con BBQ\n";
				menuTipico+="3. Arroz con pollo y verduras\n";
				menuTipico+="4. Volver\n";
				menu+="Por favor selecciones una opcion\n";
				codMenuTipico=Integer.parseInt(JOptionPane.showInputDialog(menuTipico));
				switch (codMenuTipico) {
				case 1:
					JOptionPane.showMessageDialog(null,"Se ha seleccionado Arroz con chicharron y trajadas fritas, el costo es de $"+17000);
					contadorPlatos++;
					cantPlatosTipicos++;
					valorPago+=17000;
					break;
				case 2:
					JOptionPane.showMessageDialog(null,"Se ha seleccionado Alitas con BBQ, el costo es de $"+15000);
					contadorPlatos++;
					cantPlatosTipicos++;
					valorPago+=15000;
					break;
				case 3:
					JOptionPane.showMessageDialog(null,"Se ha seleccionado Arroz con pollo y verduras, el costo es de $"+10500);
					contadorPlatos++;
					cantPlatosTipicos++;
					valorPago+=10500;
					break;
				case 4:
					break;
				default:
					JOptionPane.showMessageDialog(null, "La orden que desee seleccionar no esta.");
					break;
				}
				codMenuTipico=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menu tipico, "
						+ "de lo contrario ingrese 2 para volver al menu principal "));
				if (codMenuTipico!=1) {
					codMenuTipico=4;
				}
				}while(codMenuTipico!=4);
				
				break;
			case 2:
				do {
				String menuCarta="MENU A LA CARTA\n\n";
				menuCarta+="1. Risoto\n";
				menuCarta+="2. Bandeja paisa\n";
				menuCarta+="3. Frijolada\n";
				menuCarta+="4. Volver\n\n";
				menu+="Por favor selecciones una opcion\n";
				codMenuCarta=Integer.parseInt(JOptionPane.showInputDialog(menuCarta));
				switch (codMenuCarta) {
				case 1:
					JOptionPane.showMessageDialog(null, "Se ha seleccionado Risoto, el costo es de $"+8000);
					contadorPlatos++;
					cantPlatosCarta++;
					valorPago+=8000;
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Se ha seleccionado Bandeja paisa, el costo es de $"+28000);
					contadorPlatos++;
					cantPlatosCarta++;
					valorPago+=28000;
					break;
				case 3:
					JOptionPane.showInternalMessageDialog(null, "Se ha seleccionado Frijolada, el costo es de $"+23000);
					contadorPlatos++;
					cantPlatosCarta++;
					valorPago+=23000;
					break;
				case 4:
					break;
				default:
					JOptionPane.showMessageDialog(null, "La orden que desee seleccionar no esta.");
					break;
				}
				codMenuCarta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menu a la Carta, "
						+ "de lo contrario ingrese 2 para volver al menu principal "));
				if (codMenuCarta!=1) {
					codMenuCarta=4;
				}
				}while(codMenuCarta!=4);
				break;
			case 3:
				do {
				String menuInternacional="MENU INTERNACIONAL\n\n";
				menuInternacional+="1. Paella\n";
				menuInternacional+="2. Boloñesa\n";
				menuInternacional+="3. Sancochada\n";
				menuInternacional+="4. Volver\n";
				menu+="Por favor selecciones una opcion\n";
				codMenuInternacional=Integer.parseInt(JOptionPane.showInputDialog(menuInternacional));
				switch (codMenuInternacional) {
				case 1:
					JOptionPane.showMessageDialog(null, "Se ha seleccionado Paella, el costo es de $"+23500);
					contadorPlatos++;
					cantPlatosInternacional++;
					valorPago+=23500;
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Se ha seleccionado Boloñesa, el costo es de $"+12000);
					contadorPlatos++;
					cantPlatosInternacional++;
					valorPago+=12000;
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Se ha seleccionado Sanchochada, el costo es de $"+17000);
					contadorPlatos++;
					cantPlatosInternacional++;
					valorPago+=17000;
					break;
				case 4:
					break;
				default:
					JOptionPane.showMessageDialog(null, "La orden que desee seleccionar no esta.");
					break;
				}
				codMenuInternacional=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menu Internacional, "
						+ "de lo contrario ingrese 2 para volver al menu principal "));
				if (codMenuInternacional!=1) {
					codMenuInternacional=4;
				}
				}while(codMenuInternacional!=4);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Lo siento por no cumplir tus espectativas",":(",JOptionPane.WARNING_MESSAGE);
				break;
			case 5:
				String factura="Hola "+nombre+" su factura:\n\n";
				factura+="-La cantidad de platos procesados es: "+contadorPlatos;
				factura+="\n-La cantidad de platos Tipicos pedidos es: "+cantPlatosTipicos;
				factura+="\n-La cantidad de platos a la Carta pedidos es:"+cantPlatosCarta;
				factura+="\n-La cantidad de platos Internacionales pedidos es: "+cantPlatosInternacional;
				factura+="\n-Cantitad total a pagar: "+valorPago;
				System.out.println(factura);
				break;
			default:
				JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido ", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
				break;
			}
		} while (codMenuPpal!=4 && codMenuPpal!=5);	
	}
	

}
