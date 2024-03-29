package com.karjokalap.reddit.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class Vote extends Auditable implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private int vote;

}
