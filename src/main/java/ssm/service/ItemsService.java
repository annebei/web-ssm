package ssm.service;

import ssm.model.Items;

import java.util.List;

public interface ItemsService {

    List<Items> itemList() throws Exception;

}
