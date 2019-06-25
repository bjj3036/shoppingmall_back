package kr.hs.dgsw.baejunjae.shoppingmall_back.controller;

import kr.hs.dgsw.baejunjae.shoppingmall_back.domain.Category;
import kr.hs.dgsw.baejunjae.shoppingmall_back.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/api/category")
    public List getCategories(){
        return this.categoryService.getCategories();
    }

    @GetMapping("/api/category/{id}")
    public Category getCategory(@PathVariable("id") Long id){
        return this.categoryService.getCategory(id);
    }
}
