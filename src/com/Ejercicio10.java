package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    HashMap<String, String> dictionary = new HashMap<>();
	    //Aquí se escriben todos los pares de palabras
	    dictionary.put("arbol", "tree");
	    dictionary.put("araña", "spider");
	    dictionary.put("espía", "spy");
	    dictionary.put("era", "age");
	    dictionary.put("cocodrilo", "crocodile");
	    dictionary.put("tesoro", "treasure");
	    dictionary.put("hola", "hello");
	    dictionary.put("gato", "cat");
	    dictionary.put("casa", "house");
	    dictionary.put("hogar", "home");
	    dictionary.put("sol", "sun");
	    dictionary.put("libro", "book");
	    dictionary.put("agua", "water");
	    dictionary.put("amigo", "friend");
	    dictionary.put("ciudad", "city");
	    dictionary.put("trabajo", "work");
	    dictionary.put("tiempo", "time");
	    dictionary.put("feliz", "happy");
	    dictionary.put("perro", "dog");
	    dictionary.put("comida", "food");
	    dictionary.put("escuela", "school");
	    dictionary.put("craneo", "skull");

	    List<String> listKey = new ArrayList<>(dictionary.keySet());
	    int count = 0;
	    int numberQuestions = 5;
	    //Pregunta al usuario que ingresa la palabra en inglés de la palabra en español
	    for (int i = numberQuestions; i >= 1; i--) {
	      String spanishWord = listKey.get(new Random().nextInt(20));
	      System.out.println("Ingresa la traduccion del ingles de la siguiente palabra: " + spanishWord);
	      String englishWord = in.nextLine();
	      //contador de respuestas correctas
	      if (
	        englishWord
	          .toUpperCase()
	          .equals(dictionary.get(spanishWord).toUpperCase())
	      ) {
	        count++;
	      }
	    }
	    System.out.println("Respuestas correctas: " + count + " y respuestas incorrectas: " + (numberQuestions- count) + " de un total de preguntas: " + numberQuestions);
	    in.close();
	}
}

/*
Crear un programa en Java que realice lo siguiente:
Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
Utilizar un objeto HashMap para almacenar los pares de palabras.
Escoger al azar 5 palabras en español del mini diccionario.
Pedir al usuario que teclee la traducción al inglés de cada una de las palabras y comprobará si son correctas.
Al final debe mostrar por consola cuántas respuestas correctas e incorrectas tiene el usuario.
Al final de tu práctica, tienes que subir el ejercicio a tu repositorio de GitHub.
Colócalo en un repositorio llamado “logica-programacion-10”
*/