package kr.hs.dgsw.baejunjae.shoppingmall_back.service;

import kr.hs.dgsw.baejunjae.shoppingmall_back.domain.Category;

import  java.util.List;

public interface CategoryService {

    List getCategories();
    Category getCategory(Long id);
}
