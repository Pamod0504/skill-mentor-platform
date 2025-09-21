import React from 'react';
import './ClassRoomCard.css';

const ClassRoomCard = ({ classroom }) => {
  // Base URL for your backend API
  const API_BASE_URL = 'http://localhost:8080'; // Adjust port as needed

  // Function to get the full image URL
  const getImageUrl = (imageFilename) => {
    if (!imageFilename) return '/default-class.png'; // fallback image

    // If imageFilename is already a full URL, return as is
    if (imageFilename.startsWith('http')) {
      return imageFilename;
    }

    // If it's just a filename, construct the full URL
    return `${API_BASE_URL}/api/files/${imageFilename}`;
  };

  return (
    <div className="classroom-card">
      <div className="classroom-image-container">
        <img
          src={getImageUrl(classroom.classImage || classroom.image)}
          alt={classroom.title || classroom.name}
          className="classroom-image"
          onError={(e) => {
            // Fallback to default image if loading fails
            e.target.src = '/default-class.png';
          }}
        />
      </div>
      <div className="classroom-info">
        <h3 className="classroom-title">{classroom.title || classroom.name}</h3>
        <p className="classroom-description">{classroom.description}</p>
        <p className="classroom-instructor">Instructor: {classroom.instructor}</p>
        <p className="classroom-duration">Duration: {classroom.duration}</p>
        <p className="classroom-level">Level: {classroom.level}</p>
        {classroom.price && <p className="classroom-price">Price: ${classroom.price}</p>}
      </div>
      <div className="classroom-actions">
        <button className="btn-primary">Enroll Now</button>
        <button className="btn-secondary">View Details</button>
      </div>
    </div>
  );
};

export default ClassRoomCard;
