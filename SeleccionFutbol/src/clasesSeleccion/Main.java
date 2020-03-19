package clasesSeleccion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import org.w3c.dom.ls.LSInput;

public class Main {

	public static void main(String[] args) {
		try {
			File file = new File("src\\clasesSeleccion\\infoSeleccionFutbol.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader buffReader = new BufferedReader(fileReader);
			
			ArrayList<SeleccionFutbol> lstSeleccion = new ArrayList<SeleccionFutbol>();
			
			String linea = "";
			int contId = 1;

			while ((linea = buffReader.readLine()) != null) {
				String[] info = linea.split("~");

				if (info[0].equals("S")) {
					SeleccionFutbol seleccion = new Entrenador();
					seleccion.setId(contId);
					seleccion.setNombres(info[1]);
					seleccion.setApellidos(info[2]);
					seleccion.setEdad(Integer.parseInt(info[3]));
					lstSeleccion.add(seleccion);
				}
				else if (info[0].equals("E")) {
					lstSeleccion.add(new Entrenador(contId,info[1], info[2],Integer.parseInt(info[3]),Integer.parseInt(info[4])));
				}else if (info[0].equals("F")) {
						lstSeleccion.add(new Futbolista(contId, info[1], info[2], Integer.parseInt(info[3]), info[4],
								Integer.parseInt(info[5])));
				}else if(info[0].equals("AG")) {
					lstSeleccion.add(new Aguatero(contId, info[1], info[2], Integer.parseInt(info[3]), 
							Integer.parseInt(info[4]), Integer.parseInt(info[5]), Integer.parseInt(info[6]), Integer.parseInt(info[7])));
				}
       
				contId++;
			}
			
			for (int i = 0; i < lstSeleccion.size(); i++) {
				
				if (lstSeleccion.get(i) instanceof Entrenador && ((Entrenador)lstSeleccion.get(i)).getIdFederacion() == 0) {
					System.out.println("==== SELECCION ====");
					((Entrenador) lstSeleccion.get(i)).Viajar();
					((Entrenador) lstSeleccion.get(i)).Concentrarse();
					((Entrenador) lstSeleccion.get(i)).PartidoFutbol();
					System.out.println("=================");
				} else if (lstSeleccion.get(i) instanceof Entrenador) {
					System.out.println("==== ENTRENADOR ====");
					((Entrenador) lstSeleccion.get(i)).Viajar();
					((Entrenador) lstSeleccion.get(i)).Concentrarse();
					((Entrenador) lstSeleccion.get(i)).PartidoFutbol();
					((Entrenador) lstSeleccion.get(i)).PlanificarEntrenamiento();
					((Entrenador) lstSeleccion.get(i)).Entrenamiento();
					System.out.println("=================");
				} else if( lstSeleccion.get(i) instanceof Futbolista) {
					System.out.println("==== FUTBOLISTA ====");
					((Futbolista) lstSeleccion.get(i)).Viajar();
					((Futbolista) lstSeleccion.get(i)).Concentrarse();
					((Futbolista) lstSeleccion.get(i)).PartidoFutbol();
					System.out.println("El jugador a marcado " + ((Futbolista) lstSeleccion.get(i)).darPosicion());
					((Futbolista) lstSeleccion.get(i)).Entrenamiento();
					System.out.println("================="); 
						
				}else if(lstSeleccion.get(i) instanceof Aguatero) {
					System.out.println("==== AGUATERO ====");
					((Aguatero) lstSeleccion.get(i)).Viajar();
					((Aguatero) lstSeleccion.get(i)).Concentrarse();
					((Aguatero) lstSeleccion.get(i)).PartidoFutbol();
					((Aguatero) lstSeleccion.get(i)).Entrenamiento();
					((Aguatero) lstSeleccion.get(i)).ResultadoDeHidratacion();
					System.out.println("=================");
				}
			}
			
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}

	}
	

}
