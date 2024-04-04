public class HashTableLP {
    private static int EMPTY_VALUE = 0;
    private static int DELETED_VALUE = 1;
    private static int FILLED_VALUE = 2;

    private int tableSize;
    int []Arr;
    int []Flag;

    public HashTableLP(int tSize) {
        tableSize = tSize;
        Arr = new int[tSize + 1];
        Flag = new int[tSize + 1];
    }

    int computeHash(int key) {
        return key % tableSize;
    }

    int resolverFun(int index) {
        return index;
    }

    boolean add(int value) {
        int hashValue = computeHash(value);
        for (int i=0 ; i<tableSize ; i++) {
            if (Flag[hashValue] == EMPTY_VALUE || Flag[hashValue] == DELETED_VALUE) {
                Arr[hashValue] = value;
                Flag[hashValue] = FILLED_VALUE;
                return true;
            }
            hashValue += resolverFun(i);
            hashValue %= tableSize;
        }
        return false;
    }

    boolean find(int value) {
        int hashValue = computeHash(value);
        for (int i=0 ; i<tableSize ; i++) {
            if (Flag[hashValue] == EMPTY_VALUE) {
                return false;
            }
            hashValue += resolverFun(i);
            hashValue %= tableSize;
        }
        return false;
    }

    boolean remove(int value) {
        int hashValue = computeHash(value);
        for (int i=0 ; i<tableSize ; i++) {
            if (Flag[hashValue] == EMPTY_VALUE) {
                return false;
            }
            if (Flag[hashValue] == FILLED_VALUE && Arr[hashValue] == value) {
                Flag[hashValue] = DELETED_VALUE;
                return true;
            }
            hashValue += resolverFun(i);
            hashValue %= tableSize;
        }
        return false;
    }

    void print() {
        for (int i=0 ; i<tableSize ; i++) {
            if (Flag[i] == FILLED_VALUE) {
                System.out.println("Node at index [" + i + "] ::" + Arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        HashTableLP ht = new HashTableLP(1000);
        ht.add(1);
        ht.add(2);
        ht.add(3);
        ht.print();
        System.out.println(ht.remove(1));
        System.out.println(ht.remove(4));
        ht.print();
    }
}
