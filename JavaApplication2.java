/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author User
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] academicPerf =new int[]{1,2,3,4,5};
        Student[] students = new Student[10];
        students[0] = new Student("Alexandr","Kalinin","Sergeevich","p-32",academicPerf);
        academicPerf =new int[]{5,5,3,4,5};
        students[1] = new Student("Денис","Яворивский","Вадимович","p-32",academicPerf);
        academicPerf =new int[]{1,1,1,3,2};
        students[2] = new Student("Alexandr","Kalinin","Sergeevich","p-32",academicPerf);
        academicPerf =new int[]{2,2,5,5,5};
        students[3] = new Student("Alexandr","Kalinin","Sergeevich","p-32",academicPerf);
        academicPerf =new int[]{1,2,3,4,5};
        students[4] = new Student("Alexandr","Kalinin","Sergeevich","p-32",academicPerf);
        academicPerf =new int[]{4,4,1,1,5};
        students[5] = new Student("Alexandr","Kalinin","Sergeevich","p-32",academicPerf);
        academicPerf =new int[]{1,2,3,3,5};
        students[6] = new Student("Alexandr","Kalinin","Sergeevich","p-32",academicPerf);
        academicPerf =new int[]{5,5,5,5,5};
        students[7] = new Student("Alexandr","Kalinin","Sergeevich","p-32",academicPerf);
        academicPerf =new int[]{3,4,4,4,5};
        students[8] = new Student("Alexandr","Kalinin","Sergeevich","p-32",academicPerf);
        academicPerf =new int[]{5,5,4,4,4};
        students[9] = new Student("Alexandr","Kalinin","Sergeevich","p-32",academicPerf);
        for(int mark = 0; mark < students.length; mark++){
            int averageMark = students[mark].returnAverageMark();
                if(averageMark>=4){
                    students[mark].printData();
                };
            }
    }
}
 class Student{
        private String name;
        private String surName;
        private String lastName;
        private String groupNumber;
        private int[] academicPerf;
        private int averageMark;
        Student(String name,String surName,String lastName,String groupNumber,int[] academicPerf){
            this.name = name;
            this.surName = surName;
            this.lastName = lastName;
            this.groupNumber = groupNumber;
            this.academicPerf = academicPerf;
            int averageMark = 0;
            for(int mark = 0; mark < academicPerf.length; mark++){
                averageMark += academicPerf[mark];
            }
            averageMark = averageMark/academicPerf.length;
            this.averageMark = averageMark;
        }
        public int returnAverageMark(){
            return this.averageMark;
        }
        public void printData(){
            System.out.print(this.name +" "+ this.surName +" "+ this.lastName +" "+ this.groupNumber + " mark: "+ this.averageMark + " marks: ");
            for(int mark = 0; mark < academicPerf.length; mark++){
                System.out.print(academicPerf[mark] +" ");
            }
            System.out.println(" ");
        }
    }
