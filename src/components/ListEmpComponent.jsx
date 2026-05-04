import React, { useEffect, useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { listEmployees } from '../services/EmployeeService';

const ListEmpComponent = () => {
    const navigate = useNavigate();
    const [employees, setEmployees] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        const fetchEmployees = async () => {
            try {
                const data = await listEmployees(); // Fetch employee data
                setEmployees(data); // Set the employees state
                setLoading(false);
                console.log('Fetched employees:', data);
            } catch (err) {
                console.error('Error fetching employees:', err);
                setError(err);
                setLoading(false);
            }
        };

        fetchEmployees();
    }, []);

    function addEmployee() {
        navigate('/add-employee');
    }

    function searchEmployee() {
        navigate('/search-employee');
    }

    if (loading) {
        return <div>Loading...</div>;
    }

    if (error) {
        return <div>Error fetching employee data: {error.message}</div>;
    }

    return (
        <div className='container'>
            <h2 className='text-center'>List of Employees</h2>
            <button className='btn btn-primary mb-2' onClick={addEmployee}>Add Employee</button>
            <button className='btn btn-primary mb-2' onClick={searchEmployee}>Find Employee</button>
            <table className='table table-bordered table-striped'>
                <thead>
                    <tr>
                        <th>Customer ID</th>    
                        <th>Name</th>
                        <th>Email</th>
                        <th>Address</th>
                        <th>Date of Birth</th>
                    </tr>
                </thead>
                <tbody>
                    {employees.map((emp) => (
                        <tr key={emp.customerId}>
                            <td>{emp.customerId}</td>
                            <td>{emp.customerName}</td>
                            <td>{emp.customerMail}</td>
                            <td>{emp.customerAddress}</td>
                            <td>{emp.customerDob}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
}

export default ListEmpComponent;
