// SpecificationImpl$WhenMappings.java
package com.example.above18.filters;

import kotlin.Metadata;

// $FF: synthetic class
@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 3
)
public final class SpecificationImpl$WhenMappings {
   // $FF: synthetic field
   public static final int[] $EnumSwitchMapping$0 = new int[SearchOperation.values().length];

   static {
      $EnumSwitchMapping$0[SearchOperation.EQUALS.ordinal()] = 1;
      $EnumSwitchMapping$0[SearchOperation.NOT_EQUALS.ordinal()] = 2;
      $EnumSwitchMapping$0[SearchOperation.GREATER_THAN.ordinal()] = 3;
      $EnumSwitchMapping$0[SearchOperation.LESS_THAN.ordinal()] = 4;
      $EnumSwitchMapping$0[SearchOperation.STARTS_WITH.ordinal()] = 5;
      $EnumSwitchMapping$0[SearchOperation.ENDS_WITH.ordinal()] = 6;
      $EnumSwitchMapping$0[SearchOperation.CONTAINS.ordinal()] = 7;
      $EnumSwitchMapping$0[SearchOperation.DOESNT_START_WITH.ordinal()] = 8;
      $EnumSwitchMapping$0[SearchOperation.DOESNT_END_WITH.ordinal()] = 9;
      $EnumSwitchMapping$0[SearchOperation.DOESNT_CONTAIN.ordinal()] = 10;
   }
}
