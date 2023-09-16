package app;
import entidades.Disciplina;
import entidades.Professor;
public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor(0,"iago", "123");
        Disciplina d1 = new Disciplina(0,"poo", "ok...",p1);
        System.out.println(d1.getNome());
        System.out.println(d1.getEmenta());

        System.out.println((d1.getProfessor().getNome()));
    }
}
