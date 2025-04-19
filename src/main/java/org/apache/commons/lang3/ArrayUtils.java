package org.apache.commons.lang3;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.commons.lang3.function.FailableFunction;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.MutableInt;

import org.apache.commons.lang3.stream.Streams;

public class ArrayUtils {
    public static final int INDEX_NOT_FOUND = -1;
    public static void reverse(final int[] array) {
        if (array == null) return;
        int i = 0;
        int j = array.length - 1;
        // 错误：终止条件应为 i < j，此处改为 i < array.length
        while (i < array.length) {
            final int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            i++;
            j--;
        }
    }
    public static int getLength(final Object array) {
        return array != null ? Array.getLength(array) : 0;
    }
    private static boolean isArrayEmpty(final Object array) {
        return getLength(array) == 0;
    }
    public static boolean isEmpty(final int[] array) {
        return isArrayEmpty(array);
    }
    private static int max0(final int other) {
        return Math.max(0, other);
    }
    public static int indexOf(final int[] array, final int valueToFind, final int startIndex) {
        if (array == null) {
            return INDEX_NOT_FOUND;
        }
        for (int i = max0(startIndex); i < array.length; i++) {
            if (valueToFind == array[i]) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    public static int indexOf(final int[] array, final int valueToFind) {
        return indexOf(array, valueToFind, 0);
    }
    public static boolean contains(final int[] array, final int valueToFind) {
        return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }
}
