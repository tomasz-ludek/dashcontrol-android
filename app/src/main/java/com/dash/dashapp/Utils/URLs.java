package com.dash.dashapp.Utils;

import com.dash.dashapp.BuildConfig;

/**
 * Created by sebas on 12/10/2017.
 */

public class URLs {

    private final static String BASE_URL_DASH_CONTROL = "https://dashpay.info/api/v0/";

    private final static String BASE_DASH_URL = "https://www.dash.org/";

    public static final String RSS_LINK_DEF = "default";
    public static final String RSS_LINK_EN = BASE_DASH_URL + "rss/dash_blog_rss.xml";
    public static final String RSS_LINK_ES = BASE_DASH_URL + "es/rss/dash_blog_rss.xml";
    public static final String RSS_LINK_FR = BASE_DASH_URL + "fr/rss/dash_blog_rss.xml";
    public static final String RSS_LINK_PT = BASE_DASH_URL + "pt/rss/dash_blog_rss.xml";
    public static final String RSS_LINK_CN = BASE_DASH_URL + "cn/rss/dash_blog_rss.xml";
    public static final String RSS_LINK_RU = BASE_DASH_URL + "ru/rss/dash_blog_rss.xml";
    public static final String RSS_LINK_JP = BASE_DASH_URL + "jp/rss/dash_blog_rss.xml";
    public static final String RSS_LINK_KR = BASE_DASH_URL + "kr/rss/dash_blog_rss.xml";

    public static final String URL_PRICE = BASE_URL_DASH_CONTROL + "prices";
    public static final String URL_EXCHANGES = BASE_URL_DASH_CONTROL + "markets";
    public final static String URL_PROPOSAL = BASE_URL_DASH_CONTROL + "budget";
    public static final String URL_GRAPH = BASE_URL_DASH_CONTROL + "chart_data?";


}