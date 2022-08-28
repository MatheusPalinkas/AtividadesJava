import java.util.Scanner;

/**
 * @author João Paulo e Matheus Palinkas
 * - O construtor AmostraTemperatura deve nos permitir a digitação dos valores de data, hora e valor da temperatura;
 * - Os outros dois construtores devem receber os valores de data, hora e valor sob a forma de parâmetros;
 * - Os métodos setData(), setHora() e setValor() deve nos permitir alterar os valores das respectivas propriedades através da digitação de novos valores, setValor deve acrescer um a sequencia, toda vez que for chamado;
 * - Os demais métodos *set* devem alterar os valores das propriedades a partir dos parâmetros recebidos;
 * - O método getData() deve nos devolver a data no formato: dd/mm/aa;
 * - O método getHora() deve nos devolver a hora no formato: hh:mm:ss.
 */

public class AmostraTemperatura  {
    private int numseq = 0;
    private float valor;

    private Data data;
    private Hora hora;

    private Scanner scan = new Scanner(System.in);

    public AmostraTemperatura () {
        this.setData();
        this.setHora();
        this.setValor();
    }

    public AmostraTemperatura (int a, int b, int c, int d, int e, int f, float v) {
        this.setData(a, b, c);
        this.setHora(d, e, f);
        this.setValor(v);
    }

    public AmostraTemperatura(Data d, Hora h, float v){
        this.data = d;
        this.hora = h;
        this.setValor(v);
    }

    
    public void setData(int a, int b, int c){
        this.data = new Data(a, b, c);
    }

    public void setHora(int a, int b, int c){
        this.hora = new Hora(a, b, c);
    }

    public void setValor(float v){
        this.valor = v; 
        this.numseq++;
    }
    
    
    public void setData(){
        this.data = new Data();        
    }
    
    public void setHora(){
        this.hora = new Hora();        
    }

    public void setValor(){
        float v;

        System.out.print("Entre com o valor da temperatura: ");
        v = scan.nextFloat();

        this.valor = v;
        this.numseq++;
    }


    public int getNumSeq(){
        return this.numseq;
    }

    public float getValor(){
        return this.valor;
    }

    public String getData(){
        return this.data.mostra1();
    }

    public String getHora(){
        return this.hora.getHora1();
    }
    
}
