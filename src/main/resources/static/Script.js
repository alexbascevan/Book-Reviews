// Function to fetch book information based on bookId
function getBookInfo(bookId) {
    fetch("http://localhost:8080/books/" + bookId)
        .then(response => response.json())
        .then(function(book) {
            // Once book information is received, display it and fetch reviews
            showBookInfo(book);
            fetchAndDisplayReviews(bookId);
        })
        .catch(error => console.error('Error fetching book info:', error));
}

// Function to display book information
function showBookInfo(book) {
    // Construct HTML for displaying book information
    var bookInfo = "<h2><u>Book Info:</u></h2>";
    bookInfo += "<p><strong>Title:</strong> " + book.name + "</p>";
    bookInfo += "<p><strong>Author:</strong> " + book.author + "</p>";
    
    // Display book information in the specified div
    document.getElementById("showBookInfo").innerHTML = bookInfo;
}

// Function to fetch and display reviews for a book
function fetchAndDisplayReviews(bookId) {
    fetch("http://localhost:8080/reviews?bookId=" + bookId)
        .then(response => response.json())
        .then(function(reviewsResponse) {
            // Access the reviews array from the _embedded property
            const reviews = reviewsResponse._embedded.reviews;
            // Filter the reviews by bookId
            const filteredReviews = reviews.filter(review => review.bookId === bookId);
            // Display filtered reviews
            showReviews(filteredReviews);
        })
        .catch(error => console.error('Error fetching reviews:', error));
}

// Function to display reviews
function showReviews(reviews) {
    // Construct HTML for displaying reviews
    var reviewsHTML = "<h2><u>Reviews:</u></h2><ul>";
    reviews.forEach(review => {
        reviewsHTML += "<li>" + review.revtext + "</li>";
    });
    reviewsHTML += "</ul>";
    
    // Display reviews in the specified div
    document.getElementById("showReviews").innerHTML = reviewsHTML;
}