/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package generic;
import java.util.Scanner;
/**
 *
 * @author Svyatoslav
 */
public class Main {

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Set<Integer> set = new Set();
        System.out.println("Выберите действие");
        System.out.println("1 - добавить элемент");
        System.out.println("2 - удалить элемент");
        System.out.println("3 - проверить элемент на принадлежность множеству");
        System.out.println("4 - пересечение множеств");
        System.out.println("5 - объединение множеств");
        System.out.println("6 - вывести множество на экран");
        System.out.println("7 - выйти");
        Scanner sc = new Scanner(System.in);
        int option =  sc.nextInt();
        while (option != 7){
             if (option == 1){
                 System.out.println("Введите число");
                 int number = sc.nextInt();
                 set.addValue(number);
             }
             if (option == 2){
                 System.out.println("Введите число");
                 int number = sc.nextInt();
                 set.deleteValue(number);
             }
             if (option == 3){
                 System.out.println("Введите число");
                 int number = sc.nextInt();
                 System.out.print(set.findValue(number));
             }
             if (option == 4){
                 Set<Integer> set2 = new Set();
                 System.out.println("Добавьте элементы во второе множество");
                 System.out.println("Введите количество элементов во втором множестве");
                 int amount = sc.nextInt();
                 for (int i = 0;i < amount;i++){
                     System.out.println("Введите число");
                     int number = sc.nextInt();
                     set2.addValue(number);
                 }
                 set2.Intersection(set);
             }
             if (option == 5){
                 Set<Integer> set2 = new Set();
                 System.out.println("Добавьте элементы во второе множество");
                 System.out.println("Введите количество элементов во втором множестве");
                 int amount = sc.nextInt();
                 for (int i = 0;i < amount;i++){
                     System.out.println("Введите число");
                     int number = sc.nextInt();
                     set2.addValue(number);
                 }
                 set2.Unification(set);
             }
             if (option == 6)
                 set.printList();
             System.out.println();
             System.out.println("Выберите действие");
             option =  sc.nextInt();
         }
    }

}
