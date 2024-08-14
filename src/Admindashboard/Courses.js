import React, { useEffect, useState } from 'react';
import './CoursesPage.css';
import { useNavigate } from 'react-router-dom';
import logo from '../img/logo1.png';
import backgroundVideo from '../vdo/183107-870151708_small.mp4'; // Add an educational animation video

const CoursesPage = () => {
    const [courses, setCourses] = useState([]);
    const imageBasePath = '../img/'; // Adjust according to your setup

    useEffect(() => {
        fetch('http://localhost:8080/api/courses')
            .then((response) => response.json())
            .then((data) => setCourses(data))
            .catch((error) => console.error('Error fetching courses:', error));
    }, []);

    const navigate = useNavigate();

    const handleLogout = () => {
        navigate('/');
    };

    return (
        <div className="a1b2c3">
            <video autoPlay loop muted className="d4e5f6">
                <source src={backgroundVideo} type="video/mp4" />
                Your browser does not support the video tag.
            </video>

            <nav className="g7h8i9">
                <div className="j0k1l2">
                    <img src={logo} alt="Logo" className="m3n4o5" />
                    <div className="p6q7r8">
                        <h2 className="s9t0u1">EduLearn</h2>
                    </div>
                </div>
                <div className="y5z6a7">
                    <a href="/AdminDashboard">Home</a>
                    <a href="/CoursesPage">Courses</a>
                    <a href="/StudentDetails">Student Details</a>
                    <a href="/InstitutionDetails">Institutions</a>
                    <button className="b8c9d0" onClick={handleLogout}>
                        Logout
                    </button>
                </div>
            </nav>

            <div className="e1f2g3">
                <h2>Our Courses</h2>
                <div className="h4i5j6">
                    {courses.map((course) => (
                        <div key={course.id} className="k7l8m9">
                            <img
                                src={`${imageBasePath}${course.image}`}
                                alt={course.title}
                                className="n0o1p2"
                            />
                            <div className="q3r4s5">
                                <h3>
                                    <a href="/Coursesdet">{course.title}</a>
                                </h3>
                            </div>
                        </div>
                    ))}
                </div>
            </div>

            <footer className="t6u7v8">
                <p>&copy; 2024 EduLearn. All rights reserved.</p>
            </footer>
        </div>
    );
};

export default CoursesPage;
