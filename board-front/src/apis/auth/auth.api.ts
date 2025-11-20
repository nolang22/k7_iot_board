// authApi.ts

import type { LoginRequest, LoginResponse } from "@/types/auth.type";
import type { ApiResponse } from "@/types/common/ApiResponse";
import { publicApi } from "../common/axiosInstance";
import { AUTH_PATH } from "./auth.path";

export const authAPi = {
  login: async (req: LoginRequest): Promise<LoginResponse> => {
    // axios.메서드<메서드반환타입>();
    const res = await publicApi.post<ApiResponse<LoginResponse>>(
      AUTH_PATH.LOGIN,
      req
    );
    return res.data.data;
  },
};