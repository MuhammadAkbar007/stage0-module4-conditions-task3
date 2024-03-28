package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        System.out.println(check(symbol) ? "English" : "Non English");
    }

    public boolean check(char symbol) {
        return (symbol >= 'A' && symbol <= 'Z') || (symbol >= 'a' && symbol <= 'z');
    }
}
