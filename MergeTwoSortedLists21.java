/*Вам будут предоставлены заголовки двух отсортированных связанных списков list1 и list2.

        Объедините два списка в один отсортированный список. Список должен быть составлен путем объединения узлов первых двух списков.

        Верните заголовок объединенного связанного списка.

        Пример 1:

        Ввод: список 1 = [1,2,4], список 2 = [1,3,4]
        Вывод: [1,1,2,3,4,4]

        Пример 2:

        Ввод: список 1 = [], список 2 = []
        Вывод: []

        Пример 3:

        Ввод: список 1 = [], список 2 = [0]
        Вывод: [0]*/

import modules.ListNode;

import java.util.Map;

public class MergeTwoSortedLists21 implements Task{
    @Override
    public String execute(Map params) {
        return mergeTwoLists(new ListNode(0),new ListNode(1)).toString();
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        var head = new ListNode(0);
        var tail = head;

//        while (l1 != null || l2 != null) {
//            if (l2 == null || (l1 != null && l1.val < l2.val)){
//                node.next = l1;
//                l1 = l1.next;
//            }else{
//                node.next = l2;
//                l2 = l2.next;
//            }
//            node = node.next;
//        }

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val){
                tail.next = l1;
                l1 = l1.next;
            }else{
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if(l1 == null)
            tail.next = l2;
        else if(l2 == null)
            tail.next = l1;

        return head.next;

//        if(l1 == null) return l2;
//        if(l2 == null) return l1;
//
//        if(l1.val < l2.val) {
//            l1.next = mergeTwoLists(l1.next, l2);
//            return l1;
//        }else {
//            l2.next = mergeTwoLists(l1, l2.next);
//            return l2;
//        }

    }

}
