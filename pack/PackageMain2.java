package pack;

import pack.a.*; // 패키지 안의 모든 클래스를 가져다 쓸 수 있다.

public class PackageMain2 {

    public static void main(String[] args) {
        Data data =new Data();
        User user = new User(); // import 사용으로 패키기명 생략 가능
    }
}
