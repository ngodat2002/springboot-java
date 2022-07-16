package com.spring.asignmentspringboot.entity;

import com.spring.asignmentspringboot.entity.base.BaseEntity;
import com.spring.asignmentspringboot.entity.myenum.ProductStatus;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class Product extends BaseEntity {
    @Id
    private String id;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
    private String name;
    private String thumbNails;
    private String description;
    @Lob
    private String details;
    private BigDecimal price;
    @Enumerated(EnumType.ORDINAL)
    private ProductStatus status;
}
