/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-route project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p><code>app-route</code> is an element that enables declarative, self-describing routing<br>for a web app.</p>
 * <blockquote>
 * <p><em>n.b. app-route is still in beta. We expect it will need some changes. We’re counting on your feedback!</em></p>
 * </blockquote>
 * <p>In its typical usage, a <code>app-route</code> element consumes an object that describes<br>some state about the current route, via the <code>route</code> property. It then parses<br>that state using the <code>pattern</code> property, and produces two artifacts: some <code>data</code><br>related to the <code>route</code>, and a <code>tail</code> that contains the rest of the <code>route</code> that<br>did not match.</p>
 * <p>Here is a basic example, when used with <code>app-location</code>:</p>
 * <pre><code>&lt;app-location route=&quot;{{route}}&quot;&gt;&lt;/app-location&gt;
 * &lt;app-route
 *     route=&quot;{{route}}&quot;
 *     pattern=&quot;/:page&quot;
 *     data=&quot;{{data}}&quot;
 *     tail=&quot;{{tail}}&quot;&gt;
 * &lt;/app-route&gt;
 * 
 * 
 * </code></pre><p>In the above example, the <code>app-location</code> produces a <code>route</code> value. Then, the<br><code>route.path</code> property is matched by comparing it to the <code>pattern</code> property. If<br>the <code>pattern</code> property matches <code>route.path</code>, the <code>app-route</code> will set or update<br>its <code>data</code> property with an object whose properties correspond to the parameters<br>in <code>pattern</code>. So, in the above example, if <code>route.path</code> was <code>&#39;/about&#39;</code>, the value<br>of <code>data</code> would be <code>{&quot;page&quot;: &quot;about&quot;}</code>.</p>
 * <p>The <code>tail</code> property represents the remaining part of the route state after the<br><code>pattern</code> has been applied to a matching <code>route</code>.</p>
 * <p>Here is another example, where <code>tail</code> is used:</p>
 * <pre><code>&lt;app-location route=&quot;{{route}}&quot;&gt;&lt;/app-location&gt;
 * &lt;app-route
 *     route=&quot;{{route}}&quot;
 *     pattern=&quot;/:page&quot;
 *     data=&quot;{{routeData}}&quot;
 *     tail=&quot;{{subroute}}&quot;&gt;
 * &lt;/app-route&gt;
 * &lt;app-route
 *     route=&quot;{{subroute}}&quot;
 *     pattern=&quot;/:id&quot;
 *     data=&quot;{{subrouteData}}&quot;&gt;
 * &lt;/app-route&gt;
 * 
 * 
 * </code></pre><p>In the above example, there are two <code>app-route</code> elements. The first<br><code>app-route</code> consumes a <code>route</code>. When the <code>route</code> is matched, the first<br><code>app-route</code> also produces <code>routeData</code> from its <code>data</code>, and <code>subroute</code> from<br>its <code>tail</code>. The second <code>app-route</code> consumes the <code>subroute</code>, and when it<br>matches, it produces an object called <code>subrouteData</code> from its <code>data</code>.</p>
 * <p>So, when <code>route.path</code> is <code>&#39;/about&#39;</code>, the <code>routeData</code> object will look like<br>this: <code>{ page: &#39;about&#39; }</code></p>
 * <p>And <code>subrouteData</code> will be null. However, if <code>route.path</code> changes to<br><code>&#39;/article/123&#39;</code>, the <code>routeData</code> object will look like this:<br><code>{ page: &#39;article&#39; }</code></p>
 * <p>And the <code>subrouteData</code> will look like this: <code>{ id: &#39;123&#39; }</code></p>
 * <p><code>app-route</code> is responsive to bi-directional changes to the <code>data</code> objects<br>they produce. So, if <code>routeData.page</code> changed from <code>&#39;article&#39;</code> to <code>&#39;about&#39;</code>,<br>the <code>app-route</code> will update <code>route.path</code>. This in-turn will update the<br><code>app-location</code>, and cause the global location bar to change its value.</p>
 */
@JsType(isNative=true)
public interface AppRouteElement extends HTMLElement {

    @JsOverlay public static final String TAG = "app-route";
    @JsOverlay public static final String SRC = "app-route/app-route.html";


    /**
     * <p>Whether the current route is active. True if <code>route.path</code> matches the<br><code>pattern</code>, false otherwise.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * 
     */
    @JsProperty boolean getActive();
    /**
     * <p>Whether the current route is active. True if <code>route.path</code> matches the<br><code>pattern</code>, false otherwise.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * 
     */
    @JsProperty void setActive(boolean value);

    /**
     * <p>The parameterized values that are extracted from the route as<br>described by <code>pattern</code>.</p>
     *
     * JavaScript Info:
     * @property data
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getData();
    /**
     * <p>The parameterized values that are extracted from the route as<br>described by <code>pattern</code>.</p>
     *
     * JavaScript Info:
     * @property data
     * @type Object
     * 
     */
    @JsProperty void setData(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property queryParams
     * @type ?Object
     * 
     */
    @JsProperty JavaScriptObject getQueryParams();
    /**
     * 
     *
     * JavaScript Info:
     * @property queryParams
     * @type ?Object
     * 
     */
    @JsProperty void setQueryParams(JavaScriptObject value);

    /**
     * <p>The URL component managed by this element.</p>
     *
     * JavaScript Info:
     * @property route
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getRoute();
    /**
     * <p>The URL component managed by this element.</p>
     *
     * JavaScript Info:
     * @property route
     * @type Object
     * 
     */
    @JsProperty void setRoute(JavaScriptObject value);

    /**
     * <p>The part of <code>route.path</code> NOT consumed by <code>pattern</code>.</p>
     *
     * JavaScript Info:
     * @property tail
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getTail();
    /**
     * <p>The part of <code>route.path</code> NOT consumed by <code>pattern</code>.</p>
     *
     * JavaScript Info:
     * @property tail
     * @type Object
     * 
     */
    @JsProperty void setTail(JavaScriptObject value);

    /**
     * <p>The pattern of slash-separated segments to match <code>route.path</code> against.</p>
     * <p>For example the pattern “/foo” will match “/foo” or “/foo/bar”<br>but not “/foobar”.</p>
     * <p>Path segments like <code>/:named</code> are mapped to properties on the <code>data</code> object.</p>
     *
     * JavaScript Info:
     * @property pattern
     * @type String
     * 
     */
    @JsProperty String getPattern();
    /**
     * <p>The pattern of slash-separated segments to match <code>route.path</code> against.</p>
     * <p>For example the pattern “/foo” will match “/foo” or “/foo/bar”<br>but not “/foobar”.</p>
     * <p>Path segments like <code>/:named</code> are mapped to properties on the <code>data</code> object.</p>
     *
     * JavaScript Info:
     * @property pattern
     * @type String
     * 
     */
    @JsProperty void setPattern(String value);


}