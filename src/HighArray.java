public class HighArray {
    private long[] a; // ссылка на иассив a
    private int nElems; // количество элементов в массиве

    public HighArray(int max) { // конструктор
        a = new long[max]; // создание массива
        nElems = 0; // пока нет ни одного элемента
    }

    public boolean find(long searchKey) { // поиск заданного значения
        int i;

        for (i = 0; i < nElems; i++) { // для каждого элемента
            if (a[i] == searchKey) {  // значение найдено?
                break;    // да - выход из цикла
            }
        }
        if (i == nElems) { // достигнут последний элемент?
            return false; // да
        } else {
            return true; // нет
        }
    }

    public void insert(long value) { // вставка элемента в массив
        a[nElems] = value; // собственно ставка
        nElems++; // увелечение размера
    }

    public boolean delete(long value) {
        int i;

        for (i = 0; i < nElems; i++) { // поиск заданного значения
            if (value == a[i]) {
                break;
            }
        }
        if (i == nElems) {  // найти не удалось
            return false;
        } else {      // значение найдено
            for (int j = i; j < nElems; j++) {  // сдвиг последующих элементов
                a[j] = a[j + 1];
            }
            nElems--; // уменьшение размера
            return true;
        }
    }

    public void display() { // вывод содержимого массива
        for (int i = 0; i < nElems; i++) { // для каждого элемента
            System.out.println(a[i] + " "); // вывод
            System.out.println("");
        }
    }
}
