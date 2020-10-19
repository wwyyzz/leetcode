package Contest.W211.Q5530;

import java.math.BigInteger;
import java.util.ArrayList;

class Fancy {

    private ArrayList<Integer> lists;

    public Fancy() {
        lists = new ArrayList<>();
    }

    public void append(int val) {
        lists.add(val);
    }

    public void addAll(int inc) {
        for (int i = 0; i < lists.size(); i++) {
            lists.set(i, lists.get(i) + inc);
        }
    }

    public void multAll(int m) {
        for (int i = 0; i < lists.size(); i++) {
            lists.set(i, lists.get(i) * m);
        }
    }

    public int getIndex(int idx) {
        if (idx > lists.size()) {
            return -1;
        }
        return lists.get(idx) % 1000000007;
    }
}
