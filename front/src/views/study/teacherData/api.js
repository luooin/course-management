import { getRequest, postRequest, putRequest, postBodyRequest, getNoAuthRequest, postNoAuthRequest } from '@/libs/axios';

export const getTeacherDataOne = (params) => {
    return getRequest('/teacherData/getOne', params)
}
export const getTeacherDataList = (params) => {
    return getRequest('/teacherData/getByPage', params)
}
export const getTeacherDataCount = (params) => {
    return getRequest('/teacherData/count', params)
}
export const addTeacherData = (params) => {
    return postRequest('/teacherData/insert', params)
}
export const editTeacherData = (params) => {
    return postRequest('/teacherData/update', params)
}
export const addOrEditTeacherData = (params) => {
    return postRequest('/teacherData/insertOrUpdate', params)
}
export const deleteTeacherData = (params) => {
    return postRequest('/teacherData/delByIds', params)
}