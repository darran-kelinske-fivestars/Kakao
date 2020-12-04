[kakao](../../index.md) / [com.agoda.kakao.web](../index.md) / [KWebView](./index.md)

# KWebView

`open class KWebView`

Class for interacting with WebViews

### Parameters

`matcher` - ViewBuilder which will result in matcher of web view

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KWebView(matcher: (`[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)? = null)`<br>Class for interacting with WebViews |

### Properties

| Name | Summary |
|---|---|
| [root](root.md) | `var root: Matcher<Root>` |

### Functions

| Name | Summary |
|---|---|
| [inRoot](in-root.md) | `fun inRoot(function: `[`RootBuilder`](../../com.agoda.kakao.common.builders/-root-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`KWebView`](./index.md)<br>Check if the view is in given root |
| [invoke](invoke.md) | `operator fun invoke(function: `[`WebElementBuilder`](../-web-element-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
