

import java.util.Iterator;
import java.util.NoSuchElementException;

//package com.samples.datastructures;
//import org.w3c.dom.Node;
//
//import java.util.Stack;
//
//public class StackMain {
//    private int length;
//
//    private Node top = null;
//
//    public void push(int item){
//        Node node = new Node(item);
//        if (top == null) {
//
//            top = node;
//        } else {
//            node.next = top;
//            top = node;
//        }
//        length++;
//    }
//
//    public int pop(){
//        int result = -1;
//
//        if (top != null){
//            result = top.data;
//            top = top.next;
//            length--;
//        }
//        return result;
//    }
//
//    public int peek(){
//        return (top == null) ? -1 :top.data;
//    }
//
//    @Override
//    public String toString(){
//        StringBuilder result = new StringBuilder();
//        Node tempNode = null;
//        result.append("[");
//
//        if (top != null){
//            for (tempNode = top; tempNode!= null; tempNode = tempNode.next){
//                result.append(tempNode.data + " ");
//            }
//        }
//        result.append("]");
//
//        return result.toString();
//    }
//
//    public int size(){
//        return length;
//    }
//
//
//
//    public static void main(String[] args) {
//        StackEx stack = new StackEx()
//
//                stack.push(4);
//    }

