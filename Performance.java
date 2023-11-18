import java.util.Scanner;

public class Performance{
private int[] marks;
 
public Performance(){
marks = new int[10];
}

public void readMarks(){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the marks:");
for (int i = 0; i < 10; i++) {
marks[i] = scanner.nextInt();
}
}
    
public void Hmark(){
int topscore = marks[0];
for (int i = 1; i < 10; i++){
if (marks[i] > topscore){
topscore = marks[i];
}
}
System.out.println("Highest Mark:" + topscore);
}

public void Lmark(){
int lowest = marks[0];
for (int i = 1; i < 10; i++){
if (marks[i] < lowest){
lowest = marks[i];
}
}
System.out.println("The Least Mark is :" + lowest);
}

public void getMode(){
int mode=marks[0];
int counter=0;
for(int i=0; i<10; i++){
int currMark = marks[i];
int countCurrVal=0;
for(int j=0; j<10; j++){
if (marks[j] == currMark){
countCurrVal += 1;
}
if (countCurrVal > counter){
mode = currMark;
counter = countCurrVal;
}
}

}
System.out.println("The mode is: " + mode);
System.out.println("The freq is:"+counter);
}
 
public void display(){
Hmark();
Lmark();
getMode();
}

public static void main(String[] args){
Performance performance = new Performance();
performance.readMarks();
performance.display();
}
}