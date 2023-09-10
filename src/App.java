public class App {
    public static void funcaoPrinta(String nome , String disciplina)
    {
        System.out.println("Aluno: \n"
        + nome 
        + "\nDisciplina cursada: \n" 
        + disciplina);
        //Adicionando uma linha de comentário
        //Adicionando outra linha de comentário
        //Mudanças realizadas:
        //primeira chave para a linha de baixo
        //adicionadas mais 3 linhas para a função print (cada elemento a ser printado em uma linha diferente).
        /* Comentário de múltiplas linhas para quantidade de novas linhas esperadas:
        * 12 linhas a mais são esperadas, indo para 15.
        * */
    }

    public static void main(String[] args) throws Exception {

        funcaoPrinta("Eduardo" , "Engenharia Economica para Software");
        }
}

