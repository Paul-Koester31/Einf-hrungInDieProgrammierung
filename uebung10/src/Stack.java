public class Stack {
    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.push(" a ");
        st.push(" b ");
        st.push(" c ");
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());

    }

    private Object[] obj;
    private int top;

    public Stack(int maximalGroesse) {
        this.obj = new Object[maximalGroesse];
        this.top = -1;

    }

    public void push(Object o) {
        this.top++;
        this.obj[top] = o;
    }

    public Object pop() {
        Object temp = this.obj[top];
        this.obj[top] = null;
        top--;
        return temp;
    }

    public boolean isEmpty() {
        for (int i = 0; i < this.obj.length; i++) {
            if (this.obj[i] != null) return false;
        }
        return true;
    }
}