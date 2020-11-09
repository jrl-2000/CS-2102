class Library {
	LinkedList<Book> holdings = new LinkedList<Book>();

	Library(LinkedList<Book> holdings) {
		this.holdings = holdings;
	}

	Book findByTitle(String title) {
		for(Book this.holdings : aBook) {
			if(aBook.title.equals(title)){
				return aBook;
			}
		}
		return null;
	}
}

class Reference {
	String title;
	String location;

	Reference(String title, String location) {
		this.title = title;
		this.location = location;
	}
}


class Book {
	String title;
	String location;
	int timesOut;
	boolean isAvailable;

	Book(String title, String location, int timesOut, boolean isAvailable) {
		this.title = title;
		this.location = location;
		this.timesOut = timesOut;
		this.isAvailable = isAvailable;
	}

	Book checkIn() {
		this.isAvailable = true;
		return this;
	}

	Book checkOut(){
		this.isAvailable = false;
		this.timesOut++;
		return this;
	}
}


class DVD {
	String title;
	String location;
	int timesOut;
	boolean isAvailable;

	DVD(String title, String location, int timesOut, boolean isAvailable) {
		this.title = title;
		this.location = location;
		this.timesOut = timesOut;
		this.isAvailable = isAvailable;
	}

	DVD checkIn() {
		this.isAvailable = true;
		return this;
	}

	DVD checkOut() {
		this.isAvailable = false;
		this.timesOut++;
		return this;
	}
}