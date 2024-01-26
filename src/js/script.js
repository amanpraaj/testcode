document.addEventListener('DOMContentLoaded', function () {
    // Initialize Material Web components
    const topAppBar = new mdc.topAppBar.MDCTopAppBar(document.querySelector('.mdc-top-app-bar'));
    topAppBar.listen('MDCTopAppBar:nav', () => {
        // Handle navigation button click if needed
    });

    const list = new mdc.list.MDCList(document.querySelector('.mdc-list'));
    list.singleSelection = true;

    // Initialize Material Web components
    const buttons = document.querySelectorAll('.mdc-button');
    buttons.forEach(button => new mdc.button.MDCButton(button));

    const textFields = document.querySelectorAll('.mdc-textfield');
    textFields.forEach(textField => new mdc.textfield.MDCTextfield(textField));

    // Additional JavaScript logic can go here
});


    // Additional initialization for other components...
});

