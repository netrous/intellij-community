/*
 * Copyright 2000-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jetbrains.python.psi.impl;

import com.intellij.psi.PsiElement;
import com.intellij.util.ArrayUtil;
import com.jetbrains.python.psi.PyGlobalStatement;
import org.jetbrains.annotations.Nullable;

public final class PyGlobalStatementNavigator {
  private PyGlobalStatementNavigator() {
  }

  public static @Nullable PyGlobalStatement getByArgument(final PsiElement element){
    final PsiElement parent = element.getParent();
    if (parent instanceof PyGlobalStatement statement){
      return ArrayUtil.find(statement.getGlobals(), element) != -1 ? statement : null;
    }
    return null;
  }
}
