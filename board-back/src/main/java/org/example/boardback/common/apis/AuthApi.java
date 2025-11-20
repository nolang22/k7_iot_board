package org.example.boardback.common.apis;

public class AuthApi {
    private AuthApi () {}

    // ===========================================
    // Auth (인증)
    // ===========================================
    public static final String ROOT = ApiBase.BASE + "/auth";

    public static final String LOGIN = "/login";
    public static final String LOGOUT = "/logout";
    public static final String REFRESH = "/refresh";
    public static final String SIGNUP = "/signup";

    // 비밀번호 초기화(재설정)를 실제로 수행하는 API
    // : 사용자가 이메일로 받은 토큰을 넣고, 새 비밀번호를 설정하는 완성 단계
    public static final String PASSWORD_RESET = ROOT + "/password/reset";

    // 비밀번호 재설정 토큰이 유효한지 확인하는 API
    // : 사용자가 이메일 링크 클릭
    //  -> 프론트엔트에서 먼저 해당 API로 토큰 유효성 검사
    //  -> 유효하면 비밀번호 변경 화면 열기
    public static final String PASSWORD_VERIFY = ROOT + "/password/verify";
}
