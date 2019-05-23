package bobkin.test.hashmap;

import java.util.Arrays;

class HashMap {
    private int MIN_VALUE = Integer.MIN_VALUE;
    private int size;
    private int[] key;
    private long[] value;

    HashMap(int size) {
        this.size = Math.max(3 * size / 2, size) + 1;
        key = new int[this.size];
        value = new long[this.size];
        Arrays.fill(key, MIN_VALUE);
    }

    void put(int x, long y) {
        for (int i = index(hash(x)); ; i++) {
            if (i == size) {
                i = 0;
            }
            if (key[i] == MIN_VALUE) {
                key[i] = x;
            }
            if (key[i] == x) {
                value[i] = y;
                System.out.println("put key " + key[i]);
                System.out.println("put value " + value[i]);
                return;
            }
        }
    }
    long get(int x) {
          for (int i = index(hash(x)); ; i++) {
              if (i == size) {
                  i = 0;
              }
              if (key[i] == MIN_VALUE) {
                  throw new RuntimeException("No such key!");
              }
              if (key[i] == x) {
                  System.out.println("value = " + value[i]);
                  return value[i];
              }
          }
    }
    void size() {
        System.out.println("size = " + size);
    }
    boolean containsKey(int x) {
        for (int i = index(hash(x)); ; i++) {
            if (i == size) {
                i = 0;
            }
            if (key[i] == MIN_VALUE) {
                System.out.println("incorrect key");
                return false;
            }
            if (key[i] == x) {
                System.out.println("correct value " + key[i]);
                return true;
            }
        }
    }

    private int index(int hash) {
        return Math.abs(hash) % size;
    }

    private int hash(int h) {
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }
}
