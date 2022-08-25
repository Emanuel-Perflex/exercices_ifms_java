
<div align="center">|Documentação Pessoal|</div>

<div align="center">//---------------------------------------------------------------=>                      <=---------------------------------------------------------------//</div>


<div align="center">📄 No documento 'Robo.java'</div>

    1. A ideia inicial é tratar tudo com pares ordenados mátematicos (Xo,Yo) e (X,Y)
       1.1 - Para tal é necessário que se declare X e Y, e para otimização utilizar 2 coringas;
       1.2 - As coringas têm papel de economizar declaração de variaveis nos metódos propostos;
       1.3 - As coringas podem assumir tanto o papel de coordenadas inicias como de qualquer outra coisa;
 
    2. Adaptei a orientação a objetos nesse exercício (Embora completamente desnecessário), para fins de estudo e demonstração de conhecimento.
        2.1 - Após otimizações foram removido todos os métodos Getters do documento;
        2.2 - Também foram removidos todo e qualquer método referente a direção, com 2 variaveis no documento 'Machine.java' foi possível substituir quatro métodos;
 
    3. (Atualizado ✔️) Não haverá metódos de direção, tudo será tratado com variaveis de forma que um ponto seja adicionado á reta escolhida (X ou Y) de acordo o método atribuido no botão que o usuário clicar. Isto trás as seguintes observações:
        3.1 - O método distancia foi removido por motivo de poluição terminal e de não fazer sentido matematicamente (A distancia sempre retornará 1);
    
    4. (Atualizado ✔️) Decidi ao invés de usar o padrão para jogos WASD para o joystick, adaptar botões Swing num esquema condicional switch case.
        OBS: - Explicação no tópico 'Machine.java';
    
    5. O método coordenada tem a função de realizar a fórmula de distancia vetorial (Teorema de pitágoras basicamente) para voltar a distancia entre 2 pontos;


<div align="center">//--------------------------------------------------------------------------------------------------------//</div>
/
<div align="center">📄 No documento 'Machine.java'</div>

    1 - A princípio a motivação se baseava em fazer tudo 100% no terminal, porém houveram mudanças de planos e os seguintes pontos são relevantes:
        1.1 - Se observar o histórico de commits observará mudanças repentinas de lógica. A ideia inicial era tratar tudo no terminal. A ideia conseguinte foi tratar tudo com swing utilizando teclas, mas após 12horas de fracasso sem solução um novo método mais fácil foi aplicado, tratar tudo com buttons do Jframe da Swing java. 
            1.1.a) Será possível observar também que a principio por pura ignorancia eu estava tratando o Swing numa classe em outro arquivo, ao quase término e depois de muitos tutoriais o arquivo foi deletedo e obteve sua 'função' repassada a um método no arquivo principal.
            1.1.b) O horário de commits bate corretamente, é de minha preferencia codar durante a madrugada.
        
        //OBS - Para fins de Bibliografia, os locais consultados para construir minha ideia durantes o processo de criação foram: 

        https://pt.stackoverflow.com/questions/156239/adicionar-fun%C3%A7%C3%B5es-em-botoes-de-aplica%C3%A7%C3%A3o-gr%C3%A1fica
        https://www.youtube.com/watch?v=5o3fMLPY7qY&t=601s">Link 1
        https://www.guj.com.br/t/capturar-evento-de-teclado/68289/7">Link 2
        https://pt.stackoverflow.com/questions/22913/qual-a-finalidade-da-override
        https://www.youtube.com/watch?v=80w8995J6EA
        https://medium.com/@rafaelvicio/trabalhando-com-imutabilidade-no-java-a4225fbddefc
        https://www.youtube.com/watch?v=qKOoFiepAt0
        https://www.youtube.com/watch?v=Hlrm4n4fnIM

        
        
        
        
        
        
            