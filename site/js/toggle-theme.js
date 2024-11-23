// Função para alternar entre os modos claro e escuro
function user_color_mode_toggle() {
    const currentTheme = document.body.getAttribute('data-theme');
    document.body.setAttribute('data-theme', currentTheme === 'dark' ? 'light' : 'dark');
}

// Adiciona o evento ao botão
document.addEventListener('DOMContentLoaded', () => {
    const toggleButton = document.getElementById('toggle-theme');
    if (toggleButton) {
        toggleButton.addEventListener('click', user_color_mode_toggle);
    }
});
