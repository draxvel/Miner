package model;

public interface Cell<I> {

    boolean isBomb();

    boolean isSuggestBomb();

    boolean isSuggestEmpty();

    void suggestBomb();

    void suggestEmpty();

    void draw(I paint, boolean real);
}
