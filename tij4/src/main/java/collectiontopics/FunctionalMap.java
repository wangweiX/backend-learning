package collectiontopics;// collectiontopics/FunctionalMap.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Functional operations on a Map

import static onjava.HTMLColors.MAP;

public class FunctionalMap {
    public static void main(String[] args) {
        MAP.values().stream()
                .filter(v -> v.startsWith("Dark"))
                .map(v -> v.replaceFirst("Dark", "Hot"))
                .forEach(System.out::println);
    }
}
/* Output:
HotBlue
HotCyan
HotGoldenRod
HotGray
HotGreen
HotKhaki
HotMagenta
HotOliveGreen
HotOrange
HotOrchid
HotRed
HotSalmon
HotSeaGreen
HotSlateBlue
HotSlateGray
HotTurquoise
HotViolet
*/
