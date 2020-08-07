package com.example.above18.filters;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f¨\u0006\u0014"},
   d2 = {"Lcom/example/above18/SearchCriteria;", "", "key", "", "operation", "prefix", "value", "suffix", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "Lcom/example/above18/SearchOperation;", "getOperation", "()Lcom/example/above18/SearchOperation;", "setOperation", "(Lcom/example/above18/SearchOperation;)V", "getValue", "setValue", "above18"}
)
public final class SearchCriteria {
   @NotNull
   private String key;
   @Nullable
   private SearchOperation operation;
   @Nullable
   private String value;
   @Nullable
   private String value2;    // value2 for between operation

   @NotNull
   public final String getKey() {
      return this.key;
   }

   public final void setKey(@NotNull String var1) {
      Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
      this.key = var1;
   }

   @Nullable
   public final SearchOperation getOperation() {
      return this.operation;
   }

   public final void setOperation(@Nullable SearchOperation var1) {
      this.operation = var1;
   }

   @Nullable
   public final String getValue() {
      return this.value;
   }
   @Nullable
   public final String getValue2() {
      return this.value2;
   }

   public final void setValue(@Nullable String var1) {
      this.value = var1;
   }

   public SearchCriteria(@NotNull String key, @NotNull String operation, @Nullable String prefix, @NotNull String value, @Nullable String suffix) {
      super();
      Intrinsics.checkParameterIsNotNull(key, "key");
      Intrinsics.checkParameterIsNotNull(operation, "operation");
      Intrinsics.checkParameterIsNotNull(value, "value");
      this.key = key;
      SearchOperation op = SearchOperation.Companion.getSimpleOperation(operation.charAt(0));
      if (op != null) {
         boolean startsWithAsterisk = prefix != null && prefix.contains((CharSequence)SearchOperation.Companion.getZERO_OR_MORE_REGEX());
         boolean endsWithAsterisk = suffix != null && suffix.contains((CharSequence)SearchOperation.Companion.getZERO_OR_MORE_REGEX());
         if (op == SearchOperation.EQUALS && startsWithAsterisk && endsWithAsterisk) {
            op = SearchOperation.CONTAINS;
         } else if (op == SearchOperation.EQUALS && startsWithAsterisk) {
            op = SearchOperation.ENDS_WITH;
         } else if (op == SearchOperation.EQUALS && endsWithAsterisk) {
            op = SearchOperation.STARTS_WITH;
         }

         if (op == SearchOperation.NOT_EQUALS && startsWithAsterisk && endsWithAsterisk) {
            op = SearchOperation.DOESNT_CONTAIN;
         } else if (op == SearchOperation.NOT_EQUALS && startsWithAsterisk) {
            op = SearchOperation.DOESNT_END_WITH;
         } else if (op == SearchOperation.NOT_EQUALS && endsWithAsterisk) {
            op = SearchOperation.DOESNT_START_WITH;
         }

         if(op == SearchOperation.BETWEEN){
         op=SearchOperation.BETWEEN;
         String range=value;
         String[] minMax=range.split("-");
         String min=minMax[0];
         String max=minMax[1];
         value=min;
         this.value2=max;
         System.out.println(min+"  "+max+" in Search Criteria class");
         }
      }
      
      this.operation = op;
      this.value = value;


      
   }
}
