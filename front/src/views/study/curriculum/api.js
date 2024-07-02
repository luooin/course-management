import { getRequest, postRequest, putRequest, postBodyRequest, getNoAuthRequest, postNoAuthRequest } from '@/libs/axios';

export const getCurriculumOne = (params) => {
    return getRequest('/curriculum/getOne', params)
}
export const getCurriculumList = (params) => {
    return getRequest('/curriculum/getByPage', params)
}
export const getCurriculumCount = (params) => {
    return getRequest('/curriculum/count', params)
}
export const addCurriculum = (params) => {
    return postRequest('/curriculum/insert', params)
}
export const editCurriculum = (params) => {
    return postRequest('/curriculum/update', params)
}
export const addOrEditCurriculum = (params) => {
    return postRequest('/curriculum/insertOrUpdate', params)
}
export const deleteCurriculum = (params) => {
    return postRequest('/curriculum/delByIds', params)
}
export const getCourseResourcesList = (params) => {
    return getRequest('/courseResources/getAll', params)
}
export const getTimetableList = (params) => {
    return getRequest('/timetable/getAll', params)
}
export const createAssignment = (params) => {
    return getRequest('/assignment/create', params)
}
export const addAppraise = (params) => {
    return getRequest('/appraise/addOne', params)
}