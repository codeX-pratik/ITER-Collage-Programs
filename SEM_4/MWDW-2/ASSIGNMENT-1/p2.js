function isValidURL(url) {
    const urlPattern = /^(?:https?:\/\/)?(?:www\.)?[a-zA-Z0-9-]+\.[a-zA-Z0-9]+(?:\/[^\s]*)?$/;
    return urlPattern.test(url);
}
console.log(isValidURL("https://www.example.com"));
console.log(isValidURL("http://example.com"));
console.log(isValidURL("invalidurl")); 