import java.util.LinkedList;
import java.util.Queue;

public class task2 {
    public static void main(String[] args) {
        Queue<String> livingPresidents = new LinkedList<>();
        livingPresidents.add("Дуайт Эйзенхауэр");
        livingPresidents.add("Джон Кеннеди");
        livingPresidents.add("Линдон Джонсон");
        livingPresidents.add("Ричард Никсон");
        livingPresidents.add("Джеральд Форд");
        livingPresidents.add("Джимми Картер");
        livingPresidents.offer("Рональд Рейган");
        livingPresidents.offer("Джордж Герберт Уокер Буш");
        livingPresidents.add("Билл Клинтон");
        livingPresidents.add("Джордж Уокер Буш");
        livingPresidents.add("Барак Обама");
        livingPresidents.add("Дональд Трамп");
        livingPresidents.add("Джо Байден");
        System.out.println("Президенты США");
        System.out.println(livingPresidents);
        livingPresidents.remove();
        livingPresidents.remove();
        livingPresidents.remove();
        livingPresidents.poll();
        livingPresidents.poll();
        livingPresidents.remove();
        livingPresidents.remove();
        livingPresidents.remove();
        System.out.println("Живые президенты США");
        System.out.println(livingPresidents);
    }
}
