package com.example.above18.utils;

import com.example.above18.utils.QueryParser.AtomQueryContext;
import com.example.above18.utils.QueryParser.CriteriaContext;
import com.example.above18.utils.QueryParser.InputContext;
import com.example.above18.utils.QueryParser.KeyContext;
import com.example.above18.utils.QueryParser.OpContext;
import com.example.above18.utils.QueryParser.OpQueryContext;
import com.example.above18.utils.QueryParser.PriorityQueryContext;
import com.example.above18.utils.QueryParser.ValueContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.data.jpa.domain.Specification;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\b\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"},
   d2 = {"Lcom/example/above18/QueryVisitorImpl;", "T", "Lcom/example/above18/QueryBaseVisitor;", "Lorg/springframework/data/jpa/domain/Specification;", "()V", "ValueRegExp", "Lkotlin/text/Regex;", "visitAtomQuery", "ctx", "Lcom/example/above18/QueryParser$AtomQueryContext;", "visitCriteria", "Lcom/example/above18/QueryParser$CriteriaContext;", "visitInput", "Lcom/example/above18/QueryParser$InputContext;", "visitOpQuery", "Lcom/example/above18/QueryParser$OpQueryContext;", "visitPriorityQuery", "Lcom/example/above18/QueryParser$PriorityQueryContext;", "above18"}
)
public final class QueryVisitorImpl extends QueryBaseVisitor {
   private final Regex ValueRegExp = new Regex("^(\\*?)(.+?)(\\*?)$");

   @NotNull
   public Specification visitOpQuery(@Nullable OpQueryContext ctx) {
      Specification left;
      Specification right;
      String var6;
      label36: {
         left = (Specification)this.visit((ParseTree)(ctx != null ? ctx.left : null));
         right = (Specification)this.visit((ParseTree)(ctx != null ? ctx.right : null));
         if (ctx != null) {
            Token var10000 = ctx.logicalOp;
            if (var10000 != null) {
               var6 = var10000.getText();
               break label36;
            }
         }

         var6 = null;
      }

      String op = var6;
      Specification var7;
      if (op != null) {
         switch(op.hashCode()) {
         case 2531:
            if (op.equals("OR")) {
               var7 = left.or(right);
               Intrinsics.checkExpressionValueIsNotNull(var7, "left.or(right)");
               return var7;
            }
            break;
         case 64951:
            if (op.equals("AND")) {
               var7 = left.and(right);
               Intrinsics.checkExpressionValueIsNotNull(var7, "left.and(right)");
               return var7;
            }
         }
      }

      var7 = left.and(right);
      Intrinsics.checkExpressionValueIsNotNull(var7, "left.and(right)");
      return var7;
   }


   // $FF: synthetic method
   // $FF: bridge method
   
   // public Object visitOpQuery(OpQueryContext var1) {
   //    return this.visitOpQuery(var1);
   // }

   @NotNull
   public Specification visitPriorityQuery(@Nullable PriorityQueryContext ctx) {
      Object var10000 = this.visit((ParseTree)(ctx != null ? ctx.query() : null));
      Intrinsics.checkExpressionValueIsNotNull(var10000, "visit(ctx?.query())");
      return (Specification)var10000;
   }


   // $FF: synthetic method
   // $FF: bridge method
   
   // public Object visitPriorityQuery(PriorityQueryContext var1) {
   //    return this.visitPriorityQuery(var1);
   // }

   @NotNull
   public Specification visitAtomQuery(@Nullable AtomQueryContext ctx) {
      Object var10000 = this.visit((ParseTree)(ctx != null ? ctx.criteria() : null));
      Intrinsics.checkExpressionValueIsNotNull(var10000, "visit(ctx?.criteria())");
      return (Specification)var10000;
   }


   // $FF: synthetic method
   // $FF: bridge method
   
   // public Object visitAtomQuery(AtomQueryContext var1) {
   //    return this.visitAtomQuery(var1);
   // }

   @NotNull
   public Specification visitInput(@Nullable InputContext ctx) {
      Object var10000 = this.visit((ParseTree)(ctx != null ? ctx.query() : null));
      Intrinsics.checkExpressionValueIsNotNull(var10000, "visit(ctx?.query())");
      return (Specification)var10000;
   }


   // $FF: synthetic method
   // $FF: bridge method
   
   // public Object visitInput(InputContext var1) {
   //    return this.visitInput(var1);
   // }

   @NotNull
   public Specification visitCriteria(@Nullable CriteriaContext ctx) {
      if (ctx == null) {
         Intrinsics.throwNpe();
      }

      KeyContext var10000 = ctx.key();
      if (var10000 == null) {
         Intrinsics.throwNpe();
      }

      String key = var10000.getText();
      OpContext var8 = ctx.op();
      if (var8 == null) {
         Intrinsics.throwNpe();
      }

      String op = var8.getText();
      ValueContext var9 = ctx.value();
      if (var9 == null) {
         Intrinsics.throwNpe();
      }

      String value = var9.getText();
      if (ctx.value().STRING() != null) {
         Intrinsics.checkExpressionValueIsNotNull(value, "value");
         String val0=value;
         String val1=val0.replace("'","");
         String val2=val1.replace("\"","");
         String val3=val2.replace("\\\"", "\"");
         value = val3.replace("\\'", "'");
         //value = StringsKt.replace(StringsKt.replace(StringsKt.removeSurrounding(StringsKt.removeSurrounding(value, (CharSequence)"'"), (CharSequence)"\""), "\\\"", "\"", false, 4, (Object)null), "\\'", "'", false, 4, (Object)null);
     
      }

      Regex var10 = this.ValueRegExp;
      if (value == null) {
         Intrinsics.throwNpe();
      }
//MatchResult matchResult = Regex.find$default(var10, (CharSequence)value, 0, 2, (Object)null);
      MatchResult matchResult = var10.find((CharSequence)value, 0);
      SearchCriteria var11;
      Intrinsics.checkExpressionValueIsNotNull(key, "key");
      Intrinsics.checkExpressionValueIsNotNull(op, "op");
      if (matchResult == null) {
         Intrinsics.throwNpe();
      }

      MatchGroup var10004 = matchResult.getGroups().get(1);
      if (var10004 == null) {
         Intrinsics.throwNpe();
      }

      String var12 = var10004.getValue();
      MatchGroup var10005 = matchResult.getGroups().get(2);
      if (var10005 == null) {
         Intrinsics.throwNpe();
      }

      String var7 = var10005.getValue();
      MatchGroup var10006 = matchResult.getGroups().get(3);
      if (var10006 == null) {
         Intrinsics.throwNpe();
      }

      var11=new SearchCriteria(key, op, var12, var7, var10006.getValue());
      SearchCriteria criteria = var11;
      return (Specification)(new SpecificationImpl(criteria));
   }


   // $FF: synthetic method
   // $FF: bridge method

   // public Object visitCriteria(CriteriaContext var1) {
   //    return this.visitCriteria(var1);
   // }
}
