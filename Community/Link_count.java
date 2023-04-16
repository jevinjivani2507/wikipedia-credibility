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
        // int[] arr1 = new int[1000];
        // int[] arr2 = new int[1000];
        // int[] arr3 = new int[1000];
        // int[] arr4 = new int[1000];
        // int[] arr5 = new int[1000];
        // int[] arr6 = new int[1000];
        // // while ((stx = brx.readLine()) != null) {
        //     //sepreat by , 
        //     String[] arrOfStrx = stx.split(",");
        //     //add in array
        //     if(Integer.parseInt(stx)==-1 && countx==0){
        //         ix++;
        //         countx++;
        //     }
        //     else{
        //         arr1[ix]=Integer.parseInt(stx);
        //         ix++;
        //     }

        //      if(Integer.parseInt(stx)==-1 && countx==1){
        //         arr2[ix]=Integer.parseInt(stx);
        //         ix++;
        //     }
        //     else{
        //         arr1[ix]=Integer.parseInt(stx);
        //         ix++;
        //     }
        //      if(Integer.parseInt(stx)==-1 && countx==2){
        //         arr3[ix]=Integer.parseInt(stx);
        //         coun
        //         ix++;
        //     }
        //     else{
        //         arr1[ix]=Integer.parseInt(stx);
        //         ix++;
        //     }
        //      if(Integer.parseInt(stx)==-1 && countx==3){
        //         arr4[ix]=Integer.parseInt(stx);
        //         countx++;
        //         ix++;
        //     }
        //     else{
        //         arr1[ix]=Integer.parseInt(stx);
        //         ix++;
        //     }
        //      if(Integer.parseInt(stx)==-1 && countx==4){
        //         arr5[ix]=Integer.parseInt(stx);
        //         countx++;
        //         ix++;
        //     }
        //     else{
        //         arr1[ix]=Integer.parseInt(stx);
        //         ix++;
        //     }
        //      if(Integer.parseInt(stx)==-1 && countx==5){
        //         arr6[ix]=Integer.parseInt(stx);
        //         countx++;
        //         ix++;
        //     }
        //     else{
        //         arr6[ix]=Integer.parseInt(stx);
        //         ix++;
        //     }

            
        // }
        



        int[] arr1 = { 25, 324, 652, 670, 1416, 1531, 290, 326, 569, 594, 736, 770, 864, 893, 902, 904, 954, 983, 1004,
                1014, 1078, 1164, 1176, 1208, 1288, 1493, 595, 650, 655, 701, 909, 913, 917, 948, 1010, 1046, 1047,
                1122, 1136, 1154, 1175, 1183, 1246, 1254, 1259, 1328, 1332, 1381, 1397, 1541, 307, 308, 339, 570, 737,
                752, 849, 924, 984, 1372, 1436, 698, 771, 1007, 1432, 662, 813, 886, 1442, 1497, 1391, 358, 620, 628,
                808, 856, 862, 897, 1187, 1216, 311, 312, 328, 1496, 1622, 1519, 12, 843, 573, 625, 740, 1027, 1143,
                303, 985, 1148, 627, 863, 1285, 1543, 1189, 624, 765, 981, 1587, 1491, 348, 351, 587, 717, 982, 1008,
                1199, 1400, 249, 271, 278, 333, 576, 776, 858, 918, 986, 738, 254, 325, 592, 596, 658, 800, 906, 1194,
                1337, 1009, 320, 600, 689, 744, 803, 1023, 697, 852, 1177, 664, 715, 741, 1166, 1434, 1448, 1517, 1612,
                568, 616, 679, 690, 746, 851, 1053, 1239, 1314, 1420, 1462, 1502, 1191, 1127, 1349, 571, 1147, 654, 883,
                259, 782, 1126, 313, 316, 703, 966, 860, 1204, 10, 23, 629, 644, 925, 926, 968, 1125, 314, 317, 1465,
                1583, 1404, 1059, 1234, 36, 591, 669, 759, 762, 820, 1197, 773, 1255, 839, 1121, 1330, 1373, 309, 315,
                319, 321, 322, 323, 873, 1371, 749, 891, 910, 923, 1539, 779, 1508, 1293, 826, 1099, 1511, 1215, 1100,
                905, 882, 881, 1043, 1352, 1356, 1581, 1585, 1605, 1607, 1599, 875, 1535, 1303, 1552, 1565, 617, 885,
                766, 645, 1503, 668, 964, 1608, 1268, 330, 618 };

        int arr2[] = { 579, 653, 963, 1134, 1173, 1359, 1566, 840, 927, 991, 1158, 1210, 1309, 1406, 1419, 1422, 1190,
                1347, 1357, 1367, 1380, 1594, 639, 691, 700, 900, 1386, 1387, 1540, 1623, 1602, 822, 1568, 1395, 1325,
                1484, 1579, 1600, 663, 1245, 1193, 1514, 1569, 1615, 1616, 1617, 661, 855, 859, 1551, 1613, 931, 656,
                888, 1178, 1322, 1368, 1495, 1567, 1590, 1593, 1596, 337, 952, 780, 1000, 1338, 896, 901, 1327, 1117,
                39, 748, 894, 1021, 1572, 972, 989, 642, 1129, 1423, 1447, 344, 623, 713, 848, 899, 921, 1018, 1030,
                1159, 1235, 1257, 1282, 1291, 1350, 1354, 1418, 1505, 1592, 751, 42, 336, 359, 368, 615, 657, 665, 675,
                696, 768, 777, 785, 801, 874, 895, 903, 920, 967, 988, 999, 1017, 1055, 1114, 1155, 1167, 1181, 1192,
                1213, 1260, 1267, 1279, 1280, 1295, 1312, 1318, 1324, 1364, 1394, 1437, 1439, 1440, 1460, 1466, 1506,
                1507, 1513, 1527, 1528, 1548, 1554, 1574, 1577, 1578, 1586, 1597, 1603, 1265, 606 };

        int arr3[] = { 599, 651, 878, 978, 1132, 1171, 1196, 586, 872, 974, 1033, 1140, 1160, 1240, 1289, 1348, 1382,
                1449, 1557, 865, 870, 1035, 1038, 1063, 1261, 1362, 674, 798, 799, 1051, 1133, 1146, 1227, 1412, 305,
                632, 1217, 1203, 681, 951, 960, 1307, 1530, 876, 1049, 1301, 1546, 1550, 1560, 685, 1542, 1384, 1509,
                1589, 349, 578, 706, 804, 828, 842, 857, 880, 1011, 1064, 1070, 1101, 1112, 1162, 1225, 1298, 1377, 332,
                806, 795, 958, 1034, 1241, 1274, 890, 1201, 889, 677, 1050, 1393, 1451, 1458, 1013, 1346, 1417, 1490,
                676, 728, 1334, 1500, 1576, 593, 633, 708, 1428, 1529, 1022, 369, 884, 1270, 649, 980, 718, 764, 932,
                704, 705, 707, 709, 710, 794, 827, 832, 853, 869, 965, 1071, 1077, 1087, 1275, 1276, 1277, 1278, 1316,
                1383, 1482, 590, 992, 711, 253, 866, 1538, 1286, 1358, 1488, 912, 868, 1389, 975, 1553, 1247, 1237,
                1120, 1331, 43, 1311, 1109, 1209, 1344, 1620, 340, 1549, 1111, 1545, 1614, 846, 1110, 1113
        };
        int arr4[] = { 1315, 659, 247, 27, 28, 29, 35, 50, 54, 255, 268, 269, 270, 272, 274, 280, 291, 293, 296, 33, 46,
                47, 49, 248
        };
        int arr5[] = { 877, 673, 682, 775, 844, 1335, 1365, 1398, 1453, 1525, 1588, 911, 1019, 1020, 1207, 1456, 1130,
                1392, 1494, 1388, 753, 1003, 1052, 1242, 769, 914, 1333, 1461, 1012, 666, 824, 1361, 892, 791, 678,
                1005, 1433, 898, 730, 784, 1499, 1536, 621, 712, 1144, 1370, 1591, 809, 933, 1212, 1376, 959, 1002,
                1028, 630, 854, 1487, 821, 1302, 814, 1369, 1375, 802, 1355, 1153, 742, 755, 815, 816, 818, 819, 825,
                850, 994, 1300, 1441, 1445, 1515, 1516, 1547, 1564, 1575, 1580, 1598, 1604, 944, 1610, 1611, 1399
        };
        int arr6[] = { 1141, 1606, 572, 612, 683, 734, 772, 783, 841, 928, 1006, 1252, 1271, 1273, 1363, 1520, 1556,
                1601, 584, 640, 719, 1305, 1313, 1336, 1486, 887, 1029, 1036, 1057, 1058, 1205, 1292, 1304, 1317, 1498,
                1523, 1537, 1573, 580, 953, 929, 1182, 1214, 1256, 1320, 1408, 1478, 51, 684, 1170, 1353, 1409, 1415,
                1425, 1435, 1438, 1444, 1485, 1512, 1522, 1562, 1544, 1563, 835, 1366, 1570, 1142, 1446, 993, 1174,
                1558, 680, 1168, 969, 1262, 574, 786, 956, 1206, 1379, 1501, 634, 699, 1306, 1559, 1032, 334, 1200, 930,
                957, 1152, 922, 787, 1044, 1198, 1135, 575, 264, 301, 1360, 1374, 789, 915, 242, 597, 788, 955, 1571,
                1504, 1016, 1264, 1584, 1595, 1202, 643, 1169, 1526 };
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