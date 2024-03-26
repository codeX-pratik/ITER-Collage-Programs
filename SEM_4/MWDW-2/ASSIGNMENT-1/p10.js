class Book {
    constructor(title, author, year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    details() {
        console.log(`Book Details :- \nTitle : ${this.title}\nAuthor : ${this.author}\nYear : ${this.year}`);
    }
}

class Ebook extends Book {
    constructor(title, author, year, price) {
        super(title, author, year);
        this.price = price;
    }

    details() {
        super.details();
        console.log(`Price : Rs. ${this.price}`);
    }
}

const myEbook = new Ebook('JavaScript: The Good Parts', 'Douglas Crockford', 2008, 100);
myEbook.details();