package generics;
// generics/UseList.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {WillNotCompile}

import java.util.List;

public class UseList<W, T> {
    void f2(List<T> v) {
    }

    void f(List<W> v) {
    }
}
