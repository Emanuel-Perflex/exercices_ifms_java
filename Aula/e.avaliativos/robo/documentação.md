
                            |Documentação Pessoal|
//------------------------=>                      <=--------------------------//

    📄 No documento 'Robo.java'

    1. A ideia inicial é tratar tudo com pares ordenados mátematicos (Xo,Yo) e (X,Y)
       1.1 - Para tal é necessário que se declare X e Y, e para otimização utilizar 2 coringas;
       1.2 - As coringas têm papel de economizar declaração de variaveis nos metódos propostos;
       1.3 - As coringas podem assumir tanto o papel de coordenadas inicias como de qualquer outra coisa;
 
    2. Adaptei a orientação a objetos nesse caso (Embora completamente desnecessário), para fins de estudo e demonstração de conhecimento.
 
    3. (Item: Direção) Os métodos de direção vão funcionar de forma que um ponto seja adicionado á reta escolhida (X ou Y).Isto trás as seguintes observações:
        3.1 - Se o método distancia for requisitado após um unico movimento de joystick, a distancia sempre será equivalente a 1;
        3.2 - Como o joystick se move com base num 'while (true)', é interessante que seja demonstrada a distancia de inicio e de fim de aplicação devido ao item 3.1, evitando assim poluição visual no terminal;   
    
    4. Decidi ao invés de usar o padrão para jogos WASD para o joystick, adaptar setas num esquema de while True, conforme mencionado no Item 3.
        OBS: - Explicação no tópico 'Machine.java';
    
    5. O método coordenada tem a função de realizar a fórmula de distancia vetorial (Teorema de pitágoras basicamente) para voltar a distancia entre 2 pontos;