import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

import sun.audio.*;

public class vocabPractice implements vocabBox, vocabMK, vocabDef, vocaPronun,vocabEx {

    static ArrayList<String> list = new ArrayList<String>();

    static void play(AudioStream str) {
        AudioPlayer.player.start(str);
    }

    public static void main(String args[]) throws Exception {

        vocabPractice prac = new vocabPractice();
        Random rand = new Random();
        Scanner sin = new Scanner(System.in);
        System.out.println("Each Box Contains 30 Words");
        System.out.println("Enter The Strating Index : ");
        int start_index = sin.nextInt();
        System.out.println("Enter The Ending Index : ");
        int end_index = sin.nextInt();
        for (int i = start_index; i < end_index; i++) {
            list.add(vocabBox.box[i]);
        }
        boolean val = true;

        while (val) {
            int temp = rand.nextInt(list.size() + 1) + start_index;
            System.out.println(prac.box[temp]);
            boolean val1 = true;
            while (val1) {
                System.out.print("\n");
                System.out.println("1:cont\t2:MK\t3:Def\t4:Play\t5:EX ");
                switch (sin.nextInt()) {
                    case 1:
                        val1 = false;
                        break;
                    case 2:
                        System.out.println("\n"+mk[temp]);
                        continue;
                    case 3:
                        System.out.println("\n"+def[temp]);
                        continue;
                    case 4:
                        String gongFile = "/home/abh/Downloads" + prac.pronun[temp];
                        System.out.println(gongFile);
                        InputStream in = new FileInputStream(gongFile);
                        AudioStream str = new AudioStream(in);
                        play(str);
                        break;
                    case 5:
                        System.out.println("\n"+ex[temp]);
                        continue;


                    default:
                        val = false;
                        val1 = false;
                        break;

                }
            }
        }


    }


}
