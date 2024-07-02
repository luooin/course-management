import { getRequest, postRequest, putRequest, postBodyRequest, getNoAuthRequest, postNoAuthRequest } from '@/libs/axios';

export const getAppraiseOne = (params) => {
    return getRequest('/appraise/getOne', params)
}
export const getAppraiseList = (params) => {
    return getRequest('/appraise/getByPage', params)
}
export const getAppraiseCount = (params) => {
    return getRequest('/appraise/count', params)
}
export const addAppraise = (params) => {
    return postRequest('/appraise/insert', params)
}
export const editAppraise = (params) => {
    return postRequest('/appraise/update', params)
}
export const addOrEditAppraise = (params) => {
    return postRequest('/appraise/insertOrUpdate', params)
}
export const deleteAppraise = (params) => {
    return postRequest('/appraise/delByIds', params)
}