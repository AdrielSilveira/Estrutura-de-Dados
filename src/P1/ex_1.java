package P1;

import java.util.ArrayList;
import java.util.List;

public class ex_1 {
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        List<Integer> intersectionList = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    intersectionList.add(arr1[i]);
                    break;
                }
            }
        }

        int[] intersectionArray = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) {
            intersectionArray[i] = intersectionList.get(i);
        }

        return intersectionArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        int[] intersection = findIntersection(arr1, arr2);

        System.out.println("Intersection elements:");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}
/* A complexidade do algoritmo acima é O(n * m), onde n é o tamanho do primeiro arranjo (arr1)
e m é o tamanho do segundo arranjo (arr2). O algoritmo utiliza dois loops aninhados para percorrer
todos os elementos dos arranjos. No pior caso, cada elemento de arr1 é comparado com todos os elementos de arr2.
Portanto, a complexidade do algoritmo é proporcional ao produto dos tamanhos dos dois arranjos. */