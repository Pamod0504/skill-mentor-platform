import React, { useState, useEffect } from 'react';
import ClassRoomCard from './ClassRoomCard';

const ClassRoomsList = () => {
  const [classrooms, setClassrooms] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  // Replace with your actual backend API endpoint
  const API_BASE_URL = 'http://localhost:8080/api/v1';

  useEffect(() => {
    fetchClassrooms();
  }, []);

  const fetchClassrooms = async () => {
    try {
      setLoading(true);
      const response = await fetch(`${API_BASE_URL}/classrooms`);

      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }

      const data = await response.json();
      setClassrooms(data);
    } catch (err) {
      setError(err.message);
      console.error('Error fetching classrooms:', err);
    } finally {
      setLoading(false);
    }
  };

  if (loading) return <div className="loading">Loading classrooms...</div>;
  if (error) return <div className="error">Error: {error}</div>;

  return (
    <div className="classrooms-container">
      <h2>Available Classrooms</h2>
      <div className="classrooms-grid">
        {classrooms.map((classroom) => (
          <ClassRoomCard key={classroom.classRoomId} classroom={classroom} />
        ))}
      </div>
    </div>
  );
};

export default ClassRoomsList;
