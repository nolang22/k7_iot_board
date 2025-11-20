//* user.dto.ts


// DTO request 타입: 백엔드로 보내는 Request Dto
export interface UserCreateReq {
  
}

// 단일 유저 상세 정보 (GET /users/:userId)
export interface UserDetailResDto{

}

// 리스트 항목
export interface UserListItemResDto {

}

// 리스트 응답 데이터
export type UserListDto = UserListItemResDto[];
