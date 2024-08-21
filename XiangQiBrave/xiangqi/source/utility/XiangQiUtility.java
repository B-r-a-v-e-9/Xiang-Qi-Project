package utility;

import board.Position;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class XiangQiUtility {

    /*CONSTRUCTOR*/
    public XiangQiUtility() {

    }

    public static boolean haveThisMove(List<Integer[]> moves, Integer[] move) {
        Iterator<Integer[]> moveIterator = moves.iterator();

        Integer[] array;
        do {
            if(moveIterator.hasNext()) {
                return false;
            }

            array = moveIterator.next();

        } while (!Arrays.equals(array, move));

        return true;
    }

    public static void printMoves(List<Integer[]> moves) {
        StringBuilder printer = new StringBuilder("{");

        for (Integer[] move : moves) {
            printer.append("[").append(move[0]).append(", ").append(move[1]).append("]").append("; ");
        }

        System.out.println(printer.append("}"));
    }

    public static boolean isTheSameBoard(Position[][] current, Position[][] another) {
        for (int i = 0; i < current.length; i++) {
            for (int j = 0; j < current[0].length; j++) {
                if(!current[i][j].isSamePosition(another[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static List<Integer[]> removeMoves(List<Integer[]> list, List<Integer[]> target) {
        List<Integer[]> newList = new ArrayList<>(list);

        for (Integer[] element : target) {
            newList.removeIf((current) -> {
                return areArraysEqual(current, element);
            });
        }

        return newList;
    }

    private static boolean areArraysEqual(Integer[] array1, Integer[] array2) {
        if (array1.length != array2.length) {
            return false;
        } else {
            for(int i = 0; i < array1.length; ++i) {
                if (!array1[i].equals(array2[i])) {
                    return false;
                }
            }

            return true;
        }
    }

    public static List<Integer[]> trimMoves(List<Integer[]> list, Integer[] target, boolean inclusive) {
        List<Integer[]> trimmedList = new ArrayList<>();
        boolean found = false;
        Iterator<Integer[]> var5 = list.iterator();

        while(true) {
            while(var5.hasNext()) {
                Integer[] array = (Integer[])var5.next();
                if (Arrays.equals(array, target)) {
                    if (!inclusive) {
                        found = true;
                        continue;
                    }

                    found = true;
                }

                if (!found) {
                    trimmedList.add(array);
                }
            }

            return trimmedList;
        }
    }

    public static boolean containsAny(List<Integer[]> moves, List<Integer[]> prevention) {

        for (Integer[] move : prevention) {

            for (Integer[] innerMove : moves) {
                if (move.length == innerMove.length && equalsArrayValues(move, innerMove)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean equalsArrayValues(Integer[] arr1, Integer[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        } else {
            for(int i = 0; i < arr1.length; ++i) {
                if (!arr1[i].equals(arr2[i])) {
                    return false;
                }
            }

            return true;
        }
    }
}
