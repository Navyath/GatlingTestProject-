package simulations

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class LVRecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("https://ws.sessioncam.com")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.129 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Origin" -> "https://www.lv.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_8 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_9 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_19 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "iframe",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "cross-site",
		"Upgrade-Insecure-Requests" -> "1",
		"X-Client-Data" -> "CJS2yQEIo7bJAQjAtskBCKmdygEI6qvKAQjQr8oBCLywygEI7bXKAQiOusoBGLu6ygE=")

	val headers_36 = Map("Origin" -> "https://www.lv.com")

	val headers_39 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Intervention" -> """<https://www.chromestatus.com/feature/5718547946799104>; level="warning"""",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_40 = Map("Intervention" -> """<https://www.chromestatus.com/feature/5718547946799104>; level="warning"""")

	val headers_44 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site",
		"X-Client-Data" -> "CJS2yQEIo7bJAQjAtskBCKmdygEI6qvKAQjQr8oBCLywygEI7bXKAQiOusoBGLu6ygE=")

	val headers_52 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-type" -> "application/x-www-form-urlencoded",
		"Origin" -> "https://www.lv.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_56 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-Type" -> "text/plain;charset=UTF-8",
		"Origin" -> "https://www.lv.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_57 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "no-cache",
		"pragma" -> "no-cache",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

    val uri01 = "https://d2oh4tlt9mrke9.cloudfront.net/Record/js/sessioncam.recorder.js"
    val uri02 = "https://www.google-analytics.com"
    val uri04 = "https://service.maxymiser.net"
    val uri05 = "https://nebula-cdn.kampyle.com"
    val uri06 = "https://snap.licdn.com/li.lms-analytics/insight.min.js"
    val uri07 = "https://r1.trackedweb.net/pagevisit"
    val uri08 = "https://5059777.fls.doubleclick.net"
    val uri09 = "https://www.googletagmanager.com/gtm.js"
    val uri10 = "https://www.lv.com"
    val uri11 = "https://www.google.com/recaptcha/api.js"
    val uri12 = "https://udc-neb.kampyle.com/egw/5/qceuv8449dzg58ptt1bhda9g8ue19c7s/track/__cool.gif"
    val uri13 = "https://px.ads.linkedin.com/collect"
    val uri14 = "https://adservice.google.com/ddm/fls/z/dc_pre=COKwjufrnOkCFQuzlgodDg0ChA;src=5059777;type=site30;cat=advis0;ord=6659347856338;gtm=2wg4m0;auiddc=*;~oref=https%3A%2F%2Fwww.lv.com%2Fadviser"
    val uri15 = "https://www.gstatic.com/recaptcha/releases/wk6lx42JIeYmEAQSHndnyT8Q/recaptcha__en.js"
    val uri16 = "https://static.trackedweb.net/js/_dmptv4.js"
    val uri17 = "https://r1-t.trackedlink.net/_dmpt.js"
    val uri18 = "https://use.fontawesome.com/releases/v5.0.13/css/all.css"

	val scn = scenario("LVRecordedSimulation")
		.exec(http("request_0")
			.post("/Record/record.asmx/SaveEvents?url=https%3A%2F%2Fwww.lv.com%2Fadviser")
			.headers(headers_0)
			.formParam("data", """pu25369{"d":"","e":22}""")
			.formParam("ASPNetSessionId", "znzerszjooxswwu1likotmas")
			.formParam("w", "1366")
			.formParam("h", "1856")
			.formParam("originalUrl", "https://www.lv.com/adviser")
			.formParam("plsse", "1588685774766")
			.formParam("jsver", "560")
			.formParam("url", "https://www.lv.com/adviser")
			.formParam("si", "ffc00e61-209c-40d3-92ec-e24d9e80799c")
			.formParam("aa", "f2779b1d-3058-e311-9444-12313928a8b9"))
		.pause(1)
		.exec(http("request_1")
			.get(uri10 + "/lifeassets/js/modernizr-2.5.3.js")
			.resources(http("request_2")
			.get(uri09 + "?id=GTM-5HCWSF"),
            http("request_3")
			.get(uri02 + "/analytics.js"),
            http("request_4")
			.get(uri06),
            http("request_5")
			.get(uri02 + "/plugins/ua/linkid.js"),
            http("request_6")
			.get(uri11),
            http("request_7")
			.get(uri10 + "/lifeassets/assets/image/general/lv-adviser-centre-for-intermediaries.png"),
            http("request_8")
			.get(uri04 + "/cdn/com.lv/js/mmapi.js")
			.headers(headers_8),
            http("request_9")
			.get(uri02 + "/collect?v=1&_v=j81&a=957812388&t=pageview&_s=1&dl=https%3A%2F%2Fwww.lv.com%2Fadviser&dr=https%3A%2F%2Fwww.google.com%2F&ul=en-us&de=UTF-8&dt=LV%3D%20Adviser%20Centre%20%7C%20home%20of%20protection%2C%20retirement%20and%20investments&sd=24-bit&sr=1366x768&vp=1366x226&je=0&_u=SCCAAAAj~&jid=&gjid=&cid=1218163936.1588577612&tid=UA-4853394-6&_gid=74492117.1588577612&gtm=2wg4m05HCWSF&cg1=null&cg2=null&cd9=1588685801792.ts1vakhn&z=1383927796")
			.headers(headers_9),
            http("request_10")
			.get(uri10 + "/lifeassets/assets/image/investment/smoothing-homepage-banner-v2.jpg"),
            http("request_11")
			.get(uri10 + "/lifeassets/assets/image/protection/critical-illness/ci-refresh-banner-homepage.jpg"),
            http("request_12")
			.get(uri10 + "/lifeassets/assets/image/investment/fgf/flexible-guarantee-funds-home.jpg"),
            http("request_13")
			.get(uri10 + "/lifeassets/assets/image/working-with-lv/maggies-nurse-and-patient-central-aligned.jpg"),
            http("request_14")
			.get(uri10 + "/lifeassets/assets/image/sjp/important-information-2.png"),
            http("request_15")
			.get(uri10 + "/lifeassets/assets/image/general/pod-protection.jpg"),
            http("request_16")
			.get(uri10 + "/lifeassets/assets/image/general/pod-retirement.jpg"),
            http("request_17")
			.get(uri10 + "/lifeassets/assets/image/general/flourish/literature-flo.png"),
            http("request_18")
			.get(uri10 + "/lifeassets/assets/image/general/flourish/award-flo.png"),
            http("request_19")
			.get(uri08 + "/activityi;src=5059777;type=site30;cat=advis0;ord=6659347856338;gtm=2wg4m0;auiddc=1744606633.1588577612;~oref=https%3A%2F%2Fwww.lv.com%2Fadviser?")
			.headers(headers_19),
            http("request_20")
			.get(uri10 + "/lifeassets/assets/image/general/flourish/get-in-touch-flo.png"),
            http("request_21")
			.get(uri10 + "/lifeassets/assets/image/general/flourish/online-support-flo.png"),
            http("request_22")
			.get(uri10 + "/lifeassets/template-assets/images/content/feed.png"),
            http("request_23")
			.get(uri10 + "/lifeassets/template-assets/images/content/below-carousel-shadow.jpg"),
            http("request_24")
			.get(uri10 + "/lifeassets/assets/image/icons/vimeo-icon.png"),
            http("request_25")
			.get(uri10 + "/lifeassets/assets/image/icons/2-linkedin.png"),
            http("request_26")
			.get(uri10 + "/lifeassets/assets/image/icons/2-twitter.png"),
            http("request_27")
			.get(uri10 + "/lifeassets/js/bootstrap/jquery.min.js"),
            http("request_28")
			.get(uri10 + "/lifeassets/js/bootstrap/bootstrap.bundle.min.js"),
            http("request_29")
			.get(uri10 + "/lifeassets/js/lv-min.js?v=v19.1.0.1"),
            http("request_30")
			.get(uri10 + "/lifeassets/js/polyfills/match-media-polyfill-min.js?v=v19.1.0.1"),
            http("request_31")
			.get(uri10 + "/lifeassets/custom/js/or-min.js?v=10877"),
            http("request_32")
			.get(uri13 + "?v=2&fmt=js&pid=1539892&url=https%3A%2F%2Fwww.lv.com%2Fadviser&time=1588685801827")
			.headers(headers_9),
            http("request_33")
			.get(uri10 + "/lifeassets/css/screen.css?v=v19.1.0.1"),
            http("request_34")
			.get(uri10 + "/lifeassets/css/bootstrap/custom.css"),
            http("request_35")
			.get(uri10 + "/lifeassets/css/bootstrap/custom-lv.css"),
            http("request_36")
			.get(uri18)
			.headers(headers_36),
            http("request_37")
			.get(uri10 + "/lifeassets/custom/css/or-min.css?v=10877"),
            http("request_38")
			.get(uri10 + "/lifeassets/custom/css/head_100159650391003-min.css?v=10877"),
            http("request_39")
			.get(uri04 + "/cg/v5/?fv=dmn%3Dlv.com%3Bref%3Dhttps%253A%252F%252Fwww.google.com%252F%3Burl%3Dhttps%253A%252F%252Fwww.lv.com%252Fadviser%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&bid=lvsvwcgeu02&srv=lvsvwcgeu02&uat=Adviser_LogIn%3DNo%3BProduct_Views%3D1%3BProduct_Variety%3D1%3BUserType%3DProtection&pd=-1194815977%7CHwAAAApVAwAQu9evCBNrFwABEgABQgAUSldlBQDGVVtI%2BfDXSDbYtnH979dIAAAAAAEAAAD%2F%2F%2F%2F%2FAA53d3cuZ29vZ2xlLmNvbQQIEwUAAAAAAAAAAAASjgEA%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F8AAAAAAAAAAUU%3D")
			.headers(headers_39),
            http("request_40")
			.get(uri04 + "/platform/eu/api/mmpackage-1.19.js")
			.headers(headers_40),
            http("request_41")
			.get(uri08 + "/activityi;dc_pre=COKwjufrnOkCFQuzlgodDg0ChA;src=5059777;type=site30;cat=advis0;ord=6659347856338;gtm=2wg4m0;auiddc=1744606633.1588577612;~oref=https%3A%2F%2Fwww.lv.com%2Fadviser?")
			.headers(headers_19),
            http("request_42")
			.get(uri04 + "/cg/v5/?fv=dmn%3Dlv.com%3Bref%3Dhttps%253A%252F%252Fwww.google.com%252F%3Burl%3Dhttps%253A%252F%252Fwww.lv.com%252Fadviser%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B2%5D&ri=2&lto=330&jrt=s&pd=1740943166%7CIAAAAApVAwAQu9evCBNrFwABEgABQgAUSldlBQCkZKVY%2BfDXSDbYtnH979dIAAAAAAEAAAD%2F%2F%2F%2F%2FAA53d3cuZ29vZ2xlLmNvbQQIEwUAAAAAAAAAAAASjgEA%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F8AAAAAAAAAAUU%3D&bid=lvsvwcgeu02&srv=lvsvwcgeu02&uat=Adviser_LogIn%3DNo%3BProduct_Views%3D1%3BProduct_Variety%3D1%3BUserType%3DProtection&pageid=undefined")
			.headers(headers_39),
            http("request_43")
			.get(uri15),
            http("request_44")
			.get(uri14)
			.headers(headers_44)
			.check(status.is(403)),
            http("request_45")
			.get(uri10 + "/lifeassets/assets/image/general/news-icon.png"),
            http("request_46")
			.get(uri10 + "/lifeassets/template-assets/images/background/nav-divider.png"),
            http("request_47")
			.get(uri01),
            http("request_48")
			.get(uri10 + "/lifeassets/template-assets/images/background/collapsible-arrows.png"),
            http("request_49")
			.get(uri17),
            http("request_50")
			.get(uri16),
            http("request_51")
			.get(uri04 + "/cg/v5/?fv=dmn%3Dlv.com%3Bref%3Dhttps%253A%252F%252Fwww.google.com%252F%3Burl%3Dhttps%253A%252F%252Fwww.lv.com%252Fadviser%3Bscrw%3D1366%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1&lver=1.14&jsncl=mmRequestCallbacks%5B3%5D&ri=3&lto=330&jrt=s&pd=1963681007%7CIQAAAApVAwAQu9evCBNrFwABEgABQgAUSldlBQDuiOpY%2BfDXSDbYtnH979dIAAAAAAEAAAD%2F%2F%2F%2F%2FAA53d3cuZ29vZ2xlLmNvbQQIEwUAAAAAAAAAAAASjgEA%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F8AAAAAAAAAAUU%3D&bid=lvsvwcgeu02&srv=lvsvwcgeu02&uat=Adviser_LogIn%3DNo%3BProduct_Views%3D1%3BProduct_Variety%3D1%3BUserType%3DProtection&pageid=undefined")
			.headers(headers_8),
            http("request_52")
			.get("/Record/config.aspx?url=https%3A%2F%2Fwww.lv.com%2Fadviser&jsver=560&originalUrl=https://www.lv.com&sse=1588685803110&id=znzerszjooxswwu1likotmas")
			.headers(headers_52),
            http("request_53")
			.get(uri05 + "/we/1615/onsite/embed.js")
			.headers(headers_8),
            http("request_54")
			.get(uri05 + "/we/1615/onsite/generic1588003472016.js"),
            http("request_55")
			.get(uri05 + "/resources/onsite/js/cool-2.1.15.min.js"),
            http("request_56")
			.post(uri07 + "?accountID=DM-2508848476-01&page_url=https%3A%2F%2Fwww.lv.com%2Fadviser&page_title=LV%3D%20Adviser%20Centre%20%7C%20home%20of%20protection%2C%20retirement%20and%20investments&page_time=2020-05-05T13:36:43&user_agent=Mozilla/5.0%20(Windows%20NT%2010.0;%20Win64;%20x64)%20AppleWebKit/537.36%20(KHTML,%20like%20Gecko)%20Chrome/81.0.4044.129%20Safari/537.36&dm_i=undefined&utm_medium=undefined&utm_source=undefined&utm_campaign=undefined&recordID=093e14e1-4b2d-455f-bfd0-0286dae02bf8&sessionID=74036e11-2b82-4028-9964-7364e7b50d61")
			.headers(headers_56),
            http("request_57")
			.get(uri10 + "/favicon.ico")
			.headers(headers_57),
            http("request_58")
			.get(uri12 + "?data=eyJldmVudHMiOiBbCiAgICB7InNlc3Npb25fc2NyZWVuX3NpemUiOiAiMTM2Nng3NjgiLCJzZXNzaW9uX2R1YSI6ICJNb3ppbGxhLzUuMCAoV2luZG93cyBOVCAxMC4wOyBXaW42NDsgeDY0KSBBcHBsZVdlYktpdC81MzcuMzYgKEtIVE1MLCBsaWtlIEdlY2tvKSBDaHJvbWUvODEuMC40MDQ0LjEyOSBTYWZhcmkvNTM3LjM2Iiwic2Vzc2lvbl9wbGF0Zm9ybSI6ICJXaW4zMiIsInJlZmVycmluZ191cmwiOiAiaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8iLCJyZWZlcnJpbmdfZG9tYWluIjogInd3dy5nb29nbGUuY29tIiwidHJhY2tlcl90eXBlIjogImphdmFzY3JpcHQiLCJ0cmFja2VyX3ZlcnNpb24iOiAiMi4xLjE1IiwiZXZlbnRfbmFtZSI6ICJuZWJ1bGFfcGFnZV92aWV3IiwiZXZlbnRfdGltZXN0YW1wX2Vwb2NoIjogIjE1ODg2ODU4MDc4ODkiLCJldmVudF90aW1lem9uZV9vZmZzZXQiOiA1LjUsInVzZXJfaWQiOiAiMTcxZGU5YWQwMTBjOS0wZTdiMThhYmI2NTliYi03MzczNjY3LTEwMDIwMC0xNzFkZTlhZDAxMTVkZiIsImVudmlyb21lbnQiOiAicHJvZEV1SXJsYW5kIiwiYWNjb3VudElkIjogMTYxNCwidXJsIjogImh0dHBzOi8vd3d3Lmx2LmNvbS9hZHZpc2VyIiwid2Vic2l0ZUlkIjogMTYxNSwiZmVlZGJhY2tfdXVpZCI6IG51bGwsImZvcm1JZCI6IG51bGwsImZvcm1UcmlnZ2VyVHlwZSI6IG51bGwsImthbXB5bGVfZGF0YSI6IHsibWRpZ2l0YWxfYWx0ZXJuYXRpdmVfdXVpZCI6ICI4ODRmLWI5NDItOWUxMC02ZGQ2LWJiMzMtMGNlNi0zMDBiLWU0OWQiLCJMQVNUX0lOVklUQVRJT05fVklFVyI6ICIiLCJERUNMSU5FRF9EQVRFIjogIiIsImthbXB5bGVJbnZpdGVQcmVzZW50ZWQiOiAiIiwia2FtcHlsZV91c2VyaWQiOiAiMmI0Ni0wNTE5LTVjYmMtNjE2OC1hOWUzLTg3ODItNDg0OC1kZjBlIiwia2FtcHlsZVVzZXJTZXNzaW9uIjogIjE1ODg2ODU4MDc4NjUiLCJrYW1weWxlVXNlclBlcmNlbnRpbGUiOiAiIiwiU1VCTUlUVEVEX0RBVEUiOiAiIn0sImNvb2tpZV9zaXplIjogMjk0Nywia2FtcHlsZV92ZXJzaW9uIjogIjIuMzIuMi4wIiwiaGlzdG9yeV9sZW5ndGgiOiAzLCJldmVudF9sb2NhbF90aW1lc3RhbXAiOiAxNTg4Njg1ODA3ODY5LCJwb3NpdGlvbiI6IG51bGwsImlzVXNlcklkZW50aWZpZWQiOiBmYWxzZX0KXX0=")
			.headers(headers_9),
            http("request_59")
			.post("/Record/record.asmx/GetPageId?url=https%3A%2F%2Fwww.lv.com%2Fadviser")
			.headers(headers_0)
			.formParam("doctype", "<!DOCTYPE html>")
			.formParam("d", "")
			.formParam("sse", "1588685803110")
			.formParam("w", "1366")
			.formParam("h", "728")
			.formParam("sx", "0")
			.formParam("sy", "0")
			.formParam("dw", "1366")
			.formParam("dh", "1856")
			.formParam("sw", "1366")
			.formParam("sh", "768")
			.formParam("r", "https://www.google.com/")
			.formParam("originalUrl", "https://www.lv.com/adviser")
			.formParam("flashVersion", "")
			.formParam("sessionUserId", "c9ca0e7f-5d4b-4bae-97ef-dbc9f3b4dfba")
			.formParam("ASPNetSessionId", "znzerszjooxswwu1likotmas")
			.formParam("test", "0")
			.formParam("jsver", "560")
			.formParam("ca", "")
			.formParam("jsstats", "pre 1387 startup 13 config 313 eventsBound 84 getPageId 193")
			.formParam("url", "https://www.lv.com/adviser")
			.formParam("si", "ffc00e61-209c-40d3-92ec-e24d9e80799c")
			.formParam("aa", "f2779b1d-3058-e311-9444-12313928a8b9"),
            http("request_60")
			.post("/Record/record.asmx/SaveEvents?url=https%3A%2F%2Fwww.lv.com%2Fadviser")
			.headers(headers_0)
			.formParam("data", """ws397{"d":"0,0,1366,728,396","e":0}oc397{"d":"landscape","e":1}tag407{"d":"true","e":0}UsingDMOst1{"d":"","e":2}hcc2785{"d":" js no-flexbox flexbox-legacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths","e":3}htmlmp3011{"d":"191.210","e":4}fx4765{"d":"","e":5}xp{}scId{10}bodyaa4763{"d":"\n\n\n\n\n\n<span scId=\"424\" ></span>","e":6}xp{/div:1}scId{11}divpx4764{"d":"\n\n\n\n\n\n","e":7}xp{/span}scId{424}spanaa4763{"d":"<span scId=\"425\" ><div id=\"KampyleAnimationContainer\" style=\"z-index: 2147483000; border: 0px; position: fixed; display: block;\"></div></span>","e":8}xp{/span}scId{424}spanpx4764{"d":"","e":9}xp{/span:1}scId{425}spanaa4763{"d":"<span id=\"kampyleButtonContainer\" scId=\"427\" ><button id=\"nebula_div_btn\" style=\"border: none; position: fixed !important; margin-top: 0px;\" alt=\"Feedback\" tabindex=\"0\" class=\"kampyle_vertical_button kampyle_right noOutline \"><div class=\"kampyle_button\"></div><div data-aut=\"feedback\" class=\"kampyle_button-text\">Feedback</div></button></span>","e":10}xp{/span:1}scId{425}spanpx4764{"d":"","e":11}xp{/span:2}id{kampyleButtonContainer}scId{427}spanha4798{"d":"<style scId=\"431\">.noOutline{outline: none !important;}.wcagOutline:focus{outline: 1px dashed #595959 !important;outline-offset: 2px !important;transition: none !important;}button#nebula_div_btn { height: auto !important } .kampyle_vertical_button { background-color:transparent !important;font-family:\"Open Sans\",sans-serif;cursor:pointer;position:fixed;top:45%;z-index:99999990;height:35px !important;min-height: 35px !important;max-height: 35px !important;width:125px !important;max-width: 125px !important;min-width: 125px !important;-ms-transform:rotate(90deg);-webkit-transform:rotate(90deg);transform:rotate(90deg) } .kampyle_vertical_button .kampyle_button { height:35px;min-height: 35px !important;max-height: 35px !important;width:125px !important;min-width: 125px !important;max-width: 125px !important; background:#007c9f;color:#ffffff;position:absolute;top:0;left:0;z-index:-1; } .kampyle_vertical_button .kampyle_button-text { color:#ffffff;font-size:14px;line-height:35px;text-align:center;font-weight:normal !important; } .kampyle_vertical_button.kampyle_left .kampyle_button { -webkit-border-radius:3px 3px 0 0;-moz-border-radius:3px 3px 0 0;-ms-border-radius:3px 3px 0 0;border-radius:3px 3px 0 0; } .kampyle_vertical_button.kampyle_right { right:-45px; } .kampyle_vertical_button.kampyle_left { left:-45px } .kampyle_vertical_button.kampyle_right .kampyle_button { -webkit-border-radius:0 0 3px 3px;-moz-border-radius:0 0 3px 3px;-ms-border-radius:0 0 3px 3px;border-radius:0 0 3px 3px } .kampyle_vertical_button.kampyle_right, .kampyle_vertical_button.kampyle_left { padding: 0 !important; }</style>","e":12}9head""")
			.formParam("ASPNetSessionId", "znzerszjooxswwu1likotmas")
			.formParam("w", "1366")
			.formParam("h", "1856")
			.formParam("originalUrl", "https://www.lv.com/adviser")
			.formParam("plsse", "1588685803110")
			.formParam("jsver", "560")
			.formParam("url", "https://www.lv.com/adviser")
			.formParam("si", "ffc00e61-209c-40d3-92ec-e24d9e80799c")
			.formParam("aa", "f2779b1d-3058-e311-9444-12313928a8b9"),
            http("request_61")
			.post("/Record/record.asmx/SaveEvents?url=https%3A%2F%2Fwww.lv.com%2Fadviser")
			.headers(headers_0)
			.formParam("data", """me6438{"d":"{\"A\":{\"A\":4.49,\"B\":300.23,\"C\":308.24},\"B\":{\"A\":4094.31,\"B\":1663.13,\"C\":5759.44,\"D\":92117},\"C\":1657.98,\"D\":2791.26,\"E\":2815}","e":13}""")
			.formParam("ASPNetSessionId", "znzerszjooxswwu1likotmas")
			.formParam("w", "1366")
			.formParam("h", "1856")
			.formParam("originalUrl", "https://www.lv.com/adviser")
			.formParam("plsse", "1588685803110")
			.formParam("jsver", "560")
			.formParam("url", "https://www.lv.com/adviser")
			.formParam("si", "ffc00e61-209c-40d3-92ec-e24d9e80799c")
			.formParam("aa", "f2779b1d-3058-e311-9444-12313928a8b9")))
		.pause(3)
		.exec(http("request_62")
			.post("/Record/record.asmx/SaveEvents?url=https%3A%2F%2Fwww.lv.com%2Fadviser")
			.headers(headers_0)
			.formParam("data", """tg10731{"d":"<li scId=\"288\" data-target=\"#bootstrapCarousel\" data-slide-to=\"0\"> </li>","e":14}xp{/div:1/cms:container:2/div/div/div/ol/li}id{scDummyId}scId{288}litg10735{"d":"<li class=\"active\" scId=\"286\" data-target=\"#bootstrapCarousel\" data-slide-to=\"2\"> </li>","e":15}xp{/div:1/cms:container:2/div/div/div/ol/li:2}id{scDummyId}scId{286}litg10736{"d":"<div class=\"carousel-item ctaLeft carousel-item-next carousel-item-left\" scId=\"275\" data-cmsdescription=\"Carousel Item\"><img class=\"d-block w-100 bs-img img-fluid fixed-width\" src=\"/lifeassets/assets/image/investment/fgf/flexible-guarantee-funds-home.jpg\" alt=\"Grandad playing with his Grand Daughter\" data-cmsrealurl=\"/assets/image/investment/fgf/flexible-guarantee-funds-home.jpg\"><div class=\"carousel-caption d-none d-md-block\"><p><span><strong>First year pension wrapper charge waived when 100% invested in our smoothed funds by 30 June.</strong></span></p><p class=\"pageLink\" data-cmsdescription=\"pagelink\"><a class=\"linkButton\" data-linktarget=\"/adviser/flexible-guarantee-funds/special-offer\" href=\"/adviser/flexible-guarantee-funds/special-offer\" id=\"100159650391003>body>container-top>https://www.lv.com/adviser/flexible-guarantee-funds/special-offer\">More on the special offer</a></p></div></div>","e":16}xp{/div:1/cms:container:2/div/div/div/div/div:2}id{scDummyId}scId{275}divtg10739{"d":"<div class=\"carousel-item active ctaLeft carousel-item-left\" scId=\"278\" data-cmsdescription=\"Carousel Item\"><img class=\"d-block w-100 bs-img img-fluid fixed-width\" src=\"/lifeassets/assets/image/protection/critical-illness/ci-refresh-banner-homepage.jpg\" alt=\"Sons hugging their mum and smiling\" data-cmsrealurl=\"/assets/image/protection/critical-illness/ci-refresh-banner-homepage.jpg\"><div class=\"carousel-caption d-none d-md-block\"><p><strong>New, more inclusive critical illness cover for modern families. </strong></p><p>\nSupporting your clients through life changing moments\n</p><p class=\"pageLink\" data-cmsdescription=\"pagelink\"><a class=\"linkButton\" data-linktarget=\"/adviser/critical-illness\" href=\"/adviser/critical-illness\" id=\"100159650391003>body>container-top>https://www.lv.com/adviser/critical-illness\">Find out more about Critical Illness</a></p></div></div>","e":17}xp{/div:1/cms:container:2/div/div/div/div/div:1}id{scDummyId}scId{278}divcc11326{"d":"carousel-item ctaLeft active","e":18}xp{/div:1/cms:container:2/div/div/div/div/div:2}scId{275}divtg11330{"d":"<div class=\"carousel-item ctaLeft\" scId=\"278\" data-cmsdescription=\"Carousel Item\"><img class=\"d-block w-100 bs-img img-fluid fixed-width\" src=\"/lifeassets/assets/image/protection/critical-illness/ci-refresh-banner-homepage.jpg\" alt=\"Sons hugging their mum and smiling\" data-cmsrealurl=\"/assets/image/protection/critical-illness/ci-refresh-banner-homepage.jpg\"><div class=\"carousel-caption d-none d-md-block\"><p><strong>New, more inclusive critical illness cover for modern families. </strong></p><p>\nSupporting your clients through life changing moments\n</p><p class=\"pageLink\" data-cmsdescription=\"pagelink\"><a class=\"linkButton\" data-linktarget=\"/adviser/critical-illness\" href=\"/adviser/critical-illness\" id=\"100159650391003>body>container-top>https://www.lv.com/adviser/critical-illness\">Find out more about Critical Illness</a></p></div></div>","e":19}xp{/div:1/cms:container:2/div/div/div/div/div:1}id{scDummyId}scId{278}div""")
			.formParam("ASPNetSessionId", "znzerszjooxswwu1likotmas")
			.formParam("w", "1366")
			.formParam("h", "1856")
			.formParam("originalUrl", "https://www.lv.com/adviser")
			.formParam("plsse", "1588685803110")
			.formParam("jsver", "560")
			.formParam("url", "https://www.lv.com/adviser")
			.formParam("si", "ffc00e61-209c-40d3-92ec-e24d9e80799c")
			.formParam("aa", "f2779b1d-3058-e311-9444-12313928a8b9"))
		.pause(5)
		.exec(http("request_63")
			.post("/Record/record.asmx/SaveEvents?url=https%3A%2F%2Fwww.lv.com%2Fadviser")
			.headers(headers_0)
			.formParam("data", """cc16742{"d":"","e":20}xp{/div:1/cms:container:2/div/div/div/ol/li:2}scId{286}litg16744{"d":"<li class=\"active\" scId=\"285\" data-target=\"#bootstrapCarousel\" data-slide-to=\"3\"> </li>","e":21}xp{/div:1/cms:container:2/div/div/div/ol/li:3}id{scDummyId}scId{285}litg16747{"d":"<div class=\"carousel-item ctaLeft carousel-item-next carousel-item-left\" scId=\"272\" data-cmsdescription=\"Carousel Item\"><img class=\"d-block w-100 bs-img img-fluid fixed-width\" src=\"/lifeassets/assets/image/working-with-lv/maggies-nurse-and-patient-central-aligned.jpg\" alt=\"Placeholder alt attribute\" data-cmsrealurl=\"/assets/image/working-with-lv/maggies-nurse-and-patient-central-aligned.jpg\"><div class=\"carousel-caption\"><p class=\"p-h2 teal18 tl\">\nWe're working with Maggie's, the home of cancer care\n</p><p class=\"pageLink tl\" data-cmsdescription=\"pagelink\"><a class=\"linkButton greenRight\" data-linktarget=\"/adviser/working-with-lv/why-lv/maggies\" title=\"Find out more about Maggie's\" href=\"/adviser/working-with-lv/why-lv/maggies\" id=\"100159650391003>body>container-top>https://www.lv.com/adviser/working-with-lv/why-lv/maggies\">Find out more about Maggie's</a></p></div></div>","e":22}xp{/div:1/cms:container:2/div/div/div/div/div:3}id{scDummyId}scId{272}divcc16751{"d":"carousel-item ctaLeft active carousel-item-left","e":23}xp{/div:1/cms:container:2/div/div/div/div/div:2}scId{275}divcc17339{"d":"carousel-item ctaLeft active","e":24}xp{/div:1/cms:container:2/div/div/div/div/div:3}scId{272}divtg17340{"d":"<div class=\"carousel-item ctaLeft\" scId=\"275\" data-cmsdescription=\"Carousel Item\"><img class=\"d-block w-100 bs-img img-fluid fixed-width\" src=\"/lifeassets/assets/image/investment/fgf/flexible-guarantee-funds-home.jpg\" alt=\"Grandad playing with his Grand Daughter\" data-cmsrealurl=\"/assets/image/investment/fgf/flexible-guarantee-funds-home.jpg\"><div class=\"carousel-caption d-none d-md-block\"><p><span><strong>First year pension wrapper charge waived when 100% invested in our smoothed funds by 30 June.</strong></span></p><p class=\"pageLink\" data-cmsdescription=\"pagelink\"><a class=\"linkButton\" data-linktarget=\"/adviser/flexible-guarantee-funds/special-offer\" href=\"/adviser/flexible-guarantee-funds/special-offer\" id=\"100159650391003>body>container-top>https://www.lv.com/adviser/flexible-guarantee-funds/special-offer\">More on the special offer</a></p></div></div>","e":25}xp{/div:1/cms:container:2/div/div/div/div/div:2}id{scDummyId}scId{275}div""")
			.formParam("ASPNetSessionId", "znzerszjooxswwu1likotmas")
			.formParam("w", "1366")
			.formParam("h", "1856")
			.formParam("originalUrl", "https://www.lv.com/adviser")
			.formParam("plsse", "1588685803110")
			.formParam("jsver", "560")
			.formParam("url", "https://www.lv.com/adviser")
			.formParam("si", "ffc00e61-209c-40d3-92ec-e24d9e80799c")
			.formParam("aa", "f2779b1d-3058-e311-9444-12313928a8b9"))

	setUp(
	scn.inject(
		nothingFor(5 seconds),
		rampUsers(20) during (10 seconds))
	)
	.protocols(httpProtocol)
	.maxDuration(60 seconds)
	.assertions(
		global.responseTime.max.lt(5000),
		global.successfulRequests.percent.gt(95)
	)
}