import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class TelaLogin01 {
    public static void main(String[] args){
        //a opção try faz o tratamento de exceção caso haja erro no arquivo 
        try{
            //biblioteca q faz a leitura dos arquivos(leitura do teclado)
            FileOutputStream arquivo = new FileOutputStream("arquivo.txt", true);
            PrintWriter pr = new PrintWriter(arquivo);
            Scanner dado = new Scanner(System.in);
            //bibliotecas q trasferem dados do arquivo para uma variavel
            FileInputStream arq = new FileInputStream("arquivo.txt");InputStreamReader comversor = new InputStreamReader(arq);
            BufferedReader dados = new  BufferedReader(comversor);
            //inicio do algoritimo 
            final int TAM = 100;
            String[] email1 = new String[TAM];
            String[] nome = new String[TAM];
            String[] segNome = new String[TAM];
            int[] novaSenha = new int[TAM];
            int[] dia = new int[TAM];
            int[] mes = new int[TAM];
            int[] ano = new int[TAM];
            String email;
            int senha, op, opc, i = 0;
            System.out.print("< 1 > fazer cadastro.\n");
            System.out.print("< 2 > fazer login.\n\n");
            System.out.print("digite a opção: ");
            op = dado.nextInt();

            switch(op){
                case 1:
                //executa a poção 1 
                do{
                    dado.nextLine();
                    System.out.print("DIGITE SEU PRIMEIRO NOME: ");
                    nome[i] = dado.nextLine();
                    pr.println(nome[i]);
                    System.out.print("DIGITE O SEGUNDO NOME: ");
                    segNome[i] = dado.nextLine();
                    pr.println(segNome[i]);
                    System.out.print("DATA DE NACIMENTO(dd/mm/aa)\n");
                    System.out.print("dia: ");
                    dia[i] = dado.nextInt();
                    pr.println(dia[i]);
                    System.out.print("mes: ");
                    mes[i] = dado.nextInt();
                    pr.println(mes[i]);
                    System.out.print("ano: ");
                    ano[i] = dado.nextInt();
                    pr.println(ano[i]);
                    dado.nextLine();
                    System.out.print("DIGITE UM EMAIL VALIDO: ");
                    email1[i] = dado.nextLine();
                    pr.println(email1[i]);
                    System.out.print("DIGITE UMA SENHA(apenas numeros): ");
                    senha = dado.nextInt();
                    System.out.print("COMFIRME A SENHA: ");
                    novaSenha[i] = dado.nextInt();
                    while(senha != novaSenha[i]){
                        /*equanto a senha de comfirmação estiver errada o prog ira pedir 
                        para digita novamente */
                        System.out.print("senha incorreta.\n\nDIGITE NOVAMENTE: ");
                        novaSenha[i] = dado.nextInt();
                        pr.println(novaSenha[i]);
                    }
                    //comfirmação dos dados 
                    System.out.print("\n\n           COMFIRME SEUS DADOS          \n\n");
                    System.out.print("NOME: "+ nome[i]+" "+segNome[i]+"\n");
                    System.out.print("DATA: "+ dia[i]+"/"+mes[i]+"/"+ano[i]+"\n");
                    System.out.print("EMAIL: "+ email1[i]+"\n");
                    System.out.print("SENHA: "+ novaSenha[i]+"\n");
                    
                    System.out.println("\n\nCADASTRO FEITO COM SUCESSO.");
                    i++;
                    System.out.print("Digite 0 para finalizar ou qualquer outro numero para continuar: ");
                    opc = dado.nextInt();
                }while(opc != 0);
                break;
            case 2:
                //executa a opção 2
                dado.nextLine();
                System.out.print("EMAIL: ");
                email = dado.nextLine();
                System.out.print("SENHA: ");
                senha = dado.nextInt();
                for(int x = 0; x < i; x++){
                    nome[x] = dados.readLine();
                    segNome[x] = dados.readLine();
                    dia[x] = dados.read();
                    mes[x] = dados.read();
                    ano[x] = dados.read();
                    email1[x] = dados.readLine();
                    novaSenha[x] = dados.read();
                    
                }
                if(email != null){
                    Aplicativo.aplicativo();
                }
                
                    break;
                default:
                    System.out.println("opção invalida.");
            }
            pr.close();
            arquivo.close();
        } 
        // se tiver algum erro no arquivo ou ele não existir sera inpressa a menssagem "ERRO"   
        catch(Exception e){
            System.out.println("ERRO");
        }
    }
}

