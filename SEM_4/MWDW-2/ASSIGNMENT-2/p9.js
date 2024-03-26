class Order {
    #price1 = 10;
    #price2 = 20;

    constructor(item1, item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    totalPrice() {
        return this.item1 * this.#price1 + this.item2 * this.#price2;
    }

    get total() {
        return this.totalPrice();
    }
}

let order1 = new Order(2, 3);
console.log("Total cost of order 1 : " + order1.total);

let order2 = new Order(1, 1);
console.log("Total cost of order 2 : " + order2.total);

let order3 = new Order(5, 2);
console.log("Total cost of order 3 : " + order3.total);