package main;

import dao.ItemDAO;
import model.Item;

import java.util.List;
import java.util.Scanner;

public class ItemCRUDApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemDAO dao = new ItemDAO();
        int choice;

        do {
            System.out.println("\nHibernate Item CRUD");
            System.out.println("1. Add\n2. View All\n3. Update\n4. Delete\n5. Get by ID\n0. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); // consume newline
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();

                    Item item = new Item();
                    item.setName(name);
                    item.setPrice(price);
                    dao.addItem(item);
                    System.out.println("Item added.");
                    break;

                case 2:
                    List<Item> list = dao.getAllItems();
                    list.forEach(i -> System.out.println(i.getId() + ": " + i.getName() + " - " + i.getPrice()));
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine(); // consume newline
                    Item uitem = dao.getItemById(uid);
                    if (uitem != null) {
                        System.out.print("Enter new name: ");
                        uitem.setName(sc.nextLine());
                        System.out.print("Enter new price: ");
                        uitem.setPrice(sc.nextDouble());
                        dao.updateItem(uitem);
                        System.out.println("Item updated.");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    dao.deleteItem(did);
                    System.out.println("Item deleted (if it existed).");
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    int gid = sc.nextInt();
                    Item gitem = dao.getItemById(gid);
                    if (gitem != null) {
                        System.out.println("Item: " + gitem.getName() + " - " + gitem.getPrice());
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
            }
        } while (choice != 0);

        sc.close();
        System.out.println("Exiting...");
    }
}
