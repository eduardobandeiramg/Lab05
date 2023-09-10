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

E o resultado obtido para a classe usando a ferramenta ck foi o seguinte:

<img width="305" alt="loc lab5" src="https://github.com/eduardobandeiramg/Lab05/assets/69736656/92e1bb3b-e375-400b-bcb6-7d8213818884">

Resultado para funções:

<img width="439" alt="primeiro resultado " src="https://github.com/eduardobandeiramg/Lab05/assets/69736656/a7186211-20d5-472c-ad8b-28d0afe80855">


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
E o resultado encontrado para a classe usando a ferramenta ck foi o seguinte:

<img width="221" alt="loc lab5 2" src="https://github.com/eduardobandeiramg/Lab05/assets/69736656/b28c27c7-2455-4858-8228-463fee7b8abf">

Resultados para cada função:

<img width="438" alt="segundo resultado" src="https://github.com/eduardobandeiramg/Lab05/assets/69736656/c54a1648-ecb5-465c-8699-e85f281b0061">


### Análise do resultado para cada classe:
Eu concordo com a técnica utilizada em não contar espaços em branco ou de comentários, uma vez que essas linhas não sau utilizadas para realizar algo funcional no código e não determinam sua complexidade. 

### Análise do resultado - para cada função:
Analisando o resultado gerado pela ferramenta, conclui-se que a contagem das linhas de código de um método é feito da seguinte forma: linha onde método é declarado + linhas dentro do método + linha onde se fecha a chave do método. 
Além disso, foi possível observar uma peculiaridade: as linhas de código incluídas não foram contabilizadas no próprio método, mas sim no método que a "chamou". As linhas incluídas no método "printaNome()" não foram adicionadas a este método pela ferramenta, mas sim ao método "main()", que a invoca. 
Não obstante essa observação, o número total de linhas contadas pela ferramenta vem de encontro à expectativa: 4 linhas da main + 15 linhas do novo código = 19 linhas na main. 
#### Sobre o local onde as linhas são contadas: 
Eu particularmente não concordo que as linhas do corpo de definição de um método não sejam contabilizadas como linhas deste método, e apenas dentro do método que invoca essa função. 
Acredito que, em uma ferramenta de contagem de linhas de código, é essencial que seja entregue ao usuário a informação sobre quantas linhas são gastas para definír uma função, e não considerar isso apenas no momento de sua utilização.
#### Sobre a contabilização das linhas (linhas de comentários e linhas sendo usadas sem necessidade(apenas para uma chave, por exemplo)):
Eu particularmente concordo com o resultado, uma vez que a ferramenta tem o papel simples e objetivo de contar linhas de código. Ela não se propõe a fazer nada diferente disso, como contar apenas linhas não descartáveis ou algo do tipo. 

## Utilizando a ferramenta para calcular número de linhas em parte do projeto do Android:
- Código analisado: funcionalidade de animações do sistema operacional android:
- Localização do diretório analisado: core > java > android > animation
- [Link do projeto](https://github.com/aosp-mirror/platform_frameworks_base)

### Parte do resultado obtido:

<img width="973" alt="Screenshot 2023-09-10 at 15 37 40" src="https://github.com/eduardobandeiramg/Lab05/assets/69736656/ac81ccc3-51a7-46e4-9a9c-a5eb02f1fb6c">

#### Somatório das linhas de código das classes do diretório (obtida usando função soma da coluna "loc" planilha):

<img width="218" alt="soma android" src="https://github.com/eduardobandeiramg/Lab05/assets/69736656/a5b34e5b-8c47-4b91-acc4-744ee1e8eaa3">
