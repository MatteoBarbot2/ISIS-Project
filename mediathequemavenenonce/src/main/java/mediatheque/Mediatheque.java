package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque implements ItemVisitor{
	private List<Item> items = new LinkedList<Item>();

	public static void main(String[] args) {
		Mediatheque mediatheque = new Mediatheque();
		
		mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
		mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
		mediatheque.addItem( new CD(12, "Sergeant Peppers"));
		mediatheque.printCatalog();
		mediatheque.printOnlyBooks();
		mediatheque.printOnlyCDs();
	}
	
	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		accept(
				new Mediatheque()
		);
	}
	
	public void printOnlyBooks() {
		accept(
				new Mediatheque() {
					@Override
					public void visit(CD c) {}
				}
		);
	}

	public void printOnlyCDs() {
		accept(
				new Mediatheque() {
					@Override
					public void visit(Book b) {}
				}
		);
	}
	public void accept (ItemVisitor v){
		for (Item i : items){
			i.accept(v);
		}
	}

	@Override
	public void visit (Book b) {
		System.out.println(b);
	}
	@Override
	public void visit (CD c){
		System.out.println(c);
	}
}
