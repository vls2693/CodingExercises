package academy.part129;

public class Outer {
    public Outer() {
        Inner inner = new Inner("value");
    }

    public void getValueOfInnerClass(Inner inner) {
        inner.getValue();
    }

    public void setValueOfInnerClass(Inner inner) {
        inner.setValue("value 2");
    }

    public class Inner {
        public String value;

        public Inner(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
