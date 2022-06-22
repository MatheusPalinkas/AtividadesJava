import java.util.Scanner;

public class AmostraTemperatura  {
    private int numseq;
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
