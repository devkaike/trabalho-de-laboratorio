import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
class Aplicativo {
    public static void aplicativo(){
        try{
            FileOutputStream app = new FileOutputStream("app.txt", true);
            PrintWriter ler = new PrintWriter(app);
            Scanner dado = new Scanner(System.in);
            final int TAM = 100;
            int[] diaComp = new int[TAM];
            int[] mesComp = new int[TAM];
            int[] anoComp = new int[TAM];
            float[] horaComp = new float[TAM];
            String[] nomeComp = new String[TAM];
            int op, i;
            System.out.println("\n\n***** BEM VINDO AO ORGANIZA+ *****\n\n");
            System.out.println("< 1 > ADICIONAR COMPROMISSO");
            System.out.println("< 2 > VER COMPROMISSO");
            System.out.print("\n\nOPÇÃO: ");
            op = dado.nextInt();
            i = 0;
            do{
                if(op == 1){
                    //executa a opção 1
                    ler.println("valor i:"+ i);
                    System.out.print("Digite o nome do compromisso: ");
                    dado.nextLine();
                    nomeComp[i] = dado.nextLine();
                    ler.println(nomeComp[i]);
                    System.out.print("horario: ");
                    horaComp[i] = dado.nextFloat();
                    ler.println(horaComp[i]);
                    System.out.print("DATA (dd/mm/aa)\n");
                    System.out.print("Dia: ");
                    diaComp[i] = dado.nextInt();
                    ler.println(diaComp[i]);
                    System.out.print("Mes: ");
                    mesComp[i] = dado.nextInt();
                    ler.println(mesComp[i]);
                    System.out.print("Ano: ");
                    anoComp[i] = dado.nextInt();
                    ler.println(anoComp[i]);
                    System.out.println("\n\n O app foi programado para te alerta no dia "+diaComp[i]+"/"+mesComp[i]+"/"+anoComp[i]+" as "+horaComp[i]+" horas\n\n");
                    System.out.println("< 1 > ADICIONAR COMPROMISSO");
                    System.out.println("< 2 > VER COMPROMISSO");
                    System.out.println("< 3 > SAIR");
                    System.out.print("\n\nOPÇÃO: ");
                    op = dado.nextInt();
                    i++;
                }
            
            if(op == 2){
                //executa a opção 2
                System.out.println("**** COMFIRA TODA SUA AGENDA ABAIXO ****\n\n");
                if(i == 0){
                    System.out.println("NÃO FOI ADICIONADO NADA NA AGENDA");
                }
                else{
                    for(int x = 0; x < i; x++){
                        System.out.println(nomeComp[x]+": "+horaComp[x]+" horas do dia "+diaComp[x]+"/"+mesComp[x]+"/"+anoComp[x]);
                    }
                }
                
            }
            //opção 3 o progama finaliza 
            System.out.println("< 1 > ADICIONAR COMPROMISSO");
            System.out.println("< 2 > VER COMPROMISSO");
            System.out.println("< 3 > SAIR");
            System.out.print("\n\nOPÇÃO: ");
            op = dado.nextInt();
        }while(op != 3);
            ler.close();
            app.close();
        }
        catch(Exception e){
            System.out.println("ERRO");
        }
    }
}
