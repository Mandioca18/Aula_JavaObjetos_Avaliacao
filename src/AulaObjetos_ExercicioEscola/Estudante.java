package AulaObjetos_ExercicioEscola;
public class Estudante {
    String nome;

    String curso;

    Avaliacao_Estudante notas;

    public Estudante (String nome, String curso, Avaliacao_Estudante notas) { //Definindo Construtor Para o Classe Estudante

        this.nome = nome; //
        this.curso = curso;
        this.notas = notas;

    }

    void info(){ //Definindo Método info Para a Classe Estudante
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Media Aritmetica: " + notas.mediaAritimetica());
        System.out.println("Media Ponderada: " + notas.mediaPonderada() + "\n");
    }

}
