import { getRequest, postRequest, putRequest, postBodyRequest, getNoAuthRequest, postNoAuthRequest } from '@/libs/axios';

export const getAssignmentOne = (params) => {
    return getRequest('/assignment/getOne', params)
}
export const getAssignmentList = (params) => {
    return getRequest('/assignment/getByPage', params)
}
export const getAssignmentCount = (params) => {
    return getRequest('/assignment/count', params)
}
export const addAssignment = (params) => {
    return postRequest('/assignment/insert', params)
}
export const editAssignment = (params) => {
    return postRequest('/assignment/update', params)
}
export const addOrEditAssignment = (params) => {
    return postRequest('/assignment/insertOrUpdate', params)
}
export const deleteAssignment = (params) => {
    return postRequest('/assignment/delByIds', params)
}
export const uploadAssignment = (params) => {
    return postRequest('/assignment/upload', params)
}