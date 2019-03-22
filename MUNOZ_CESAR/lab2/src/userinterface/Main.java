package userinterface;
import model.*;
import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Bienvenido al zoo");
		System.out.println("Seleccione una opcion");
		System.out.println("1. Calcular area de ambiente para Canguros");
		System.out.println("2. Determinar cantidad de alimento para los Canguros");
		System.out.println("3. Consultar el tiempo próximo para la vacunación de los Canguros");
		System.out.println("4. Determinar si un Canguro es propenso a enfermedades cardiacas");
		System.out.println("5. Enviar la notificación de alimento al límite de los Dragones");
		System.out.println("6. Calcular el consumo de agua de un Canguro");
		System.out.println("7. Calcular el consumo de agua de un Dragon Barbado");
		System.out.println("8. Crear Canguro");
		System.out.println("9. Agregar Canguro a un Ambiente ");
		System.out.println("10. Eliminar Canguro");
		System.out.println("11. Cambiar Canguro de Ambiente");
		System.out.println("12. Encontrar los animales del zoológico cuyos nombres empiezan y terminan en vocal");

		int option = input.nextInt();

		switch(option){
			case 1:
			System.out.println("Seleccione el ambiente del cual desea calcular el area");
			int environment = input.nextInt();
			System.out.println("El area calculada es: ");
			int environment = input.nextInt();
			break;

			case 2:
			System.out.println("Digite el peso del Canguro");
			double height = input.nextDouble();
			break;

			case 3:
			System.out.println("Digite el dia actual");
			int day = input.nextInt();
			System.out.println("Digite el mes actual");
			int month = input.nextInt();
			System.out.println("Digite el anio actual");
			int year = input.nextInt();
			break;

			case 4:
			System.out.println("Digite el IMC del Canguro");
			double bodyMassIndex = input.nextDouble();
			System.out.println("Digite el tipo de sangre del Canguro");
			String bloodType = input.nextLine();
			break;

			case 5:
			System.out.println("ALERTA, realizar suministro de alimento");
			String bloodType = input.nextLine();
			break;

			case 6:
			System.out.println("Digite el IMC");
			double bodyMassIndex = input.nextDouble();
			break;

			case 7:
			System.out.println("Digite el IMC");
			double bodyMassIndex = input.nextDouble();
			break;



			default:
			break;
		}

	}

}