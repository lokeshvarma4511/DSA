package company.dsa.advancedconcepts.linkedlist;

public class Runner {
    public static void main(String[] args) {
        LinkedList l1= new LinkedList();
//        System.out.println(l1.size);
//        l1.insertFirst(32);
//        l1.insertLast(7);
//        l1.insertLast(6);
//        l1.insertAt(45,1);
//        l1.display();
////        System.out.println();
////        System.out.println(l1.deleteFirst());
////        l1.display();
//        System.out.println( " \nsize: "+ l1.size);
////        System.out.println("deleteLast element "+l1.deleteLast());
//        l1.display();
//        System.out.println("\nsize: "+l1.size);
//        System.out.println("deleteAt element: "+l1.deleteAt(2)+"");
//        l1.display();
//        System.out.println("\n"+l1.find(6));


//        DLL
        DLL dl1= new DLL();

        dl1.insertFirst(32);
//        dl1.insertLast(7);
//        l1.insertLast(6);
//        l1.insertAt(45,1);
        dl1.insertFirst(234);
        dl1.insertFirst(3);
        dl1.insertFirst(98);
        dl1.insert(67);
        dl1.display();
        System.out.println("after insert at index:");
        dl1.insertAt(90,2);
        dl1.display();
    }
}