// NullSPecification.java
package com.example.above18.utils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.data.jpa.domain.Specification;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J,\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"},
   d2 = {"Lcom/example/above18/NullSPecification;", "T", "Lorg/springframework/data/jpa/domain/Specification;", "()V", "toPredicate", "Ljavax/persistence/criteria/Predicate;", "root", "Ljavax/persistence/criteria/Root;", "query", "Ljavax/persistence/criteria/CriteriaQuery;", "criteriaBuilder", "Ljavax/persistence/criteria/CriteriaBuilder;", "above18"}
)
public final class NullSPecification implements Specification {
   @Nullable
   public Predicate toPredicate(@NotNull Root root, @NotNull CriteriaQuery query, @NotNull CriteriaBuilder criteriaBuilder) {
      Intrinsics.checkParameterIsNotNull(root, "root");
      Intrinsics.checkParameterIsNotNull(query, "query");
      Intrinsics.checkParameterIsNotNull(criteriaBuilder, "criteriaBuilder");
      return null;
   }
}