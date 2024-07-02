import { getRequest, postRequest, putRequest, postBodyRequest, getNoAuthRequest, postNoAuthRequest } from '@/libs/axios';

export const getCourseResourcesOne = (params) => {
    return getRequest('/courseResources/getOne', params)
}
export const getCourseResourcesList = (params) => {
    return getRequest('/courseResources/getByPage', params)
}
export const getCourseResourcesCount = (params) => {
    return getRequest('/courseResources/count', params)
}
export const addCourseResources = (params) => {
    return postRequest('/courseResources/insert', params)
}
export const editCourseResources = (params) => {
    return postRequest('/courseResources/update', params)
}
export const addOrEditCourseResources = (params) => {
    return postRequest('/courseResources/insertOrUpdate', params)
}
export const deleteCourseResources = (params) => {
    return postRequest('/courseResources/delByIds', params)
}
export const getCurriculumList = (params) => {
    return getRequest('/curriculum/getAll', params)
}