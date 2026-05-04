import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';

import { findEmployees } from '../services/EmployeeService';

const EmployeeSearchComponent = () => {
  const [id, setId] = useState('');
  const [employee, setEmployee] = useState(null);
  const [error, setError] = useState('');
  const navigate = useNavigate();
  

  const findEmployee = () => {
    if (!id) {
      setError('Please enter an ID');
      return;
    }

    findEmployees(id)
      .then((response) => {
        setEmployee(response);
        setError('');
      })
      .catch((err) => {
        setEmployee(null);
        setError('Employee not found');
      });
  };

  return (
    <div className="container">
      <h3>Search Employee</h3>

      <input
        type="text"
        placeholder="Enter Id"
        value={id}
        onChange={(e) => setId(e.target.value)}
        className="form-control mb-2"
      />

       {/* FIXED: pass function, do NOT call it */}
      <button className="btn btn-primary mb-3" onClick={findEmployee}>
        Submit
      </button>
      <button className="btn btn-primary mb-3" onClick={()=>navigate('/employees')}>Back</button>


       {/* Error message */}
      {error && <p className="text-danger">{error}</p>}

       {/* Display Result */}
      {employee && (
        <div className="card p-3">
          <p><strong>ID:</strong> {employee.customerId}</p>
          <p><strong>Name:</strong> {employee.customerName}</p>
          <p><strong>Email:</strong> {employee.customerMail}</p>
          <p><strong>Address:</strong> {employee.customerAddress}</p>
          <p><strong>DOB:</strong> {employee.customerDob}</p>
        </div>
      )}
    </div>
  );
};

export default EmployeeSearchComponent;