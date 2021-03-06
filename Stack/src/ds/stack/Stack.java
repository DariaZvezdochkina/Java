package ds.stack;

public class Stack {

    private int maxSize;  //будет хранить размер массива
    private long[] stackArray;
    private int top; //будет указывать на позицию индекса последнего элемента который будет помещен на самый верх

    public Stack(int size) { //для инициализации структуры данных с правильным количеством необходимых слотов
        this.maxSize = size; //максимальный размер будет равен размеру который передается в него
        this.stackArray = new long[maxSize]; //массив стека будет инициализирован с этим размером пока мы не начнем помещать
        this.top = -1; // элементы в стек поэтому первый элемент будет иметь нулевое значение с индексом массива
        //затем мы будем увеличивать отрицательный до нуля
         }


    public void push(long j) { //используется для того чтобы класть элементы в стек
        if (isFull()) {  //если количество элементов превышает количество в массиве
            System.out.println("this stack is already full");
        } else  { //если нет то наверх прибавляется еще один элемент
            top++;
            stackArray[top] = j; // назначим массив стека с позицией индекса(топ) со значением которое было передано как параметр
        }

    }

    public long pop() {  //вернет данные
        if (isEmpty()) {
            System.out.println("this stack is already empty");
            return -1;
        } else {
            int oldTop = top;
            top--; //удалили этот элемент из верхней части стека
            return stackArray[oldTop]; //будет возвращать массив стека с индексной позцией элемента который мы намерены удалить который был вершиной стека
            //будут в другом порядке
        }

    }

    public long peak() { //посмотреть какой последний элемент был помещен поверх него
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top==-1); //если в стеке ничего нет то это будет отрицательное значение

    }

    public boolean isFull() {
        return (maxSize-1 == top); //топ указывает на позицию индекса элемента которая на верху стека и максимальный размер будет
        //просто чем то что мы передали конструктору стека чтобы создать его
    }

}
