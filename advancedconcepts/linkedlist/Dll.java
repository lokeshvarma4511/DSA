package company.dsa.advancedconcepts.linkedlist;

public class Dll
{
     private Node head;
     public void insertFirst(int data) {

          Node node = new Node(data);
          node.next = head;
          node.prev =null;
          if (head != null)
          {
               head.prev = node;
          }
          head=node;
     }

     public void insert(int data) {
          Node node = new Node(data);
          node.next=null;
          if (head == null) {
               insertFirst(data);
          }
          else
          {
               Node last= head;
               while (last.next != null) {
                    last=last.next;
               }
               node.prev=last;
               last.next=node;
               node.next=null;
          }

     }


     public void display() {
          Node node=head;
          Node last = null;
          while(node!=null)
          {
               System.out.print(node.data + "-->");
               last=node;
               node = node.next;
          }
          System.out.println("End");

          //printing in reverse
          while (last != null) {
               System.out.print(last.data+"-->");
               last = last.prev;
          }
          System.out.println("Start");
     }

     private class Node
     {
          int data;
          Node next;
          Node prev;
          public Node(int data) {
               this.data=data;
          }
     }
}