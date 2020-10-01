package L7_ExpresionesRegulares;

public class ExpresionesRegulares {
	
	//MAIN
	public static void main(String[] args) {
		
		
	}
	
	//Validar int/Núm entero
	public static boolean validaNumeroEntero_Exp(String texto){
	    return texto.matches("^-?[0-9]+$");
	}
	
	//Validar entero positivo
	public static boolean validaNumeroEnteroPositivo_Exp(String texto){
		return texto.matches("^[0-9]+$");
	}
	
	//Validar número entero negativo
	public static boolean validaNumeroEnteroNegativo_Exp(String texto){    
	    return texto.matches("^-[0-9]+$");
	}
	
	
	//Validar DNI (8 números / Letra al final)
	public static boolean validaDNI_Exp(String DNI){
	    return DNI.matches("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");    
	}
	
	//Validar una IP
	public static boolean validaIP_Exp(String ip){    
	    return ip.matches("^(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
	}
	
	//Validar matrícula de coche/Europea 0000XXX
	public static boolean validarMatriculaEuropea_Exp(String matricula) {
	    return matricula.matches("^[0-9]{4}[A-Z]{3}$");
	}
	
	//Validar si es un número binario
	public static boolean validaBinario_Exp(String binario){
	    return binario.matches("^[0-1]+$");    
	}
	
	//Validar un número octal
	public static boolean validaOctal_Exp(String octal){
	    return octal.matches("^[0-7]+$");    
	}
	
	//Validar número hexadecimal
	public static boolean validaHexadecimal_Exp(String hexadecimal){
	    return hexadecimal.matches("^[0-9A-F]+$");    
	}
	
	//Validar un número real (positivo o negativo)
	public static boolean validaNumeroReal_Exp(String texto){
	    return texto.matches("^-?[0-9]+([\\.,][0-9]+)?$");
	}
	
	//Validar número real positivo
	public static boolean validaNumeroRealPositivo_Exp(String texto) {	 
	    return texto.matches("^[0-9]+([\\.,][0-9]+)?$");
	}
	
	//Validar número real negativo
	public static boolean validaNumeroRealNegativo_Exp(String texto){    
	    return texto.matches("^-[0-9]+([\\.,][0-9]+)$");
	}
	
	//Validar número real con 'x' decimales
	public static boolean validaNumeroReal_Exp(String texto, int num_deciamales) {
	    if (num_deciamales > 0) {
	        return texto.matches("^-?[0-9]+([\\.,][0-9]{1," + num_deciamales + "})?$");
	    } else {
	        return false;
	    }
	}
	
	//Validar número real positivo con decimales
	//@param num_deciamales numero de decimales maximo, no puede ser menor que cero
	public static boolean validaNumeroRealPositivo_Exp(String texto, int num_deciamales) {
	    if (num_deciamales > 0) {
	        return texto.matches("^[0-9]+([\\.,][0-9]{1," + num_deciamales + "})?$");
	    } else {
	        return false;
	    }
	}
	
	//Validar número real negativo
	public static boolean validaNumeroRealNegativo_Exp(String texto, int num_deciamales) {
	    if (num_deciamales > 0) {
	        return texto.matches("^-[0-9]+([\\.,][0-9]{1," + num_deciamales + "})?$");
	    } else {
	        return false;
	    }
	}
	
	//Validar fecha con formato dd/mm/aaaa
	public static boolean validaNumeroFecha_Exp(String texto) {	 
	    return texto.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[/\\/](19|20)\\d{2}$");
	}
	
	//Validar un nombre/Incluyendo a los nombres compuestos
	public static boolean validaNombre_Exp(String texto) {	 
	    return texto.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
	}
	
	//Validar un email
	public static boolean validar_Mail_Exp(String email) {
	    return email.matches("^([\\w-]+\\.)*?[\\w-]+@[\\w-]+\\.([\\w-]+\\.)*?[\\w]+$");
	}
	
	//Validar si es un usuario de twitter
	// empieza por @ y puede contener letras mayusculas y minusculas, numeros, guiones y guiones bajos.
	public static boolean validarUsuarioTwitter_Exp(String usuario_twitter) {
	    return usuario_twitter.matches("^@([A-Za-z0-9_]{1,15})$");
	}
	
	
	//Valorar IBSN
	//13 dígitos
	// Siempre empiezza en 978 o 979
	public static boolean validarISBN13_Exp(String ISBN) {
	    return ISBN.matches("^(978|979)[0-9]{9}$");
	}

}
