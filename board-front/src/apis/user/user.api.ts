// user.api.ts

import type { ApiResponse } from "@/types/common/ApiResponse";
import { privateApi } from "../common/axiosInstance";
import { USER_PATH } from "./user.path";
import type { UserDetailResDto, UserListItemResDto } from "@/types/user/user.dto";

export const userApi = {
  getUser: async (userId: number): Promise<UserDetailResDto> => {
    const res = await privateApi.get<ApiResponse<UserDetailResDto>>(
      USER_PATH.BY_ID(userId)
    );
    return res.data.data;
  },

  getUserList: async (): Promise<UserListItemResDto> => {
    const res = await privateApi.get<ApiResponse<UserListItemResDto>>(
      USER_PATH.LIST
    );
    return res.data.data;
  },
};