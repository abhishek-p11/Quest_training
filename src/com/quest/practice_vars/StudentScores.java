package com.quest.practice_vars;
public class StudentScores {
    public static void main(String[] args) {
        // Step 1: Initialize arrays
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace"};
        int[] ages = {20, 21, 22, 23, 24, 25, 26};
        int[][] scores = {
                {85, 90, 78, 92, -1},
                {88, 92, 80, -1, 85},
                {75, 80, 70, 60, 72},
                {90, 85, 88, 95, 92},
                {65, 70, 60, 68, 67},
                {80, 85, -1, 90, 95},
                {90, 88, 92, 85, 80}

        };
        System.out.println("--average scores--");
        calculateAverageScores( names, ages, scores);
        System.out.println("--highest scores--");
        findHighestScorer(names, ages, scores);
        rankStudents(names, ages, scores);
        System.out.println("--missing data--");
        detectMissingData(names,scores);
    }
    public static void calculateAverageScores(String[] names, int[] ages, int[][] scores) {
        double[] avgScores = new double[names.length];
        double temp=0;
        for (int i = 0; i < 7; i++) {
             temp=0;
            for(int j = 0; j < 5; j++) {
                temp=temp+scores[i][j];
            }
            avgScores[i]=temp/5;
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println("average score of "+names[i]+"="+avgScores[i]);
        }
    }
    public static void findHighestScorer(String[] names, int[] ages, int[][] scores) {
        double[] avgScores = new double[names.length];
        double temp=0;
        double highestScore=0;
        int c=0;
        for (int i = 0; i < 7; i++) {
            temp=0;
            for(int j = 0; j < 5; j++) {
                temp=temp+scores[i][j];
            }
            avgScores[i]=temp/5;
        }
        for (int i = 0; i < names.length; i++) {
            if(avgScores[i]>highestScore) {
                highestScore = avgScores[i];
                c=i;
            }

        }
        System.out.println(names[c]+" got the highest average score"+"="+highestScore);

    }
    public static void rankStudents(String[] names, int[] ages, int[][] scores) {
        int[] sum=new int[names.length];
        int[] avg=new int[names.length];

        for(int i=0; i<names.length; i++){
            for(int j=0; j<scores[i].length; j++) {
                sum[i] += scores[i][j];
            }
            avg[i]=sum[i]/scores[i].length;

        }
        for (int i = 0; i < avg.length ; i++) {
            for (int j =i+1; j < avg.length ; j++) {
                if (avg[i] < avg[j]) {

                    int temp = avg[i];
                    avg[i] = avg[j];
                    avg[j] = temp;

                    String name=names[i];
                    names[i]=names[j];
                    names[j]=name;
                }
            }

        }
        System.out.println("--------STUDENT RANKINGS---------");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i] + " - Average Score: " + avg[i]);
        }
    }


    public static void detectMissingData(String[] names, int[][] scores) {
        for (int i = 0; i < names.length; i++) {
            for(int j = 0; j < 5; j++) {
                if(scores[i][j]==-1) {
                    System.out.println(names[i]+" has missing data in subject "+(j+1));
                }
            }
        }
    }

}
