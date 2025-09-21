import React from 'react';
import './MentorCard.css';

const MentorCard = ({ mentor }) => {
  // Base URL for your backend API
  const API_BASE_URL = 'http://localhost:8080'; // Adjust port as needed

  // Function to get the full image URL
  const getImageUrl = (imageFilename) => {
    if (!imageFilename) return '/default-mentor.png'; // fallback image

    // If imageFilename is already a full URL, return as is
    if (imageFilename.startsWith('http')) {
      return imageFilename;
    }

    // If it's just a filename, construct the full URL
    return `${API_BASE_URL}/api/files/${imageFilename}`;
  };

  return (
    <div className="mentor-card">
      <div className="mentor-image-container">
        <img
          src={getImageUrl(mentor.profileImage || mentor.image)}
          alt={mentor.name}
          className="mentor-image"
          onError={(e) => {
            // Fallback to default image if loading fails
            e.target.src = '/default-mentor.png';
          }}
        />
      </div>
      <div className="mentor-info">
        <h3 className="mentor-name">{mentor.name}</h3>
        <p className="mentor-expertise">{mentor.expertise}</p>
        <p className="mentor-experience">{mentor.experience} years experience</p>
        <p className="mentor-rating">Rating: {mentor.rating}/5</p>
        {mentor.bio && <p className="mentor-bio">{mentor.bio}</p>}
      </div>
      <div className="mentor-actions">
        <button className="btn-primary">View Profile</button>
        <button className="btn-secondary">Book Session</button>
      </div>
    </div>
  );
};

export default MentorCard;
