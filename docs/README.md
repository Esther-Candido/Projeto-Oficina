# Mini projeto - Sistema de Gestão Oficinal
Este projeto tem como intuito ir introduzindo conceitos ainda em falta, e, em simultâneo, possibilitar a prática desses mesmos conceitos.

## Sistema de Gestão Oficinal
Uma pequena oficina contactou a sua empresa para desenvolver uma aplicação que faça o registo e efetue a gestão da manutenção efetuada pelos seus clientes na sua rede de Oficinas.
Com esta aplicação pretende-se registar a ficha de cada viatura, bem como cada manutenção efetuada, para efeitos de estatística e gestão do stock da Oficina. Desse modo:

## Modelo de Dados
###  Oficina
É o local onde se efetua a receção, manutenção e entrega dos veículos, novamente aos clientes. Cada Oficina possui os seguintes atributos:
- Nome
- Morada
- id (gerado automáticamente pelo Sistema)

### Veiculos
A Oficina dedica-se à reparação de Veículos, sendo eles de três tipos distintos. Pesados, Ligeiros, Motociclos. Todos possuem ano de fabrico, marca, modelo e matricula. Contudo, existem algumas distinções entre eles. Nomeadamente:
- Os pesados possuem também como atributo o número de eixos e a tonelagem
- Os ligeiros podem ainda ser classificados em familiares, SUV, desportivos, clássicos;
- No caso dos motociclos é necessário considerar ainda a cilindrada;

## Manutenções
As manutenções podem ser Inopinadas ou Programadas. Cada vez que uma viatura efetua uma manutenção, é adicionado um registo dessa manutenção à ficha da viatura;
- Cada registo de manutenção deve conter pelos menos os seguintes campos com informação:
    - Data da manutenção;
    - Custo da manutenção (até ao cêntimo. Exemplo: 5678,98);
    - Tipo da manutenção. A manutenção tem 2 tipos possíveis:
        - Programada (P);
        - Inopinada (I);
    - Pequena descrição (max. 200 carateres) sobre a manutenção. Este campo é opcional.

## Requisitos para a aplicação
- Ao nível do registo de viaturas, a aplicação deve suportar as seguintes operações:
    - inserir viatura:
    - apagar viatura (e todos as suas manutenções)
    - Editar viatura
- Ao nível das manutenções as operações são:
    - Inserir manutenção (relacionada a uma viatura)
    - Editar manutenção
    - Apagar manutenção
- Duas viaturas registadas não podem ter a mesma matricula;
- Duas manutenções da mesma viatura não podem acontecer no mesmo dia;
- As funcionalidades de consulta (um menu secundário) que o programa deve implementar são:
    - Imprimir viatura (Através da matricula). A impressão da viatura implica imprimir na primeira linha a informação da viatura, seguindo-se por cada linha as entradas relativas à manutenção precedidas pelo carater (*). As manutenções devem aparecer por ordem cronológica. Exemplo:
   ```
     MX-45-78 Opel Corsa (2007)
      * 20190123 - P - 123,45 - Revisão dos 10000 Km
      * 20190318 - I - 578,00 - Substituição da parte dianteira do condutor
   ```
    - Imprimir todas as viaturas (Por ano de matricula e dentro do mesmo ano por ordem alfabética de matricula)
    - Imprimir todas as viaturas por tipo (Pesado - Ligeiro - Motociclo)
    - Quantidade total de manutenções efetuadas (com a quantidade total deve ser impresso o valor total de todas as manutenções);
    - O formato do output deixa-se em aberto, contudo apresenta-se um possível exemplo
   ```
    MX-45-78 Opel Corsa (2007) - 4 manutenções - Total: 3476,87
    ZG-15-73 Opel Frontera (2009) - 2 manutenções - Total: 36,87
   ```




