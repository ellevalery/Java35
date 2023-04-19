package tasks.grocery;

//1. addGroceryItem
//2. printGroceryList
//3. removeGroceryItem
//4. modifyGroceryItem
//5. searchItem

import java.util.ArrayList;

    public class GroceryList {

        //Field
        private ArrayList<String> groceryList = new ArrayList<>();

        //Methods

        //Adding new item to the list
        public void addGroceryItem(String item) {
            groceryList.add(item);
        }

        //Print all list items
        public void printGroceryList() {
            System.out.println("You have " + groceryList.size() + " items in your grocery list");
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println((i + 1) + ". " + groceryList.get(i));
            }
        }

        //Remove Grocery item
        public void removeGroceryItem(String item) {
            int position = findItem(item);
            if(position >= 0){
                groceryList.remove(position);
                System.out.println(item + " was deleted");
            }else {
                System.out.println("Item is not in the list");
            }
        }

        //Modify Grocery list item
        public void modifyGroceryItem(int position, String newItem){
            if(position >= 0 && position < groceryList.size()){
                groceryList.set(position,newItem);
                System.out.println("Grocery item was modified");
            }else {
                System.out.println("Items position is not valid");
            }
        }

        //Search item in the list
        public boolean searchItem(String searchItem){
            return findItem(searchItem) >= 0;
        }

        //Delete all items
        public void deleteAllItems(){
            groceryList.clear();
            System.out.println("All items in the list are deleted");
        }


        //Returning items index
        private int findItem(String searchItem){
            return groceryList.indexOf(searchItem);
        }

    }
