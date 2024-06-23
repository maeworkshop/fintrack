package com.maemresen.fintrack.persistence.entity;

import com.maemresen.fintrack.persistence.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "money_transaction")
public class MoneyTransaction extends BaseEntity {
}
