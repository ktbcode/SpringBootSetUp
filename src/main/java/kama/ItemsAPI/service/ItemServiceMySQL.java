package kama.ItemsAPI.service;

import kama.ItemsAPI.repository.entity.Item;
import kama.ItemsAPI.repository.entity.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceMySQL implements ItemService{
    //dependency injection
    private final ItemRepository itemRepository;

    public ItemServiceMySQL(@Autowired ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    @Override
    public Item save(Item item) {
        return itemRepository.save( item );
    }

    @Override
    public void delete(int itemId) {
        itemRepository.deleteById( itemId );
    }

    @Override
    public List<Item> all() {
        List<Item> result = new ArrayList<>();
        itemRepository.findAll().forEach( result::add );
        return result;
    }

    @Override
    public Item findById(int itemId) {
        return null;
    }
}
