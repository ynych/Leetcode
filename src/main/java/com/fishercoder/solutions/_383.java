package com.fishercoder.solutions;

/**
 * 383 Ransom Note
 *
 * Given an arbitrary ransom note string and another string containing letters
 * from all the magazines, write a function that will return true if
 * the ransom note can be constructed from the magazines ; otherwise, it will return false.
 * Each letter in the magazine string can only be used once in your ransom note.

 Note:

 You may assume that both strings contain only lowercase letters.
 canConstruct("a", "b") -> false
 canConstruct("aa", "ab") -> false
 canConstruct("aa", "aab") -> true
*/
public class _383 {

	public static class Solution1 {
		public boolean canConstruct(String ransomNote, String magazine) {
			int[] count = new int[26];
			for (char ch : ransomNote.toCharArray()) {
				count[ch - 'a']++;
			}
			for (char ch : magazine.toCharArray()) {
				if (--count[ch - 'a'] < 0) {
					return false;
				}
			}
			return true;
		}
	}

}