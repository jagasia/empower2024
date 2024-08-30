package com.empower.demo.test;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({MathematicsTest.class, MathematicsTest2.class, MathematicsTest5.class})
//@IncludeCategory({Admin.class})
@ExcludeCategory({Admin.class})
public class AppSuite {

}
