 const navbar = document.querySelector("header");
        const heroSection = document.getElementById("hero");

        const toggleNavbarBackground = () =>
        (navbar.style.backgroundColor =
            window.scrollY > heroSection.offsetHeight - navbar.offsetHeight
                ? "#53376F"
                : "transparent");

        toggleNavbarBackground();
        window.addEventListener("scroll", toggleNavbarBackground);

        const toggleBtn = document.querySelector(".toggle_btn");
        const toggleBtnIcon = toggleBtn.querySelector("i");
        const dropDownMenu = document.querySelector(".dropdown_menu");

        toggleBtn.addEventListener("click", () => {
            dropDownMenu.classList.toggle("open");
            toggleBtnIcon.className = dropDownMenu.classList.contains("open")
                ? "fa-solid fa-xmark"
                : "fa-solid fa-bars";
        });
