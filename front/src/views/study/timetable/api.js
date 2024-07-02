import { getRequest, postRequest, putRequest, postBodyRequest, getNoAuthRequest, postNoAuthRequest } from '@/libs/axios';

export const getTimetableOne = (params) => {
    return getRequest('/timetable/getOne', params)
}
export const getTimetableList = (params) => {
    return getRequest('/timetable/getByPage', params)
}
export const getMyTimetableList = (params) => {
    return getRequest('/timetable/getMyPage', params)
}
export const getTimetableCount = (params) => {
    return getRequest('/timetable/count', params)
}
export const addTimetable = (params) => {
    return postRequest('/timetable/insert', params)
}
export const editTimetable = (params) => {
    return postRequest('/timetable/update', params)
}
export const addOrEditTimetable = (params) => {
    return postRequest('/timetable/insertOrUpdate', params)
}
export const deleteTimetable = (params) => {
    return postRequest('/timetable/delByIds', params)
}
export const getCurriculumList = (params) => {
    return getRequest('/curriculum/getAll', params)
}
export const getUserList = (params) => {
    return getRequest('/superUser/getUserList', params)
}