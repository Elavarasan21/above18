package com.example.above18.utils;

import com.example.above18.filters.SpecificationsBuilder;
import com.example.above18.annotation.SearchSpec;
import kotlin.Metadata;
//import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J4\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u0016"},
   d2 = {"Lcom/example/above18/configuration/SearchSpecificationResolver;", "Lorg/springframework/web/method/support/HandlerMethodArgumentResolver;", "()V", "buildSpecification", "Lorg/springframework/data/jpa/domain/Specification;", "T", "specClass", "Ljava/lang/Class;", "search", "", "resolveArgument", "parameter", "Lorg/springframework/core/MethodParameter;", "mavContainer", "Lorg/springframework/web/method/support/ModelAndViewContainer;", "webRequest", "Lorg/springframework/web/context/request/NativeWebRequest;", "binderFactory", "Lorg/springframework/web/bind/support/WebDataBinderFactory;", "supportsParameter", "", "Companion", "above18"}
)
public final class SearchSpecificationResolver implements HandlerMethodArgumentResolver {
   private static final Logger logger = LoggerFactory.getLogger(SearchSpecificationResolver.class);
  // public static final SearchSpecificationResolver.Companion Companion = new SearchSpecificationResolver.Companion((DefaultConstructorMarker)null);
   public static final SearchSpecificationResolver.Companion Companion = new SearchSpecificationResolver.Companion();

   public boolean supportsParameter(@NonNull @NotNull MethodParameter parameter) {
      Intrinsics.checkParameterIsNotNull(parameter, "parameter");
      return parameter.getParameterType() == Specification.class && parameter.hasParameterAnnotation(SearchSpec.class);
   }

   @Nullable
   public Specification resolveArgument(@NonNull @NotNull MethodParameter parameter, @Nullable ModelAndViewContainer mavContainer, @NotNull NativeWebRequest webRequest, @Nullable WebDataBinderFactory binderFactory) throws Exception {
      Intrinsics.checkParameterIsNotNull(parameter, "parameter");
      Intrinsics.checkParameterIsNotNull(webRequest, "webRequest");
      SearchSpec def = (SearchSpec)parameter.getParameterAnnotation(SearchSpec.class);
      Class var10001 = parameter.getGenericParameterType().getClass();
      if (def == null) {
         Intrinsics.throwNpe();
      }

      return this.buildSpecification(var10001, webRequest.getParameter(def.searchParam()));
   }


   // $FF: synthetic method
   // $FF: bridge method

   // public Object resolveArgument(MethodParameter var1, ModelAndViewContainer var2, NativeWebRequest var3, WebDataBinderFactory var4) {
   //    return this.resolveArgument(var1, var2, var3, var4);
   // }

   private final Specification buildSpecification(Class specClass, String search) {
      logger.debug("Building specification for class {}", specClass);
      logger.debug("Search value found is {}", search);
      if (search != null) {
         CharSequence var3 = (CharSequence)search;
         if (var3.length() != 0) {
            SpecificationsBuilder specBuilder = new SpecificationsBuilder();
            return specBuilder.withSearch(search).build();
         }
      }

      return null;
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"},
      d2 = {"Lcom/example/above18/configuration/SearchSpecificationResolver$Companion;", "", "()V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "above18"}
   )
   public static final class Companion {
      private Companion() {
      }

      // $FF: synthetic method
     // public Companion(DefaultConstructorMarker $constructor_marker) {
     //    this();
      //}
   }
}
