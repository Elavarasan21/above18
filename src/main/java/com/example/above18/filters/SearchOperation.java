package com.example.above18.filters;

import kotlin.Metadata;
//import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"},
   d2 = {"Lcom/example/above18/SearchOperation;", "", "(Ljava/lang/String;I)V", "EQUALS", "NOT_EQUALS", "GREATER_THAN", "LESS_THAN", "STARTS_WITH", "ENDS_WITH", "CONTAINS", "DOESNT_START_WITH", "DOESNT_END_WITH", "DOESNT_CONTAIN", "Companion", "above18"}
)
public enum SearchOperation {
   EQUALS,
   NOT_EQUALS,
   GREATER_THAN,
   LESS_THAN,
   STARTS_WITH,
   ENDS_WITH,
   CONTAINS,
   DOESNT_START_WITH,
   DOESNT_END_WITH,
   DOESNT_CONTAIN,
   BETWEEN;

   @NotNull
   private static final String[] SIMPLE_OPERATION_SET = new String[]{":", "!", ">", "<", "~","-"};
   @NotNull
   private static final String ZERO_OR_MORE_REGEX = "*";
   @NotNull
   private static final String OR_OPERATOR = "OR";
   @NotNull
   private static final String AND_OPERATOR = "AND";
   @NotNull
   private static final String LEFT_PARANTHESIS = "(";
   @NotNull
   private static final String RIGHT_PARANTHESIS = ")";
   //public static final SearchOperation.Companion Companion = new SearchOperation.Companion((DefaultConstructorMarker)null);
   public static final SearchOperation.Companion Companion = new SearchOperation.Companion();

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0006¨\u0006\u0018"},
      d2 = {"Lcom/example/above18/SearchOperation$Companion;", "", "()V", "AND_OPERATOR", "", "getAND_OPERATOR", "()Ljava/lang/String;", "LEFT_PARANTHESIS", "getLEFT_PARANTHESIS", "OR_OPERATOR", "getOR_OPERATOR", "RIGHT_PARANTHESIS", "getRIGHT_PARANTHESIS", "SIMPLE_OPERATION_SET", "", "getSIMPLE_OPERATION_SET", "()[Ljava/lang/String;", "[Ljava/lang/String;", "ZERO_OR_MORE_REGEX", "getZERO_OR_MORE_REGEX", "getSimpleOperation", "Lcom/example/above18/SearchOperation;", "input", "", "above18"}
   )
   public static final class Companion {
      @NotNull
      public final String[] getSIMPLE_OPERATION_SET() {
         return SearchOperation.SIMPLE_OPERATION_SET;
      }

      @NotNull
      public final String getZERO_OR_MORE_REGEX() {
         return SearchOperation.ZERO_OR_MORE_REGEX;
      }

      @NotNull
      public final String getOR_OPERATOR() {
         return SearchOperation.OR_OPERATOR;
      }

      @NotNull
      public final String getAND_OPERATOR() {
         return SearchOperation.AND_OPERATOR;
      }

      @NotNull
      public final String getLEFT_PARANTHESIS() {
         return SearchOperation.LEFT_PARANTHESIS;
      }

      @NotNull
      public final String getRIGHT_PARANTHESIS() {
         return SearchOperation.RIGHT_PARANTHESIS;
      }

      @Nullable
      public final SearchOperation getSimpleOperation(char input) {
         switch(input) {
         case '!':
            return SearchOperation.NOT_EQUALS;
         case ':':
            return SearchOperation.EQUALS;
         case '<':
            return SearchOperation.LESS_THAN;
         case '>':
            return SearchOperation.GREATER_THAN;
         case '-':{
            System.out.println("Between operator is given");
            return SearchOperation.BETWEEN;
         }
            //return SearchOperation.BETWEEN;
         default:
            return null;
         }
      }

      private Companion() {
      }

      // $FF: synthetic method

      //public Companion(DefaultConstructorMarker $constructor_marker) {
      //   this();
      //}
   }
}
