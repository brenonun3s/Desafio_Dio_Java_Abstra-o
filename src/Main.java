
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("DESCRIÇÃO CURSO JAVA");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("DESCRIÇÃO CURSO python");
        curso2.setCargaHoraria(40);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        /* */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBreno = new Dev();
        devBreno.setNome("Breno");
        devBreno.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Breno:" + devBreno.getConteudosInscritos());
        System.out.println("------------------------------------");

        devBreno.progredir();

        System.out.println("Conteudos Inscritos Breno:" + devBreno.getConteudosInscritos());
        System.out.println("------------------------------------");
        System.out.println("Conteudos Concluidos Breno:" + devBreno.getConteudosConcluidos());
        System.out.println("------------------------------------");
        System.out.println("XP " + devBreno.getcalcularTotalXp());
        
        System.out.println("------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("------------------------------------");

        devJoao.progredir();

        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("------------------------------------");
        System.out.println("Conteudos Concluidos Breno:" + devJoao.getConteudosConcluidos());
        System.out.println("XP " + devJoao.getcalcularTotalXp());
        
    }

}
