package Day9;

public class C03_Pratik {

    public static void main(String[] args) {

/*
        String[] isimler={"Hamza","hadi","mustafa","batu","ali","mina"};
        int index=0;
        while (index<isimler.length){
            System.out.println(isimler[index]);//Hamza hadi mustafa  batu  ali    mina
            index++;
        }

 */

        String[] isimler = {"Hamza", "hadi", "mustafa", "batu", "ali", "mina"};
        int index = 0;
        while (index < isimler.length) {
            if(isimler[index].equals("mina")){
                System.out.println("listede mina var");// listede mina var
            }
            index++;
        }


    }
}
