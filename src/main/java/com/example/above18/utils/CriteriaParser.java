package com.example.above18.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.domain.Specification;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00020\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"},
   d2 = {"Lcom/example/above18/CriteriaParser;", "T", "", "()V", "visitor", "Lcom/example/above18/QueryVisitorImpl;", "getParser", "Lcom/example/above18/QueryParser;", "queryString", "", "parse", "Lorg/springframework/data/jpa/domain/Specification;", "searchParam", "above18"}
)
public final class CriteriaParser {
   private final QueryVisitorImpl visitor = new QueryVisitorImpl();

   @NotNull
   public final Specification parse(@NotNull String searchParam) {
      Intrinsics.checkParameterIsNotNull(searchParam, "searchParam");
      QueryParser parser = this.getParser(searchParam);
      Object var10000 = this.visitor.visit((ParseTree)parser.input());
      Intrinsics.checkExpressionValueIsNotNull(var10000, "visitor.visit(parser.input())");
      return (Specification)var10000;
   }

   private final QueryParser getParser(String queryString) {
      QueryLexer lexer = new QueryLexer((CharStream)CharStreams.fromString(queryString));
      CommonTokenStream tokens = new CommonTokenStream((TokenSource)lexer);
      return new QueryParser((TokenStream)tokens);
   }
}
