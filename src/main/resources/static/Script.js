function getReviews(bookId) {
    fetch("http://localhost:8080/reviews?bookId=" + bookId)
        .then(response => response.json())
        .then(function(reviews) {
            getBookInfo(bookId, reviews);
        });
}

function getBookInfo(bookId, reviews) {
    fetch("http://localhost:8080/books/" + bookId)
        .then(response => response.json())
        .then(function(book) {
            showBookInfo(book, reviews);
        });
}

function showBookInfo(book, reviews) {
    var bookInfo = "<h2>Book Info</h2>";
    bookInfo += "<p><strong>Title:</strong> " + book.name + "</p>";
    bookInfo += "<p><strong>Author:</strong> " + book.author + "</p>";
    
    var reviewList = "<h2>Reviews</h2><ul>";
    reviews.forEach(function(review) {
        reviewList += "<li>" + review.review + "</li>";
    });
    reviewList += "</ul>";

    document.getElementById("showReviews").innerHTML = bookInfo + reviewList;
}
