# TRABALHO FINAL

Construir a classe Data, conforme especificação abaixo, este exercício comporá a avaliação final, portanto será obrigatória sua elaboração para a prova final.


***

## Exercício 01

Renomear as propriedades e métodos da classe Data, deixando-os de acordo com o padrão UML (métodos getters e setters).

***

## Exercício 02

Crie a classe **AmostraTemperatura** conforme especificado abaixo (2,0):

| Propriedades|
|------------|
| - numseq: int |
| - data: Data |
| - hora: Hora |
| - valor: float |

| Métodos |
|------------|
| + AmostraTemperatura() |
| + AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v) |
| + AmostraTemperatura(Data d, Hora h, float v) |
| + setData(int a, int b, int c) |
| + setData() |
| + setHora(int a, int b, int c) |
| + setHora() |
| + setValor(float v) |
| + setValor() |
| + getNumSeq(): int |
| + getData(): String |
| + getHora(): String |
| + getValor(): float |

- O construtor AmostraTemperatura deve nos permitir a digitação dos valores de data, hora e valor da temperatura;

- Os outros dois construtores devem receber os valores de data, hora e valor sob a forma de parâmetros;

- Os métodos setData(), setHora() e setValor() deve nos permitir alterar os valores das respectivas propriedades através da digitação de novos valores, setValor deve acrescer um a sequencia, toda vez que for chamado;

- Os demais métodos “set” devem alterar os valores das propriedades a partir dos parâmetros recebidos;

- O método getData() deve nos devolver a data no formato: dd/mm/aa;

- O método getHora() deve nos devolver a hora no formato: hh:mm:ss.

***

## Exercício 03

Para testar a classe criada siga os passos abaixo respeitando a ordem em que eles serão
solicitados:

- Usando a classe AmostraTemperatura instancie o objeto t1 inicializado-o com o construtor AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v);
- Exiba todas as propriedades de t1;
- Agora instancie o objeto t2 usando o construtor AmostraTemperatura();
- Exiba todas as propriedades de t2;
- Usando os métodos setData(), setHora() e setValor, altere as propriedades de T1;
- Exiba todas as propriedades de t1 novamente.