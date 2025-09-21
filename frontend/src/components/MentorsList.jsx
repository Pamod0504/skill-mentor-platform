import React, { useState, useEffect } from 'react';
import MentorCard from './MentorCard';
import './Lists.css';

const MentorsList = () => {
  const [mentors, setMentors] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  // Replace with your actual backend API endpoint
  const API_BASE_URL = 'http://localhost:8080/api/v1';

  useEffect(() => {
    fetchMentors();
  }, []);

  const fetchMentors = async () => {
    try {
      setLoading(true);
      const response = await fetch(`${API_BASE_URL}/mentors`);

      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }

      const data = await response.json();
      setMentors(data);
    } catch (err) {
      setError(err.message);
      console.error('Error fetching mentors:', err);
    } finally {
      setLoading(false);
    }
  };

  if (loading) return <div className="loading">Loading mentors...</div>;
  if (error) return <div className="error">Error: {error}</div>;

  return (
    <div className="mentors-container">
      <h2>Our Mentors</h2>
      <div className="mentors-grid">
        {mentors.map((mentor) => (
          <MentorCard key={mentor.mentorId} mentor={mentor} />
        ))}
      </div>
    </div>
  );
};

export default MentorsList;
