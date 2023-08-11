public class MyArrayList implements MyList{
    private Object[] items;
    private int size;

    public MyArrayList(){
        items = new Object[10];
        size = 0;
    }

    @Override
    public void add(String value) {
        int bufSize = size++;
        Object[] bufArray = items;
        if(bufSize >= items.length){
            items = new Object[(int) (size * 1.5 + 1)];
            for(int i = 0; i < bufArray.length; i++){
                items[i] = bufArray[i];
            }
        }
        items[bufSize] = value;
    }

    @Override
    public void remove(int index) {
        items[index] = null;
        for(int i = index + 1; i < size; i++){
            items[i - 1] = items[i];
        }
        size--;
    }

    @Override
    public void set(int index, String value) {
        if(index >= 0 && index <= items.length - 1){
            items[index] = value;
        }
        else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String get(int index) {
        return (String) items[index];
    }

    @Override
    public void add(int index, String value) {
        int bufSize = size++;
        Object[] bufArray = items.clone();
        if(bufSize >= items.length){
            items = new Object[(int) (size * 1.5 + 1)];
            for(int i = 0; i < bufArray.length; i++){
                items[i] = bufArray[i];
            }
        }
        items[index] = value;
        for(int i = index; i < size; i++){
            items[i + 1] = bufArray[i];
        }
    }

    @Override
    public boolean contains(String value) {
        for(int i = 0; i < size; i++){
            if(value.equals(items[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }
}
