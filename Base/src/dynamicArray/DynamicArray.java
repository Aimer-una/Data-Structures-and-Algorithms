package dynamicArray;

// 动态数组
public class DynamicArray {
    private int size = 0; // 逻辑大小
    private int capacity = 8; // 容量大小
    private int[]array = new int[capacity];

    public void addLast(int element){
        add(size,element);
    }

    public void add(int index,int element){
        if (index >= 0 && index < size) {
            System.arraycopy(array,index,array,index+1,size-index);
        }
        array[index] = element;
        size++;
    }


}
