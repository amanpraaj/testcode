document.addEventListener('DOMContentLoaded', function () {
    const topAppBar = new mdc.topAppBar.MDCTopAppBar(document.querySelector('.mdc-top-app-bar'));
    topAppBar.listen('MDCTopAppBar:nav', () => {
        // Handle navigation button click if needed
    });

    // Additional JavaScript logic can go here
});
