import java.util.List;
import java.util.Scanner;

public class Workshop {
    public static void main(String[] args) {
    }
    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        //return a+b;
        int c = a + b;
        return c;
    }
    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        // TODO: Implementar el método para retornar el mayor de los tres números enteros.
        // Ejemplo: Si a = 3, b = 7, y c = 5, el resultado debería ser 7.
        if (a >= b && a >= c) return a;
        if (b >= c) return b;
        return c;
    }
    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        // TODO: Implementar el método para retornar la tabla de multiplicar del número dado.
        // Ejemplo: Si numero = 2 y limite = 5, el resultado debería ser [2, 4, 6, 8, 10].
        int[] resultado = new int[limite];
        for (int i = 0; i < limite; i++) {
            resultado[i] = numero * (i + 1);
        }
        return resultado;
    }
    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        // TODO: Implementar el método para calcular el factorial de un número entero.
        // Ejemplo: Si n = 5, el resultado debería ser 120.
        // Lanzar IllegalArgumentException si n es negativo.
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        // TODO: Implementar el método para verificar si un número es primo.
        // Ejemplo: Si numero = 7, el resultado debería ser true.
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        // TODO: Implementar el método para generar la serie de Fibonacci hasta el número n.
        // Ejemplo: Si n = 5, el resultado debería ser [0, 1, 1, 2, 3].
        // Lanzar IllegalArgumentException si n es negativo.
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        int[] resultado = new int[n];
        if (n > 0) {
            resultado[0] = 0;
        }
        if (n > 1) {
            resultado[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            resultado[i] = resultado[i - 1] + resultado[i - 2];
        }
        return resultado;
    }
    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        // TODO: Implementar el método para sumar todos los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 15.
        if (arreglo == null) {
            return 0;
        }
        int suma = 0;
        for (int numero : arreglo) {
            suma += numero;
        }
        return suma;
    }
    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        // TODO: Implementar el método para calcular el promedio de los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        if (arreglo == null || arreglo.length == 0) {
            return 0.0;
        }
        double suma = 0;
        for (int numero : arreglo) {
            suma += numero;
        }
        return suma / arreglo.length;
    }
    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento mayor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 5.
        if (arreglo == null || arreglo.length == 0) {
            return 0;
        }
        int mayor = arreglo[0];
        for (int numero : arreglo) {
            if (numero > mayor) {
                mayor = numero;
            }
        }
        return mayor;
    }
    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento menor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 1.
        if (arreglo == null || arreglo.length == 0) {
            return 0;
        }
        int menor = arreglo[0];
        for (int numero : arreglo) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }
    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        // TODO: Implementar el método para buscar un elemento en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y elemento = 3, el resultado debería ser true.
        if (arreglo == null) {
            return false;
        }
        for (int numero : arreglo) {
            if (numero == elemento) {
                return true;
            }
        }
        return false;
    }
    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        // TODO: Implementar el método para invertir un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser [5, 4, 3, 2, 1].
        if (arreglo == null) {
            return new int[0];
        }
        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }
    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        // TODO: Implementar el método para ordenar un arreglo en orden ascendente.
        // Ejemplo: Si arreglo = [5, 4, 3, 2, 1], el resultado debería ser [1, 2, 3, 4, 5].
        if (arreglo == null) {
            return new int[0];
        }
        int[] ordenado = arreglo.clone();
        java.util.Arrays.sort(ordenado);
        return ordenado;
    }
    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        // TODO: Implementar el método para eliminar los duplicados de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 2, 3, 4, 4, 5], el resultado debería ser [1, 2, 3, 4, 5].
        if (arreglo == null) {
            return new int[0];
        }
        java.util.LinkedHashSet<Integer> conjunto = new java.util.LinkedHashSet<>();
        for (int numero : arreglo) {
            conjunto.add(numero);
        }
        int[] resultado = new int[conjunto.size()];
        int i = 0;
        for (int numero : conjunto) {
            resultado[i++] = numero;
        }
        return resultado;
    }
    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        // TODO: Implementar el método para combinar dos arreglos en uno solo.
        // Ejemplo: Si arreglo1 = [1, 2, 3, 4, 5] y arreglo2 = [6, 7, 8], el resultado debería ser [1, 2, 3, 4, 5, 6, 7, 8].
        int l1 = (arreglo1 == null) ? 0 : arreglo1.length;
        int l2 = (arreglo2 == null) ? 0 : arreglo2.length;
        int[] resultado = new int[l1 + l2];
        int index = 0;
        if (arreglo1 != null) {
            for (int numero : arreglo1) {
                resultado[index++] = numero;
            }
        }
        if (arreglo2 != null) {
            for (int numero : arreglo2) {
                resultado[index++] = numero;
            }
        }
        return resultado;
    }
    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        // TODO: Implementar el método para rotar un arreglo n posiciones.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y posiciones = 2, el resultado debería ser [3, 4, 5, 1, 2].
        if (arreglo == null || arreglo.length == 0) {
            return new int[0];
        }
        int n = arreglo.length;
        int p = posiciones % n;
        if (p < 0) {
            p += n;
        }
        int[] resultado = new int[n];
        for (int i = 0; i < n; i++) {
            resultado[i] = arreglo[(i + p) % n];
        }
        return resultado;
    }
    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        // TODO: Implementar el método para contar el número de caracteres en una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser 5.
        if (cadena == null) {
            return 0;
        }
        return cadena.length();
    }
    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        // TODO: Implementar el método para invertir una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser "olleH".
        if (cadena == null) {
            return "";
        }
        return new StringBuilder(cadena).reverse().toString();
    }
    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        // TODO: Implementar el método para verificar si una cadena es un palíndromo.
        // Ejemplo: Si cadena = "madam", el resultado debería ser true.
        if (cadena == null) {
            return false;
        }
        String limpia = cadena.replaceAll("\\s+", "").toLowerCase();
        String invertida = new StringBuilder(limpia).reverse().toString();

        return limpia.equals(invertida);
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        // TODO: Implementar el método para contar el número de palabras en una cadena.
        // Ejemplo: Si cadena = "Este es un test", el resultado debería ser 4.
        if (cadena == null || cadena.trim().isEmpty()) {
            return 0;
        }
        return cadena.trim().split("\\s+").length;
    }
    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a mayúsculas.
        // Ejemplo: Si cadena = "hello", el resultado debería ser "HELLO".
        return cadena.toUpperCase();
    }
    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a minúsculas.
        // Ejemplo: Si cadena = "HELLO", el resultado debería ser "hello".
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        // TODO: Implementar el método para reemplazar una subcadena en una cadena por otra subcadena.
        // Ejemplo: Si cadena = "Hello Java", antiguaSubcadena = "Java", y nuevaSubcadena = "world", el resultado debería ser "Hello world".
        if (cadena == null || antiguaSubcadena == null) {
            return cadena;
        }
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }
    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
        // Ejemplo: Si cadena = "Hello world" y subcadena = "world", el resultado debería ser 6.
        if (cadena == null || subcadena == null) {
            return -1;
        }
        return cadena.indexOf(subcadena);
    }
    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        // TODO: Implementar el método para validar un correo electrónico.
        // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.
        if (correo == null) {
            return false;
        }
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        return correo.matches(regex);
    }
    // Método que calcula el promedio de una lista de números
    public double promedioLista(List<Integer> lista) {
        // TODO: Implementar el método para calcular el promedio de una lista de números.
        // Ejemplo: Si lista = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        if (lista == null || lista.isEmpty()) {
            return 0.0;
        }
        double suma = 0;
        for (int numero : lista) {
            suma += numero;
        }
        return suma / lista.size();
    }
    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        // TODO: Implementar el método para convertir un número en su representación binaria.
        // Ejemplo: Si numero = 10, el resultado debería ser "1010".
        return Integer.toBinaryString(numero);
    }
    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        // TODO: Implementar el método para convertir un número en su representación hexadecimal.
        // Ejemplo: Si numero = 255, el resultado debería ser "FF".
        return Integer.toHexString(numero).toUpperCase();
    }
    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
        // Las reglas del juego son:
        // - Piedra vence a Tijera y Lagarto
        // - Papel vence a Piedra y Spock
        // - Tijera vence a Papel y Lagarto
        // - Lagarto vence a Spock y Papel
        // - Spock vence a Tijera y Piedra
        // El método debe retornar un mensaje indicando el resultado del juego.
        // Ejemplo: Si la eleccionUsuario es "Piedra", el resultado podría ser "Ganaste" o "Perdiste" dependiendo de la elección de la computadora.
        if (eleccionUsuario == null) {
            return "Elección inválida";
        }
        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
        String computadora = opciones[new java.util.Random().nextInt(opciones.length)];
        String usuario = eleccionUsuario.trim();
        if (usuario.equalsIgnoreCase(computadora)) {
            return "Empate. La computadora eligió " + computadora;
        }
        boolean ganaUsuario = false;
        String u = usuario.toLowerCase();
        String c = computadora.toLowerCase();
        if (u.equals("piedra") && (c.equals("tijera") || c.equals("lagarto"))) {
            ganaUsuario = true;
        } else if (u.equals("papel") && (c.equals("piedra") || c.equals("spock"))) {
            ganaUsuario = true;
        } else if (u.equals("tijera") && (c.equals("papel") || c.equals("lagarto"))) {
            ganaUsuario = true;
        } else if (u.equals("lagarto") && (c.equals("spock") || c.equals("papel"))) {
            ganaUsuario = true;
        } else if (u.equals("spock") && (c.equals("tijera") || c.equals("piedra"))) {
            ganaUsuario = true;
        }
        if (ganaUsuario) {
            return "¡Ganaste! La computadora eligió " + computadora;
        } else {
            return "Perdiste. La computadora eligió " + computadora;
        }
    }
    public String pptls2(String game[]) {
        //Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
        Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
         */
        if (game == null || game.length < 2) {
            return "Entrada inválida";
        }
        String p1 = game[0].trim().toUpperCase();
        String p2 = game[1].trim().toUpperCase();
        if (p1.equals(p2)) {
            return "Empate";
        }
        boolean p1Wins = false;
        // Reglas: (R=Rock, P=Paper, S=Scissors, L=Lizard, V=Spock)
        if ((p1.equals("S") && p2.equals("P")) ||
                (p1.equals("P") && p2.equals("R")) ||
                (p1.equals("R") && p2.equals("L")) ||
                (p1.equals("L") && p2.equals("V")) ||
                (p1.equals("V") && p2.equals("S")) ||
                (p1.equals("S") && p2.equals("L")) ||
                (p1.equals("L") && p2.equals("P")) ||
                (p1.equals("P") && p2.equals("V")) ||
                (p1.equals("V") && p2.equals("R")) ||
                (p1.equals("R") && p2.equals("S"))) {
            p1Wins = true;
        }
        return p1Wins ? "Player 1" : "Player 2";
    }
    public double areaCirculo(double radio) {
        if (radio < 0) {
            return 0.0;
        }
        return Math.PI * radio * radio;
    }
    public String zoodiac(int day, int month) {
        if ((month == 1 && day >= 20 && day <= 31) || (month == 2 && day >= 1 && day <= 18)) return "Aquarius";
        if ((month == 2 && day >= 19 && day <= 29) || (month == 3 && day >= 1 && day <= 20)) return "Pisces";
        if ((month == 3 && day >= 21 && day <= 31) || (month == 4 && day >= 1 && day <= 19)) return "Aries";
        if ((month == 4 && day >= 20 && day <= 30) || (month == 5 && day >= 1 && day <= 20)) return "Taurus";
        if ((month == 5 && day >= 21 && day <= 31) || (month == 6 && day >= 1 && day <= 20)) return "Gemini";
        if ((month == 6 && day >= 21 && day <= 30) || (month == 7 && day >= 1 && day <= 22)) return "Cancer";
        if ((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 22)) return "Leo";
        if ((month == 8 && day >= 23 && day <= 31) || (month == 9 && day >= 1 && day <= 22)) return "Virgo";
        if ((month == 9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22)) return "Libra";
        if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21)) return "Scorpio";
        if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21)) return "Sagittarius";
        if ((month == 12 && day >= 22 && day <= 31) || (month == 1 && day >= 1 && day <= 19)) return "Capricorn";
        return "Fecha inválida";
    }
}

