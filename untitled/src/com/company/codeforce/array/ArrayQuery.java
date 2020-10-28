package com.company.codeforce.array;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ArrayQuery {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        dynamicArray(n, queries);

        bufferedReader.close();
        //bufferedWriter.close();
    }


    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        List dyanmiArray = new ArrayList();

        int lastAns = 0;
        int tmpSeq[][] = new int[n][100141497];

        int index = 0;
int p=0;
        System.out.println(queries.get(48).get(0));

        System.out.println(queries.get(48).get(1));

        System.out.print(queries.get(48).get(2));

        for (List<Integer> item : queries) {
            p+=1;
            System.out.print(p);
            switch (item.get(0)) {
                case 1:
                    index = (item.get(1) ^ lastAns) % n;
                    if(index==66)
                    {
                        System.out.print("");
                    }
                    tmpSeq[index][tmpSeq.length-1] = item.get(2);
                    break;
                case 2:
                    if(p==49)
                    {
                        System.out.print("CHECK");
                    }
                    index = (item.get(1) ^ lastAns) % n;
                    lastAns = tmpSeq[index][tmpSeq.length-1];
                    dyanmiArray.add(lastAns);
                    break;
            }
        }

        for (int i=0;i<dyanmiArray.size();i++) {
            System.out.print(""+ dyanmiArray.get(i));
        }

            return dyanmiArray;
    }


}
