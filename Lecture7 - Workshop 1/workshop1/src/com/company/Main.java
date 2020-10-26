package com.company;

import linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        System.out.println("---------");
        list.addFirst(5);
        System.out.println(list.getHead().getValue());
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        System.out.println("---------");
        list.addFirst(8);
        System.out.println(list.getHead().getValue());
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        System.out.println("---------");
        System.out.println(list.getTail().getValue());
        System.out.println(list.getSize());

        System.out.println("---------");
        list.addLast(3);
        System.out.println(list.getTail().getValue());
        System.out.println(list.getSize());

        System.out.println("---------");
        System.out.println(list.removeFirstNode());
        System.out.println(list.getSize());
        System.out.println(list.getHead().getValue());

        System.out.println("---------");
        System.out.println(list.removeLast());
        System.out.println(list.getSize());
        System.out.println(list.getTail().getValue());

        System.out.println("---------");
        list.addFirst(4);
        list.addLast(6);
        list.forEach(System.out::println);

        System.out.println("---------");
        int[] arr = list.toArray();
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

        System.out.println("---------");
        list.addAfter(4, 0);
        list.forEach(System.out::println);
        System.out.println();
        list.addAfter(6, 7);
        list.forEach(System.out::println);

        System.out.println("---------");
        list.removeAfter(4);
        list.forEach(System.out::println);
        System.out.println();
        list.removeAfter(7);
        list.forEach(System.out::println);
        System.out.println();

    }
}
