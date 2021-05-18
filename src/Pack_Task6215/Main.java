/*Магазину нужно сохранять информацию о продажах для каждого сотрудника.
Напишите метод Map getSalesMap(Reader reader) который принимает Reader содержащий строки вида:
Алексей 3000
Антон 8000
Метод должен получить все строки из Readera и заполнить и вернуть карту где ключом будет имя сотрудника,
а значением сумма всех его продаж.
Пример ввода:
Антон 8000
Пример вывода:
{Алексей=[10000], Дмитрий=[9000], Антон=[11000]}  */

package Pack_Task6215;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.lang.System.in;
public class Main {
    public static void main(String[] args) throws IOException {
        //getSalesMap("agfadgh 125000");
        System.out.println(getSalesMap("agfadgh 125000"));
    }

    public static Map<String, Long> getSalesMap(String reader) throws IOException {
        Map<String, Long> map = new HashMap<>();
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            String name = scanner.next();
            long salary = scanner.nextLong();
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + salary);
            } else {
                map.put(name, salary);
            }
        }
        return map;
    }

}