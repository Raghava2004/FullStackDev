import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { createEmployee } from '../services/EmployeeService';

const EmployeeComponent = () => {

  const [customerName, setCustomerName] = useState('');
  const [customerMail, setCustomerMail] = useState('');
  const [customerAddress, setCustomerAddress] = useState('');
  const [dob, setDob] = useState('');

  const navigate = useNavigate();

  function saveEmployee(e) {
    e.preventDefault();

    const employee = { customerName, customerMail, customerAddress, dob };
    console.log(employee);

    createEmployee(employee).then(() => {
      navigate('/employees');
    });

    navigate('/employees');
  }

  return (
    <div className="container">
      <br /><br />
      <div className="row">
        <div className="card col-md-6 offset-md-3">
          <h2 className="text-center">Add Employee</h2>
          <div className="card-body">

            <form onSubmit={saveEmployee}>

              <div className="form-group mb-2">
                <label className="form-label">Customer Name:</label>
                <input
                  type="text"
                  className="form-control"
                  value={customerName}
                  onChange={(e) => setCustomerName(e.target.value)}
                />
              </div>

              <div className="form-group mb-2">
                <label className="form-label">Email:</label>
                <input
                  type="email"
                  className="form-control"
                  value={customerMail}
                  onChange={(e) => setCustomerMail(e.target.value)}
                />
              </div>

              <div className="form-group mb-2">
                <label className="form-label">Address:</label>
                <input
                  type="text"
                  className="form-control"
                  value={customerAddress}
                  onChange={(e) => setCustomerAddress(e.target.value)}
                />
              </div>

              <div className="form-group mb-2">
                <label className="form-label">DOB:</label>
                <input
                  type="date"
                  className="form-control"
                  value={dob}
                  onChange={(e) => setDob(e.target.value)}
                />
              </div>

              <button type="submit" className="btn btn-success">
                Submit
              </button>

            </form>

          </div>
        </div>
      </div>
    </div>
  );
};

export default EmployeeComponent;