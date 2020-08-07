package com.example.above18.utils;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¨\u0006\b"},
   d2 = {"Lcom/example/above18/configuration/ResolverConf;", "Lorg/springframework/web/servlet/config/annotation/WebMvcConfigurer;", "()V", "addArgumentResolvers", "", "argumentResolvers", "", "Lorg/springframework/web/method/support/HandlerMethodArgumentResolver;", "above18"}
)
public class ResolverConf implements WebMvcConfigurer {
   public void addArgumentResolvers(@NotNull List argumentResolvers) {
      Intrinsics.checkParameterIsNotNull(argumentResolvers, "argumentResolvers");
      argumentResolvers.add(new SearchSpecificationResolver());
   }
}
