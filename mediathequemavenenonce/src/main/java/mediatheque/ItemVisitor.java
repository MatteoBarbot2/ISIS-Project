package mediatheque;

public interface ItemVisitor {
    public void visit (Book b);
    public void visit (CD c);
}
