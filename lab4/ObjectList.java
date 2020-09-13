

public class ObjectList {
    private Object[] objar;
    private int total;

    public ObjectList(int s) {
        objar = new Object[s];
        total = s;
    }

    public String add(Object o) {
        String adds = "";
        if (getTotal() == total) {
            adds = "myStack is already full";
        } else {
            if (objar[getTotal()] == null) {
                objar[getTotal()] = o;
                int num=getTotal();
                adds = "added to object list at position "+(num-1);
            }
        }
        return adds;
    }

    public void remove(int number) {
        for (int i = number; i <= total - 2; i++) {
            objar[i] = objar[i + 1];
        }
        objar[objar.length - 1] = null;
    }

    public boolean isFull() {
        boolean full = false;
        if (objar.length == total) {
            full = true;
        }
        return full;
    }

    public boolean isEmpty() {
        boolean empty = true;
        for (int i = 0; i < objar.length; i++) {
            if (objar[i] != null) {
                empty = false;
            }
        }
        return empty;
    }

    public int getTotal() {
        int numItems = 0;
        for (int i = 0; i < objar.length; i++) {
            if (objar[i] != null) {
                numItems += 1;
            }
        }
        return numItems;
    }

    public Object getObject(int i) {
        return objar[i];
    }
}
