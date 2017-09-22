package com.mrd.encode;

import cyou.mrd.game.Server;

public class HTTPEncodeUtil {

	public static final int DEFAULT_CACHE_SIZE = 1024 * 100;
	
	public static native int fileEncode(byte[] array, int len);

	public static native int fileDecode(byte[] array, int len);

	public static native int Encode(byte[] array, int len, byte[] retarray, int space);

	public static native int Decode(byte[] array, int Len, byte[] retarray, int space);

	private static String encoding = "utf-8";

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		Server server = new Server();
		server.loadLibrary();
		System.out.println("\n\n\n");
//		String test = new String(
//				"{\"data\":{\"buildList\":[{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":4320,\"y\":1664},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":5280,\"y\":1664},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":5760,\"y\":1904},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":6240,\"y\":2144},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":3840,\"y\":3824},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":3360,\"y\":3584},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":2880,\"y\":3344},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":2400,\"y\":3104},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":1920,\"y\":2864},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":1440,\"y\":2624},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":960,\"y\":2384},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":480,\"y\":2144},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":4320,\"y\":3584},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":3840,\"y\":3344},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":3360,\"y\":3104},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":2880,\"y\":2864},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":2400,\"y\":2624},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":1920,\"y\":2384},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":1440,\"y\":2144},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":960,\"y\":1904},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":4800,\"y\":3344},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":4320,\"y\":3104},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":3840,\"y\":2864},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":3360,\"y\":2624},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":2880,\"y\":2384},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":2400,\"y\":2144},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":1920,\"y\":1904},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":1440,\"y\":1664},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":5280,\"y\":3104},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":4800,\"y\":2864},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":4320,\"y\":2624},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":2880,\"y\":1904},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":2400,\"y\":1664},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":1920,\"y\":1424},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":5760,\"y\":2864},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":5280,\"y\":2624},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":4800,\"y\":2384},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":3360,\"y\":1664},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":2880,\"y\":1424},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":2400,\"y\":1184},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":6240,\"y\":2624},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":5760,\"y\":2384},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":5280,\"y\":2144},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":4800,\"y\":1904},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":3840,\"y\":1424},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":3360,\"y\":1184},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":2880,\"y\":944},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":6720,\"y\":2384},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":4800,\"y\":1424},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":4320,\"y\":1184},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":3840,\"y\":944},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":3360,\"y\":704},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":7200,\"y\":2144},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":6720,\"y\":1904},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":6240,\"y\":1664},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":5760,\"y\":1424},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":5280,\"y\":1184},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":4800,\"y\":944},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":4320,\"y\":704},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"000\",\"x\":3840,\"y\":464},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_003\",\"x\":3616,\"y\":1696},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":5,\"tid\":\"20_10_002\",\"x\":4160,\"y\":1648},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_002\",\"x\":3616,\"y\":2080},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"50_10_001\",\"x\":4128,\"y\":2080},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4032,\"y\":2224},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4000,\"y\":2208},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":3968,\"y\":2192},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":3936,\"y\":2176},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":3904,\"y\":2160},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":3872,\"y\":2144},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":3840,\"y\":2128},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":3808,\"y\":2112},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":3776,\"y\":2096},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":3808,\"y\":2080},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":3840,\"y\":2064},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":3872,\"y\":2048},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":3904,\"y\":2032},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4064,\"y\":1952},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4096,\"y\":1936},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4128,\"y\":1920},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4160,\"y\":1936},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4448,\"y\":2080},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4416,\"y\":2064},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4384,\"y\":2048},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4352,\"y\":2032},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4320,\"y\":2016},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4288,\"y\":2000},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4256,\"y\":1984},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4224,\"y\":1968},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4192,\"y\":1952},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4480,\"y\":2096},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4448,\"y\":2112},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4384,\"y\":2144},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4416,\"y\":2128},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4352,\"y\":2160},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4320,\"y\":2176},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4256,\"y\":2208},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4224,\"y\":2224},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4192,\"y\":2240},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4224,\"y\":2256},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4192,\"y\":2272},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4160,\"y\":2256},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4128,\"y\":2272},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4096,\"y\":2256},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_20_001\",\"x\":4064,\"y\":2240},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_038\",\"x\":3712,\"y\":2192},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_038\",\"x\":3296,\"y\":2080},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_002\",\"x\":3488,\"y\":2144},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_036\",\"x\":3488,\"y\":2048},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_036\",\"x\":3808,\"y\":2240},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_037\",\"x\":3680,\"y\":2272},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":5,\"tid\":\"30_10_006\",\"x\":3584,\"y\":2192},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":5,\"tid\":\"30_10_009\",\"x\":3392,\"y\":2096},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3968,\"y\":1968},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3936,\"y\":1952},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3904,\"y\":1936},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3872,\"y\":1920},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3840,\"y\":1904},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3808,\"y\":1888},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3776,\"y\":1872},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3744,\"y\":1856},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3712,\"y\":1840},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3680,\"y\":1824},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3648,\"y\":1808},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3616,\"y\":1792},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3584,\"y\":1776},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3552,\"y\":1760},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3520,\"y\":1744},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3488,\"y\":1728},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":5,\"tid\":\"30_10_008\",\"x\":3200,\"y\":2000},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_037\",\"x\":3328,\"y\":1968},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_013\",\"x\":3104,\"y\":1984},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_013\",\"x\":3072,\"y\":1968},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_013\",\"x\":3040,\"y\":1952},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_013\",\"x\":3008,\"y\":1936},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_013\",\"x\":2976,\"y\":1920},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_013\",\"x\":2944,\"y\":1904},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_013\",\"x\":2976,\"y\":1888},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_013\",\"x\":3008,\"y\":1872},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_013\",\"x\":3040,\"y\":1856},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":4064,\"y\":1632},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":4032,\"y\":1648},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":4096,\"y\":1680},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":4064,\"y\":1664},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":4160,\"y\":1712},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":4192,\"y\":1696},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":4224,\"y\":1680},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":4256,\"y\":1664},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_003\",\"x\":3456,\"y\":1776},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3840,\"y\":1872},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3872,\"y\":1856},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3808,\"y\":1856},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3840,\"y\":1840},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3904,\"y\":1840},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3936,\"y\":1824},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":4000,\"y\":1792},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":4032,\"y\":1776},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":4064,\"y\":1760},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":4096,\"y\":1744},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":4128,\"y\":1728},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3968,\"y\":1808},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_011\",\"x\":3872,\"y\":1824},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_011\",\"x\":3904,\"y\":1808},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_011\",\"x\":3936,\"y\":1792},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_011\",\"x\":3968,\"y\":1776},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_011\",\"x\":4000,\"y\":1760},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_011\",\"x\":4032,\"y\":1744},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_011\",\"x\":4064,\"y\":1728},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_011\",\"x\":4096,\"y\":1712},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_012\",\"x\":4640,\"y\":1952},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"20_10_005\",\"x\":3936,\"y\":1536},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":4000,\"y\":1632},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3968,\"y\":1616},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3936,\"y\":1600},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3904,\"y\":1584},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3872,\"y\":1568},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3840,\"y\":1552},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3872,\"y\":1536},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3904,\"y\":1520},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3936,\"y\":1504},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_010\",\"x\":4096,\"y\":1616},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_010\",\"x\":4128,\"y\":1600},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_010\",\"x\":4096,\"y\":1584},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_007\",\"x\":4576,\"y\":1856},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_037\",\"x\":4448,\"y\":1920},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_038\",\"x\":4448,\"y\":1824},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_020\",\"x\":3584,\"y\":1904},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_018\",\"x\":3936,\"y\":1696},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_018\",\"x\":3872,\"y\":1728},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_017\",\"x\":3808,\"y\":1696},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_017\",\"x\":3872,\"y\":1664},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"10_10_002\",\"x\":3424,\"y\":1984},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3616,\"y\":2176},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3584,\"y\":2160},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3552,\"y\":2144},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3520,\"y\":2128},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3488,\"y\":2112},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3456,\"y\":2096},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3424,\"y\":2080},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3392,\"y\":2064},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3360,\"y\":2048},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3328,\"y\":2032},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3296,\"y\":2016},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3264,\"y\":2000},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3232,\"y\":1984},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3776,\"y\":1904},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3744,\"y\":1920},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3712,\"y\":1936},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3680,\"y\":1952},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3648,\"y\":1968},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3616,\"y\":1984},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3584,\"y\":2000},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3552,\"y\":2016},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3584,\"y\":2032},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3616,\"y\":2048},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3584,\"y\":2064},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3552,\"y\":2080},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_10_001\",\"x\":3520,\"y\":2096},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4544,\"y\":2096},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4512,\"y\":2080},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4480,\"y\":2064},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4448,\"y\":2048},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4416,\"y\":2032},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4384,\"y\":2016},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4352,\"y\":2000},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4320,\"y\":1984},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4288,\"y\":1968},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4256,\"y\":1952},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4224,\"y\":1936},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4192,\"y\":1920},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4160,\"y\":1904},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4128,\"y\":1888},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4096,\"y\":1904},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4064,\"y\":1920},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4032,\"y\":1936},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":3872,\"y\":2016},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4064,\"y\":2272},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4032,\"y\":2256},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4000,\"y\":2240},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":3968,\"y\":2224},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":3936,\"y\":2208},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":3904,\"y\":2192},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":3872,\"y\":2176},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":3840,\"y\":2160},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":3808,\"y\":2144},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":3776,\"y\":2128},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":3744,\"y\":2112},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":3712,\"y\":2096},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":3744,\"y\":2080},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":3776,\"y\":2064},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":3808,\"y\":2048},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":3840,\"y\":2032},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4512,\"y\":2112},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4480,\"y\":2128},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4416,\"y\":2160},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4448,\"y\":2144},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4384,\"y\":2176},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4352,\"y\":2192},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4320,\"y\":2208},{\"holes\":[{\"id\":\"\"},{\"id\":\"\"},{\"id\":\"\"}],\"or\":0,\"re\":0,\"state\":0,\"tid\":\"40_30_001\",\"x\":4288,\"y\":2224}],\"diamond\":0,\"dnum\":0,\"energy\":8,\"exp\":1,\"icon\":\"headico8.png\",\"items\":[{\"num\":0,\"tid\":\"10_10_001\"},{\"num\":0,\"tid\":\"10_10_002\"},{\"num\":0,\"tid\":\"10_10_003\"},{\"num\":0,\"tid\":\"10_10_004\"},{\"num\":0,\"tid\":\"10_10_005\"},{\"num\":0,\"tid\":\"10_10_006\"},{\"num\":0,\"tid\":\"10_10_007\"},{\"num\":0,\"tid\":\"10_10_008\"},{\"num\":0,\"tid\":\"10_10_009\"},{\"num\":0,\"tid\":\"10_10_010\"},{\"num\":0,\"tid\":\"10_10_011\"},{\"num\":0,\"tid\":\"10_10_012\"},{\"num\":0,\"tid\":\"10_10_013\"},{\"num\":0,\"tid\":\"10_10_014\"},{\"num\":0,\"tid\":\"10_10_015\"},{\"num\":0,\"tid\":\"10_10_016\"},{\"num\":0,\"tid\":\"10_10_017\"},{\"num\":0,\"tid\":\"10_10_018\"},{\"num\":0,\"tid\":\"10_10_019\"},{\"num\":0,\"tid\":\"10_20_001\"},{\"num\":0,\"tid\":\"10_20_002\"},{\"num\":0,\"tid\":\"10_20_003\"},{\"num\":0,\"tid\":\"10_20_004\"},{\"num\":0,\"tid\":\"10_20_005\"},{\"num\":0,\"tid\":\"10_20_006\"},{\"num\":0,\"tid\":\"10_20_007\"},{\"num\":0,\"tid\":\"10_20_008\"},{\"num\":0,\"tid\":\"10_20_009\"},{\"num\":0,\"tid\":\"10_20_010\"},{\"num\":0,\"tid\":\"10_20_011\"},{\"num\":0,\"tid\":\"10_20_012\"},{\"num\":0,\"tid\":\"10_20_013\"},{\"num\":0,\"tid\":\"10_20_014\"},{\"num\":0,\"tid\":\"10_20_015\"},{\"num\":0,\"tid\":\"20_10_001\"},{\"num\":0,\"tid\":\"20_10_002\"},{\"num\":0,\"tid\":\"20_10_003\"},{\"num\":0,\"tid\":\"20_10_004\"},{\"num\":0,\"tid\":\"20_10_005\"},{\"num\":0,\"tid\":\"20_10_006\"},{\"num\":0,\"tid\":\"20_10_007\"},{\"num\":0,\"tid\":\"20_10_008\"},{\"num\":0,\"tid\":\"20_10_009\"},{\"num\":0,\"tid\":\"20_10_010\"},{\"num\":0,\"tid\":\"20_10_011\"},{\"num\":0,\"tid\":\"20_10_012\"},{\"num\":0,\"tid\":\"20_10_013\"},{\"num\":0,\"tid\":\"20_10_014\"},{\"num\":0,\"tid\":\"20_10_015\"},{\"num\":0,\"tid\":\"20_10_016\"},{\"num\":0,\"tid\":\"20_10_017\"},{\"num\":0,\"tid\":\"20_10_018\"},{\"num\":0,\"tid\":\"20_20_001\"},{\"num\":0,\"tid\":\"20_20_002\"},{\"num\":0,\"tid\":\"20_20_003\"},{\"num\":0,\"tid\":\"20_20_004\"},{\"num\":0,\"tid\":\"20_20_005\"},{\"num\":0,\"tid\":\"20_20_006\"},{\"num\":0,\"tid\":\"20_20_007\"},{\"num\":0,\"tid\":\"20_20_008\"},{\"num\":0,\"tid\":\"20_20_009\"},{\"num\":0,\"tid\":\"20_20_010\"},{\"num\":0,\"tid\":\"20_20_011\"},{\"num\":0,\"tid\":\"20_20_012\"},{\"num\":0,\"tid\":\"20_20_013\"},{\"num\":0,\"tid\":\"20_20_014\"},{\"num\":0,\"tid\":\"20_20_015\"},{\"num\":0,\"tid\":\"30_10_001\"},{\"num\":0,\"tid\":\"30_10_002\"},{\"num\":0,\"tid\":\"30_10_003\"},{\"num\":0,\"tid\":\"30_10_004\"},{\"num\":0,\"tid\":\"30_10_005\"},{\"num\":0,\"tid\":\"30_10_006\"},{\"num\":0,\"tid\":\"30_10_007\"},{\"num\":0,\"tid\":\"30_10_008\"},{\"num\":0,\"tid\":\"30_10_009\"},{\"num\":0,\"tid\":\"30_10_010\"},{\"num\":0,\"tid\":\"30_10_011\"},{\"num\":0,\"tid\":\"30_10_012\"},{\"num\":0,\"tid\":\"30_10_013\"},{\"num\":0,\"tid\":\"30_10_014\"},{\"num\":0,\"tid\":\"30_10_015\"},{\"num\":0,\"tid\":\"30_10_016\"},{\"num\":0,\"tid\":\"30_10_017\"},{\"num\":0,\"tid\":\"30_20_001\"},{\"num\":0,\"tid\":\"30_20_002\"},{\"num\":0,\"tid\":\"30_20_003\"},{\"num\":0,\"tid\":\"30_20_004\"},{\"num\":0,\"tid\":\"30_20_005\"},{\"num\":0,\"tid\":\"30_20_006\"},{\"num\":0,\"tid\":\"30_20_007\"},{\"num\":0,\"tid\":\"30_20_008\"},{\"num\":0,\"tid\":\"30_20_009\"},{\"num\":0,\"tid\":\"30_20_010\"},{\"num\":0,\"tid\":\"30_20_011\"},{\"num\":0,\"tid\":\"30_20_012\"},{\"num\":0,\"tid\":\"30_20_013\"},{\"num\":0,\"tid\":\"30_20_014\"},{\"num\":0,\"tid\":\"30_20_015\"}],\"level\":1,\"log\":[\"\"],\"money\":10000,\"name\":\"forward\",\"peopleNum\":0,\"snum\":0,\"task\":\"\",\"time\":\"0\",\"verify\":{\"BuyDollar\":0,\"CompensateDollar\":0,\"LocalTime\":412173715,\"RemainDollar\":200,\"RewardDollar\":0,\"UseDollar\":0}},\"opcode\":1011}"
//						.getBytes(), "utf-8");

//		String test = new String(
//				"{\"data\":{\"acId\":186,\"loginType\":\"mid\",\"mid\":\"yukun\",\"version\":1.0},\"opcode\":1}".getBytes(), "utf-8");
		
		String test = "fddsafds";
		
		System.out.println("\n---------------------------------\nencoding: " + encoding + "\n");
		System.out.println("Encode String Bytes().length: " + test.getBytes().length);

		byte[] buf = new byte[test.getBytes().length * 2];
		int ret = HTTPEncodeUtil.Encode(test.getBytes(), test.getBytes().length, buf, buf.length);
		System.out.println("HTTPEncodeUtil.Encode return: " + ret);
		for (int i = buf.length - 1; i >= 0; i--) {
			if (buf[i] != 0) {
				System.out.println("buf real size : " + (i + 1));
				break;
			}
		}
		System.out.println("\n---------------------------------\n");

		byte[] encodeBytes = new byte[ret];
		System.arraycopy(buf, 0, encodeBytes, 0, ret);

		byte[] targetBufBytes = new byte[100000];
		int deRet = HTTPEncodeUtil.Decode(encodeBytes, ret, targetBufBytes, targetBufBytes.length);

		System.out.println("HTTPEncodeUtil.Encode return : " + deRet);
		for (int i = targetBufBytes.length - 1; i >= 0; i--) {
			if (targetBufBytes[i] != 0) {
				System.out.println("buf real size : " + (i + 1));
				break;
			}
		}
		String targetStr = new String(targetBufBytes, 0, deRet, encoding);
		System.out.println("Decode : " + test.equals(targetStr));

	}

}