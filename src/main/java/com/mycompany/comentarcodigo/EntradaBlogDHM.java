package com.mycompany.comentarcodigo;


/**
 * Clase para manejar las entradas de un blog.
 * La clase se creó el 22/2/2023 por David Hernández.
 * Esta es la versión 1.0
 * @author david
 */
public class EntradaBlogDHM {
	//separador es el ccarácter que separa ENTRADA DE del
	//nombre del autor
	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
        /**
         * Constructor de la clase
         * @param id                            número de entrada
         * @param autor                         nombre del autor de la entrada
         * @param texto                         texto que contiene la entrada
         * @throws IllegalArgumentException     Si el número es negativo
         */
	public EntradaBlogDHM(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
        /**
         * Devuelve el número de la entrada
         * @return id
         */
	public int getId(){
		return this.id;
	}
	
        /**
         * devuelve el texto completo de la entrada
         * @return texto
         */
	public String getTexto(){
		return this.texto;
	}
	
        /**
         * devuelve el nombre del autor de la entrada en mayúsculas
         * @return author upperCase
         */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
        /**
         * devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
         * @return author
         */
	public String devuelveAutor(){
		return this.autor;
	}
	
        /**
         * No tiene porqué tener argumentos.
         * @param args 
         */
	public static void main(String[] args) {
		EntradaBlogDHM e1=new EntradaBlogDHM (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}
