public class Fractional_Knapsack {

    static class Item {
        int value, weight;

        public Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    public static double getMaxValue(int capacity, Item[] items) {
        double[] ratio = new double[items.length];
        for (int i=0 ; i<items.length ; i++) {
            ratio[i] = (double) items[i].value / items[i].weight;
        }

        for (int i=0 ; i<items.length - 1; i++) {
            for (int j=i + 1; j<items.length; j++) {
                if (ratio[i] < ratio[j]) {
                    double tempRatio = ratio[i];
                    ratio[i] = ratio[j];
                    ratio[j] = tempRatio;

                    Item tempItem = items[i];
                    items[i] = items[j];
                    items[j] = tempItem;
                }
            }
        }

        double totalValue = 0.0;

        for (Item item : items) {
            if (capacity == 0) break;
            if (item.weight <= capacity) {
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                totalValue += item.value * ((double) capacity / item.weight);
                capacity = 0;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        Item[] items = {
            new Item(60,10),
            new Item(100, 20),
            new Item(120, 30),
        };
        int capacity = 50;
        double maxValue = getMaxValue(capacity, items);
        System.out.println("Maximum value we can obtain : " + maxValue);
    }
}

/*
output : 

    Maximum value we can obtain : 240.0
    
 */