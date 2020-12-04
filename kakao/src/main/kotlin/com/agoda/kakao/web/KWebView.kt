@file:Suppress("unused")

package com.agoda.kakao.web

import androidx.test.espresso.Root
import androidx.test.espresso.matcher.RootMatchers
import androidx.test.espresso.web.sugar.Web
import com.agoda.kakao.common.KakaoDslMarker
import com.agoda.kakao.common.assertions.BaseAssertions
import com.agoda.kakao.common.builders.RootBuilder
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.delegate.WebInteractionDelegate
import org.hamcrest.Matcher

/**
 * Class for interacting with WebViews
 *
 * @param matcher ViewBuilder which will result in matcher of web view
 */
@KakaoDslMarker
open class KWebView(matcher: (ViewBuilder.() -> Unit)? = null) {
    var root: Matcher<Root> = RootMatchers.DEFAULT
    private val web = WebInteractionDelegate(
        if (matcher != null) {
            Web.onWebView(ViewBuilder().apply(matcher).getViewMatcher()).inRoot(root)
        } else {
            Web.onWebView().inRoot(root)
        }
    )

    /**
     * Operator that allows usage of DSL style
     *
     * @param function WebElementBuilder which will give you access to match elements
     * and perform actions/assertions on it.
     */
    operator fun invoke(function: WebElementBuilder.() -> Unit) {
        WebElementBuilder(web).apply(function)
    }

    /**
     * Check if the view is in given root
     *
     * @param function RootBuilder that will result in root matcher
     *
     * @see RootBuilder
     */
    fun inRoot(function: RootBuilder.() -> Unit): KWebView {
        root = RootBuilder().apply(function).getRootMatcher()
        web.inRoot(root)
        return this
    }
}
