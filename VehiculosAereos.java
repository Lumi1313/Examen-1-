package examen1;
import javax.swing.JOptionPane;

public class VehiculosAereos {
	public static void main(String[]args) {
		byte opc=0;
		do {
			opc=Byte.parseByte(JOptionPane.showInputDialog("Menu Principal: Escoja su vehiculo\n 1) Avion\n 2) Avioneta\n 3) Helicoptero\n 4)Exit"));
			switch(opc) {
			case 1:
				JOptionPane.showMessageDialog(null, "Modo de personalizacion de Aviones");
				byte menuAvion=0;
				do {
					menuAvion=Byte.parseByte(JOptionPane.showInputDialog("1) Carga\n 2) Pasajeros\n 3) Militar\n 4) Salir del programa"));
					switch(menuAvion) {
					
					case 1:
						JOptionPane.showMessageDialog(null, "Creando Avion de Carga...");
						AvionesCarga AvionCargaPrueba= new AvionesCarga();
						
						
						AvionCargaPrueba.setPaisElab(JOptionPane.showInputDialog("Pais:"));
						
						AvionCargaPrueba.configFUV(JOptionPane.showInputDialog("Filtro UV: (Responda Si o No)"));
						
						JOptionPane.showMessageDialog(null, AvionCargaPrueba.getInfo());
						
						break;
						
					case 2: 
						JOptionPane.showMessageDialog(null, "Creando Avion de Pasajeros...");
						AvionesPasajeros AvionPasajeroPrueba= new AvionesPasajeros();
						
						AvionPasajeroPrueba.setPaisElab(JOptionPane.showInputDialog("Pais:"));
							
						AvionPasajeroPrueba.configFUV(JOptionPane.showInputDialog("Filtro UV: (Responda Si o No)"));
						System.out.println(AvionPasajeroPrueba.getfiltroUV());
						
						JOptionPane.showMessageDialog(null, AvionPasajeroPrueba.getInfo());
						
						break;
						
					case 3: 
						JOptionPane.showMessageDialog(null, "Creando Avion Militar...");
						AvionesMilitares AvionMilitarPrueba= new AvionesMilitares();
						
						AvionMilitarPrueba.setPaisElab(JOptionPane.showInputDialog("Pais:"));
						
						AvionMilitarPrueba.configFUV(JOptionPane.showInputDialog("Filtro UV: (Responda Si o No)"));
						
						AvionMilitarPrueba.setCamuflaje(JOptionPane.showInputDialog("Camuflaje (Responda Si o No)"));
						
						AvionMilitarPrueba.setBlindado(JOptionPane.showInputDialog("Blindado Doble: (Responda Si o No)"));
						
						
						JOptionPane.showMessageDialog(null, AvionMilitarPrueba.getInfo());
									
							break;
					case 4:
						menuAvion=4;
							break;
					default:
							JOptionPane.showMessageDialog(null, "Por favor escoja una opcion correcta.");
							break;
								}
							}
				while (menuAvion!=4); 
				System.exit(0);
							
					//Avionetas	
			case 2:
				JOptionPane.showMessageDialog(null, "Modo de personalizacion de Avionetas");
				byte menuAvionetas=0;
				do {
					menuAvionetas=Byte.parseByte(JOptionPane.showInputDialog("1) Carreras\n 2) Celebracion\n 4) Salir\n"));
					switch(menuAvionetas) {
								
								case 1:
									JOptionPane.showMessageDialog(null, "Creando Avioneta de Carrera...");
									AvionetasCarreras AvionetaCarrera= new AvionetasCarreras();
									  
									  AvionetaCarrera.setPaisElab(JOptionPane.showInputDialog("Pais:"));
									  
									  AvionetaCarrera.setTurbo(JOptionPane.showInputDialog("Opcion Turbo (Responda Si o No)"));
									  
									  AvionetaCarrera.setColor(JOptionPane.showInputDialog("Color:"));
									 
									  AvionetaCarrera.setHelices(JOptionPane.showInputDialog("Helices Dobles: (Responda Si o No)"));
									  
									  JOptionPane.showMessageDialog(null, AvionetaCarrera.getInfo());
									  
									break;
									
								case 2: 
									JOptionPane.showMessageDialog(null, "Creando Avioneta de Celebracion...");
									AvionetasCelebracion AvionetaCelebrar= new AvionetasCelebracion();
									  
									  AvionetaCelebrar.setPaisElab(JOptionPane.showInputDialog("Pais:"));
									
									  AvionetaCelebrar.setColor(JOptionPane.showInputDialog("Color:"));
							
									  AvionetaCelebrar.setHelices(JOptionPane.showInputDialog("Helices Dobles: (Responda Si o No)"));
									  
									  AvionetaCelebrar.setdispensadorHumo(JOptionPane.showInputDialog("\n Dispensador de Humo: (Responda con Si o No)"));
									  
									  JOptionPane.showMessageDialog(null, AvionetaCelebrar.getInfo());

									break;

								case 4:
								menuAvionetas=4;
								break;
								default:
								JOptionPane.showMessageDialog(null, "Por favor escoja una opcion valida.");
								break;
					
					}
					
							}
						while (menuAvionetas!=4); 
							System.exit(0);
							break;
							
					//Helicopteros
			case 3:
				JOptionPane.showMessageDialog(null, "Modo de personalizacion de Helicopteros");
				byte menuHelicopteros=0;
				do {
					menuHelicopteros=Byte.parseByte(JOptionPane.showInputDialog("1) Militar\n 2) Transporte\n 4) Salir\n"));
					switch(menuHelicopteros) {
					
					case 1:
						JOptionPane.showMessageDialog(null, "Creando Helicoptero Militar...");
						HelicopterosMilitares HelicopteroMilitar= new HelicopterosMilitares();
						
						HelicopteroMilitar.setPaisElab(JOptionPane.showInputDialog("Pais:"));
						
						HelicopteroMilitar.setColor(JOptionPane.showInputDialog("Color:"));
						
						HelicopteroMilitar.setCamuflaje(JOptionPane.showInputDialog("Camuflaje: (Responda Si o No)"));
						
						HelicopteroMilitar.setBlindado(JOptionPane.showInputDialog("Blindado Doble: (Responda Si o No)"));
						
						JOptionPane.showMessageDialog(null, HelicopteroMilitar.getInfo());
						
						break;
						
					case 2: 
						JOptionPane.showMessageDialog(null, "Creando Helicoptero de Transporte...");
						HelicopterosTransporte HelicopteroTransporte= new HelicopterosTransporte();
											
						HelicopteroTransporte.setPaisElab(JOptionPane.showInputDialog("Pais:"));
						
						HelicopteroTransporte.setColor(JOptionPane.showInputDialog("Color:"));
						
						HelicopteroTransporte.setHelices(JOptionPane.showInputDialog("Helices Dobles: (Responda Si o No)"));
						
						JOptionPane.showMessageDialog(null, HelicopteroTransporte.getInfo());
						
						break;
						
					case 4:
						menuHelicopteros=4;
						break;
					default:
						JOptionPane.showMessageDialog(null, "Por favor escoja una opcion valida.");
						break;
					}
				}while (menuHelicopteros!=4); 
				System.exit(0);
				break;
				
			case 4:
				opc=4;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Por favor escoja una opcion valida.");
				break;
			}
		}while (opc!=4);
		System.exit(0);
			}
	
}	
				