import java.io.StreamCorruptedException;

public class Example {
    public static void main(String[] args) {
        int YuWen = 0;
        int ShuXue = 1;
        int WaiYu = 2;
        int WuLi = 3;
        int HuaXue = 4;
        int ShengWu = 5;

        int totalScoreCount = 6;
        double[] scores = new double[totalScoreCount];
        String[] scoreNames = new String[totalScoreCount];

        scoreNames[YuWen] = "语文";
        scoreNames[ShuXue] = "数学";
        scoreNames[WaiYu] = "外语";
        scoreNames[WuLi] = "物理";
        scoreNames[HuaXue] = "化学";
        scoreNames[ShengWu] = "生物";

        for (int i = 0; i < totalScoreCount; i++) {
            scores[i] = 80 + Math.random() * 20;
        }
        for (int i = 0; i < totalScoreCount; i++) {
            System.out.println(scoreNames[i]+": "+scores[i]);
        }
        double maxScore = 0;
        int maxScoreIdx = 0;
        for (int i=0;i<totalScoreCount;i++){
            if (scores[i] > maxScore){
                maxScore = scores[i];
                maxScoreIdx = i;
            }
        }
        System.out.println("成绩最高的科目是"+scoreNames[maxScoreIdx]+", 成绩是: "+maxScore);
    }
}
