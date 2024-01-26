document.addEventListener('DOMContentLoaded', function () {
    // Testimonials carousel
    const testimonials = document.querySelectorAll('.testimonial');
    let currentTestimonialIndex = 0;

    function showTestimonial(index) {
        testimonials.forEach((testimonial, i) => {
            if (i === index) {
                testimonial.classList.add('active');
            } else {
                testimonial.classList.remove('active');
            }
        });
    }

    function rotateTestimonials() {
        showTestimonial(currentTestimonialIndex);
        currentTestimonialIndex = (currentTestimonialIndex + 1) % testimonials.length;
    }

    // Initial display
    showTestimonial(currentTestimonialIndex);

    // Rotate testimonials every 5 seconds (adjust as needed)
    setInterval(rotateTestimonials, 5000);

    // Contact form submission
    const contactForm = document.getElementById('contactForm');

    contactForm.addEventListener('submit', function (event) {
        event.preventDefault();

        // Basic validation, you may want to enhance this based on your needs
        const name = document.getElementById('name').value;
        const email = document.getElementById('email').value;
        const message = document.getElementById('message').value;

        if (name && email && message) {
            // For simplicity, this example just logs the form data
            console.log('Form submitted:', { name, email, message });
            // You can add further actions like sending an email or storing data
        } else {
            alert('Please fill in all fields.');
        }
    });
});
