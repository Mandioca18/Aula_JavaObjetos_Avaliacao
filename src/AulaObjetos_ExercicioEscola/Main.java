package AulaObjetos_ExercicioEscola;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Estudante a1 = new Estudante("Renato Gaúcho", "Técnico CBF", new Avaliacao_Estudante(5, 6, 7)); // Estudante a1 = Objeto
        Estudante a2 = new Estudante("Abel Ferreira", "Técnico CBF", new Avaliacao_Estudante(10, 8, 8.5));

        a1.info();
        a2.info();
    }
}
