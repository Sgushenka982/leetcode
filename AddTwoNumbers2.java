/*Вам будут предоставлены два непустых связанных списка, представляющих два неотрицательных целых числа.
 Цифры хранятся в обратном порядке, и каждый из их узлов содержит одну цифру.
 Сложите два числа и верните сумму в виде связанного списка.
 Можно предположить, что эти два числа не содержат никакого начального нуля, за исключением самого числа 0.

        Пример 1:

        Ввод: l1 = [2,4,3], l2 = [5,6,4]
        Вывод: [7,0,8]
        Объяснение: 342 + 465 = 807.

        Пример 2:

        Ввод: l1 = [0], l2 = [0]
        Вывод: [0]

        Пример 3:

        Ввод: l1 = [9,9,9,9,9,9], l2 = [9,9,9,9]
        Вывод: [8,9,9,9,0,0,0,1]

        Ограничения:

        Количество узлов в каждом связанном списке находится в диапазоне [1, 100].
        0 <= Node.val <= 9
        Гарантируется, что список представляет число, у которого нет начальных нулей.*/

import modules.ListNode;

import java.util.Map;

public class AddTwoNumbers2 implements Task{
    @Override
    public String execute(Map params) {
        return null;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode head = node;

        int oversize = 0;
        while(l1 !=null || l2!=null){
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + oversize;
            int digit = sum%10;
            oversize = sum/10;

            ListNode tempNode = new ListNode(digit);
            node.next = tempNode;
            node = node.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        if(oversize>0){
            node.next = new ListNode(oversize);
        }

        return head.next;

//        int overflow = 0;
//        ListNode res = new ListNode();
//        ListNode cur = null;
//        while (l1 != null || l2 != null || overflow > 0) {
//            if  (cur == null) {
//                cur = res;
//            } else {
//                cur.next = new ListNode();
//                cur = cur.next;
//            }
//
//            int v1 = l1 == null ? 0 : l1.val;
//            int v2 = l2 == null ? 0 : l2.val;
//            int sum = v1 + v2 + overflow;
//            int digit = sum % 10;
//            overflow = sum / 10;
//            cur.val = digit;
//            l1 = l1 == null ? null : l1.next;
//            l2 = l2 == null ? null : l2.next;
//        }
//        return res;
    }
}
