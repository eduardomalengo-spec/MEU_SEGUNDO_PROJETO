import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=======BOTEDU1=======");
        Scanner botdu = new Scanner(System.in);
        
        
        System.out.print("Ola! Me chamo BotEdu, seu asssitente virtual, como posso te ajudar? ");
        String ed1 = botdu.nextLine().toUpperCase();
        
        if(ed1.equalsIgnoreCase("To bem e voce?")) {
            System.out.println("BOTEDU: Que bom ! To bem sim ! Que bom que perguntou, como posso te ajudar? ");
        }
        else {
            System.out.println("[ERROR] Não posso te ajudar pode reiniciar o chat pfv? ");
        }
        
        System.out.print("Como posso te ajudar? ");
        String ed2 = botdu.nextLine();
        
        if(ed2.equalsIgnoreCase("Preciso criar um jogo")) {
            System.out.println("[CRIANDO JOGO...]");
            System.out.println("[NOME? ] ");
            System.out.println("[OBJETIVO? ]");
        }
        
        else {
            System.out.println("[ERROR] Digite novamente ! ");
        }
        
        botdu.close();
        
    }
}