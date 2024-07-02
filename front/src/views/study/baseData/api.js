import { getRequest, postRequest, putRequest, postBodyRequest, getNoAuthRequest, postNoAuthRequest } from '@/libs/axios';

export const getBaseDataOne = (params) => {
    return getRequest('/baseData/getOne', params)
}
export const getBaseDataList = (params) => {
    return getRequest('/baseData/getByPage', params)
}
export const getBaseDataCount = (params) => {
    return getRequest('/baseData/count', params)
}
export const addBaseData = (params) => {
    return postRequest('/baseData/insert', params)
}
export const editBaseData = (params) => {
    return postRequest('/baseData/update', params)
}
export const addOrEditBaseData = (params) => {
    return postRequest('/baseData/insertOrUpdate', params)
}
export const deleteBaseData = (params) => {
    return postRequest('/baseData/delByIds', params)
}