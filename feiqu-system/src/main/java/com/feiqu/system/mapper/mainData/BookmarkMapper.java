package com.feiqu.system.mapper.mainData;

import com.feiqu.system.model.mainData.Bookmark;
import com.feiqu.system.model.mainData.BookmarkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookmarkMapper {
    long countByExample(BookmarkExample example);

    int deleteByExample(BookmarkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bookmark record);

    int insertSelective(Bookmark record);

    List<Bookmark> selectByExample(BookmarkExample example);

    Bookmark selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bookmark record, @Param("example") BookmarkExample example);

    int updateByExample(@Param("record") Bookmark record, @Param("example") BookmarkExample example);

    int updateByPrimaryKeySelective(Bookmark record);

    int updateByPrimaryKey(Bookmark record);

    void saveBatch(@Param("bookmarks") List<Bookmark> bookmarks);
}