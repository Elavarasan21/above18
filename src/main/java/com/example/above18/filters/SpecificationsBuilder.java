// SpecificationsBuilder.java
package com.example.above18.filters;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.domain.Specification;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"},
   d2 = {"Lcom/example/above18/SpecificationsBuilder;", "U", "", "()V", "parser", "Lcom/example/above18/CriteriaParser;", "specs", "Lorg/springframework/data/jpa/domain/Specification;", "build", "withSearch", "search", "", "above18"}
)
public final class SpecificationsBuilder {
   private Specification specs = (Specification)(new NullSPecification());
   private final CriteriaParser parser = new CriteriaParser();

   @NotNull
   public final SpecificationsBuilder withSearch(@NotNull String search) {
      Intrinsics.checkParameterIsNotNull(search, "search");
      this.specs = this.parser.parse(search);
      return this;
   }

   @NotNull
   public final Specification build() {
      return this.specs;
   }
}
