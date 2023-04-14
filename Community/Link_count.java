import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Link_count {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //read file and add it in array
        File filex = new File("D:\\Study\\Sem-6\\SNA\\Sna_final\\wikipedia-credibility\\Community\\page_leiden.txt");
        BufferedReader brx = new BufferedReader(new FileReader(filex));
        String stx;
        int ix = 0;
        int countx=0;
        int[] arr1 = new int[1000];
        int[] arr2 = new int[1000];
        int[] arr3 = new int[1000];
        int[] arr4 = new int[1000];
        int[] arr5 = new int[1000];
        int[] arr6 = new int[1000];
        while ((stx = brx.readLine()) != null) {
            String[] arrOfStrx = stx.split(",");
            if(Integer.parseInt(arrOfStrx[0])==-1 && countx==0){
                ix++;
                countx++;
            }
            else{
                arr1[ix]=Integer.parseInt(arrOfStrx[0]);
                ix++;
            }

             if(Integer.parseInt(arrOfStrx[0])==-1 && countx==1){
        
                countx++;
                ix++;
            }
            else{
                arr2[ix]=Integer.parseInt(arrOfStrx[0]);
                ix++;
            }
             if(Integer.parseInt(arrOfStrx[0])==-1 && countx==2){
                countx++;
                ix++;
            }
            else{
                arr3[ix]=Integer.parseInt(arrOfStrx[0]);
                ix++;
            }
             if(Integer.parseInt(arrOfStrx[0])==-1 && countx==3){
                countx++;
                ix++;
            }
            else{
                arr4[ix]=Integer.parseInt(arrOfStrx[0]);
                ix++;
            }
             if(Integer.parseInt(arrOfStrx[0])==-1 && countx==4){
                countx++;
                ix++;
            }
            else{
                arr5[ix]=Integer.parseInt(arrOfStrx[0]);
                ix++;
            }
             if(Integer.parseInt(arrOfStrx[0])==-1 && countx==5){
                countx++;
                ix++;
            }
            else{
                arr6[ix]=Integer.parseInt(arrOfStrx[0]);
                ix++;
            }

            
        }
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;

        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr1.length; i++) {
            mp.put(arr1[i], a);
        }

        Map<Integer, Integer> mp1 = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr2.length; i++) {
            mp1.put(arr2[i], b);
        }
        Map<Integer, Integer> mp2 = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr3.length; i++) {
            mp2.put(arr3[i], c);
        }
        Map<Integer, Integer> mp3 = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr4.length; i++) {
            mp3.put(arr4[i], d);
        }
        Map<Integer, Integer> mp4 = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr5.length; i++) {
            mp4.put(arr5[i], d);
        }
        Map<Integer, Integer> mp5 = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr6.length; i++) {
            mp5.put(arr6[i], d);
        }

        File file = new File("D:\\Study\\Sem-6\\SNA\\Sna-projrct\\Codes\\author-author.csv");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        int count = 0;
        while ((st = br.readLine()) != null) {
            String[] arrOfStr = st.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            if (mp.containsKey(x) && mp1.containsKey(y) || mp1.containsKey(x) && mp.containsKey(y)) {
                if (mp.get(x) == mp1.get(y) || mp1.get(x) == mp.get(y)) {
                    count++;
                }
            }
        }

        int ans[] = new int[20];
        ans[0]=count;
        count=0;
        File file1 = new File("D:\\Study\\Sem-6\\SNA\\Sna-projrct\\Codes\\author-author.csv");
        BufferedReader br1 = new BufferedReader(new FileReader(file1));
        String st1;
        while ((st1 = br1.readLine()) != null) {
            String[] arrOfStr = st1.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            if (mp.containsKey(x) && mp2.containsKey(y) || mp2.containsKey(x) && mp.containsKey(y)) {
                if (mp.get(x) == mp2.get(y) || mp2.get(x) == mp.get(y)) {
                    count++;
                }
            }
        }
        ans[1]=count;
        count=0;
        File file2 = new File("D:\\Study\\Sem-6\\SNA\\Sna-projrct\\Codes\\author-author.csv");
        BufferedReader br2 = new BufferedReader(new FileReader(file2));
        String st2;
        while ((st2 = br2.readLine()) != null) {
            String[] arrOfStr = st2.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            if (mp.containsKey(x) && mp3.containsKey(y) || mp3.containsKey(x) && mp.containsKey(y)) {
                if (mp.get(x) == mp3.get(y) || mp3.get(x) == mp.get(y)) {
                    count++;
                }
            }
        }
        ans[2] = count;
        count = 0;
        File file3 = new File("D:\\Study\\Sem-6\\SNA\\Sna-projrct\\Codes\\author-author.csv");
        BufferedReader br3 = new BufferedReader(new FileReader(file3));
        String st3;
        while ((st3 = br3.readLine()) != null) {
            String[] arrOfStr = st3.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            if (mp.containsKey(x) && mp4.containsKey(y) || mp4.containsKey(x) && mp.containsKey(y)) {
                if (mp.get(x) == mp4.get(y) || mp4.get(x) == mp.get(y)) {
                    count++;
                }
            }
        }
        
        ans[3] = count;
        count = 0;
        File file4 = new File("D:\\Study\\Sem-6\\SNA\\Sna-projrct\\Codes\\author-author.csv");
        BufferedReader br4 = new BufferedReader(new FileReader(file4));
        String st4;
        while ((st4 = br4.readLine()) != null) {
            String[] arrOfStr = st4.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            if (mp.containsKey(x) && mp5.containsKey(y) || mp5.containsKey(x) && mp.containsKey(y)) {
                if (mp.get(x) == mp5.get(y) || mp5.get(x) == mp.get(y)) {
                    count++;
                }
            }
        }
        ans[4] = count;
        count = 0;
        File file5 = new File("D:\\Study\\Sem-6\\SNA\\Sna-projrct\\Codes\\author-author.csv");
        BufferedReader br5 = new BufferedReader(new FileReader(file5));
        String st5;
        while ((st5 = br5.readLine()) != null) {
            String[] arrOfStr = st5.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            if (mp1.containsKey(x) && mp2.containsKey(y) || mp2.containsKey(x) && mp1.containsKey(y)) {
                if (mp1.get(x) == mp2.get(y) || mp2.get(x) == mp1.get(y)) {
                    count++;
                }
            }
        }
        ans[5] = count;
        count = 0;
        File file6 = new File("D:\\Study\\Sem-6\\SNA\\Sna-projrct\\Codes\\author-author.csv");
        BufferedReader br6 = new BufferedReader(new FileReader(file6));
        String st6;
        while ((st6 = br6.readLine()) != null) {
            String[] arrOfStr = st6.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            if (mp1.containsKey(x) && mp3.containsKey(y) || mp3.containsKey(x) && mp1.containsKey(y)) {
                if (mp1.get(x) == mp3.get(y) || mp3.get(x) == mp1.get(y)) {
                    count++;
                }
            }
        }
        ans[6] = count;
        count = 0;
        File file7 = new File("D:\\Study\\Sem-6\\SNA\\Sna-projrct\\Codes\\author-author.csv");
        BufferedReader br7 = new BufferedReader(new FileReader(file7));
        String st7;
        while ((st7 = br7.readLine()) != null) {
            String[] arrOfStr = st7.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            if (mp1.containsKey(x) && mp4.containsKey(y) || mp4.containsKey(x) && mp1.containsKey(y)) {
                if (mp1.get(x) == mp4.get(y) || mp4.get(x) == mp1.get(y)) {
                    count++;
                }
            }
        }
        ans[7] = count;
        count = 0;
        File file8 = new File("D:\\Study\\Sem-6\\SNA\\Sna-projrct\\Codes\\author-author.csv");
        BufferedReader br8 = new BufferedReader(new FileReader(file8));
        String st8;
        while ((st8 = br8.readLine()) != null) {
            String[] arrOfStr = st8.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            if (mp1.containsKey(x) && mp5.containsKey(y) || mp5.containsKey(x) && mp1.containsKey(y)) {
                if (mp1.get(x) == mp5.get(y) || mp5.get(x) == mp1.get(y)) {
                    count++;
                }
            }
        }
        ans[8] = count;
        count = 0;
        File file9 = new File("D:\\Study\\Sem-6\\SNA\\Sna-projrct\\Codes\\author-author.csv");
        BufferedReader br9 = new BufferedReader(new FileReader(file9));
        String st9;
        while ((st9 = br9.readLine()) != null) {
            String[] arrOfStr = st9.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            if (mp2.containsKey(x) && mp3.containsKey(y) || mp3.containsKey(x) && mp2.containsKey(y)) {
                if (mp2.get(x) == mp3.get(y) || mp3.get(x) == mp2.get(y)) {
                    count++;
                }
            }
        }
        ans[9] = count;
        count = 0;
        File file10 = new File("D:\\Study\\Sem-6\\SNA\\Sna-projrct\\Codes\\author-author.csv");
        BufferedReader br10 = new BufferedReader(new FileReader(file10));
        String st10;
        while ((st10 = br10.readLine()) != null) {
            String[] arrOfStr = st10.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            if (mp2.containsKey(x) && mp4.containsKey(y) || mp4.containsKey(x) && mp2.containsKey(y)) {
                if (mp2.get(x) == mp4.get(y) || mp4.get(x) == mp2.get(y)) {
                    count++;
                }
            }
        }
        ans[10] = count;
        count = 0;
        File file11 = new File("D:\\Study\\Sem-6\\SNA\\Sna-projrct\\Codes\\author-author.csv");
        BufferedReader br11 = new BufferedReader(new FileReader(file11));
        String st11;
        while ((st11 = br11.readLine()) != null) {
            String[] arrOfStr = st11.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            if (mp2.containsKey(x) && mp5.containsKey(y) || mp5.containsKey(x) && mp2.containsKey(y)) {
                if (mp2.get(x) == mp5.get(y) || mp5.get(x) == mp2.get(y)) {
                    count++;
                }
            }
        }
        ans[11] = count;
        count = 0;
        File file12 = new File("D:\\Study\\Sem-6\\SNA\\Sna-projrct\\Codes\\author-author.csv");
        BufferedReader br12 = new BufferedReader(new FileReader(file12));
        String st12;
        while ((st12 = br12.readLine()) != null) {
            String[] arrOfStr = st12.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            if (mp3.containsKey(x) && mp4.containsKey(y) || mp4.containsKey(x) && mp3.containsKey(y)) {
                if (mp3.get(x) == mp4.get(y) || mp4.get(x) == mp3.get(y)) {
                    count++;
                }
            }
        }
        ans[12] = count;
        count = 0;
        File file13 = new File("D:\\Study\\Sem-6\\SNA\\Sna-projrct\\Codes\\author-author.csv");
        BufferedReader br13 = new BufferedReader(new FileReader(file13));
        String st13;
        while ((st13 = br13.readLine()) != null) {
            String[] arrOfStr = st13.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            if (mp3.containsKey(x) && mp5.containsKey(y) || mp5.containsKey(x) && mp3.containsKey(y)) {
                if (mp3.get(x) == mp5.get(y) || mp5.get(x) == mp3.get(y)) {
                    count++;
                }
            }
        }
        ans[13] = count;
        count = 0;
        File file14 = new File("D:\\Study\\Sem-6\\SNA\\Sna-projrct\\Codes\\author-author.csv");
        BufferedReader br14 = new BufferedReader(new FileReader(file14));
        String st14;

        while ((st14 = br14.readLine()) != null) {
            String[] arrOfStr = st14.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            if (mp4.containsKey(x) && mp5.containsKey(y) || mp5.containsKey(x) && mp4.containsKey(y)) {
                if (mp4.get(x) == mp5.get(y) || mp5.get(x) == mp4.get(y)) {
                    count++;
                }
            }
        }
        ans[14] = count;
        count = 0;
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

        br.close();

    }
}