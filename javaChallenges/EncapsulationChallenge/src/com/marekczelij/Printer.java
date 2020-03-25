package com.marekczelij;

public class Printer {

    private Toner toner;
    private int numberOfPrintedPages;
    private boolean isDuplexPrinter;


    private Printer(Toner toner, int numberOfPrintedPages, boolean isDuplexPrinter) {
        this.toner = toner;
        this.numberOfPrintedPages = numberOfPrintedPages;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public Printer() {
        this(new Toner(), 0, false);
    }

    public Printer( boolean isDuplexPrinter) {
        this(new Toner(), 0, isDuplexPrinter);
    }

    public int fillUpTonerinPrinter(int amount)
    {
        return toner.fillUpToner(amount);
    }

    private void printedPageCounterUp()
    {
        numberOfPrintedPages++;
    }

    private boolean canPrint(int characters)
    {
        return characters*toner.getTonerAmountOnCharacter() <= toner.getTonerLevel();
    }

    public int printCharacterOnPage(char character)
    {
        if (!canPrint(1)){
            System.out.println("Can't print!");
            return -1;
        }
        System.out.println(character);
        toner.decreaseTonerLevel(1);
        return 0;
    }

    public int printStrintOnPage(String word){
        if (!canPrint(word.length())){
            System.out.println("Can't print!");
            return -1;
        }
        System.out.println(word);
        toner.decreaseTonerLevel(word.length());
        return 0;

    }

    public int tonerLevelState() {
        return toner.getTonerLevel();
    }

    public int printPages(int pages){
        int pages2Print = pages;
        if(isDuplexPrinter())
        {
            pages2Print=(pages/2)+(pages % 2);
        }
        numberOfPrintedPages+=pages2Print;
        return pages2Print;
    }

    public int getNumberOfPrintedPages() {
        return numberOfPrintedPages;
    }

    private void setNumberOfPrintedPages(int numberOfPrintedPages) {
        this.numberOfPrintedPages = numberOfPrintedPages;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }

    private void setDuplexPrinter(boolean duplexPrinter) {
        isDuplexPrinter = duplexPrinter;
    }

    private Toner getToner() {
        return toner;
    }

    private void setToner(Toner toner) {
        this.toner = toner;
    }
}
