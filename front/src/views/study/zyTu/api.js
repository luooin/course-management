import { getRequest, postRequest, putRequest, postBodyRequest, getNoAuthRequest, postNoAuthRequest } from '@/libs/axios';

export const getAntvVoList = (params) => {
    return getRequest('/assignment/getAntvVoList', params)
}