package org.example.boardback.common.constants;

/*
    ApiMappingPattern
    -------------------------------------
    - 실무 RESTful API URL 패턴을 한 곳에서 관리하는 상수 클래스
    - 도메인 단위 그룹 구성
    - 확장성 / 유지보수성 / 일관성 강화

    [ 권장 규칙 ]
    1) BASE = /api/v1
    2) ROOT = BASE + "/resource"
    3) ID_ONLY = "/{id}"
    4) 중첩 리소스는 ROOT + ID_ONLY + "sub-resource"
*/


import org.springframework.security.core.parameters.P;

public class ApiMappingPattern {
    private  ApiMappingPattern() {}




    public static final class Auth {
        private  Auth() {}


    }

    public static final class Users {
        private Users() {}




        public static final class Boards {
            private Boards() {
            }


        }
    }
}
