package com.tf.filter.service.business.concretes;

import com.tf.filter.service.business.abstracts.FilterService;
import com.tf.filter.service.entities.Inventory;
import com.tf.filter.service.repositories.FilterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FilterManager implements FilterService {
    private FilterRepository filterRepository;
    @Override
    public void add(Inventory inventory) {
        this.filterRepository.save(inventory);
    }
}
