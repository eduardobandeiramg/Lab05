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
E o resultado obtido usando a ferramenta ck foi o seguinte:

<img width="439" alt="primeiro resultado " src="https://github.com/eduardobandeiramg/Lab05/assets/69736656/957b2ad2-7ade-41bb-bc4c-8edc6b0b2cc1">

Foram feitas algumas modificações, sendo elas descritas nos comentários do novo código:

```java
public class App {
    public static void funcaoPrinta(String nome , String disciplina)
    {
        System.out.println("Aluno: \n"
        + nome 
        + "\nDisciplina cursada: \n" 
        + disciplina);
        //Adicionando uma linha de comentário.
        //Adicionando outra linha de comentário.
        //Mudanças realizadas:
        //primeira chave para a linha de baixo.
        //adicionadas mais 3 linhas para a função print (cada elemento a ser printado em uma linha diferente).
        /* Comentário de múltiplas linhas para quantidade de novas linhas esperadas:
        * 12 linhas a mais são esperadas, indo para 15.
        * */
    }

    public static void main(String[] args) throws Exception {

        funcaoPrinta("Eduardo" , "Engenharia Economica para Software");
        }
}
```
E o resultado encontrado usando a ferramenta ck foi o seguinte:

<img width="438" alt="segundo resultado" src="https://github.com/eduardobandeiramg/Lab05/assets/69736656/275bede8-b66b-4244-be99-9e28e75e242b">

### Análise do resultado:
Analisando o resultado gerado pela ferramenta, conclui-se que a contagem das linhas de código de um método é feito da seguinte forma: linha onde método é declarado + linhas dentro do método + linha onde se fecha a chave do método. 
Além disso, foi possível observar uma peculiaridade: as linhas de código incluídas não foram contabilizadas no próprio método, mas sim no método que a "chamou". As linhas incluídas no método "printaNome()" não foram adicionadas a este método pela ferramenta, mas sim ao método "main()", que a invoca. 
Não obstante essa observação, o número total de linhas contadas pela ferramenta vem de encontro à expectativa: 4 linhas da main + 15 linhas do novo código = 19 linhas na main. 
#### Sobre o local onde as linhas são contadas: 
Eu particularmente não concordo que as linhas do corpo de definição de um método não sejam contabilizadas como linhas deste método, e apenas dentro do método que invoca essa função. 
Acredito que, em uma ferramenta de contagem de linhas de código, é essencial que seja entregue ao usuário a informação sobre quantas linhas são gastas para definír uma função, e não considerar isso apenas no momento de sua utilização.
#### Sobre a contabilização das linhas (linhas de comentários e linhas sendo usadas sem necessidade(apenas para uma chave, por exemplo)):
Eu particularmente concordo com o resultado, uma vez que a ferramenta tem o papel simples e objetivo de contar linhas de código. Ela não se propõe a fazer nada diferente disso, como contar apenas linhas não descartáveis ou algo do tipo. 

## Utilizando a ferramenta para calcular número de linhas em parte do projeto do Android:
[Link do projeto]([https://github.com/bitcoin/bitcoin](https://github.com/aosp-mirror/platform_frameworks_base)https://github.com/aosp-mirror/platform_frameworks_base)
Funcionalidade de animações do sistema operacional android:
Localização do diretório analisado:
core > java > android > animation

