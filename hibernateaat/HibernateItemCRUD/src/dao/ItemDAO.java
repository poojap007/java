package dao;

import model.Item;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ItemDAO {
    private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void addItem(Item item) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(item);
        tx.commit();
        session.close();
    }

    public List<Item> getAllItems() {
        Session session = factory.openSession();
        List<Item> items = session.createQuery("from Item", Item.class).list();
        session.close();
        return items;
    }

    public Item getItemById(int id) {
        Session session = factory.openSession();
        Item item = session.get(Item.class, id);
        session.close();
        return item;
    }

    public void updateItem(Item item) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(item);
        tx.commit();
        session.close();
    }

    public void deleteItem(int id) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Item item = session.get(Item.class, id);
        if (item != null) {
            session.delete(item);
        }
        tx.commit();
        session.close();
    }
}
