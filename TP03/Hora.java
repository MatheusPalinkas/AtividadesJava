import java.util.Scanner;

/**
 * @author João Paulo e Matheus Palinkas
 * - O construtor Hora() deve permitir ao usuário digitar os valores de hora, minuto e segundos e com eles inicializar os atributos da classe. Os valores digitados deverão ser consistidos e só aceitos se válidos, caso contrário, exigir ao usuário redigitar;
 * - O construtor Hora(int h, int m, int s) deverá receber os valores de hora, minuto e segundos e com eles inicializa as propriedades da classe;
 * - Os métodos setHor(int h), setMin(int m) e setSeg(int s) devem receber um valor e atribuí-lo ao respectivo atributo;
 * - Os métodos setHor(), setMin() e setSeg() devem permitir que o usuário digite um valor e atribuí-lo ao respectivo atributo. Os valores digitados deverão ser consistidos e só aceitos se válidos, caso contrário, exigir ao usuário redigitar;
 * - Os métodos getHor(), getMin() e getSeg() devem devolver as respectivas propriedades;
 * - O método getHora1() deve nos devolver a hora no formato: hh:mm:ss;
 * - O método getHora2() deve nos devolver a hora no formato: hh:mm:ss (AM/PM);
 * - O método getSegundos() deve nos devolver a quantidade de segundos expressa na hora em questão, (exemplo: 01:00:01 = 3601 segundos) .
 * - Conveniente colocar tratamento de exceção para as possíveis inconsistências na entrada de dados.
 */

public class Hora {
    private int hora;
    private int min;
    private int seg;

    private Scanner scan = new Scanner(System.in);

    public Hora() {
       this.setHor();
       this.setMin();
       this.setSeg();
    }

    public Hora(int h, int m, int s){
        this.setHor(h);
        this.setMin(m);
        this.setSeg(s);
    }


    public void setHor(int h){
        if(h < 0 || h > 23){
            System.out.println("O valor da hora deve ser positivo e menor que 24");
            return;
        }

        this.hora = h;
    }

    public void setMin(int m){
        if(m < 0 || m > 59){
            System.out.println("O valor do minuto deve ser positivo e menor que 60");
            return;
        }
        

        this.min = m;
    }

    public void setSeg(int s){
        if(s < 0 || s > 59){
            System.out.println("O valor do segundo deve ser positivo e menor que 60");
            return;
        }

        this.seg = s;
    }


    public void setHor(){
        int h;

        do{
            System.out.print("Entre com o valor da hora: ");
            h = scan.nextInt();

            if(h < 0 || h > 23){
                System.out.println("O valor da hora deve ser positivo e menor que 24");
            }
            
        }while(h < 0 || h > 23);

        this.hora = h;
    }

    public void setMin(){
        int m;

        do{
            System.out.print("Entre com o valor do minuto: ");
            m = scan.nextInt();

            if(m < 0 || m > 59){
                System.out.println("O valor do minuto deve ser positivo e menor que 60");
            }
            
        }while(m < 0 || m > 59);

        this.min = m;
    }

    public void setSeg(){
        int s;

        do{
            System.out.print("Entre com o valor do segundo: ");
            s = scan.nextInt();

            if(s < 0 || s > 59){
                System.out.println("O valor do segundo deve ser positivo e menor que 60");
            }
            
        }while(s < 0 || s > 59);

        this.seg = s;
    }


    public int getHor(){
        return this.hora;
    }
    
    public int getMin(){
        return this.min;
    }
    
    public int getSeg(){
        return this.seg;
    }


    public int getSegundos()
    {
        final int QTD_SEGUNDOS_EM_HORA = 3600;
        final int QTD_SEGUNDOS_EM_MINUTO = 60;

        int qtdSegundos = 0;

        qtdSegundos += this.hora * QTD_SEGUNDOS_EM_HORA;
        qtdSegundos += this.min * QTD_SEGUNDOS_EM_MINUTO;
        qtdSegundos += this.seg;

        return qtdSegundos;
    }

    public String getHora1()
    {
        return formatarData(this.hora, this.min, this.seg);
    }

    public String getHora2()
    {
        int horaPeriodo = this.hora;
        String periodo = horaPeriodo < 12 ? "AM" : "PM";

        if(horaPeriodo == 0){
            horaPeriodo = 12;
        }

        if(horaPeriodo > 12){
            horaPeriodo -= 12;
        }


        return formatarData(horaPeriodo, this.min, this.seg) + " " + periodo;
    }

    private String formatarData(int hora, int min, int seg){
        return String.format("%02d", hora) + ":" +
            String.format("%02d", min) + ":" +
            String.format("%02d", seg);
    }
}