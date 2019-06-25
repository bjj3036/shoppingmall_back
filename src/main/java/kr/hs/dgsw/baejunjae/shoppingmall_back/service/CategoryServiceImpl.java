package kr.hs.dgsw.baejunjae.shoppingmall_back.service;

import kr.hs.dgsw.baejunjae.shoppingmall_back.domain.Category;
import kr.hs.dgsw.baejunjae.shoppingmall_back.domain.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List getCategories() {
        return categoryMapper.getCategories();
    }

    @Override
    public Category getCategory(Long id) {
        return this.categoryMapper.getCategory(id);
    }

}
