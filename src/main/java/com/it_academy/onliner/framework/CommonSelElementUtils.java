package com.it_academy.onliner.framework;

import com.codeborne.selenide.ElementsCollection;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.textsInAnyOrder;

public class CommonSelElementUtils {

    public static void assertTextsFromTwoListsMatch(ElementsCollection collection, List<String> expectedText){
        collection.shouldHave(textsInAnyOrder(expectedText));
    }
}
