package com.waterfrog.algorithm;

import java.util.BitSet;

/**
 * Created by wangwanru on 16/9/20.
 * 判断是否为兄弟字符串
 * <p/>
 * 如果两个字符串的字符一样，但是顺序不一样，被认为是兄弟字符串
 */
public class BrotherWords {

    /**
     * 将每个字符放入bitset中对比两个字符是否相等
     *
     * @param source1
     * @param source2
     * @return
     */
    public static boolean isBrotherWords(String source1, String source2) {
        if (source1 == null || source2 == null || source1.length() != source2.length()) {
            return false;
        }
        BitSet bitSet1 = new BitSet();
        BitSet bitSet2 = new BitSet();
        int len = source1.length();
        for (int i = 0; i < len; i++) {
            bitSet1.set(source1.charAt(i));
            bitSet2.set(source2.charAt(i));
        }
        return bitSet1.equals(bitSet2);
    }

    /**
     * 大数乘积的解决方案(具有片面性，需要更多的优化方案,只是提供一种思路）
     *  1: 只是考虑大写，如果引用更多的话需要更多的质数
     *  2: 乘积可能越界
     *
     * @param source1
     * @param source2
     * @return
     */
    public static boolean isBrotherWords2(String source1, String source2) {
        if (source1 == null || source2 == null || source1.length() != source2.length()) {
            return false;
        }
        source1 = source1.toUpperCase();
        source2 = source2.toUpperCase();
        int[] primeNumber = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,
                61, 67, 71, 73, 79, 83, 89, 97, 101};
        long prime1 = 1;
        long prime2 = 1;
        int len = source1.length();
        for (int i = 0; i < len; i++) {
            prime1 *= primeNumber[source1.charAt(i) - 'A'];
            prime2 *= primeNumber[source2.charAt(i) - 'A'];
        }
        return prime1 == prime2;
    }

    public static void main(String[] args) {
        System.out.println(isBrotherWords("listen", "slient"));
        System.out.println(isBrotherWords2("listen", "slient"));
    }

}
