package ch03_array;

import javax.security.auth.Subject;
import java.util.Scanner;

public class SungjukTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("응시자가 몇명인가요?");
        int name_su = scan.nextInt();

        String[] name = new String[name_su];

        for (int i = 0; i < name_su; i++) {
            System.out.println((i+1) + "번째 응시자 이름 :");
            name[i]=scan.next();

        }

        System.out.println("시험이 몇 과목인가요?");
        int subject_su = scan.nextInt();

        String[] subject = new String[subject_su]; //시험 과목 이름을 1차원

        for (int i = 0; i < subject_su; i++) {
            System.out.println((i+1) +"번째 과목 이름 : ");
            subject[i] =scan.next();

        }


        int [][] NameSubject = new int[name_su][subject_su];//시험 점수 2차원 배열

        for (int i = 0; i < NameSubject.length; i++) {
            System.out.printf("%s님 점수 입력\n", name[i]);
            for (int j = 0; j < NameSubject[i].length; j++) {
                System.out.printf("%s 점수 :", subject[j]);
                NameSubject[i][j] = scan.nextInt();


                System.out.println();
            }


        }
        //응시자별 평균 점수를 저장할 1차원 배열
        double[] avg_name = new double[name_su];

        for (int i = 0; i < name_su; i++) {
            for (int j = 0; j < subject_su; j++) {
                avg_name[i] += NameSubject[i][j];




            }

            avg_name[i]/= subject_su;

        }

        for (int i = 0; i < name_su; i++) {
            System.out.printf("%s님의 평균 ; %.2f\n", name[i], avg_name[i]);

        }
        double[] avg_subject = new double[subject_su];

        for (int i = 0; i < subject_su; i++) {
            for (int j = 0; j < name_su; j++) {
                avg_subject[i] += NameSubject[j][i];

            }
            avg_subject[i] /= name_su;


        }
        for (int i = 0; i < subject_su; i++) {
            System.out.printf("%s 과목의 평균 : %.2f\n",subject[i] , avg_subject[i]);}


//행렬 전치

        int [][] SubjectName = new int[subject_su][name_su];
        for (int i = 0; i < subject_su; i++) {
            for (int j = 0; j < name_su; j++) {
                SubjectName[i][j] = NameSubject[j][i];


            }
            System.out.println();

        }

        System.out.println("before transform");
        for (int i = 0; i < name_su; i++) {
            for (int j = 0; j < subject_su; j++) {
                System.out.printf("%d\t", NameSubject[i][j]);

            }
        }

            System.out.println("after transform");
            for (int i = 0; i < subject_su; i++) {
                for (int j = 0; j < name_su; j++) {
                    System.out.printf("%d\t", SubjectName[i][j]);
                }
                System.out.println();
        }
            scan.close();
    }
}
