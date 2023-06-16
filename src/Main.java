public class Main {
    public static void main(String[] args) {
        Text text = new Text("Вухатий великий синій слон. Яблуко в саду. Зелене яблуко? Груша. Жовта слива висить у саду!");
        System.out.println("Початковий текст:\n" + text);
        System.out.println("Відсортований:");
        text.sortByAmountOfWords();
    }
}