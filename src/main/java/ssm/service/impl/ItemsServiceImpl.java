package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.ItemsMapper;
import ssm.model.Items;
import ssm.model.ItemsExample;
import ssm.service.ItemsService;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapper itemsMapper;

    public List<Items> itemList() throws Exception {
        ItemsExample items = new ItemsExample();
        List<Items> itemsList =  itemsMapper.selectByExampleWithBLOBs(items);
        return itemsList;
    }
}
