import axios from 'axios';

// const EMPLOYEE_API_BASE_URL = "http://localhost:8080/getAllCustomers";
const EMPLOYEE_API_BASE_URL = "http://localhost:8081/customer/";
const EMPLOYEE_API_FIND_URL = "http://localhost:8081/customer/find?Id=";



export const listEmployees = async () => {
    try {
        const response = await axios.get(EMPLOYEE_API_BASE_URL);
        return response.data;  // Return only the data from the response
    } catch (error) {
        throw new Error(`Error fetching employees: ${error.message}`);
    }
};


export const createEmployee = (employee) => {
  return axios.post(EMPLOYEE_API_BASE_URL, employee, {
    headers: {
      "Content-Type": "application/json"
    }
  });
};



export const findEmployees = async (Id) => {
    try {
        const response = await axios.get(EMPLOYEE_API_FIND_URL+Id);
        return response.data;  // Return only the data from the response
    } catch (error) {
        throw new Error(`Error fetching employees: ${error.message}`);
    }
};