package kr.hs.dgsw.baejunjae.shoppingmall_back.domain;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface CategoryMapper {

    List getCategories();
    Category getCategory(Long id);
}
