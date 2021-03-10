import java.util.Scanner;

public class portafolio {

	public static void main(String[] args) {
		
		
		String datoComandos [] = new String[26];
		String respuestaComandos [] = new String [26];
		
		datoComandos [0]="pwd";
		datoComandos [1]="ls";
		datoComandos [2]="cd";
		datoComandos [3]="mkdir";
		datoComandos [4]="rmdir";
		datoComandos [5]="cp";
		datoComandos [6]="touch";
		datoComandos [7]="cat";
		datoComandos [8]="head";
		datoComandos [9]="clear";
		datoComandos [10]="rm";
		datoComandos [11]="mv";
		datoComandos [12]="grep";
		datoComandos [13]="sed";
		datoComandos [14]="chown";
		datoComandos [15]="sudo";
		datoComandos [16]="chmod";
		datoComandos [17]="apt";
		datoComandos [18]="locate";
		datoComandos [19]="/";
		datoComandos [20]="$";
		datoComandos [21]="..";
		datoComandos [22]=".";
		datoComandos [23]="tail";
		datoComandos [24]="nl";
		datoComandos [25]="gzip";
		
		
		respuestaComandos [0]="muestra la dirección actual en que te encuentras.";
		respuestaComandos [1]="permite desplegar un listado del contenido de la carpeta actual";
		respuestaComandos [2]="permite movilizarte entre directorios.";
		respuestaComandos [3]="permite crear un directorio nuevo";
		respuestaComandos [4]="permite eliminar un directorio ( no se puede eliminar un directorio con contenido).";
		respuestaComandos [5]="permite copiar un archivo especificando el nombre del archivo con su extensión y el lugar a donde se desea movilizar.";
		respuestaComandos [6]="con este comando puedes crear un documento .txt";
		respuestaComandos [7]="podemos crear un .txt y ver el contenido de un archivo";
		respuestaComandos [8]="el comando head seguido del nombre de un archivo muestra el contenido de las primeras líneas.";
		respuestaComandos [9]="este comando limpia la terminal.";
		respuestaComandos [10]="permite eliminar un archivo, especificando luego del comando el nombre del archivo con su extensión.";
		respuestaComandos [11]="permite movilizar un archivo de un directorio a otro.";
		respuestaComandos [12]="este comando permite localizar entre las líneas del documento si existe la palabra que le indiquemos.";
		respuestaComandos [13]="este comando permite sustituir una palabra por otra en Todo el flujo del documento a momento de mostrarse este comando no modifica el archivo.";
		respuestaComandos [14]="con este comando cambiamos al propietario del archivo con permisos de administrador.";
		respuestaComandos [15]="este comando sirve para utilizar diferentes comando como superusuario";
		respuestaComandos [16]="permite cambiar los permisos de acceso de un archivo o de un directorio.";
		respuestaComandos [17]="este se utiliza para las distribuciones de linux basadas en Debian tales como ubuntu.";
		respuestaComandos [18]="con el comando (locate) seguido del nombre del archivo podemos realizar una busqueda del mismo para ello es necesario tomar en cuenta que este comando debe de actualizarse periodicamente";
		respuestaComandos [19]="indica el directorio raíz del sistema operativo";
		respuestaComandos [20]="indica el directorio del usuario";
		respuestaComandos [21]="indica que es el directorio padre";
		respuestaComandos [22]="indica el directorio actual";
		respuestaComandos [23]="este comando realiza todo lo contrario del comando head";
		respuestaComandos [24]="muestra el documento con la lineas enumeradas sin embargo no toma en cuenta las lineas vasias pero con algunas opciones podemos ver con mas detalles.";
		respuestaComandos [25]="con este comando seguido del nombre del archivo podremos comprimir el su tamaño en un archivo .gz";
		

		boolean Programas = true;
		
		
		
		System.out.println("Bienvenido a mi portafolio");
		System.out.println("------------------------------------------------------------------");
		System.out.println("porfavor escribe un comando de ubuntu para saber para que funciona");
		System.out.println("------------------------------------------------------------------");
		
		do {
			Scanner Ingresar = new Scanner(System.in);
			System.out.println("ingrese aqui: ");
			String Dato = Ingresar.nextLine();
			
			int correcto = 0;	
			
			for(int i=0;i<=25;i++) {
				
			if (Dato.equalsIgnoreCase(datoComandos[i])) {
				System.out.println("------------------------------------------------------------------");
				System.out.println("Elegiste: "+datoComandos[i]);
				System.out.println("Descripcion: "+respuestaComandos[i]);
				correcto=1;
				
			}else if (Dato.equals("exit")) {
				Programas = false;
				correcto =1;
				
			
			   }
			
			}
			
			
			if (correcto==0) {
				System.out.println("------------------------------------------------------------------");
				System.out.println("El comando es incorecto o no esta en mis archivos :c");
			}
			
		} while (Programas);
			
			
	}

}


