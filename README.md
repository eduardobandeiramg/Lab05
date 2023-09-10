# Lab5: Tarefa sobre métricas de código - LOC (lines of code)

## Repositório para demonstração dos resultados da atividade da disciplina "Engenharia Econômica para Software", do 6º período do curso Engenharia de Software - PUC-MG

[Link da ferramenta utilizada](https://github.com/mauricioaniche/ck)

Em um primeiro momento foi escrito um código simples, em java:

```java
public class App {
    public static void funcaoPrinta(String nome , String disciplina){
        System.out.println("Aluno: \n"+ nome  + "\nDisciplina cursada: \n" + disciplina);
    }

    public static void main(String[] args) throws Exception {

        funcaoPrinta("Eduardo" , "Engenharia Economica para Software");
        }
}

```

- E o resultado obtido para a classe usando a ferramenta ck foi o seguinte:

<img width="305" alt="loc lab5" src="https://github.com/eduardobandeiramg/Lab05/assets/69736656/92e1bb3b-e375-400b-bcb6-7d8213818884">

Foram feitas algumas modificações, sendo elas descritas nos comentários do novo código:

```java
public class App {
    public static void funcaoPrinta(String nome , String disciplina)
    
    {
    
    
        System.out.println("Aluno: \n"
        + nome  
        + "\nDisciplina cursada: \n" 
        + disciplina);

        // Adicionando uma linha de comentário.
        // Adicionando outra linha de comentário.
        // Mudanças realizadas:
        // primeira chave do metodo para duas linhas abaixo.
        // mais duas linhas vazias abaixo da chave
        // adicionadas mais 3 linhas para a função print (cada elemento a ser printado em uma linha diferente).
        // mais uma linha em branco, seguida de 8 linhas de comentario e mais uma linha em branco a seguir.
        // mais 3 linhas em branco antes da chamada da main e 2 após o fim da main.

    }



    public static void main(String[] args) throws Exception {

        funcaoPrinta("Eduardo" , "Engenharia Economica para Software");
        }
}


```
- E o resultado encontrado para a classe usando a ferramenta ck foi o seguinte:

<img width="221" alt="loc lab5 2" src="https://github.com/eduardobandeiramg/Lab05/assets/69736656/b28c27c7-2455-4858-8228-463fee7b8abf">

### Análise do resultado:
Eu concordo com a técnica utilizada em não contar espaços em branco ou de comentários, uma vez que essas linhas não são utilizadas para realizar algo funcional no código e não determinam sua complexidade. 
Além disso, também não são contabilizadas linhas desnecessárias, mesmo que haja código nelas. Ex.: na função printaNome(), dentro do método print(), foram usadas uma linha para cada concatenação de String e isso não foi contabilizado pela ferramenta.

## Utilizando a ferramenta para calcular número de linhas em parte do projeto do Android:
- Código analisado: funcionalidade de animações do sistema operacional android:
- Localização do diretório analisado: core > java > android > animation
- [Link do projeto](https://github.com/aosp-mirror/platform_frameworks_base)
- Número de estrelas do projeto:

<img width="172" alt="Screenshot 2023-09-10 at 16 09 55" src="https://github.com/eduardobandeiramg/Lab05/assets/69736656/a9e999bf-3860-4204-9423-a3babfa489e1">


### Parte do resultado obtido:

<img width="973" alt="Screenshot 2023-09-10 at 15 37 40" src="https://github.com/eduardobandeiramg/Lab05/assets/69736656/ac81ccc3-51a7-46e4-9a9c-a5eb02f1fb6c">

#### Somatório das linhas de código das classes do diretório (obtida usando função soma da coluna "loc" planilha):

<img width="218" alt="soma android" src="https://github.com/eduardobandeiramg/Lab05/assets/69736656/a5b34e5b-8c47-4b91-acc4-744ee1e8eaa3">




## Referências:

@manual{aniche-ck,
  title={Java code metrics calculator (CK)},
  author={Maurício Aniche},
  year={2015},
  note={Available in https://github.com/mauricioaniche/ck/}
}
