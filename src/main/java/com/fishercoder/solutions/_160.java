package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

/**160. Intersection of Two Linked Lists
 *
 * Write a program to find the node at which the intersection of two singly linked lists begins.


 For example, the following two linked lists:

 A:          a1 → a2
                     ↘
                     c1 → c2 → c3
                     ↗
 B:     b1 → b2 → b3
 begin to intersect at node c1.


 Notes:
 If the two linked lists have no intersection at all, return null.
 The linked lists must retain their original structure after the function returns.
 You may assume there are no cycles anywhere in the entire linked structure.
 Your code should preferably run in O(n) time and use only O(1) memory.
 */

public class _160 {

	public static class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			if (headA == null || headB == null) {
				return null;
			}
			if (headA == headB) {
				return headA;
			}
			ListNode nodeA = headA;
			ListNode nodeB = headB;
			while (nodeA != nodeB) {
				nodeA = nodeA == null ? headB : nodeA.next; // post headB before headA
				nodeB = nodeB == null ? headA : nodeB.next; // post headA before headB
			}
			return nodeA;
		}
	}
}
