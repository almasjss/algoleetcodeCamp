package AlgoTheroyPractise;
//Класс Stack – это подкласс Vector,который
// реализует стандартный стек last-in, first-out.
// В Java Stack только определяет стандартный
// конструктор, который создает пустой стек.
// Stack включает все методы, определённые Vector,
// и самостоятельно добавляет несколько своих
// собственных.

import java.util.EmptyStackException;
import java.util.Stack;

public class Run {
    public static void main(String[] args) {
        Stack stack =new Stack();
        System.out.println("Stack"+stack);
        showPush(stack,42);
        showPush(stack,66);
        showPush(stack,99);
        showPush(stack,100);
        showPop(stack);
        showPop(stack);
        showPop(stack);
        showPop(stack);
        try {
            showPop(stack);
        }
        catch (EmptyStackException e){
            System.out.println("Empty Stack");
        }
    }
    static void showPush(Stack st,int a){
        st.push(new Integer(a));
        System.out.println("Втолкнуть ->"+a);
        System.out.println("Стек"+st);
    }
    static void showPop(Stack st){
        System.out.println("Shout up->");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("Stack"+st);
    }


}
