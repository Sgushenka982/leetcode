/*Вам предоставляется массив k связанных списков lists, каждый связанный список отсортирован в порядке возрастания.
  Объедините все связанные списки в один отсортированный связанный список и верните его.

        Пример 1:

        Ввод: списки = [[1,4,5],[1,3,4],[2,6]]
        Вывод: [1,1,2,3,4,4,5,6]
        Объяснение: Связанные списки являются:
        [
        1->4->5,
        1->3->4,
        2->6
        ]
        объединение их в один отсортированный список:
        1->1->2->3->4->4->5->6

        Пример 2:

        Ввод: списки = []
        Вывод: []

        Пример 3:

        Ввод: списки = [[]]
        Вывод: []

        Ограничения:

        k == lists.length
        0 <= k <= 104
        0 <= lists[i].length <= 500
        -104 <= lists[i][j] <= 104
        lists[i] сортируется в порядке возрастания.
        Сумма lists[i].length не будет превышать 104.*/

import modules.ListNode;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class MergeKLists23 implements Task{

    @Override
    public String execute(Map params) {
        return mergeKLists((ListNode[]) params.get("value")).toString();
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;

        Queue<ListNode> queue = new LinkedList<ListNode>();

        for(var list: lists){
            queue.add(list);
        }

        while(queue.size()>1){
            MergeTwoSortedLists21 merge2List = new MergeTwoSortedLists21();
            var mergedList = merge2List.mergeTwoLists(queue.remove(), queue.remove());

            queue.add(mergedList);
        }

        return queue.remove();
    }
}
