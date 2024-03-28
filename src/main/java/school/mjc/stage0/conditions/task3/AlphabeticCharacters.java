package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        IsEnglishSymbolDeterminer isEnglishSymbolDeterminer = new IsEnglishSymbolDeterminer();
        if (!isEnglishSymbolDeterminer.check(character)) {
            System.out.println("wrong alphabet!");
        } else {
            System.out.println(character == 'A' || character == 'a' || character == 'O' || character == 'o' ||
                    character == 'E' || character == 'e' || character == 'I' || character == 'i' || character == 'U' ||
                    character == 'u' || character == 'Y' || character == 'y' ? "Vowel" : "Consonant");
        }
    }
}
