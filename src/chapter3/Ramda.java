package chapter3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Callable;

public class Ramda {
    public static void main(String[] args)
    {
        Callable<String> tt;
        Runnable r1 = () -> System.out.println("hello world 1");
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world 2");
            }
        };

        process(r1);
        process(r2);
        process(()-> System.out.println("hello world 3"));

        String result = processFile((BufferedReader br) -> br.readLine() + br.readLine());
        String result2 = processFile((BufferedReader br) -> br.readLine());
    }

    @FunctionalInterface
    public interface BufferedReaderProcessor {
        String process(BufferedReader b) throws IOException;
    }

    public static void process(Runnable r)
    {
        r.run();
    }
    public static String processFile(BufferedReaderProcessor p) throws IOException {
        // 람다 표현식으로 함수형 인터페이스의 추상 메서드 구현을 직접 전달할 수 있으며 전달된 코드는 함수형 인터페이스의 인스턴스로
        // 전달된 코드와 같은 방식으로 처리한다.
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt")))
        {
//            return br.readLine();
            return p.process(br);
            // 너어어어무 유연해 이게 코딩이지...


        }
    }
}
