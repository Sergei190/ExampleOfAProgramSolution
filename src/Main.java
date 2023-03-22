public class Main {
    public static void main(String[] args) {
        int maxSize = 100; // размер массива
        HighArray arr; // ссылка на массив
        arr = new HighArray(maxSize); // создание массива

        arr.insert(77); // вставка 10 элементов
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display(); // вывод элементов

        int searchKey = 35; // поиск элемента
        if (arr.find(searchKey)) {
            System.out.println("Нашел " + searchKey);
        } else {
            System.out.println("Не нашел " + searchKey);
        }
        arr.delete(00); // удаление трех элементов
        arr.delete(55);
        arr.delete(99);

        arr.display(); // повторный вывод
    }
}