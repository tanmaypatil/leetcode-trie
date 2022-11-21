package com.example.basic.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IPOTest {
    @Test
    public void test1() {
        IPO i = new IPO();
        int p = i.findMaximizedCapital(2,0,new int[] {1,2,3}, new int[] {0,1,1});
        Assertions.assertEquals(4,p);

    }
    @Test
    public void test2() {
        IPO i = new IPO();
        int p = i.findMaximizedCapital(3,0,new int[] {1,2,3}, new int[] {0,1,2});
        Assertions.assertEquals(6,p);

    }

    @Test
    public void test3() {
        IPO i = new IPO();
        int p = i.findMaximizedCapital(3,0,new int[] {1,2,3}, new int[] {1,1,2});
        Assertions.assertEquals(0,p);

    }

    @Test
    public void test4() {
        IPO i = new IPO();
        int p = i.findMaximizedCapital(3,0,new int[] {1,2,3}, new int[] {1,1,2});
        Assertions.assertEquals(0,p);

    }

    @Test
    public void test5() {
        IPO i = new IPO();
        int p = i.findMaximizedCapital(10,0,new int[] {1,2,3}, new int[] {0,1,2});
        Assertions.assertEquals(6,p);

    }
    /*
     * 111
12
[319,178,37,756,152,763,481,1055,594,825,759,494,1087,696,717,358,1091,1145,1043,245,779,957,3,1060,1141,926,226,657,869,740,1170,746,889,416,634,209,1189,1076,819,1144,40,807,561,400,283,133,186,839,1043,491,936,559,70,9,854,1172,9,739,871,436,1087,1029,66,561,798,1141,701,1020,1072,92,636,509,392,77,84,202,843,563,329,906,101,997,1162,105,876,460,285,446,753,516,60,932,323,659,9,639,1041,861,1199,343,792,1114,536,405,542,805,929,589,538,410,143,114,24,1064,682,536,1016,1141,843,472,817,196,673,189,915,196,755,203,956,283,833,836,22,899,232,655,572,207,819,639,1024,887,407,385,251,896,165,290,193,357,870,678,411,697,998,344,628,866,1004,894,547,574,36,847,691,601,896,363,21,1133,115,658,855,1042,2,189,230,215,747,971,581,809,832,311,35,639,1127,701,167,672,763,997,1061,1170,289,806,91,198,720,67,273,863,437,152,671,635,968,107,58,453,392,236,875,719,44,850,176,580,937,227,125,851,1188,915,747,1175,69,743,250,275,290,787,780,516,775,279,256,649,83,1180,372,655,813,750,381,807,988,977,430,282,1067,551,726,756,372,17,1016,550,1128,223,174,85,1039,1,27,178,822,243,440,79,772,211,640,454,1141,654,351,54,794,711,157,492,307,1156,937,212,461,417,741,1104,642,1147,833,1194,1066,1070,876,1045,341,854,1014,787,518,404,1068,385,756,998,298,439,917,183,71,363,38,828,372,1071,195,481,1153,871,712,803,849,145,1144,410,420,561,678,241,498,548,436,871,810,180,635,119,665,551,1132,807,408,685,489,274,459,28,987,935,310,284,1163,924,812,267,1123,782,1065,1075,1199,1047,289,280,1044,931,1056,625,672,150,41,1084,998,151,483,226,548,277,1187,1010,262,1048,493,1084,845,1127,1009,773,129,547,798,118,559,463,972,666,1155,519,381,405,819,201,790,729,1100,614,691,3,386,206,514,387,612,1073,158,67,1116,164,496,1056,1159,348,530,28,1177,774,1139,559,563,310,916,897,36,1060,173,952,123,635,911,711,304,611,481,645,532,1033,385,402,797,117,307,969,1147,1127,434,1099,1043,104,74,257,778,934,901,106,84,525,138,698,877,1009,487,450,649,736,802,1032,456,757,10,2,720,1155,234,844,880,1053,1134,821,1094,970,1095,976,101,1163,104,38,198,350,896,345,867,1129,1064,403,228,1103,416,561,722,915,1161,252,45,632,1163,232,174,964,876,1126,479,432,984,815,544,1005,620,497,1021,763,169,1028,706,1112,150,368,483,251,721,492,686,1105,38,1140,1085,153,366,428,296,28,648,873,21,236,393,581,1043,1086,747,402,201,1196,416,788,318,257,815,735,1023,1143,1100,922,1033,884,824,963,159,904,21,1168,511,723,400,239,338,89,1099,572,674,54,891,426,277,91,504,302,616,468,506,917,491,744,1091,1051,594,465,850,338,417,320,1160,364,480,855,86,305,225,833,637,760,1147,613,236,460,664,1183,38,806,100,654,852,975,816,506,1092,275,6,229,972,53,554,370,63,651,701,304,1011,672,353,118,1111,448,549,151,1087,909,420,1095,663,1119,1124,729,578,733,861,1154,1195,387,1182,850,189,463,1129,1185,541,546,1159,314,137,479,59,841,514,548,496,642,341,151,999,1036,1186,704,550,1039,723,779,584,382,371,712,176,665,180,440,697,1102,408,728,157,1050,558,692,336,384,107,839,477,204,862,345,429,1144,1069,207,449,594,963,988,843,334,200,865,281,296,1040,914,995,743,1134,1050,484,602,1001,570,1052,1106,922,77,1099,681,360,955,1184,669,411,760,46,599,815,231,86,694,469,1079,1161,1105,519,1010,681,603,376,534,145,361,448,1006,91,397,671,597,238,119,467,587,723,162,804,638,568,195,460,610,868,806,995,1178,490,406,933,232,17,37,2,114,1004,871,531,209,267,37,750,1196,940,89,725,377,898,6,685,210,1127,1160,432,391,931,681,937,275,1190,137,743,652,430,566,180,1192,718,253,133,998,1067,764,747,1159,827,143,506,641,327,468,731,50,15,569,80,310,1086,1092,989,245,520,711,788,1144,938,1152,1169,563,1053,1182,331,838,112,361,1049,717,979,956,434,534,1083,117,280,1104,293,1137,592,1019,606,526,216,924,197,137,1041,2,910,274,1178,267,521,626,764,691,124,446,337,676,325,288,1120,924,512,777,1063,979,86,677,1183,777,418,41,852,929,712,1132,1030,339,943,475,851,340,894,1091,230,654,229,945,69,182,110,255,895,645,1061,793,1016,807,440,330,519,73,108,660,209,1077,1191,938,415,1162,579,258,14,273,561,834,371,134,1118,1139,1163,667,979,483,436,42,593,139,846,875,571,808,76,713,1198,352,299,156,793,509,245,697,1106,236,287,236,644,683]
[487,13,943,31,661,656,690,175,1147,760,96,290,755,504,1111,219,187,641,380,886,781,214,714,594,41,1154,908,977,1183,28,464,524,895,1177,28,225,1180,206,387,25,166,207,394,418,771,719,153,836,970,589,114,67,1180,1136,863,1144,21,9,957,861,981,849,1031,361,541,649,220,718,263,390,24,830,103,955,233,1174,521,580,83,869,321,712,1011,130,297,835,406,543,849,681,337,355,867,863,552,883,155,762,982,129,605,125,1111,442,89,1139,1084,870,183,1142,78,12,893,677,817,348,1036,482,76,619,563,435,529,311,1148,629,786,288,112,995,854,844,1002,948,570,736,1088,354,618,876,926,150,1108,412,707,233,137,775,751,1137,481,349,150,518,1165,191,223,754,419,1025,817,1001,278,692,403,1023,106,78,124,679,598,727,1026,966,564,726,1148,643,806,1182,645,300,867,613,458,844,679,907,437,1012,902,18,843,190,43,705,818,957,146,1175,130,744,941,975,692,1066,541,335,20,311,606,377,558,113,545,1115,228,29,2,1180,331,1072,151,692,1156,347,293,1135,959,865,1031,40,425,1191,1178,87,989,92,1186,1072,105,1058,369,401,1117,220,484,181,901,321,923,263,72,685,820,1123,736,942,37,419,631,545,761,227,230,25,636,1048,834,736,899,530,217,669,278,653,657,857,724,782,146,780,615,1156,751,463,625,707,355,92,718,855,624,504,359,744,793,868,462,985,1087,517,886,83,221,383,601,709,683,1097,544,411,28,1129,781,13,752,347,1150,1030,269,701,658,658,1188,222,1160,480,953,203,132,17,723,927,911,448,977,1126,219,118,1033,919,1041,712,930,963,772,264,523,479,735,919,72,1019,131,15,628,331,408,578,37,1123,125,527,887,54,1043,259,654,557,872,505,700,1077,202,368,628,29,66,199,611,730,1108,682,705,628,1001,705,21,266,428,1093,800,742,701,715,845,1151,300,460,1134,708,443,706,819,296,199,671,452,626,386,569,999,326,1081,202,384,783,541,811,1058,684,146,288,1149,480,0,658,547,773,588,758,189,489,257,436,362,417,180,671,141,657,864,808,1026,504,827,1125,977,1161,699,360,689,520,796,147,746,978,833,82,102,254,736,88,525,1037,659,1061,333,663,520,6,439,823,1151,395,188,32,513,34,805,1017,1193,157,942,87,630,915,807,215,482,1132,23,1008,1175,724,1070,339,1139,22,455,306,369,151,1031,1119,846,1195,49,1169,773,706,45,747,875,944,1161,1025,258,765,1039,459,641,1169,211,894,556,253,831,1115,458,351,1138,58,1169,1190,743,611,392,1015,54,831,330,1138,681,1012,750,967,1179,398,564,5,2,143,787,197,590,144,589,588,493,524,748,1123,707,585,641,293,871,331,1173,280,218,931,11,663,1005,1118,555,1000,699,720,81,527,71,458,462,1056,447,491,1068,1078,842,455,497,959,745,654,1011,939,787,430,535,594,940,1176,656,207,815,1133,610,1113,596,1018,961,840,555,582,1187,828,161,983,686,870,800,525,34,1013,385,870,953,59,518,521,151,633,561,848,310,712,108,1148,446,480,983,110,442,182,119,463,909,690,48,1040,631,17,1027,158,353,108,524,335,1046,514,1027,746,917,378,437,606,829,743,462,1013,525,290,477,749,896,12,351,13,42,819,334,912,30,1041,815,307,1138,168,209,1134,100,276,292,283,1074,123,561,857,92,879,58,706,532,75,49,385,342,887,646,301,54,483,589,1084,1092,178,845,243,873,611,340,712,115,157,63,773,800,844,167,384,522,877,183,368,709,501,905,512,756,246,197,463,47,232,256,37,883,1048,774,431,943,868,111,163,336,648,313,858,536,416,680,951,320,499,199,234,482,529,676,26,1180,721,877,586,628,1152,835,1145,447,763,750,188,1169,596,1125,310,519,1165,488,1063,59,292,701,1078,1088,663,512,172,477,187,215,1192,22,827,279,607,286,179,744,569,500,510,1038,570,1159,520,1070,759,831,906,644,753,574,257,983,1023,227,460,710,169,595,249,111,73,991,933,448,655,559,183,244,44,644,935,466,97,605,460,800,229,977,675,236,946,73,456,623,499,423,162,342,914,386,1082,407,954,1081,1099,142,539,416,791,1195,1099,885,965,971,796,1198,449,768,792,541,18,476,303,137,319,1008,343,733,128,641,709,175,691,227,307,1177,1198,1075,747,944,1038,933,643,613,1166,1153,120,288,1167,246,1103,185,85,1008,1060,1051,421,150,601,376,183,1028,146,297,515,688,886,1090,552,969,903,1086,931,946,1099,546,17,851,908,1170,418,94,61,233,1069,510,783,302,701,564,1195,57,1007,994,205,1019,694,1020,137,1041,803,673,1162,14,904,418,1076,514,79,944,242,491,867,934,40,1059,776,817,468,516,550,906,790,459,273,924,185,1183,337,435,699,316,768]
     */

    @Test
    public void test6() {
        IPO i = new IPO();
        int p = i.findMaximizedCapital(111,12,new int[] {319,178,37,756,152,763,481,1055,594,825,759,494,1087,696,717,358,1091,1145,1043,245,779,957,3,1060,1141,926,226,657,869,740,1170,746,889,416,634,209,1189,1076,819,1144,40,807,561,400,283,133,186,839,1043,491,936,559,70,9,854,1172,9,739,871,436,1087,1029,66,561,798,1141,701,1020,1072,92,636,509,392,77,84,202,843,563,329,906,101,997,1162,105,876,460,285,446,753,516,60,932,323,659,9,639,1041,861,1199,343,792,1114,536,405,542,805,929,589,538,410,143,114,24,1064,682,536,1016,1141,843,472,817,196,673,189,915,196,755,203,956,283,833,836,22,899,232,655,572,207,819,639,1024,887,407,385,251,896,165,290,193,357,870,678,411,697,998,344,628,866,1004,894,547,574,36,847,691,601,896,363,21,1133,115,658,855,1042,2,189,230,215,747,971,581,809,832,311,35,639,1127,701,167,672,763,997,1061,1170,289,806,91,198,720,67,273,863,437,152,671,635,968,107,58,453,392,236,875,719,44,850,176,580,937,227,125,851,1188,915,747,1175,69,743,250,275,290,787,780,516,775,279,256,649,83,1180,372,655,813,750,381,807,988,977,430,282,1067,551,726,756,372,17,1016,550,1128,223,174,85,1039,1,27,178,822,243,440,79,772,211,640,454,1141,654,351,54,794,711,157,492,307,1156,937,212,461,417,741,1104,642,1147,833,1194,1066,1070,876,1045,341,854,1014,787,518,404,1068,385,756,998,298,439,917,183,71,363,38,828,372,1071,195,481,1153,871,712,803,849,145,1144,410,420,561,678,241,498,548,436,871,810,180,635,119,665,551,1132,807,408,685,489,274,459,28,987,935,310,284,1163,924,812,267,1123,782,1065,1075,1199,1047,289,280,1044,931,1056,625,672,150,41,1084,998,151,483,226,548,277,1187,1010,262,1048,493,1084,845,1127,1009,773,129,547,798,118,559,463,972,666,1155,519,381,405,819,201,790,729,1100,614,691,3,386,206,514,387,612,1073,158,67,1116,164,496,1056,1159,348,530,28,1177,774,1139,559,563,310,916,897,36,1060,173,952,123,635,911,711,304,611,481,645,532,1033,385,402,797,117,307,969,1147,1127,434,1099,1043,104,74,257,778,934,901,106,84,525,138,698,877,1009,487,450,649,736,802,1032,456,757,10,2,720,1155,234,844,880,1053,1134,821,1094,970,1095,976,101,1163,104,38,198,350,896,345,867,1129,1064,403,228,1103,416,561,722,915,1161,252,45,632,1163,232,174,964,876,1126,479,432,984,815,544,1005,620,497,1021,763,169,1028,706,1112,150,368,483,251,721,492,686,1105,38,1140,1085,153,366,428,296,28,648,873,21,236,393,581,1043,1086,747,402,201,1196,416,788,318,257,815,735,1023,1143,1100,922,1033,884,824,963,159,904,21,1168,511,723,400,239,338,89,1099,572,674,54,891,426,277,91,504,302,616,468,506,917,491,744,1091,1051,594,465,850,338,417,320,1160,364,480,855,86,305,225,833,637,760,1147,613,236,460,664,1183,38,806,100,654,852,975,816,506,1092,275,6,229,972,53,554,370,63,651,701,304,1011,672,353,118,1111,448,549,151,1087,909,420,1095,663,1119,1124,729,578,733,861,1154,1195,387,1182,850,189,463,1129,1185,541,546,1159,314,137,479,59,841,514,548,496,642,341,151,999,1036,1186,704,550,1039,723,779,584,382,371,712,176,665,180,440,697,1102,408,728,157,1050,558,692,336,384,107,839,477,204,862,345,429,1144,1069,207,449,594,963,988,843,334,200,865,281,296,1040,914,995,743,1134,1050,484,602,1001,570,1052,1106,922,77,1099,681,360,955,1184,669,411,760,46,599,815,231,86,694,469,1079,1161,1105,519,1010,681,603,376,534,145,361,448,1006,91,397,671,597,238,119,467,587,723,162,804,638,568,195,460,610,868,806,995,1178,490,406,933,232,17,37,2,114,1004,871,531,209,267,37,750,1196,940,89,725,377,898,6,685,210,1127,1160,432,391,931,681,937,275,1190,137,743,652,430,566,180,1192,718,253,133,998,1067,764,747,1159,827,143,506,641,327,468,731,50,15,569,80,310,1086,1092,989,245,520,711,788,1144,938,1152,1169,563,1053,1182,331,838,112,361,1049,717,979,956,434,534,1083,117,280,1104,293,1137,592,1019,606,526,216,924,197,137,1041,2,910,274,1178,267,521,626,764,691,124,446,337,676,325,288,1120,924,512,777,1063,979,86,677,1183,777,418,41,852,929,712,1132,1030,339,943,475,851,340,894,1091,230,654,229,945,69,182,110,255,895,645,1061,793,1016,807,440,330,519,73,108,660,209,1077,1191,938,415,1162,579,258,14,273,561,834,371,134,1118,1139,1163,667,979,483,436,42,593,139,846,875,571,808,76,713,1198,352,299,156,793,509,245,697,1106,236,287,236,644,683}, 
        new int[] {487,13,943,31,661,656,690,175,1147,760,96,290,755,504,1111,219,187,641,380,886,781,214,714,594,41,1154,908,977,1183,28,464,524,895,1177,28,225,1180,206,387,25,166,207,394,418,771,719,153,836,970,589,114,67,1180,1136,863,1144,21,9,957,861,981,849,1031,361,541,649,220,718,263,390,24,830,103,955,233,1174,521,580,83,869,321,712,1011,130,297,835,406,543,849,681,337,355,867,863,552,883,155,762,982,129,605,125,1111,442,89,1139,1084,870,183,1142,78,12,893,677,817,348,1036,482,76,619,563,435,529,311,1148,629,786,288,112,995,854,844,1002,948,570,736,1088,354,618,876,926,150,1108,412,707,233,137,775,751,1137,481,349,150,518,1165,191,223,754,419,1025,817,1001,278,692,403,1023,106,78,124,679,598,727,1026,966,564,726,1148,643,806,1182,645,300,867,613,458,844,679,907,437,1012,902,18,843,190,43,705,818,957,146,1175,130,744,941,975,692,1066,541,335,20,311,606,377,558,113,545,1115,228,29,2,1180,331,1072,151,692,1156,347,293,1135,959,865,1031,40,425,1191,1178,87,989,92,1186,1072,105,1058,369,401,1117,220,484,181,901,321,923,263,72,685,820,1123,736,942,37,419,631,545,761,227,230,25,636,1048,834,736,899,530,217,669,278,653,657,857,724,782,146,780,615,1156,751,463,625,707,355,92,718,855,624,504,359,744,793,868,462,985,1087,517,886,83,221,383,601,709,683,1097,544,411,28,1129,781,13,752,347,1150,1030,269,701,658,658,1188,222,1160,480,953,203,132,17,723,927,911,448,977,1126,219,118,1033,919,1041,712,930,963,772,264,523,479,735,919,72,1019,131,15,628,331,408,578,37,1123,125,527,887,54,1043,259,654,557,872,505,700,1077,202,368,628,29,66,199,611,730,1108,682,705,628,1001,705,21,266,428,1093,800,742,701,715,845,1151,300,460,1134,708,443,706,819,296,199,671,452,626,386,569,999,326,1081,202,384,783,541,811,1058,684,146,288,1149,480,0,658,547,773,588,758,189,489,257,436,362,417,180,671,141,657,864,808,1026,504,827,1125,977,1161,699,360,689,520,796,147,746,978,833,82,102,254,736,88,525,1037,659,1061,333,663,520,6,439,823,1151,395,188,32,513,34,805,1017,1193,157,942,87,630,915,807,215,482,1132,23,1008,1175,724,1070,339,1139,22,455,306,369,151,1031,1119,846,1195,49,1169,773,706,45,747,875,944,1161,1025,258,765,1039,459,641,1169,211,894,556,253,831,1115,458,351,1138,58,1169,1190,743,611,392,1015,54,831,330,1138,681,1012,750,967,1179,398,564,5,2,143,787,197,590,144,589,588,493,524,748,1123,707,585,641,293,871,331,1173,280,218,931,11,663,1005,1118,555,1000,699,720,81,527,71,458,462,1056,447,491,1068,1078,842,455,497,959,745,654,1011,939,787,430,535,594,940,1176,656,207,815,1133,610,1113,596,1018,961,840,555,582,1187,828,161,983,686,870,800,525,34,1013,385,870,953,59,518,521,151,633,561,848,310,712,108,1148,446,480,983,110,442,182,119,463,909,690,48,1040,631,17,1027,158,353,108,524,335,1046,514,1027,746,917,378,437,606,829,743,462,1013,525,290,477,749,896,12,351,13,42,819,334,912,30,1041,815,307,1138,168,209,1134,100,276,292,283,1074,123,561,857,92,879,58,706,532,75,49,385,342,887,646,301,54,483,589,1084,1092,178,845,243,873,611,340,712,115,157,63,773,800,844,167,384,522,877,183,368,709,501,905,512,756,246,197,463,47,232,256,37,883,1048,774,431,943,868,111,163,336,648,313,858,536,416,680,951,320,499,199,234,482,529,676,26,1180,721,877,586,628,1152,835,1145,447,763,750,188,1169,596,1125,310,519,1165,488,1063,59,292,701,1078,1088,663,512,172,477,187,215,1192,22,827,279,607,286,179,744,569,500,510,1038,570,1159,520,1070,759,831,906,644,753,574,257,983,1023,227,460,710,169,595,249,111,73,991,933,448,655,559,183,244,44,644,935,466,97,605,460,800,229,977,675,236,946,73,456,623,499,423,162,342,914,386,1082,407,954,1081,1099,142,539,416,791,1195,1099,885,965,971,796,1198,449,768,792,541,18,476,303,137,319,1008,343,733,128,641,709,175,691,227,307,1177,1198,1075,747,944,1038,933,643,613,1166,1153,120,288,1167,246,1103,185,85,1008,1060,1051,421,150,601,376,183,1028,146,297,515,688,886,1090,552,969,903,1086,931,946,1099,546,17,851,908,1170,418,94,61,233,1069,510,783,302,701,564,1195,57,1007,994,205,1019,694,1020,137,1041,803,673,1162,14,904,418,1076,514,79,944,242,491,867,934,40,1059,776,817,468,516,550,906,790,459,273,924,185,1183,337,435,699,316,768});
        Assertions.assertEquals(
            126981,p);

    }

    
}
