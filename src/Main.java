public class Main {
    public static void main (String[] args) {

//ДЗ1 https://leetcode.com/problems/01-matrix/ - ищем от нулей.
// Нужно завести двумерный массив типа boolean, для отметки посещенных клеток.
// Шаблон как в задаче с семинара
        Hw1 mx = new Hw1();
        int[][] matrix1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.println("Пример 1");
        System.out.println("Исходная матрица:");
        mx.printMatrix(matrix1);
        mx.updateMatrix(matrix1);
        System.out.println("Результат:");
        mx.printMatrix(matrix1);

        int[][] matrix2 = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        System.out.println("\nПример 2");
        System.out.println("Исходная матрица:");
        mx.printMatrix(matrix2);
        mx.updateMatrix(matrix2);
        System.out.println("Результат:");
        mx.printMatrix(matrix2);

//ДЗ2 https://leetcode.com/problems/implement-queue-using-stacks/
// - перекидывать в выходной стэк элементы из входного в операциях pop и peek только когда выходной пуст.

// Your MyQueue object will be instantiated and called as such:
// MyQueue obj = new MyQueue();
// obj.push(x);
// int param_2 = obj.pop();
// int param_3 = obj.peek();
// boolean param_4 = obj.empty();

        Hw2.MyQueue myQueue = new Hw2.MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.peek()); // return 1
        System.out.println(myQueue.pop()); // return 1, queue is [2]
        System.out.println(myQueue.empty()); // return false

//ДЗ3 https://leetcode.com/problems/simplify-path/

        String path1 = "/home/";
        System.out.println("\nПример 1: " + Hw3.simplifyPath(path1));
        String path2 = "/../";
        System.out.println("Пример 2: " + Hw3.simplifyPath(path2));
        String path3 = "/home//foo/";
        System.out.println("Пример 3: " + Hw3.simplifyPath(path3));
        String path4 = "/home/...//foo/";
        System.out.println("Пример 4: " + Hw3.simplifyPath(path4));

    }
}
