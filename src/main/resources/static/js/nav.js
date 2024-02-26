const kebab=document.getElementById('kebab')
const close_btn=document.getElementById('nav_close')
const nav_drop=document.getElementById('nav_drop')

kebab.addEventListener('click',open_navbar)
close_btn.addEventListener('click',close_navbar)

function open_navbar(){
    nav_drop.classList.replace("nav_drop_close_action","nav_drop_open_action")
}

function close_navbar(){
    nav_drop.classList.replace("nav_drop_open_action","nav_drop_close_action")
}