package com.cloud.learn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.Date;

@RedisHash("IdGen")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class IdGen implements Serializable {
    private Long id;
    private Date created;
}
