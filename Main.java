import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] chisla = str.split(" ");
        Drob num1;
        Drob num2;
        if(chisla[0].indexOf('/')==-1 && chisla[2].indexOf('/')==-1){
            num1 = new Drob(Integer.parseInt(chisla[0]),1);
            num2 = new Drob(Integer.parseInt(chisla[2]),1);
        }
        else if (chisla[0].indexOf('/')!=-1 && chisla[2].indexOf('/')==-1){
            String[] drob = chisla[0].split("/");
            num1 = new Drob(Integer.parseInt(drob[0]),Integer.parseInt(drob[1]));
            num2 = new Drob(Integer.parseInt(chisla[2]),1);
        }
        else if (chisla[0].indexOf('/')==-1 && chisla[2].indexOf('/')!=-1){
            num1 = new Drob(Integer.parseInt(chisla[0]),1);
            String[] drob = chisla[2].split("/");
            num2 = new Drob(Integer.parseInt(drob[0]),Integer.parseInt(drob[1]));
        }
        else{
            String[] drob = chisla[0].split("/");
            num1 = new Drob(Integer.parseInt(drob[0]),Integer.parseInt(drob[1]));
            drob = chisla[2].split("/");
            num2 = new Drob(Integer.parseInt(drob[0]),Integer.parseInt(drob[1]));
        }
        String zn = chisla[1];
        Boolean f = true;
        if("+".equals(zn)){
            num2.chisl = num2.chisl * num1.znam;
            num1.chisl= num1.chisl * num2.znam + num2.chisl;
            num1.znam= num1.znam * num2.znam;
        }
        else if("-".equals(zn)){
            num2.chisl = num2.chisl * num1.znam;
            num1.chisl= num1.chisl * num2.znam - num2.chisl;
            num1.znam= num1.znam * num2.znam;
        }
        else if("*".equals(zn)){
            num1.chisl = num1.chisl * num2.chisl;
            num1.znam = num1.znam * num2.znam;
        }
        else if("/".equals(zn)) {
            if (num2.chisl != 0) {
                num1.chisl= num1.chisl * num2.znam;
                num1.znam = num1.znam * num2.chisl;
            } else {
                f = false;
            }
        }
        if(f){
            if(num1.znam != 0){
                System.out.println(num1.getdrob());
            }
            else{
                System.out.println("Деление на 0");
            }
        }
        else{
            System.out.println("Деление на 0");
        }
    }
}