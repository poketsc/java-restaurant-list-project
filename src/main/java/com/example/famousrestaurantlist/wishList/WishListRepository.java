package com.example.famousrestaurantlist.wishList;

import com.example.famousrestaurantlist.db.MemoryDbRepositoryAbstract;
import com.example.famousrestaurantlist.wishList.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}
