package com.example.fooddelivery.repository;

import com.example.fooddelivery.entity.NotificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Long, NotificationEntity> {
}
